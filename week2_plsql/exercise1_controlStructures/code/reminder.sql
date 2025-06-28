-- set, declare, begin, exception
set SERVEROUTPUT on;
DECLARE
    cursor dueIn_a_MonthCustomers IS
    select c.c_id,l.end_date - trunc(sysdate) as due_days from customers c
    join loans l on l.c_id = c.c_id
    where l.end_date - trunc(sysdate) between 1 and 30;

    id customers.c_id%TYPE;
    days_left int;

BEGIN
    open dueIn_a_MonthCustomers;
    LOOP
        fetch dueIn_a_MonthCustomers into id,days_left;
        exit when dueIn_a_MonthCustomers%NOTFOUND;
        DBMS_OUTPUT.PUT_LINE('Hello' || id || ', this is a friendly reminder that');
        DBMS_OUTPUT.PUT_LINE('  your loan is due in' || days_left || ' days.' || ' Pay on time to avoid un-necessary actions!');
    end loop;
    close dueIn_a_MonthCustomers;
    COMMIT;
    DBMS_OUTPUT.PUT_LINE('Reminders Sent Sucessfully');
EXCEPTION
    WHEN OTHERS THEN
        ROLLBACK;
        DBMS_OUTPUT.PUT_LINE('An error occurred: ' || SQLERRM);
END;
/
