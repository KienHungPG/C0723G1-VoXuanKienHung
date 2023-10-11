package bai3.controller;

import bai3.model.HoaDon;
import bai3.service.HoaDonService;
import bai3.service.IHoaDonService;

import java.util.List;

public class HoaDonController {
    public final IHoaDonService hoaDonService = new HoaDonService();
    public List<HoaDon> hienThi(){
       return hoaDonService.hienThi();
    }
    public void themMoi(HoaDon hoaDon){
        hoaDonService.themMoi(hoaDon);
    }
}
