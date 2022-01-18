-- insert a single row in to all columns 
insert into department values('D001','Accounts','Bangalore');
insert into department values('D002','Admin','Bangalore');
insert into department values('D022','Advertising','hyderabad');
insert into department values('D025','HR','hyderabad');
insert into department(deptid,deptname) values('D027','HR');
insert into department(deptid,deptname) values('D029','IT');
-- to view the all rows and columns of the table
select * from department;

-- insert a multiple rows in to all columns 
insert into department values('D011','Accounts','hyderabad'),
							  ('D012','Admin','hyderabad'),
                              ('D013','IT','hyderabad');
-- insert the data in to few columns
insert into course(courseid,coursename) values(002,'SQL');
select * from course;
insert into course(courseid,courseduration) values(001,35);

-- truncate the above table
truncate course;

-- insert into employee_shift table with autoincrement column
insert into employee_shift (empname,shiftstarttime,shiftendtime) values
		('Rama','10:30:12','15:30:12');
        
-- insert multiple values into employee_shift table with autoincrement column
insert into employee_shift (empname,shiftstarttime,shiftendtime) values
		('Krishna','10:45:12','16:30:12'),
        ('Shiva','10:45:12','16:30:12');
       
-- view the data from above table
select * from employee_shift;


-- truncate the above table
truncate employee_shift;

-- creating a application table with check constraint on age
create table application(appid int primary key auto_increment,
						appname varchar(20) not null,
                        appage int check(appage >=21),
                        appstatus varchar(20) default 'in progress');
drop table application;
-- insert values in the above table
insert into application(appname,appage) values ('Rama',22);
-- view data from above table
select * from application;

-- insert values in the above table to check check constraint
-- below statement fails because age is less than 22 
insert into application(appname,appage) values ('Krishna',18);

-- create a dummy table to understand timestamp data type

create table demo_timestamp(t1 timestamp);

SET time_zone = '+05.30';

insert into demo_timestamp values ('2009-02-15 10:30:01');

-- select data from above table

select * from demo_timestamp;

-- select with out distinct
select deptname from department;


