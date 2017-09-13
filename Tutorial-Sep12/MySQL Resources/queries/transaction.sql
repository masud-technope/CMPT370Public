begin;

insert into staff(staffNo,firstName,lastName,position,gender,dob,salary,branchNo)
values(
7, 'Max','Payne', 'Employee','M','1975-11-06', 75000, 2);

update staff
set lastName='Lee'
where staffNo=7;
-- rollback;

select * from staff;

-- execute all statements at once now
commit; 