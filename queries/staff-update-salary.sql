

-- salary increment for the managers

-- SET SQL_SAFE_UPDATES=0;

 update staff
 set salary=salary * 1.05
 where staff.position='Manager';


-- select * from staff;

