select hello() from dual;

-- function call
select checknationality(COUNTRY) from customer;

-- call the function inside the another procedure or function
 -- create procedure customerNationality()
 --   begin
 --    select checknationality(COUNTRY) from customer;
 --    END$$
 --  after creating above procedure call the procedure as below
 call customerNationality();
 
 -- drop the function
 drop function hello;
 
 --  see all function in the current database
 SHOW FUNCTION STATUS WHERE DB = 'MORITECH';
    
    
select customername ,checknationality(COUNTRY) AS citizenship from customer;