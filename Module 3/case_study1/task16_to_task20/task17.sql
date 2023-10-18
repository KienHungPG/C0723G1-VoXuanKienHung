-- Task 17 --
/*
Cập nhật thông tin những khách hàng có ten_loai_khach từ Platinum lên Diamond, 
chỉ cập nhật những khách hàng đã từng đặt phòng với Tổng Tiền thanh toán trong năm 2021 là lớn hơn 10.000.000 VNĐ.
*/

use furama_resort;

update khach_hang
set ma_loai_khach = 1
where ma_khach_hang = (select * 
						from (select kh.ma_khach_hang
							 from loai_khach lk
                                      join khach_hang kh on kh.ma_loai_khach = lk.ma_loai_khach
                                      join hop_dong hd on hd.ma_khach_hang = kh.ma_khach_hang
                                      join dich_vu dv on dv.ma_dich_vu = hd.ma_dich_vu
                                      join hop_dong_chi_tiet hdct on hd.ma_hop_dong = hdct.ma_hop_dong
                                      join dich_vu_di_kem dvdk on dvdk.ma_dich_vu_di_kem = hdct.ma_dich_vu_di_kem
                             where lk.ten_loai_khach = 'Platinum'
                             group by kh.ma_khach_hang
                             having sum(dv.chi_phi_thue + dvdk.gia * hdct.so_luong) > 1000000) as sua_thong_tin);
select * from khach_hang;
