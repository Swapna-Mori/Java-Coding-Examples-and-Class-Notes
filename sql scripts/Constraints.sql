-- adding constraints while creating table
create table course(courseid int,coursename varchar(20) not null);

-- drop the table
drop table course;

-- adding multiple  constraints on single column while creating table
create table course(courseid int not null unique,
						coursename varchar(20) not null );

-- describe command
desc course;

-- adding constraint while altering table
alter table course add column coursefees float not null;

-- adding new constraint 

alter table course modify coursename varchar(20) not null;

-- adding two constraints using alter
alter table course modify coursename varchar(20) not null unique;

-- alter table drop constraint
alter table course drop constraint coursen; 

-- ALTER TABLE table_name ADD CONSTRAINT constraint_name not null
-- alter the table to add a new column
alter table course add column courseduration int;
alter table course add CONSTRAINT  course_nt_nl unique (courseduration);

-- drop the constraint using constraint name
alter table course drop constraint  course_nt_nl;

-- create table the constraint and constraint name
create table instructor(instructorid int,
						instructorname varchar(50) ,
                        constraint cns_name unique(instructorname));

-- describe
desc instructor;











