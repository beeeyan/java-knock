drop table if exists users;

create table users
(
    id serial primary key,
    username varchar(50) unique not null,
    password varchar(50) not null,
    email varchar(255) unique not null
);

drop table if exists measuredatas;

create table measuredatas(
    id int primary key AUTO_INCREMENT,
    name varchar(255),
    power1 int,
    power2 int,
    power3 int,
    power4 int,
    power5 int
);