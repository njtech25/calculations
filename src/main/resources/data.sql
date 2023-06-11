insert into address (ID,  	Addr_Line1 , 	addr_Line2 , city,zip_code,country  )
values(100,'2337 Herndon Parkway Rd','','Herndon','20170','US');

insert into address (ID,  	Addr_Line1 , 	addr_Line2 , city,zip_code,country  )
values(101,'2331 Herndon Parkway Rd','','Herndon','20171','US');

insert into address (ID,  	Addr_Line1 , 	addr_Line2 , city,zip_code,country  )
values(102,'2332 Herndon Parkway Rd','','Herndon','20171','US');

insert into address (ID,  	Addr_Line1 , 	addr_Line2 , city,zip_code,country  )
values(103,'2333 Herndon Parkway Rd','','Herndon','20170','US');

insert into address (ID,  	Addr_Line1 , 	addr_Line2 , city,zip_code,country  )
values(104,'2334 Herndon Parkway Rd','','Herndon','20170','US');

insert into customer (ID,  	DOB , 	NAME , 	ADDRESS_ID  )
values(100,current_date,'Faddy',100);

insert into customer (ID,  	DOB , 	NAME , 	ADDRESS_ID  )
values(101,current_date,'Mat',101);

insert into customer (ID,  	DOB , 	NAME , 	ADDRESS_ID  )
values(102,current_date,'Nicole',102);

insert into customer (ID,  	DOB , 	NAME , 	ADDRESS_ID  )
values(103,current_date,'Alex',103);

insert into customer (ID,  	DOB , 	NAME , 	ADDRESS_ID  )
values(104,current_date,'Phil',104);


insert into CUSTTRANSACTION (AMOUNT , 	DATE , 	CUSTOMER_ID  )
values(30,current_date-30,104);

insert into CUSTTRANSACTION (AMOUNT , 	DATE , 	CUSTOMER_ID  )
values(30,current_date-60,104);

insert into CUSTTRANSACTION (	AMOUNT , 	DATE , 	CUSTOMER_ID  )
values(500,current_date-15,104);

insert into CUSTTRANSACTION ( 	AMOUNT , 	DATE , 	CUSTOMER_ID  )
values(5,current_date-10,104);

insert into CUSTTRANSACTION (	AMOUNT , 	DATE , 	CUSTOMER_ID  )
values(1000,current_date-90,104);

insert into CUSTTRANSACTION (	AMOUNT , 	DATE , 	CUSTOMER_ID  )
values(75,current_date-120,104);


insert into CUSTTRANSACTION (AMOUNT , 	DATE , 	CUSTOMER_ID  )
values(30,current_date-30,103);

insert into CUSTTRANSACTION (AMOUNT , 	DATE , 	CUSTOMER_ID  )
values(300,current_date-60,103);

insert into CUSTTRANSACTION (	AMOUNT , 	DATE , 	CUSTOMER_ID  )
values(101,current_date-90,103);

insert into CUSTTRANSACTION (	AMOUNT , 	DATE , 	CUSTOMER_ID  )
values(750,current_date-120,103);

insert into CUSTTRANSACTION (	AMOUNT , 	DATE , 	CUSTOMER_ID  )
values(75,current_date-150,103);

insert into CUSTTRANSACTION (	AMOUNT , 	DATE , 	CUSTOMER_ID  )
values(500,current_date-15,103);

insert into CUSTTRANSACTION ( 	AMOUNT , 	DATE , 	CUSTOMER_ID  )
values(567,current_date-10,103);




