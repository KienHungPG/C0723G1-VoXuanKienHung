drop database if exists products;

create database if not exists products;

use products;

create table if not exists products(
id int primary key auto_increment,
product_code varchar(255) not null,
product_name varchar(255) not null,
product_price double not null,
product_amount int not null,
product_description text,
product_status varchar(255)
);

insert into Products (product_code, product_name, product_price, product_amount, product_description, product_status)
values
    ('P001', 'Product 1', 10.99, 50, 'This is product 1', 'Active'),
    ('P002', 'Product 2', 19.99, 30, 'This is product 2', 'Active'),
    ('P003', 'Product 3', 5.99, 100, 'This is product 3', 'Inactive');

-- Tạo Unique Index trên bảng Products (sử dụng cột productCode để tạo chỉ mục)
create unique index i_product_code on products(product_code);

-- tạo Composite Index trên bảng Products (sử dụng 2 cột productName và productPrice)
create index i_product_name_and_price on products(product_name, product_price);

-- Sử dụng câu lệnh EXPLAIN để biết được câu lệnh SQL của bạn thực thi như nào
explain select * from products where product_code = 'P001';
explain select * from products where product_name = 'Product 1';
explain select * from products where product_price = 5.99;

/* 
	so sánh câu truy vấn trước và sau khi tạo index
 - Tốc độ truy vấn trước khi tạo index chậm hơn sau khi tạo index
*/

-- Tạo view lấy về các thông tin: productCode, productName, productPrice, productStatus từ bảng products.
create view w_products as 
	select product_code,product_name,product_price,product_status
    from products;
select * from w_products;

-- Tiến hành sửa đổi view
update w_products
set product_price = 11.99
where product_code = 'P001';

select * from w_products;

-- Tiến hành xoá view
drop view w_products;

-- Tạo store procedure lấy tất cả thông tin của tất cả các sản phẩm trong bảng product
delimiter //
create procedure get_all_products()
begin
select * from products;
end //
delimiter ;

call get_all_products();

-- Tạo store procedure thêm một sản phẩm mới
delimiter //
create procedure add_new_product(product_code varchar(255), 
								product_name varchar(255), 
                                product_price double, 
                                product_amount int, 
                                product_description text, 
                                product_status varchar(255))
begin
insert into products (product_code, product_name, product_price, product_amount, product_description, product_status)
values (product_code, product_name, product_price, product_amount, product_description, product_status);
end //
delimiter ;

call add_new_product('p004','Product 4', 15.99, 200, 'This is product 4', 'Active');

select * from products;

-- Tạo store procedure sửa thông tin sản phẩm theo id
delimiter //
create procedure update_product (
	product_id int,
    new_product_code varchar(255),
    new_product_name varchar(255),
    new_product_price double,
    new_product_amount int,
    new_product_description text,
    new_product_status varchar(50)
)
begin
    update products
    set
        product_code = new_product_code,
        product_name = new_product_name,
        product_price = new_product_price,
        product_amount = new_product_amount,
        product_description = new_product_description,
        product_status = new_product_status
    where id = product_id;
end //
delimiter ;

call update_product(1, 'P001-New', 'Product 1 New', 12.99, 500, 'Updated product description', 'Active');

select * from products;

-- Tạo store procedure xoá sản phẩm theo id
delimiter //
create procedure delete_product(product_id int)
begin
	delete from products
    where id = product_id;
end //
delimiter ;

call delete_product(4);

select * from products;








