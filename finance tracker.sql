CREATE DATABASE finance_tracker;

USE  finance_tracker;
#DROP TABLE user_table;
CREATE TABLE user_table(
user_name char(50) NOT NULL PRIMARY KEY,
email char(50) NOT NULL,
passwd char(50) NOT NULL

);

USE finance_tracker ;
select *
from user_table;

CREATE TABLE incomes(
income_id int NOT Null AUTO_INCREMENT PRIMARY KEY,
user_name char(50) NOT NULL ,
amount FLOAT(15,2) NOT NULL check (amount>0),
category char(50) NOT NULL,
`date` DATE,
notes VARCHAR(255),
constraint fk1 foreign key (user_name) references user_table(user_name)

);

CREATE TABLE expenses(
expenses_id int NOT Null AUTO_INCREMENT PRIMARY KEY,
user_name char(50) NOT NULL ,
amount FLOAT(15,2) NOT NULL check (amount>0),
category char(50) NOT NULL,
`date` DATE,
notes VARCHAR(255),
constraint fk1 foreign key (user_name) references user_table(user_name)

);