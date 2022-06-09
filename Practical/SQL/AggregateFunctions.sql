use java;
create table product(id int primary key,productName varchar(50) not null,quantity int not null,cost int not null);
insert into product values(101,"pen",100,10);
insert into product values(102,"notebook",100,25);
insert into product values(103,"pencil",150,7);
insert into product values(104,"chock",55,20);
insert into product values(105,"ruler",25,15);

select count(cost) from product;
select count(productName) from product;
select sum(quantity) from product;
select max(cost) from product;
select min(cost) from product;