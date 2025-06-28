CREATE TABLE accounts (
    AccountID NUMBER PRIMARY KEY,
    CustomerID NUMBER,
    AccountType VARCHAR2(20),
    Balance NUMBER,
    LastModified DATE,
    FOREIGN KEY (CustomerID) REFERENCES customers(c_id)
);
commit;
savepoint sp1;

describe accounts;
select * from accounts;