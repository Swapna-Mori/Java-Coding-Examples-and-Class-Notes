-- views in mysql

create view innerjoinexample
as
 select
	m.name as member
    from
    members m 
    inner join 
    committee c
    on 
    c.name = m.name;  
    
  -- query data from the view (SELECT statement for above view)
  select * from innerjoinexample;
    
-- advantages of view are
     -- 1. Simplify complex query
	 -- 2. adding extra security layers

create table supervisiors (supervisior_id int auto_increment primary key,
							supervisior_name varchar(30),
                            supervisior_city varchar(50));
-- show views
show tables;
-- creating updatable views
create view supervisior_info
as
select supervisior_id,supervisior_name,supervisior_city from supervisiors;

-- view the data from the above view
select * from supervisior_info;
    
-- drop the view
drop view supervisior_info;

-- update the data using view
update supervisior_info SET supervisior_city = 'Kurnool' where supervisior_id = 6;

-- filter data (remove rows based on the condition to create a view)
create view supervisior_filtered_data
as
select supervisior_city,sum(supervisior_salary) as totalsalary_city
							from supervisiors group by supervisior_city 
                            having totalsalary_city > 135000;
    