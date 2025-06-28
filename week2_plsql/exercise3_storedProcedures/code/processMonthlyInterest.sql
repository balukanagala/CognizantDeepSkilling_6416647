set SERVEROUTPUT on;

create or replace procedure process_monthly_interest(
    p_account_id in number
)
IS
BEGIN
    UPDATE accounts
    -- set Balance = Balance + Balance/100
    set Balance = Balance*1.01
    where ACCOUNTID = p_account_id;
    DBMS_OUTPUT.PUT_LINE('Balance updated successfully');
EXCEPTION
    WHEN OTHERS THEN
        DBMS_OUTPUT.PUT_LINE('An error occurred: ' || SQLERRM);
         -- Re-raise the exception to inform the calling block about the failure.
        RAISE;
END;
/

-- Anonymous Block
-- The main program

BEGIN
    FOR acc_rec in (select AccountID from ACCOUNTS where ACCOUNTTYPE='Savings') 
    LOOP
      process_monthly_interest(acc_rec.AccountID);
    END LOOP;
    COMMIT;
    DBMS_OUTPUT.PUT_LINE('All Balances of savings account updated successfully');
EXCEPTION
    WHEN OTHERS THEN
        ROLLBACK;
        DBMS_OUTPUT.PUT_LINE('An error occurred: ' || SQLERRM);
        -- Re-raise the exception for the calling environment
        -- This is important if your anonymous block is being called by another application, a scheduled job, or a 
        -- larger script. 
        RAISE;
END;
/

-- NOTES

-- 1. for loop vs cursor fetching

-- If an exception occurs inside the loop, the cursor remains open, which is not good.
-- hence, for loop is used, no worry about cursors and all

-- 2. commit statement for every update vs commit statement in block calling the procedure

-- committing for every update increases overhead.
-- moreover, : If the procedure fails halfway through (e.g., due to a power outage, disk error, or another session 
-- locking a row), all the accounts processed before the failure would have their interest applied and committed, while 
-- the remaining accounts would not. This leaves your data in an inconsistent state.
-- same with rollback

-- The Problem with ROLLBACK in the sub-procedure: If ProcessMonthlyInterest_SingleAccount had a ROLLBACK, it would 
-- only undo the changes specific to the single account it was trying to process at that moment. However, all the 
-- accounts processed before that point by the anonymous block (which then calls ProcessMonthlyInterest_SingleAccount 
-- repeatedly) would remain updated.

-- don't use commit and rollback inside procedures

-- 3. use of raise statement

-- If this procedure encounters an error and just printed a message without RAISE;, the anonymous block (which calls it 
-- in a loop) would not know that ProcessMonthlyInterest_SingleAccount failed for a particular account. It would 
-- continue processing other accounts, and then COMMIT at the end, leading to inconsistent data. By re-raising the exception, it forces the anonymous block's exception handler to be triggered, allowing it to perform a full ROLLBACK 
-- for the entire batch.
