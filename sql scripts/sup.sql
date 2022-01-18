SELECT * FROM moritech.supervisiors;

insert into supervisiors 
(supervisior_name,supervisior_city,supervisior_salary) values
('Rama789','Hyderabad',56000),
('Rama789','Hyderabad',56000);

delete from supervisiors where supervisior_id IN (17,18,19);


create table sample1(id int,name varchar(30));