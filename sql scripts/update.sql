-- check the data before update
select * from department;

-- update statement
update department set city = 'hyderabad';

-- update statement with where condition
update department set city = 'bangalore' where deptid = 'd004';

-- update statement with where clause and two conditions;
update department set city = 'bangalore' where deptname = 'Admin' or city = 'hyderabad';