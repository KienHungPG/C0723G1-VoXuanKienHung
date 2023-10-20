drop database if exists internet_store;

create database if not exists internet_store;

use internet_store;

create table if not exists computer(
computer_code int auto_increment,
manufacturer varchar(50),
computer_location varchar(50),
price_per_hour double,
primary key(computer_code)
);

create table if not exists customer_type(
customer_type_code int auto_increment,
customer_type varchar(10),
primary key(customer_type_code)
);

create table if not exists customer(
customer_code int auto_increment,
`name` varchar(50),
phone_number varchar(10),
email varchar(50),
customer_type_code int,
unique(phone_number,email),
primary key(customer_code),
foreign key (customer_type_code) references customer_type(customer_type_code)
);

create table if not exists service(
service_code int auto_increment,
service_name varchar(50),
service_price double,
primary key(service_code)
);

create table if not exists bill(
bill_code int auto_increment,
customer_code int,
computer_code int,
start_time datetime,
end_time datetime,
primary key(bill_code),
foreign key(customer_code) references customer(customer_code),
foreign key(computer_code) references computer(computer_code)
);

create table if not exists bill_detail(
bill_detail_code int auto_increment,
bill_code int,
service_code int,
service_amount int,
primary key(bill_detail_code),
foreign key(bill_code) references bill(bill_code),
foreign key(service_code) references service(service_code)
);

-- INSERT --

insert into computer(manufacturer,computer_location,price_per_hour)
values 	('AMD','Standard Zone',10000),
		('AMD','VIP Zone',12000),
		('Intel','Couple Zone',15000),
        ('Intel','Competition Zone',18000),
        ('Intel','Stream Zone', 20000);
	
insert into customer_type(customer_type)
values	('VIP'),
		('Member'),
        ('Other');

insert into customer(`name`,phone_number,email,customer_type_code)
values	('Văn Hiếu','0987654321','hieu@gmail.com',2),
		('Văn Toại','0123123123','toai@gmail.com',2),
		('Kiến Hùng','0932404364','hung@gmail.com',1),
		('Gia Kiệt','0123321345','kiet@gmail.com',3),
		('Thành Đạt','098567432','dat@gmail.com',3);
        
insert into service(service_name,service_price)
values	('Nước ngọt',20000),
		('Bánh mì',15000),
		('Mì tôm',10000);

