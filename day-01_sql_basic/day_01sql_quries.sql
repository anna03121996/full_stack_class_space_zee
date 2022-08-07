create database learning_data_base;
create table employee (first_name varchar(200), last_name varchar(200), position varchar(200), date_of_join date, base_salary int, commition float);

insert into employee (first_name, last_name, position, date_of_join,base_salary,commition) values ('anna','pandiyan','front-end developer','2017-11-12',5000,0.5);
insert into employee (first_name, last_name, position, date_of_join,base_salary,commition) values ('ajith','kumar','back-end developer','2019-12-22',4300,0.6);

--select * from employee;

insert into employee (first_name, last_name, position, date_of_join,base_salary,commition) values ('prem','kumar','testing engineer','2020-11-20',8000,0.86);
insert into employee (first_name, last_name, position, date_of_join,base_salary,commition) values ('anil','kumar','devops engineer','2014-01-02',12000,0.47);
insert into employee (first_name, last_name, position, date_of_join,base_salary,commition) values ('ajith',null,'testing engineer','2010-08-22',18000,0.62);
insert into employee (first_name, last_name, position, date_of_join,base_salary,commition) values ('prem','kumar','ui/ux designer','2018-11-20',15000,0.43);

alter table employee add updated_base_salary int;
insert into employee (first_name, last_name, position, date_of_join,base_salary,commition,updated_base_salary) values ('arul','vel','ui/ux designer','2022-01-20',15000,0.43,null);

update employee set updated_base_salary = ((base_salary*0.2)+base_salary) where date_of_join <'2021-08-08';
select base_salary +(base_salary*commition) as net_salary from employee;

update employee set position = 'senior '+position where date_of_join <'2017-08-08';

alter table employee add experience_level varchar(200);

update employee set experience_level ='senior' where date_of_join < '2017-08-08';
update employee set experience_level ='junior' where not date_of_join<'2017-08-08';
update employee set experience_level ='fresher' where date_of_join<'2022-08-08' and date_of_join>'2021-08-08';

select * from employee;