set serveroutput on;

create or replace procedure addBonus(
    p_dept_name in varchar2,
    p_bonus in number
)
is 
BEGIN
    update employees
    set salary = salary + (salary*p_bonus/100)
    where Department=p_dept_name;
    DBMS_OUTPUT.PUT_LINE('Balance updated successfully');
EXCEPTION
    WHEN OTHERS THEN
        DBMS_OUTPUT.PUT_LINE('An error occurred: ' || SQLERRM);
        RAISE;
END;
/

-- Anonymous Block
-- main code

savepoint sp1;
BEGIN
    addBonus('HR',5);
    addBonus('Engineering',3);
    addBonus('IT',2);
    addBonus('Finance',1);
EXCEPTION
    WHEN OTHERS THEN
        DBMS_OUTPUT.PUT_LINE('An error occurred: ' || SQLERRM);
        rollback;
        RAISE;
END;
/

SELECT * from EMPLOYEES;
-- ROLLBACK to sp1;

-- I have executed addBonus() multiple times, so salary will not match with exact bonus increment wrt initial salaries
