insert all
into employees (EmployeeID, Name, Position, Salary, Department, HireDate) values(1, 'Alice Johnson', 'Manager', 70000, 'HR', TO_DATE('2015-06-15', 'YYYY-MM-DD'))
into employees (EmployeeID, Name, Position, Salary, Department, HireDate) values(2, 'Bob Brown', 'Developer', 60000, 'IT', TO_DATE('2017-03-20', 'YYYY-MM-DD'))
into employees (EmployeeID, Name, Position, Salary, Department, HireDate) values(3, 'Dwayne Bravo', 'Engineer', 65000, 'Engineering', TO_DATE('2017-03-20', 'YYYY-MM-DD'))
into employees (EmployeeID, Name, Position, Salary, Department, HireDate) values(4, 'Charlie Davis', 'Analyst', 55000, 'Finance', TO_DATE('2019-09-01', 'YYYY-MM-DD'))
into employees (EmployeeID, Name, Position, Salary, Department, HireDate) values(5, 'Diana Green', 'Team Lead', 75000, 'IT', TO_DATE('2016-11-10', 'YYYY-MM-DD'))
into employees (EmployeeID, Name, Position, Salary, Department, HireDate) values(6, 'Eve White', 'HR Specialist', 58000, 'HR', TO_DATE('2020-01-25', 'YYYY-MM-DD'))
into employees (EmployeeID, Name, Position, Salary, Department, HireDate) values(7, 'Frank Black', 'Engineer', 62000, 'Engineering', TO_DATE('2018-07-12', 'YYYY-MM-DD'))
select 1 from dual;

commit;
SAVEPOINT sp1;

select * from employees;