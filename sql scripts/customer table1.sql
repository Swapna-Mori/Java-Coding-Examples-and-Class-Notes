CALL `moritech`.`checkCountry`(5, @pcountryname);
select @pcountryname;

DELIMITER $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `Even or Odd`(
IN tablevalue int)
BEGIN
	declare n int;
    declare result varchar(255);
    set n = tablevalue;
  mul:  loop
      if n > 10  then
			leave mul;
	  end if;
       if(n % 2 = 0) then
             set result  = concat( n," is even");
			iterate mul;
		else
			set result = concat( n," is odd");
		end if;
	end loop;
    
    select result;
          
END$$
DELIMITER ;
CALL `moritech`.`Even or Odd`(<{IN tablevalue int}>);

