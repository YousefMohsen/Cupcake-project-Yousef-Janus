

CREATE DATABASE mydb;


use mydb;
CREATE TABLE userinfo(
id int(5) PRIMARY KEY auto_increment, 
username varchar(40) ,
password varchar(40),
balance int(7));

CREATE TABLE orders(
ordernumber int(5) PRIMARY KEY auto_increment,
userID int(5),
totalprice int(7),
pickedup boolean, 
FOREIGN KEY (userID) REFERENCES userinfo(id));

CREATE TABLE toppings(
topid int(5) PRIMARY KEY auto_increment,
topname varchar(40),
topprice int(7));

CREATE TABLE bottoms(
botid int(5) PRIMARY KEY auto_increment,
botname varchar(40),
botprice int(7));

CREATE TABLE soldproducts(
spnumber int(5) PRIMARY KEY,
ordernumber int(5),
qty int(5),
price int(7),
topid int(5),
botid int(5),
FOREIGN KEY (ordernumber) REFERENCES orders(ordernumber),
FOREIGN KEY (topid) REFERENCES toppings(topid),
FOREIGN KEY (botid) REFERENCES bottoms(botid));

INSERT INTO userinfo (username,password) VALUES ("admin", 123);
INSERT INTO userinfo (username,password) VALUES ("hej", 123);
INSERT INTO userinfo (username,password) VALUES ("Messi", 10);
INSERT INTO userinfo (username,password) VALUES ("a", "a");

INSERT INTO bottoms (botname,botprice) VALUES ("Chocolate", 5);
INSERT INTO bottoms (botname,botprice) VALUES ("Vanilla", 5);
INSERT INTO bottoms (botname,botprice) VALUES ("Nutmeg", 5);
INSERT INTO bottoms (botname,botprice) VALUES ("Pistacio", 6);
INSERT INTO bottoms (botname,botprice) VALUES ("Almond", 7);

INSERT INTO toppings (topname,topprice) VALUES ("Chocolate", 5);
INSERT INTO toppings (topname,topprice) VALUES ("Blueberry", 5);
INSERT INTO toppings (topname,topprice) VALUES ("Rasberry", 5);
INSERT INTO toppings (topname,topprice) VALUES ("Crispy", 6);
INSERT INTO toppings (topname,topprice) VALUES ("Strawberry", 6);
INSERT INTO toppings (topname,topprice) VALUES ("Rum/Raisin", 7);
INSERT INTO toppings (topname,topprice) VALUES ("Orange", 8);
INSERT INTO toppings (topname,topprice) VALUES ("Lemon", 8);
INSERT INTO toppings (topname,topprice) VALUES ("BlueCheese", 9);

select * from toppings;
select * from bottoms;
select * from userinfo;

