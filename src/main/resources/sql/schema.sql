drop TABLE user if EXISTS;
CREATE TABLE user(
    id int generated by DEFAULT as IDENTITY,
    username varchar(40),
    name varchar(20),
    age int(3),
    balance DECIMAL(10,2),
    PRIMARY KEY(id)
);