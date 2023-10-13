-- Task 4 --
use furama_resort;

select kh.ho_ten, count(hd.ma_khach_hang) as so_lan_dat_phong
from khach_hang kh
left join hop_dong hd on kh.ma_khach_hang = hd.ma_khach_hang
where kh.ma_loai_khach = 1
group by kh.ho_ten
order by so_lan_dat_phong ASC;
