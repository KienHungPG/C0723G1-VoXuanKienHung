package bai3.repository;

import bai3.model.HoaDon;
import bai3.utils.FileUtils;

import java.util.ArrayList;
import java.util.List;

public class HoaDonRepository implements IHoaDonRepository {
    private static final String PATH = "E:\\CG\\Final Module 2\\src\\bai3\\data\\hoa_don_tien_dien.csv";
    private static final String COMMA = ",";

    @Override
    public List<HoaDon> hienThi() {
        return docFile();
    }

    @Override
    public void themMoi(HoaDon hoaDon) {
        List<HoaDon> hoaDons = docFile();
        hoaDons.add(hoaDon);
        vietFile(hoaDons);
    }

    public List<String> chuyenThanhString(List<HoaDon> hoaDons) {
        List<String> strings = new ArrayList<>();
        for (HoaDon hoaDon : hoaDons) {
            strings.add(hoaDon.getMaHoaDon()
                    + COMMA + hoaDon.getTenKhachHang()
                    + COMMA + hoaDon.getLoaiKhach()
                    + COMMA + hoaDon.getDinhMuc());
        }
        return strings;
    }

    public List<HoaDon> chuyenThanhHoaDon(List<String> strings) {
        List<HoaDon> hoaDons = new ArrayList<>();
        for (String string : strings) {
            String[] str = string.split(COMMA);
            hoaDons.add(new HoaDon(str[0], str[1], str[2], Integer.parseInt(str[3])));
        }
        return hoaDons;
    }

    public List<HoaDon> docFile() {
        List<String> strings = FileUtils.readFile(PATH);
        return chuyenThanhHoaDon(strings);
    }

    public void vietFile(List<HoaDon> hoaDons) {
        List<String> strings = chuyenThanhString(hoaDons);
        FileUtils.writeFile(PATH, strings);
    }
}

