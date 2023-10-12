-- Task 2 -- 

use furama_resort;

select * from nhan_vien
where ho_ten like 'H%' or ho_ten like 'T%' or ho_ten like 'K%'
and length(ho_ten) <= 15;
