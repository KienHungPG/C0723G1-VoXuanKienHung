package bai3.repository;

import bai3.model.HoaDon;

import java.util.List;

public interface IHoaDonRepository {
    List<HoaDon> hienThi();
    void themMoi(HoaDon hoaDon);
}
