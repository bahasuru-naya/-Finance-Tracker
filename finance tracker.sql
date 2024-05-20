CREATE DATABASE finance_tracker;

USE finance_tracker;

CREATE TABLE user_table (
    user_name CHAR(50) NOT NULL PRIMARY KEY,
    email CHAR(50) NOT NULL,
    passwd CHAR(50) NOT NULL
);

CREATE TABLE incomes (
    income_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    user_name CHAR(50) NOT NULL,
    amount FLOAT(15, 2) NOT NULL CHECK (amount > 0),
    category CHAR(50) NOT NULL,
    `date` DATE,
    notes VARCHAR(255),
    CONSTRAINT fk1 FOREIGN KEY (user_name) REFERENCES user_table(user_name)
);

CREATE TABLE expenses (
    expenses_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    user_name CHAR(50) NOT NULL,
    amount FLOAT(15, 2) NOT NULL CHECK (amount > 0),
    category CHAR(50) NOT NULL,
    `date` DATE,
    notes VARCHAR(255),
    CONSTRAINT fk2 FOREIGN KEY (user_name) REFERENCES user_table(user_name)
);
