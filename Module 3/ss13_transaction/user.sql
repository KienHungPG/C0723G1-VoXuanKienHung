drop database if exists users_manager;
create database if not exists users_manager;
use users_manager;
create table if not exists users(
	id int(3) NOT NULL AUTO_INCREMENT, 
	name varchar(120) NOT NULL, 
	email varchar(220) NOT NULL, 
	country varchar(120), 
	PRIMARY KEY (id) 
);
insert into users(name, email, country) 
values	('Minh','minh@codegym.vn','Viet Nam'),
		('Kante','kante@che.uk','Kenia');

-- procedure

DELIMITER //
create procedure get_user_by_id(in user_id int)
begin
 select users.name, users.email, users.country
 from users
 where users.id = user_id;
 end //
DELIMITER ;
DELIMITER //
create procedure insert_user(in user_name varchar(50),in user_email varchar(50),in user_country varchar(50))
begin
 insert into users(name, email, country) values(user_name, user_email, user_country);
 end //
DELIMITER ;

-- thêm 2 bảng permision và user_permision

create table permision(
      id int(11) primary key,
      name varchar(50)
);
create table user_permision(
     permision_id int(11),
     user_id int(11),
     foreign key (permision_id) references permision(id),
     foreign key (user_id) references users(id)
     
);
drop table user_permision;
-- thêm dữ liệu permision
insert into permision(id, name) values(1, 'add');
insert into permision(id, name) values(2, 'edit');
insert into permision(id, name) values(3, 'delete');
insert into permision(id, name) values(4, 'view');

-- bảng employee
create table employee ( 
            id int(3) NOT NULL AUTO_INCREMENT, 
            name varchar(120) NOT NULL, 
            salary int(220) NOT NULL, 
            created_Date datetime, 
            PRIMARY KEY (id) 
);
-- bài tập 1 Gọi MySql Stored Procedures từ JDBC
-- Gọi Stored Procedures từ JDBC sử dụng CallableStatement cho chức năng hiển thị danh sách users
DELIMITER //
create procedure get_user()
begin
 select *
 from users;
 end //
DELIMITER ;
-- Gọi Stored Procedures từ JDBC sử dụng CallableStatement cho chức năng sửa thông tin user
delimiter //
create procedure sp_edit_user(p_id int,p_name varchar(120), p_email varchar(220), p_country varchar(120))
begin
 update users
 set name = p_name,
 email = p_email,
 country = p_country
 where id = p_id;
 end //
DELIMITER ;
-- Gọi Stored Procedures từ JDBC sử dụng CallableStatement cho chức năng xoá user
delimiter //
create procedure sp_delete_user(p_id int)
begin
 delete from users
 where id = p_id;
 end //
DELIMITER ;