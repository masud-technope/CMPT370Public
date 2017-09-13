create table cmpt370.staff
(
staffNo INT CHECK(staffNo>0),
firstName VARCHAR(45) NOT NULL,
lastName VARCHAR(45) NOT NULL,
position VARCHAR(45) NOT NULL,
gender CHAR CHECK(gender='m' or gender='f' or gender='o'),
dob DATE NOT NULL,
salary INT CHECK(salary>0),
branchNo INT CHECK(branchNo>0),
PRIMARY KEY (staffNo)
);