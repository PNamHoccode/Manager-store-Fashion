/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Com.Sport.Entity;

import Com.Sport.ultils.XDate;
import java.util.Date;

/**
 *
 * @author ADMIN
 */
public class KhachHang {
    private String MaKH;
    private String TenKH;
    private String GioiTinh;
    private boolean ThanhVien=true;
    private String SoDT;
    private String Email;
    private String DiaChi;
    private Date NgayMua = new Date();

    @Override
    public String toString() {
       return this.MaKH + "" + this.TenKH;
    }

    public KhachHang() {
    }

    public KhachHang(String MaKH, String TenKH, String GioiTinh, String SoDT, String Email, String DiaChi) {
        this.MaKH = MaKH;
        this.TenKH = TenKH;
        this.GioiTinh = GioiTinh;
        this.SoDT = SoDT;
        this.Email = Email;
        this.DiaChi = DiaChi;
    }

    
    public String getMaKH() {
        return MaKH;
    }

    public void setMaKH(String MaKH) {
        this.MaKH = MaKH;
    }

    public String getTenKH() {
        return TenKH;
    }

    public void setTenKH(String TenKH) {
        this.TenKH = TenKH;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public boolean isThanhVien() {
        return ThanhVien;
    }

    public void setThanhVien(boolean ThanhVien) {
        this.ThanhVien = ThanhVien;
    }

    public String getSoDT() {
        return SoDT;
    }

    public void setSoDT(String SoDT) {
        this.SoDT = SoDT;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public Date getNgayMua() {
        return NgayMua;
    }

    public void setNgayMua(Date NgayMua) {
        this.NgayMua = NgayMua;
    }
    
}
