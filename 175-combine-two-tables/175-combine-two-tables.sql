# Write your MySQL query statement below
SELECT firstName, lastName, city, state from Person Left Join Address on 
Person.PersonId = Address.PersonId;