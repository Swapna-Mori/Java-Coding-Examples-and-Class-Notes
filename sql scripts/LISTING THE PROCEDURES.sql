CALL `moritech`.`GETSUMOFALLPAYMENTS`();

SHOW PROCEDURE STATUS;

SHOW PROCEDURE STATUS WHERE db= 'moritech' ;

SHOW PROCEDURE STATUS WHERE Name like 'g%' and db = 'moritech' ;

SHOW PROCEDURE STATUS like 'get%';

SHOW PROCEDURE STATUS like '%payments';

select routine_name
from
information_schema.routines
where
routine_type = 'PROCEDURE'
AND
routine_schema = 'moritech';

