create table customer(customerid int primary key auto_increment,
					  customername varchar(100),
                      customeremail varchar(100),
                      phone varchar(30),
                      addressLine1 varchar(50),
					  addressLine2 varchar(50),
                      city varchar(50),
                      state varchar(50),
                      postalcode varchar(30),
                      country varchar(30),
                      creditLimit float,
                      salesRepEmployeeNumber int);
insert into customer(customername,customeremail,
						phone,addressLine1,
                        addressLine2,city,
                        state,postalcode,
                        country,creditLimit,
                        salesRepEmployeeNumber) values
					('Rama','ram@gmail.com','454545343','Marathahalli'
                    ,'near kalamandir','bangalore','karnataka','560057','India',
                    560000,345);
delete from customer;
select * from customer;
insert into customer(customername,customeremail,
						phone,addressLine1,
                        addressLine2,city,
                        state,postalcode,
                        country,creditLimit,
                        salesRepEmployeeNumber) values
					('RamaK','ramk@gmail.com','4545453478','Kundalahalli'
                    ,'near Bigbazaar','bangalore','karnataka','560057','India',
                    760000,345),
                   ('krishna','krishna@gmail.com','4545453490','hounslow'
                    ,'lampton road','London','hounslow','TW3 2GE','UK',
                    760000,345),
                   ('shiva','shiv@gmail.com','4545453567','new york'
                    ,'new york','new york','new york','10005','USA',
                    760000,346),
                   ('Chang lee','chlee@gmail.com','4545453789','Singapore'
                    ,'Sengkang','near Compass','Sengkang','540101','Singapore',
                    760000,376);
                    
                    
                    
                    
                    
                    
                    
                    