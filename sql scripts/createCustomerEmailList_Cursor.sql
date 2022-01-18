CREATE DEFINER=`root`@`localhost` PROCEDURE `createCustomerEmailList`(
inout custEmailList varchar(4000))
BEGIN
		declare finished integer default 0;
        declare custemailaddress varchar(100) default "";
        -- declare emailList varchar(100) default "";
	
		-- declare the cursor for customer email
        declare curEmail
				cursor for
						select customeremail from customer;
		-- declare not found handler
			declare continue Handler
			for not found set finished =1;
        
        -- open the cursor
        open curEmail;
        
        getCustomerEmail: loop
        
					-- fetch the data from cursor into custemailaddress
					fetch curEmail INTO custemailaddress;
					if finished = 1 THEN 
						   Leave getCustomerEmail;
					end if;
					
					-- build the email list
					set  custEmailList = concat(custemailaddress,";",custEmailList);
        end loop getCustomerEmail;
        
        -- close the cursor
        close curEmail;
END