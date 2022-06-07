use gms;

create table person(personId int primary key,firstName varchar(20) not null,lastName varchar(20) not null,address varchar(100) not null,city varchar(20) not null);

insert into person values(101,"Rupesh","Patil","Vikhroli","Mumbai");

insert into person values(102,"Vinayak","Suryawanshi","Ghatkopar","Mumbai");

insert into person values(103,"Suraj","Suryawanshi","Bhandup","Mumbai");

insert into person values(104,"Rohit","Walanj","Rabgaon","Pali");

insert into person values(105,"Tejas","Kute","Ghatkopar","Mumbai");

select * from person;