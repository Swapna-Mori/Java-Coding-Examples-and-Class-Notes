use moritech;

alter table student add studentpercentage float after studentmarks;

-- Modify a column type

alter table student modify  studentpercentage double;

-- describe table

desc student;

-- rename the column name
alter table student rename column stud_per to studentpercentage;

alter table student change column studentpercentage studper float;

-- drop a column
# drop a column
alter table student drop studentnationality;

-- alter the table name
alter table student rename to student_data;
