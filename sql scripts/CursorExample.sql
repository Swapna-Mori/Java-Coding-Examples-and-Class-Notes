set  @custEmailList = "";
CALL `moritech`.`createCustomerEmailList`(@custEmailList);
select @custEmailList;

set @custList = "";
CALL customerNameList(@custList);
select @custList;
