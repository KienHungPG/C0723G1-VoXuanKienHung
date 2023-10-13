-- Task 6 --
use furama_resort;

select 
    dv.ma_dich_vu,
    dv.ten_dich_vu,
    dv.dien_tich,
    dv.chi_phi_thue,
    ldv.ten_loai_dich_vu
from dich_vu dv
left join (
    select distinct ma_dich_vu
    from hop_dong
    where year(ngay_lam_hop_dong) = 2021 and month(ngay_lam_hop_dong) in(1,2,3))
    khach_hang_da_dat on dv.ma_dich_vu = khach_hang_da_dat.ma_dich_vu
join loai_dich_vu ldv on dv.ma_loai_dich_vu = ldv.ma_loai_dich_vu
where khach_hang_da_dat.ma_dich_vu is null;
