-- TCL Commands
-- savepoint
-- commit
-- rollback

-- following command shows status of autocommit where it is ON or OFF
-- By default autocommit is ON in mysq;

show variables where variable_name = 'autocommit';

-- to disablt autocommit use following statement
set autocommit = 0;

select * from sample_tcldemo;