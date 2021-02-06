create database employees_database;

use employees_database;

show databases;

SELECT DATABASE();

create table employees_tbl(
id INT AUTO_INCREMENT PRIMARY KEY,
name varchar(20),
dept varchar(10),
salary int(10)
);

insert into employees_tbl values(100,'Michael','Sales',5000);
insert into employees_tbl values(200,'Geetha','HR',6000);
insert into employees_tbl values(300,'Anand','Marketing',7000);
insert into employees_tbl values(400,'Anitha','Technology',8000);
insert into employees_tbl values(500,'Amurtha','Legal',9000);
insert into employees_tbl values(600,'Amudha','Account',9500);
insert into employees_tbl values(700, 'Gandhi','Sales',5500);

insert into employees_tbl (id,name,dept,salary) values(800, 'Vicky', 'HR', 7000);

DELETE FROM employees_tbl where id=900;

UPDATE employees_tbl
SET salary = 5500
WHERE id = 100