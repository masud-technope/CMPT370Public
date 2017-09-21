

-- find out the champion staff in customer service

select  firstName, lastName from staff where staffNo in (
select * from (
select staffNo from customerservice
group by staffNo
order by count(*) desc limit 1
) as t);

