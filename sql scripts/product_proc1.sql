CREATE DEFINER=`root`@`localhost` PROCEDURE `product_proc1`(in prid int,
out pname varchar(50),inout pprice decimal(10,2))
BEGIN
	declare tempPrice decimal(10,2);
    
    -- select the data from product table
    select productname,productprice into pname,tempPrice from product 
			where pid = prid;
	-- update product with new price
    update product set productprice = pprice where pid = prid;
    
    -- return old price
    set pprice = tempPrice;

END