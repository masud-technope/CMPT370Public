
select * from staff where branchNo=1;

begin;

set @bonus := (select salary*0.1  from staff where position='Manager' and branchNo=1); 
set @empcount := (select count(*) from staff where branchNo=1);
set @addition=@bonus/@empcount;

update staff set salary=salary-salary*0.1 where position='Manager' and branchNo=1;
update staff set salary=salary+@addition where position='Employee' and branchNo=1;

commit;

select * from staff where branchNo=1;