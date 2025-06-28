-- created table schema on my own

-- Creating customer table
create table customers(
    c_id int primary key,
    c_name varchar2(30) not null,
    age number(3) check (age>=0),
    isVip char(1) default 'N', check(isVip in  ('Y','N')),
    balance number(15,2) default 0,
    email varchar2(100) not null
);

-- creating loans table
create table loans(
    loan_id int primary key,
    c_id int not null,
    loan_amt number(15,2) not null,
    interest_rate number(5,2) check(interest_rate>=1 and interest_rate<=100),
    due_date date not null,
    status varchar2(10) default'ACTIVE' not null check(status in ('ACTIVE','PAID','OVERDUE')),
    foreign key (c_id) references customers(c_id)
);

describe customers;
describe loans;

commit;

select 'tables created successfully' as message from dual;

-- addded schema as required in the exercises docx

alter table customers drop column age;
alter table customers add (dob date); 
-- cannot add a not null column directly hence added a nullable column
alter table customers add(lastModified date default SYSDATE not null);

alter table loans add(start_date date);
alter table loans add(end_date date);
-- cannot add a not null column directly hence added a nullable column
update loans set end_date = due_date;
alter table loans drop column due_date;


commit;
savepoint sp1;

-- make the start,end,date as not null

alter table customers
modify dob date not null;

alter table loans
modify start_date date not null;

alter table loans
modify end_date date not null;
commit;
savepoint sp2;
