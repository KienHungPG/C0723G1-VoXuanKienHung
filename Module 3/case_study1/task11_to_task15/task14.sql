-- Task 14 --
/*
Hiển thị thông tin tất cả các Dịch vụ đi kèm chỉ mới được sử dụng một lần duy nhất.
Thông tin hiển thị bao gồm ma_hop_dong, ten_loai_dich_vu, ten_dich_vu_di_kem,so_lan_su_dung 
(được tính dựa trên việc count các ma_dich_vu_di_kem).
*/

use furama_resort;
select hd.ma_hop_dong,ldv.ten_loai_dich_vu,dvdk.ten_dich_vu_di_kem,count(hdct.ma_dich_vu_di_kem) as so_lan_su_dung
from hop_dong hd
join dich_vu dv on hd.ma_dich_vu = dv.ma_dich_vu
join loai_dich_vu ldv on dv.ma_loai_dich_vu = ldv.ma_loai_dich_vu
join hop_dong_chi_tiet hdct on hdct.ma_hop_dong = hd.ma_hop_dong
join dich_vu_di_kem dvdk on dvdk.ma_dich_vu_di_kem = hdct.ma_dich_vu_di_kem
where hdct.ma_dich_vu_di_kem in (
    select ma_dich_vu_di_kem
    from hop_dong_chi_tiet hdct
    group by ma_dich_vu_di_kem
    having count(hdct.ma_dich_vu_di_kem) = 1)
group by hd.ma_hop_dong, hdct.ma_dich_vu_di_kem
order by hdct.ma_hop_dong;