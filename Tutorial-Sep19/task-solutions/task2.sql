
SET SQL_SAFE_UPDATES=0;

select * from staff;

begin;
update staff set salary= salary+salary*0.1 where position='Employee';
update staff set salary=salary - salary*0.05 where position='Manager' ;
commit;

select * from staff;
 