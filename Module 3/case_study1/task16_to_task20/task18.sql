-- Task 18 --
/*
Xóa những khách hàng có hợp đồng trước năm 2021 (chú ý ràng buộc giữa các bảng).
*/

use furama_resort;

delete from khach_hang
where ma_khach_hang in (
    select distinct kh.ma_khach_hang
    from khach_hang kh
    left join hop_dong hd on kh.ma_khach_hang = hd.ma_khach_hang
    where year(hd.ngay_lam_hop_dong) < 2021
);

