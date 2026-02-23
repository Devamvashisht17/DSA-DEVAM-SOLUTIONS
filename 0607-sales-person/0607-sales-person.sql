# Write your MySQL query statement below
select name from salesperson where sales_id not in (select o.sales_id from company c join orders o on c.com_id = o.com_id where c.name='red');