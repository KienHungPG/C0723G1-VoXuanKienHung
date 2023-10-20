-- Task 18 --
/*
Xóa những khách hàng có hợp đồng trước năm 2021 (chú ý ràng buộc giữa các bảng).
*/

use furama_resort;

set sql_safe_updates = 0;

create view khach_hang_can_xoa as
select distinct kh.ma_khach_hang
from khach_hang kh
join hop_dong hd on kh.ma_khach_hang = hd.ma_khach_hang
where year(hd.ngay_lam_hop_dong) < 2021;

delete from khach_hang
where ma_khach_hang in (select ma_khach_hang from khach_hang_can_xoa);

set sql_safe_updates = 1;

