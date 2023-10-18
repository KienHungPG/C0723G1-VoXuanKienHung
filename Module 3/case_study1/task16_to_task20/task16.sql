-- Task 16 --
/*
Xóa những Nhân viên chưa từng lập được hợp đồng nào từ năm 2019 đến năm 2021.
*/

use furama_resort;

set sql_safe_updates = 0;
delete from nhan_vien
where ma_nhan_vien not in (select *
                           from (select nv.ma_nhan_vien
                                 from nhan_vien nv
								 join hop_dong hd on hd.ma_nhan_vien = nv.ma_nhan_vien
                                 where year (hd.ngay_lam_hop_dong) between 2019 and 2021) as tim_nhan_vien_can_xoa);

select * from nhan_vien;