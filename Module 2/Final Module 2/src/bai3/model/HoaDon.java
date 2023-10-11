package bai3.model;

public class HoaDon {
    private String maHoaDon;
    private String tenKhachHang;
    private String loaiKhach;
    private int dinhMuc;

    public HoaDon() {
    }

    public HoaDon(String maHoaDon, String tenKhachHang, String loaiKhach, int dinhMuc) {
        this.maHoaDon = maHoaDon;
        this.tenKhachHang = tenKhachHang;
        this.loaiKhach = loaiKhach;
        this.dinhMuc = dinhMuc;
    }

    public String getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    public String getLoaiKhach() {
        return loaiKhach;
    }

    public void setLoaiKhach(String loaiKhach) {
        this.loaiKhach = loaiKhach;
    }

    public int getDinhMuc() {
        return dinhMuc;
    }

    public void setDinhMuc(int dinhMuc) {
        this.dinhMuc = dinhMuc;
    }

    @Override
    public String toString() {
        return "HoaDon{" +
                "maHoaDon='" + maHoaDon + '\'' +
                ", tenKhachHang='" + tenKhachHang + '\'' +
                ", loaiKhach='" + loaiKhach + '\'' +
                ", dinhMuc=" + dinhMuc +
                '}';
    }
}
