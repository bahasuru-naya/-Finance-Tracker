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