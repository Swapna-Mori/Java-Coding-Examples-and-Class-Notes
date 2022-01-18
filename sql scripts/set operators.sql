--  SET Operators
   -- MINUS (not supported) => Left Join
   -- INTERSECT (notsupported) => Inner Join
   -- union
   -- union all
   
create table t1 (id Int primary key);
create table t2 (id Int primary key);

insert into t1 values (1),(2),(3);
insert into t2 values (2),(4),(3);

-- Union example
select id from t1
Union
select id from t2;

-- Union all example
select id from t1
Union all
select id from t2;

-- intersect example
select id from t1
intersect
select id from t2;