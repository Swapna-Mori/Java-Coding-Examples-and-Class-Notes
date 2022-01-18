CREATE DEFINER=`root`@`localhost` PROCEDURE `customerNameList`( INOUT custList varchar(4000))
BEGIN
		declare finished integer default 0;
        declare custName varchar(100) default "";
        
        declare curName
           cursor for
                  select customername from customer;
		-- declare not found handler
			declare continue Handler
            for not found set finished =1;
		# open cursor
        OPEN curName;
        #fetch records
        getName : loop
					fetch curName into custName;
                    if finished = 1 then leave getName;
                    end if;
                    set custList = concat(custName ,";",custList);
		END loop getName;
        close curName;
		
END