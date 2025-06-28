-- set, declare, begin, exception
set SERVEROUTPUT on;
DECLARE
    cursor customer IS 
        select c_id, isVip from CUSTOMERS
        where balance>10000;

    -- declaring variables for further use
    cust_id customers.c_id%TYPE;
    cust_isVip customers.isVip%TYPE;

BEGIN
    open customer;
    LOOP
        fetch customer into cust_id,cust_isVip;
        exit when customer%NOTFOUND;
        update CUSTOMERS
        set isVip='Y'
        where c_id = cust_id;
    end LOOP;
    close customer;
    commit;
    DBMS_OUTPUT.PUT_LINE('Updated Successfully');
EXCEPTION
    when others then
    ROLLBACK;
    DBMS_OUTPUT.PUT_LINE('An Error Occurred : '||SQLERRM);
END;
/