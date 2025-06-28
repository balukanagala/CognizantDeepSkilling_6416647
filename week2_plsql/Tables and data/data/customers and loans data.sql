-- data inserted according to my own schema

insert all
into customers (c_id, c_name, age, balance, email) values(101,'dinesh',25,1000,'dinesh@oracle.com')
into customers (c_id, c_name, age, balance, email) values(102,'ramesh',30,25000,'ramesh@google.com')
into customers (c_id, c_name, age, balance, email) values(103,'suesh',70,100000,'suresh@gmail.com')
into customers (c_id, c_name, age, balance, email) values(104,'bhargav',65,55000,'bhargav@xyz.com')
into customers (c_id, c_name, age, balance, email) values(105,'ram',24,1000,'ram@sita.com')
into customers (c_id, c_name, age, balance, email) values(106,'sita',80,500,'sita@ram.com')
into customers (c_id, c_name, age, balance, email) values(107,'sudheer',22,100000,'sudheer@infosys.com')
select 1 from dual;

select * from customers;

insert all 
into loans (loan_id,c_id,loan_amt,interest_rate,due_date,status) values(201,101,10000,5,TRUNC(SYSDATE)-5,'PAID')
into loans (loan_id,c_id,loan_amt,interest_rate,due_date) values(202,102,50000,4,TRUNC(SYSDATE)+120)
into loans (loan_id,c_id,loan_amt,interest_rate,due_date,status) values(203,103,5000,2,TRUNC(SYSDATE)-30,'OVERDUE')
into loans (loan_id,c_id,loan_amt,interest_rate,due_date) values(204,104,250000,11,TRUNC(SYSDATE)+180)
into loans (loan_id,c_id,loan_amt,interest_rate,due_date,status) values(205,105,120000,9,TRUNC(SYSDATE)-1,'OVERDUE')
into loans (loan_id,c_id,loan_amt,interest_rate,due_date) values(206,106,500000,13,TRUNC(SYSDATE)+365)
into loans (loan_id,c_id,loan_amt,interest_rate,due_date,status) values(207,107,20000,6,TRUNC(SYSDATE)-45,'PAID')
select 1  from dual;

update loans set due_date = TRUNC(SYSDATE)+30 where c_id in (102,106); 
-- sys_date+30 days will be added
update loans set interest_rate = 2.25 where loan_id=203;

select * from loans;

commit;

update loans set due_date = TRUNC(SYSDATE) where c_id=102;
commit;

-- making changes according to exercises docx
-- adding dob
-- setting isVip status as 'N' again, since already set 'Y' with old schema
set SERVEROUTPUT on;
DECLARE
    cursor c IS 
        select c_id from CUSTOMERS;
    cust_id customers.c_id%TYPE;
    dt date := TO_DATE('2004-03-08','YYYY-MM-DD');
BEGIN
    open c;
    LOOP
        fetch c into cust_id;
        exit when c%NOTFOUND;
        dt:= dt+30;
        update customers 
        set dob = dt+30,
        isVip ='N'
        where c_id = cust_id;
    end LOOP;
    close c;
    commit;
   DBMS_OUTPUT.PUT_LINE('Dates added successfully');
EXCEPTION
    when others then
    ROLLBACK;
    DBMS_OUTPUT.PUT_LINE('An Error Occurred : '||SQLERRM);
END;
/

-- updating dob to meet >60 age requirement
update CUSTOMERS set dob = TO_DATE('1945-01-10', 'YYYY-MM-DD') where c_id = 103;
update CUSTOMERS set dob= TO_DATE('1950-11-08', 'YYYY-MM-DD') where c_id = 104;
update CUSTOMERS set dob= TO_DATE('1960-12-19', 'YYYY-MM-DD') where c_id = 106;

commit;

-- updating end_dates
update loans set end_date = to_date('2026-01-10','YYYY-MM-DD') where loan_id = 202; 
update loans set end_date = to_date('2025-06-20','YYYY-MM-DD') where loan_id = 203; 

commit;

-- adding start_dates

update loans set start_date = to_date('2022-08-20','YYYY-MM-DD') where loan_id = 201; 
update loans set start_date = to_date('2022-12-15','YYYY-MM-DD') where loan_id = 202; 
update loans set start_date = to_date('2000-11-10','YYYY-MM-DD') where loan_id = 203; 
update loans set start_date = to_date('2005-09-25','YYYY-MM-DD') where loan_id = 204; 
update loans set start_date = to_date('2022-08-01','YYYY-MM-DD') where loan_id = 205; 
update loans set start_date = to_date('1999-02-27','YYYY-MM-DD') where loan_id = 206; 
update loans set start_date = to_date('2023-11-09','YYYY-MM-DD') where loan_id = 207; 
commit;


select * from customers;
select * from loans;