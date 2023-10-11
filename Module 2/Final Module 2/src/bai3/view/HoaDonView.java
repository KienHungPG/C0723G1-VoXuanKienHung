package bai3.view;

import bai3.controller.HoaDonController;
import bai3.model.HoaDon;
import bai3.utils.Regex;

import java.util.Scanner;

public class HoaDonView {
    public final HoaDonController hoaDonController = new HoaDonController();
    Scanner scanner = new Scanner(System.in);

    public void menuChinh() {
        System.out.println("---MENU---");
        System.out.println("1. Hiển thị danh sách hóa đơn");
        System.out.println("2. Thêm mới hóa đơn");
        System.out.println("3. Thoát chương trình");
    }

    public int chonMenu() {
        int chon;

        do {
            try {
                menuChinh();
                System.out.println("Chọn tính năng");
                chon = Integer.parseInt(scanner.nextLine());
                if (chon <= 0 || chon > 3) {
                    System.out.println("Không hợp lệ. Vui lòng nhập lại!!!");
                } else {
                    return chon;
                }
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số 1-3");
            }
        } while (true);
    }

    public void quanLyHoaDon() {
        int chon = chonMenu();
        switch (chon) {
            case 1:
                for (HoaDon hoaDon : hoaDonController.hienThi()) {
                    System.out.println(hoaDon);
                }
                break;
            case 2:
                hoaDonController.themMoi(themMoiHoaDon());
                break;
            case 3:
                System.exit(1);
        }
    }

    public String nhapMaHoaDon() {
        String maHoaDon;
        do {
            System.out.println("Nhập vào mã hóa đơn MHD-XXXX(X là số nguyên 0-9): ");
            maHoaDon = scanner.nextLine();
            if (Regex.kiemTraMaHD(maHoaDon)) {
                return maHoaDon;
            } else {
                System.out.println("Vui lòng nhập đúng định dạng MHD-XXXX(X là số nguyên 0-9)!!!");
            }
        } while (true);
    }

    public String nhapTenKhachHang() {
        String tenKhachHang;
        do {
            System.out.println("Nhập vào họ và tên khách hàng: ");
            tenKhachHang = scanner.nextLine().trim();
            if (tenKhachHang.equalsIgnoreCase("")) {
                System.out.println("Tên không được phép để trống. Vui lòng nhập lại.");
            }
            return tenKhachHang;
        } while (true);
    }

    public String nhapLoaiKhachHang() {
        int loaiKhach;
        do {
            try {
                System.out.println("Chọn loại khách hàng");
                System.out.println("1. Sinh hoạt");
                System.out.println("2. Kinh Doanh");
                loaiKhach = Integer.parseInt(scanner.nextLine());
                if (loaiKhach <= 0 || loaiKhach > 2) {
                    System.out.println("Vui lòng chọn 1 hoặc 2");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Phải chọn số 1 hoặc 2");
            }
        } while (true);
        if (loaiKhach == 1) {
            return "Sinh hoạt";
        } else {
            return "Kinh doanh";
        }
    }

    public int nhapDinhMuc() {
        int dinhMuc;
        do {
            try {
                System.out.println("Nhập vào định mức tiêu thụ");
                dinhMuc = Integer.parseInt(scanner.nextLine());
                if (dinhMuc <= 0) {
                    System.out.println("Vui lòng nhập số nguyên dương lớn hơn 0");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số nguyên dương");
            }
        } while (true);
        return dinhMuc;
    }

    public void nhapThongTin(HoaDon hoaDon) {
        hoaDon.setTenKhachHang(nhapTenKhachHang());
        hoaDon.setLoaiKhach(nhapLoaiKhachHang());
        hoaDon.setDinhMuc(nhapDinhMuc());
    }

    public HoaDon themMoiHoaDon() {
        HoaDon hoaDon = new HoaDon();
        String maHoaDon;
        do {
            maHoaDon = nhapMaHoaDon();
            if (kiemTraMa(maHoaDon)) {
                System.out.println("Mã hóa đơn đã tồn tại!!!");
            }
            hoaDon.setMaHoaDon(maHoaDon);
            nhapThongTin(hoaDon);
        } while (kiemTraMa(maHoaDon));
        return hoaDon;
    }


    public boolean kiemTraMa(String maHoaDon) {
        for (HoaDon hoaDon : hoaDonController.hienThi()) {
            if (hoaDon.getMaHoaDon().equals(maHoaDon)) {
                return true;
            }
        }
        return false;
    }

}

