-- DCL statements
-- GRANT
-- To GRANT privileges we need to first create the user

create user swapna@localhost  identified by 'swapna@123';

-- to view privileges/GRANTS
 
 show grants for swapna@localhost;
 
 -- grant all privileges 
 grant all on *.* to swapna@localhost;
 
 -- view user()
 select user();
 
 -- revoke (removing privileges)
 
 revoke all, grant option from swapna@localhost;
 
 -- grant on particular database
 -- create the database;
 create database grantdemo;
 
 -- following command grants privileges on particular db
 GRANT ALL ON grantdemo.* TO swapna@localhost;
 
 -- grants privileges by choosing few DML or DDL operations 
 GRANT SELECT,UPDATE,DROP ON grantdemo.* TO swapna@localhost;
 
 --  revoke the selected privilege
 revoke drop on grantdemo.* FROM swapna@localhost;
 
 
 
 
 