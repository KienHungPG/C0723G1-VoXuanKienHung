-- Task 12 -- 
/*
Hiển thị thông tin ma_hop_dong, ho_ten (nhân viên), ho_ten (khách hàng), so_dien_thoai (khách hàng), ten_dich_vu, so_luong_dich_vu_di_kem 
(được tính dựa trên việc sum so_luong ở dich_vu_di_kem), 
tien_dat_coc của tất cả các dịch vụ đã từng được khách hàng đặt vào 3 tháng cuối năm 2020 nhưng chưa từng được khách hàng đặt vào 6 tháng đầu năm 2021.
*/

use furama_resort;

select hd.ma_hop_dong,nv.ho_ten as ho_ten_nhan_vien,kh.ho_ten as ho_ten_khach_hang,kh.so_dien_thoai,dv.ten_dich_vu,sum(hdct.so_luong) as so_luong,hd.tien_dat_coc
from hop_dong hd
left join nhan_vien nv on hd.ma_nhan_vien = nv.ma_nhan_vien
left join khach_hang kh on hd.ma_khach_hang = kh.ma_khach_hang
left join hop_dong_chi_tiet hdct on hd.ma_hop_dong = hdct.ma_hop_dong
left join dich_vu_di_kem dvdk on hdct.ma_dich_vu_di_kem = dvdk.ma_dich_vu_di_kem
left join dich_vu dv on hd.ma_dich_vu = dv.ma_dich_vu
where year(hd.ngay_lam_hop_dong) = 2020
and quarter(hd.ngay_lam_hop_dong) = 4
and hd.ma_dich_vu not in ( select hd.ma_dich_vu
							from hop_dong hd
							where year(hd.ngay_lam_hop_dong) = '2021'
                            and (quarter(hd.ngay_lam_hop_dong) = '1' 
                            or quarter(hd.ngay_lam_hop_dong) = '2'))
group by hd.ma_hop_dong;




