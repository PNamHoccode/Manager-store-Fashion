/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Com.Sport.Dao;

import Com.Sport.Entity.HoaDon;
import Com.Sport.Entity.KhachHang;
import Com.Sport.ultils.Xjdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class HoaDonDao extends HomeDao<HoaDon, String> {

    public void insert(HoaDon model) {
        String sql = "INSERT INTO HoaDon (MaHD,DonGia,SoLuong,TongTien,TenSP,NgayLap,MaNV,MaKH) VALUES (?, ?, ?, ? ,?,?,?,?)";
        Xjdbc.update(sql,
                model.getMaHD(),
                model.getDongia(),
                model.getSoluong(),
                model.getTongTien(),
                model.getTensp(),
                model.getNgayLap(),
                model.getMaNV(),
                model.getMaKH()
        );

    }

    public void update(HoaDon model) {
        String sql = "UPDATE HoaDOn SET DonGia=?,SoLuong=?,TongTien=?,TenSP=?,NgayLap=?,MaNV=?,MaKH=? WHERE MaHD=?";
        Xjdbc.update(sql,
                model.getDongia(),
                model.getSoluong(),
                model.getTongTien(),
                model.getTensp(),
                model.getNgayLap(),
                model.getMaNV(),
                model.getMaKH(),
                model.getMaHD()
        );

    }

    public void delete(String MaHD) {
        String sql = "DELETE FROM HoaDon WHERE MaHD=?";
        Xjdbc.update(sql, MaHD);
    }

    public List<HoaDon> selectAll() {
        String sql = "SELECT * FROM HoaDon ORDER BY CAST(SUBSTRING(MaHD, PATINDEX('%[0-9]%', MaHD), LEN(MaHD)) AS nvarchar) ASC;";
        return this.selectBySql(sql);
    }

    public HoaDon selectById(String maHD) {
        String sql = "SELECT * FROM HoaDon WHERE MaHD=?";
        List<HoaDon> list = this.selectBySql(sql, maHD);
        return list.size() > 0 ? list.get(0) : null;
    }
    

    protected List<HoaDon> selectBySql(String sql, Object... args) {
        List<HoaDon> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = Xjdbc.query(sql, args);
                while (rs.next()) {
                    HoaDon entity = new HoaDon();
                    entity.setMaHD(rs.getString("MaHD"));
                    entity.setDongia(rs.getFloat("DonGia"));
                    entity.setSoluong(rs.getInt("SoLuong"));
                    entity.setTongTien(rs.getFloat("TongTien"));
                    entity.setTensp(rs.getString("TenSP"));
                    entity.setNgayLap(rs.getDate("NgayLap"));
                    entity.setMaKH(rs.getString("MaKH"));
                    entity.setMaNV(rs.getString("MaNV"));

                    list.add(entity);
                }
            } finally {
                if (rs != null) {
                    rs.getStatement().getConnection().close();
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        return list;

    }

    public List<Integer> selectYears() {
        String sql = "SELECT DISTINCT year(NgayLap) Year FROM hoadon ORDER BY Year DESC";
        List<Integer> list = new ArrayList<>();
        try {
            ResultSet rs = Xjdbc.query(sql);
            while (rs.next()) {
                list.add(rs.getInt(1));
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
    public void tinhtong(){
        String sql = "select sum(soluong*dongia) from HoaDon";
    }
}
