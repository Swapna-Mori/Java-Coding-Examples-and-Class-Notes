-- Group By Having Clause
 use moritech;
create table supervisiors (supervisior_id int auto_increment primary key,
							supervisior_name varchar(30),
                            supervisior_address varchar(50));

-- insert the values in the above table
insert into supervisiors(supervisior_name,supervisior_address) values
						('Aman','Madhya Pradesh'),
                        ('Dilip','Lahore'),
                        ('Vinayak','Telangana'),
                        ('Ritu','Lucknow');
insert into supervisiors(supervisior_name,supervisior_address) values ('Vinay','Telangana');
insert into supervisiors(supervisior_name) values ('Vijay');
--  view the data
select * from supervisiors;

-- Group Function in Mysql
-- count with out null values
select supervisior_address,count(supervisior_address) from supervisiors;

-- count with null values
select supervisior_address,count(*) from supervisiors;

-- group by using count function
select supervisior_address,count(supervisior_address) as count 
							from supervisiors group by supervisior_address;
                            

-- alter the supervisiors table by adding a salary column
alter table supervisiors add column supervisior_salary float;

-- alter the column name supervisior_address to supervisior_city
alter table supervisiors rename column supervisior_address to supervisior_city;

-- describe above supervisiors table
desc supervisiors;

-- update the salaries of the supervisiors
update supervisiors set supervisior_salary = 55000 where 
                        supervisior_id = 1;
                        
update supervisiors set supervisior_salary = 35000 where 
                        supervisior_id = 3;   

update supervisiors set supervisior_salary = 65000 where 
                        supervisior_id = 5;

update supervisiors set supervisior_salary = 25000 where 
                        supervisior_id = 4;
                        
update supervisiors set supervisior_salary = 35000 where 
                        supervisior_id = 2;                        
                        
                        
-- SUM group by function
-- calculate total amount of salaries given to supervisors
select sum(supervisior_salary)  from supervisiors;                
  
-- grouping the supervisior based on city and calculating sum of salaries of all
      -- supervisiors living in that city
select sum(supervisior_salary),supervisior_address 
		from supervisiors group by supervisior_address;

-- MAX Group function
-- calculating maximum salary amoong all supervisiors
select max(supervisior_salary)  from supervisiors;                

-- adding few more rows of data to calculate maximum salary from each city

insert into supervisiors(supervisior_name,supervisior_city,supervisior_salary) values
						('Arman','Madhya Pradesh',70000),
                        ('Dhana','Lahore',55000),
                        ('Vikram','Telangana',45000),
                        ('Rishi','Lucknow',15000);
                        
insert into supervisiors(supervisior_name,supervisior_city,supervisior_salary) values
						('Aman','Madhya Pradesh',30000),
                        ('Dhiru','Lahore',45000),
                        ('Vishal','Telangana',25000),
                        ('Ricky','Lucknow',10000);
-- using group by calculating maximum salary from each city
select max(supervisior_salary),supervisior_city  from supervisiors 
								group by supervisior_city;     


-- Min Group function
-- calculating minimum salary amoong all supervisiors
select min(supervisior_salary)  from supervisiors;                

-- using group by calculating minimum salary from each city
select min(supervisior_salary) minimum_Salary,supervisior_city  from supervisiors 
								group by supervisior_city; 

-- AVG group function
-- calculating average salary of all supervisiors
select avg(supervisior_salary) as average_salary from supervisiors;

-- using group by calculating average salary from each city
select avg(supervisior_salary) average_Salary,supervisior_city  from supervisiors 
								group by supervisior_city; 

-- using group by calculating average salary from each city
select sum(supervisior_salary) as totalsalary_city,count(*) as no_of_supervisiors ,avg(supervisior_salary) average_Salary,supervisior_city  from supervisiors 
								group by supervisior_city;
                                
-- using count for displaying distinct values
-- count with out duplicate values
select supervisior_city,count(distinct supervisior_city) from supervisiors;

-- count with out duplicate values using group by
select supervisior_city,count(distinct supervisior_city) 
							from supervisiors group by supervisior_city ;
                            

 
-- Note 1: all group functions ignores null values
-- Note 2: group by clause works on group functions alter 
-- Note 3: group by clause can contain a column name which not in the list of selected columns
-- Example for Note 3
select supervisior_name,count(distinct supervisior_city) 
							from supervisiors group by supervisior_id ;
-- Note 4 : group by clause can be  used to list more than one column
-- Example for Note 4
select supervisior_name,supervisior_city,count(distinct supervisior_city) 
							from supervisiors group by supervisior_id,supervisior_city ;
                            
-- Note 5 : Where clause can be used to filter data before grouping the data using group by
-- Example for Note 5
-- using group by calculating maximum salary from each city where maximum salary > 55000
select max(supervisior_salary) as max_salary_city,supervisior_city  from supervisiors 
								where supervisior_salary > 55000
								group by supervisior_city;
                                
-- using group by calculating maximum salary from each city where maximum salary < 55000
select max(supervisior_salary) as max_salary_city,supervisior_city  from supervisiors 
								where supervisior_salary < 55000
								group by supervisior_city;
-- using group by calculating maximum salary from each city where maximum salary >= 55000
select max(supervisior_salary) as max_salary_city,supervisior_city  from supervisiors 
								where supervisior_salary >= 55000
								group by supervisior_city;
-- using group by calculating maximum salary from each city where maximum salary <= 55000
select max(supervisior_salary) as max_salary_city,supervisior_city  from supervisiors 
								where supervisior_salary <= 55000
								group by supervisior_city;
-- using group by calculating maximum salary from each city where maximum salary = 55000
select max(supervisior_salary) as max_salary_city,supervisior_city  from supervisiors 
								where supervisior_salary = 55000
								group by supervisior_city;
                                
-- Note 6 : we cannot use group functions in  Where clause 
-- Example for Note 6
-- using group by calculating maximum salary from each city where maximum salary = 55000
-- following query throws an error "Invalid group function"
select max(supervisior_salary) as max_salary_city,supervisior_city  from supervisiors 
								where max(supervisior_salary)= 55000
								group by supervisior_city;
-- To solve above error we have to use having clause
-- Having clause
select supervisior_city,sum(supervisior_salary) as totalsalary_city
							from supervisiors group by supervisior_city 
                            having sum(supervisior_salary) > 135000;
			
-- Having clause with alias name
select supervisior_city,sum(supervisior_salary) as totalsalary_city
							from supervisiors group by supervisior_city 
                            having totalsalary_city > 135000;

-- Having clause with column name which is not listed in select
select supervisior_city,sum(supervisior_salary) as totalsalary_city
							from supervisiors group by supervisior_city 
                            having supervisior_id = 3;
-- above query throws an error saying 'supervisior_id' as unknown column

-- to solve that error add that column name in the select statement list 
-- use the following syntax to solve the above error
select supervisior_city,supervisior_id,sum(supervisior_salary) as totalsalary_city
							from supervisiors group by supervisior_city
                            having supervisior_id > 3;

-- order by with group by and having clause
select max(supervisior_salary) as max_salary_city,supervisior_city  from supervisiors 
								where supervisior_salary >= 55000
								group by supervisior_city 
                                order by max_salary_city;
                                
-- order by with group by and having clause in descending order
select max(supervisior_salary) as max_salary_city,supervisior_city  from supervisiors 
								where supervisior_salary >= 55000
								group by supervisior_city 
                                order by max_salary_city desc;
                                
-- -- Limit and order by with group by and having clause 

select max(supervisior_salary) as max_salary_city,supervisior_city  from supervisiors 
								where supervisior_salary <= 55000
								group by supervisior_city 
                                order by max_salary_city desc
                                limit 2;