-- all rows and columns
select * from department;

-- rows with limit;
select * from department limit 2;

--  limit the rows using where clause and condition
select * from department where deptname='accounts';

--  limit the columns (projection)
select deptid,city from department;

-- limit the columns (projection) 
-- and limit the rows using where clause and condition
select deptid,city from department where deptname='accounts';

--  limit the rows using where clause, and operator for multiple conditions
select * from department where deptname='accounts' and city = 'Bangalore';

--  limit the rows using where clause, or operator for multiple conditions
select * from department where deptname='accounts' or city = 'Bangalore';

--  limit the rows using where clause and like operator
select * from department where deptname Like 'I%';
select * from department where deptname Like '%N';
select * from department where deptname Like 'A%S';
select * from department where deptname Like '_d%';
select * from department where deptname Like '__v%';

--  limit the rows using where clause and IN operator
select * from department where deptname IN ('IT','Advertising');


-- with out distinct keyword
select * from department;
-- select with distinct keyword
select distinct deptname from department;

-- order the data using select
select  deptname from department order by deptname;

-- select with where and order by
select * from department where deptname IN ('IT','Advertising','HR') order by deptname;

-- select with few columns with where and orderby
 -- select with where and order by
select deptid,deptname from department where 
		deptname IN ('IT','Advertising','HR') order by city;
        
-- NOT Operator
--  limit the rows using where clause and not IN operator
select * from department where deptname Not IN ('IT','Advertising');

-- Not with Like
select * from department where deptname Not Like '__v%';

-- IS Null
select * from department where city is null;

-- IS NOT NULL
-- IS Null
select * from department where city is not null;

-- LIMIT from last
select * from department order by deptid desc limit 2;