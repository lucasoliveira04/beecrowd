select c.name, r.rentals_date
from customers c
join rentals r 
on c.id = r.id_customers 
where extract(month from r.rentals_date) = 9;
