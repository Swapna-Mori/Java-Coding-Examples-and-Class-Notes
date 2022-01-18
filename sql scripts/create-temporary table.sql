--  create temporary table from existing table
create temporary table department_clone 
select * from department;

-- describe the table
desc department_clone;

-- insert values in to above temporary table
insert into department values('D001','Accounts','Bangalore');

-- view data from temporary table
select * from department_clone;

-- drop above table to create same table with specific rows
drop table department_clone;

--  create temporary table from existing table and specific rows
create temporary table department_clone 
select * from department where deptname = 'accounts';

--  create temporary table from existing table and specific columns
create temporary table department_clone1 
select deptname,city from department;

-- view data from temporary table
select * from department_clone1;







