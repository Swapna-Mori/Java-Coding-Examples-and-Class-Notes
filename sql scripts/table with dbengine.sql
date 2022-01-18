use moritech;

drop table instructordetails;

-- creating table using specific engine type

create table instructordetails
(instr_details_id int,instr_id int,specialization varchar(20))
engine=MyISAM;