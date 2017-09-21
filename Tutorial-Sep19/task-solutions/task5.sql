

-- The most frequent customer receiving the service

select firstName, lastName from customer where customerID in 
(select * from (
select customerID from customerservice
group by customerID
order by count(*) desc limit 1) as t );

