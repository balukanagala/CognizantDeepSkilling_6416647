-- scenario 1: applying 1% discount on interest_rate to customers whose age >= 60
SET SERVEROUTPUT ON;
DECLARE
    CURSOR senior_citizens IS
        SELECT 
            l.loan_id,
            l.interest_rate
        from
            customers c
        JOIN 
            loans l
        ON
            l.c_id = c.c_id
        where
            TRUNC(MONTHS_BETWEEN(SYSDATE, c.dob) / 12) > 60;
-- declaring variables which are used later
    c_loan_id loans.loan_id%TYPE;
    c_interest_rate loans.interest_rate%TYPE;
    new_interest_rate loans.interest_rate%TYPE;
BEGIN
    OPEN senior_citizens;
    LOOP
        FETCH senior_citizens into c_loan_id,c_interest_rate;
        EXIT WHEN senior_citizens%NOTFOUND;
        new_interest_rate := 0.99 * c_interest_rate;
        update LOANS
        set INTEREST_RATE = new_interest_rate
        where loan_id = c_loan_id;
    END LOOP;
    CLOSE senior_citizens;
    COMMIT;
    DBMS_OUTPUT.PUT_LINE('Loan interest rates modified successfully');
EXCEPTION
    WHEN OTHERS THEN
        ROLLBACK;
        DBMS_OUTPUT.PUT_LINE('An error occurred: ' || SQLERRM);
END;
/

/*
the modified interet_rates are not exactly 0.99 * interest_rate
as i have executed this code multiple times with old schema and modified schema
*/