insert all
into accounts (AccountID, CustomerID, AccountType, Balance, LastModified) values(4201,101,'Savings',1000,SYSDATE)
into accounts (AccountID, CustomerID, AccountType, Balance, LastModified) values(4202,102,'Savings',25000,SYSDATE)
into accounts (AccountID, CustomerID, AccountType, Balance, LastModified) values(4203,103,'Savings',100000,SYSDATE)
into accounts (AccountID, CustomerID, AccountType, Balance, LastModified) values(4204,104,'Current',55000,SYSDATE)
into accounts (AccountID, CustomerID, AccountType, Balance, LastModified) values(4205,105,'Fixed Deposit',1000,SYSDATE)
into accounts (AccountID, CustomerID, AccountType, Balance, LastModified) values(4206,106,'Salary',500,SYSDATE)
into accounts (AccountID, CustomerID, AccountType, Balance, LastModified) values(4207,107,'Savings',100000,SYSDATE)
select 1 from dual;

commit;


select * from accounts;