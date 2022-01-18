CREATE DEFINER=`root`@`localhost` FUNCTION `checknationality`(country varchar(30)) RETURNS varchar(30) CHARSET utf8mb4
    DETERMINISTIC
BEGIN
	declare customer_country varchar(30);
    
    if country = 'USA' then
			SET customer_country = 'AMERICAN Citizen';
	elseif country = 'UK' then
			SET customer_country = 'UK Citizen';
     end if;       
            
RETURN customer_country;
END