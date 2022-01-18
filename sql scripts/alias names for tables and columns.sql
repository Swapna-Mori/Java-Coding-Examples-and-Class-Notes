-- Alias names to columns in tables
select * from employee_shift;

-- column alias after concating two columns in a table
 select 
 concat(shiftstarttime,' from ',shiftendtime) shifttimings
from employee_shift;

-- column alias
select shiftstarttime as st from employee_shift;

-- column alias
select shiftstarttime st from employee_shift;

-- table alias

select * from supervisiors as sp;

-- table alias name to access columns in a table
select sp.supervisior_name as supervisior from supervisiors as sp;
