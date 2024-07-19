/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Com.Sport.Entity;

/**
 *
 * @author ADMIN
 */
public class SanPham {
    private  String MaSP ;
	private  String TenSP ;
	private  String LoaiSP ;
	private  String Size ;
	private  int SoLuong;
	private  String Hinh ;
	private  String MoTa;
	private  String GhiChu ;
        private String phanloai;
        private float gia;
        

    public SanPham() {
    }

    public SanPham(String MaSP, String TenSP, String LoaiSP, String Size, int SoLuong, String Hinh, String MoTa, String GhiChu) {
        this.MaSP = MaSP;
        this.TenSP = TenSP;
        this.LoaiSP = LoaiSP;
        this.Size = Size;
        this.SoLuong = SoLuong;
        this.Hinh = Hinh;
        this.MoTa = MoTa;
        this.GhiChu = GhiChu;
    }

    public float getGia() {
        return gia;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }

    public String getMaSP() {
        return MaSP;
    }

    public void setMaSP(String MaSP) {
        this.MaSP = MaSP;
    }

    public String getPhanloai() {
        return phanloai;
    }

    public void setPhanloai(String phanloai) {
        this.phanloai = phanloai;
    }

    public String getTenSP() {
        return TenSP;
    }

    public void setTenSP(String TenSP) {
        this.TenSP = TenSP;
    }

    public String getLoaiSP() {
        return LoaiSP;
    }

    public void setLoaiSP(String LoaiSP) {
        this.LoaiSP = LoaiSP;
    }

    public String getSize() {
        return Size;
    }

    public void setSize(String Size) {
        this.Size = Size;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public String getHinh() {
        return Hinh;
    }

    public void setHinh(String Hinh) {
        this.Hinh = Hinh;
    }

    public String getMoTa() {
        return MoTa;
    }

    public void setMoTa(String MoTa) {
        this.MoTa = MoTa;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }
      @Override
     public String toString(){
        return this.MaSP;
     }
}
