# Write your MySQL query statement below
select email as Email from person group by Email having count(*)>1;