use java;

 alter table person rename to person_info;
 
 alter table person_info rename column personId to Id;
 
 alter table person_info add grade varchar(10);
 
 update person_info set grade='a' where id=101;
 update person_info set grade='a' where id=102;
 update person_info set grade='o' where id=103;
 update person_info set grade='b' where id=104;
 update person_info set grade='b' where id=105;
 
 select * from person_info;
 
 -- deleting a row
 delete from person info where Id=105;
 
 -- truncate will delete the records of the table
 truncate table person_info;
 
 -- drop 
 drop table person_info;