package bai3.service;

import bai3.model.HoaDon;

import java.util.List;

public interface IHoaDonService {
    List<HoaDon> hienThi();
    void themMoi(HoaDon hoaDon);
}
