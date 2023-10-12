-- Task 3 --

use furama_resort;

select * from khach_hang
where (timestampdiff(year, ngay_sinh, current_date())between 18 and 50)
and (dia_chi like '%Đà Nẵng%' or dia_chi like '%Quảng Trị%');