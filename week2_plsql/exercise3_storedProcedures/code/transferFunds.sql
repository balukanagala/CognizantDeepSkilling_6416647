create or replace procedure transferFunds(
    src_acc_id in NUMBER,
    dest_acc_id in NUMBER,
    amt in NUMBER
)
is  
    bal accounts.Balance%TYPE;
begin
    select Balance into bal from accounts where AccountID=src_acc_id;
    if(bal < amt) then
          RAISE_APPLICATION_ERROR(-20001, 'Insufficient Funds');
    else 
        update accounts
        set Balance = Balance - amt
        where AccountID = src_acc_id;

        update accounts
        set Balance = Balance + amt
        where AccountID  = dest_acc_id;
    end if;
    DBMS_OUTPUT.PUT_LINE('Transferred Successfully');
EXCEPTION
    WHEN OTHERS THEN
        DBMS_OUTPUT.PUT_LINE('An error occurred: ' || SQLERRM);
        RAISE;
END;
/

    
EXEC transferFunds(4207,4206,30000);
EXEC transferFunds(4201,4205,2000);
commit;

select * from accounts;