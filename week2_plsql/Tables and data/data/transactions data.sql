insert all
into transactions (TransactionID, AccountID, TransactionDate, Amount, TransactionType) values(1, 4201, SYSDATE, 200, 'Deposit')
into transactions (TransactionID, AccountID, TransactionDate, Amount, TransactionType) values(2, 4202, SYSDATE, 2000, 'Withdrawl')
into transactions (TransactionID, AccountID, TransactionDate, Amount, TransactionType) values(3, 4203, SYSDATE, 20000, 'Transfer')
into transactions (TransactionID, AccountID, TransactionDate, Amount, TransactionType) values(4, 4204, SYSDATE, 1000, 'Payment')
into transactions (TransactionID, AccountID, TransactionDate, Amount, TransactionType) values(5, 4205, SYSDATE, 2000, 'Deposit')
into transactions (TransactionID, AccountID, TransactionDate, Amount, TransactionType) values(6, 4206, SYSDATE, 200, 'Transfer')
into transactions (TransactionID, AccountID, TransactionDate, Amount, TransactionType) values(7, 4207, SYSDATE, 50000, 'Transfer')
select 1 from dual;

commit;


select * from transactions;