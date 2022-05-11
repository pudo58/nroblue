CREATE TABLE admins
(
    id INT AUTO_INCREMENT not null PRIMARY KEY,
    username varchar(50) not null,
    password varchar(33) not null,
    status int not null
);

CREATE TABLE staffs
(
   id INT AUTO_INCREMENT not null PRIMARY KEY,
   id_admin INT not null ,
   username varchar(50) not null,
   password varchar(33)not null,
   email varchar(255) null,
   date date not null,
   status int not null
);

CREATE TABLE accounts
(
    id int AUTO_INCREMENT not null primary key,
    id_staff INT not null ,
    username varchar(100)not null,
    password varchar(32) not null,
    tribe text(15) not null,
    registration text(10) not null,
    images text not null,
    mota text(250) null,
    price double not null,
    status int not null
);

CREATE TABLE users
(
    id int AUTO_INCREMENT not null primary key,
    username varchar(25) UNIQUE not null,
    password varchar(33) not null,
    email varchar(255)null,
    gold int not null,
    money double not null,
    date date not null,
    status int not null
);

CREATE TABLE carts 
(
    id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    id_user int not null,
    id_account int not null
);

CREATE TABLE cards
(
    id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    id_user int not null,
    type varchar(30) not null,
    value double not null,
    serial text(20) not null,
    code text(20)not null,
    date date not null,
    status int not null
);    
    

ALTER TABLE staffs
ADD FOREIGN KEY (id_admin) REFERENCES admins(id);

ALTER TABLE accounts
ADD FOREIGN KEY (id_staff) REFERENCES staffs(id);

ALTER TABLE carts
ADD FOREIGN KEY (id_account) REFERENCES accounts(id);


ALTER TABLE cards
ADD FOREIGN KEY (id_user) REFERENCES users(id);


