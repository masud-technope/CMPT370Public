
-- staff chart from two tables

select b.branchNo, b.city, s.staffNo, s.position, s.firstName, s.lastName  
from staff as s, branch as b
where s.branchNo=b.branchNo
order by b.city asc