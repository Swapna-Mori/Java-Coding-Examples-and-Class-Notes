
-- check the data before delete
select * from department;

--  delete all rows
delete from department;

-- delete with condition
delete from department where deptid = 'D003'; 

-- alter the department table
alter table department add column city varchar(20);

-- delete with multiple condition using AND operator
delete from department where deptname = 'Accounts' AND city='hyderabad';

-- delete with multiple condition using OR operator
delete from department where deptname = 'Accounts' OR city='hyderabad';

-- select the data from application table
select * from application;

-- delete data from application table (contains auto_increment)
delete from application;

