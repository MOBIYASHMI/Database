select * from employee;

-- A. Write a query to display ename and sal of employees whose salary are greater than or equal to 2200
select eName, sal from employee where sal >=2200; 

-- B. Write a query to display details of employees who are not getting commision
select * from employee where comm="NULL";

-- C. Write a query to display ename and sal of employees who don't have their salary in the range of 2500
-- to 4000
select eName, sal from employee where sal not between 2500 and 4000;

-- D. Write a query to display ename, job title and sal of employees who don't have a manager
select eName,job, sal from employee where mgr='NULL';

-- E.  Write a query to display ename whose name contains 'A' as third alphabet
select eName from employee where eName like '__a%';

-- F.  Write a query to display ename whose name contains 'T' as the last alphabet
select eName from employee where eName like '%t';
