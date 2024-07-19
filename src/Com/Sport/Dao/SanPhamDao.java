/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Com.Sport.Dao;

import Com.Sport.Entity.NhanVien;
import Com.Sport.Entity.SanPham;
import Com.Sport.ultils.Xjdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class SanPhamDao extends HomeDao<SanPham, String>{
public void insert(SanPham model) {
        String sql = "INSERT INTO SanPham (MaSP ,TenSP ,LoaiSP ,Size ,SoLuong ,Hinh ,MoTa ,GhiChu ,Gia) VALUES (?, ?, ?, ? , ? , ?,?,?,?)";
        Xjdbc.update(sql,
                model.getMaSP(),
                model.getTenSP(),
                model.getLoaiSP(),
                model.getSize(),
                model.getSoLuong(),
                model.getHinh(),
                model.getMoTa(),
                model.getGhiChu(),
                model.getGia()
               );

    }

    public void update(SanPham model) {
        String sql = "UPDATE SanPham set TenSP =? ,LoaiSP =?,Size =?,SoLuong =?,Hinh =?,MoTa =?,GhiChu=?,Gia=?  WHERE MaSP =?";
        Xjdbc.update(sql,
               model.getTenSP(),
                model.getLoaiSP(),
                model.getSize(),
                model.getSoLuong(),
                model.getHinh(),
                model.getMoTa(),
                model.getGhiChu(),
                model.getGia(),
                model.getMaSP()
               );

    }

    public void delete(String MaSP) {
        String sql = "DELETE FROM SanPham WHERE MaSP=?";
        Xjdbc.update(sql, MaSP);
    }

    public List<SanPham> selectAll() {
        String sql = "SELECT * FROM SanPham ORDER BY CAST(SUBSTRING(MaSP, PATINDEX('%[0-9]%', MaSP), LEN(MaSP)) AS nvarchar) ASC; ";
        return this.selectBySql(sql); 
    }

    public SanPham selectById(String MaSP) {
        String sql = "SELECT * FROM SanPham WHERE MaSP=?";
        List<SanPham> list = this.selectBySql(sql, MaSP);
        return list.size() > 0 ? list.get(0) : null;
    }

    protected List<SanPham> selectBySql(String sql, Object... args) {
        List<SanPham> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = Xjdbc.query(sql, args);
                while (rs.next()) {
                    SanPham entity = new SanPham();
                    entity.setMaSP(rs.getString("MaSP"));
                    entity.setTenSP(rs.getString("TenSP"));
                    entity.setLoaiSP(rs.getString("LoaiSP"));
                    entity.setSize(rs.getString("Size"));
                    entity.setSoLuong(rs.getInt("SoLuong"));
                    entity.setHinh(rs.getString("Hinh"));
                    entity.setMoTa(rs.getString("MoTa"));
                    entity.setGhiChu(rs.getString("GhiChu"));
                  entity.setGia(rs.getFloat("Gia"));

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
//     public List<SanPham> getSanPham(String masp){
//        String sql = "{CALL Sp_ThongKeSanPham(?)}";
//        String[] cols = {"MaSP", "TenSP", "Loai","SoLuong"};
//        return this.getSanPham(masp);
//    }
     public List<SanPham> selectByKeyword(String keyword) {
        String sql = "SELECT * FROM SanPham WHERE TenSP LIKE ? ";
        return this.selectBySql(sql, "%" + keyword + "%");
    }
}
