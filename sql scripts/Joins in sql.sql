-- inner join example on order and orderdetails
select o.orderNumber,o.orderDate,status from orders o
inner join
orderdetails od 
ON
o.orderNumber = od.orderNumber;

-- in simpler way for joins 

create table members (
		member_id int auto_increment,
        name varchar(100),
        primary key(member_id)
);


create table committee(
		committee_id int auto_increment,
        name varchar(100),
        primary key(committee_id)
);

-- insert the data in the above tables for understanding joins

insert into members(name)
		values ('John'),
				('Jane'),
                ('Mary'),
                ('David'),
                ('Amelia');
insert into committee(name)
		values ('John'),
                ('Mary'),
                ('Amelia'),
                ('Joe');
--  view the data
select * from members;

select * from committee;                
                
 -- inner join
 
 select
 
	* 
    from
    members m 
    inner join 
    committee c
    on 
    c.name = m.name;
                
   -- inner join with specific columns
 
 select
	m.name as member
    from
    members m 
    inner join 
    committee c
    on 
    c.name = m.name;             
                
 select
	c.committee_id,c.name as committee ,m.member_id,m.name as member
    from
    members m 
    inner join 
    committee c
    on 
    c.name = m.name; 
 
 -- Left Join example
 
  select
	c.committee_id,c.name as committee ,m.member_id,m.name as member
    from
    members m 
    left join 
    committee c
	using
    (name);
 
 -- Right Join example
          select
	c.committee_id,c.name as committee ,m.member_id,m.name as member
    from
    members m 
    right join 
    committee c
	using
    (name); 
    
-- cross join example 

select
	c.committee_id,c.name as committee ,m.member_id,m.name as member
    from
    members m 
    cross join 
    committee c;