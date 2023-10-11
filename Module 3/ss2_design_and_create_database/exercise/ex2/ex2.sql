drop database if exists quan_ly_ban_hang;

create database if not exists quan_ly_ban_hang;

use quan_ly_ban_hang;

create table customers(
customer_id int auto_increment,
customer_name varchar(50),
customer_age int,
primary key(customer_id)
);

create table orders(
customer_id int,
order_id int auto_increment,
order_date datetime,
order_total_price int,
primary key(order_id),
foreign key (customer_id) references customers(customer_id)
);

create table products(
product_id int auto_increment,
product_name varchar(50),
product_price int,
primary key(product_id)
);

create table order_detail(
order_id int,
product_id int,
order_qty varchar(50),
foreign key (order_id) references orders(order_id),
foreign key (product_id) references products(product_id)
);
