/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Com.Sport.Entity;

import java.util.Date;

/**
 *
 * @author ADMIN
 */
public class BinhLuan {
    private String MaBL;
    private String NoiDung;
    private Date NgayTao = new Date();
    private String MaKH;
    private String MaSP;

    public String getMaBL() {
        return MaBL;
    }

    public void setMaBL(String MaBL) {
        this.MaBL = MaBL;
    }

    public String getNoiDung() {
        return NoiDung;
    }

    public void setNoiDung(String NoiDung) {
        this.NoiDung = NoiDung;
    }

    public Date getNgayTao() {
        return NgayTao;
    }

    public void setNgayTao(Date NgayTao) {
        this.NgayTao = NgayTao;
    }

    public String getMaKH() {
        return MaKH;
    }

    public void setMaKH(String MaKH) {
        this.MaKH = MaKH;
    }

    public String getMaSP() {
        return MaSP;
    }

    public void setMaSP(String MaSP) {
        this.MaSP = MaSP;
    }
    
}
