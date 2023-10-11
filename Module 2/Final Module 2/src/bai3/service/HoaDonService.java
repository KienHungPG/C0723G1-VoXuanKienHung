package bai3.service;

import bai3.model.HoaDon;
import bai3.repository.HoaDonRepository;
import bai3.repository.IHoaDonRepository;

import java.util.List;

public class HoaDonService implements IHoaDonService{
    public final IHoaDonRepository hoaDonRepository = new HoaDonRepository();
    @Override
    public List<HoaDon> hienThi() {
        return hoaDonRepository.hienThi();
    }

    @Override
    public void themMoi(HoaDon hoaDon) {
        hoaDonRepository.themMoi(hoaDon);
    }
}
