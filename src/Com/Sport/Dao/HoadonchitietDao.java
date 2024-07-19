/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Com.Sport.Dao;

import Com.Sport.Entity.HoaDon;
import Com.Sport.Entity.HoaDonChiTiet;
import Com.Sport.ultils.Xjdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class HoadonchitietDao extends HomeDao<HoaDonChiTiet, String> {

 public void insert(HoaDonChiTiet model) {
        String sql = "INSERT INTO HoaDonChiTiet (MaHDCT,MaSP,MaHD,ThanhTien) VALUES ( ?, ? , ?,? )";
        Xjdbc.update(sql,
                model.getMaHDCT(),                                           
                model.getMaSP(),
                 model.getMaHD(),
                model.getThanhTien()              
                               
               
               
        );

    }

    public void update(HoaDonChiTiet model) {
        String sql = "UPDATE HoaDonChiTiet SET MaSP=?,MaHD=?,ThanhTien=? WHERE MaHDCT=?";
        Xjdbc.update(sql,                                        
                                                        
                model.getMaSP(),
                 model.getMaHD(),
                model.getThanhTien(),             
                    model.getMaHDCT()            
        );

    }

    public void delete(String MaHDCT) {
        String sql = "DELETE FROM HoaDonChiTiet WHERE MaHDCT=?";
        Xjdbc.update(sql, MaHDCT);
    }

    public List<HoaDonChiTiet> selectAll() {
        String sql = "SELECT * FROM HoaDonChiTiet ORDER BY MaHDCT ASC";
        return this.selectBySql(sql);
    }

    public HoaDonChiTiet selectById(String MaHDCT) {
        String sql = "SELECT * FROM HoaDonChiTiet WHERE MaHDCT=?";
        List<HoaDonChiTiet> list = this.selectBySql(sql, MaHDCT);
        return list.size() > 0 ? list.get(0) : null;
    }

    protected List<HoaDonChiTiet> selectBySql(String sql, Object... args) {
        List<HoaDonChiTiet> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = Xjdbc.query(sql, args);
                while (rs.next()) {
                    HoaDonChiTiet entity = new HoaDonChiTiet();
                    entity.setMaHDCT(rs.getString("MaHDCT"));                 
                    entity.setMaSP(rs.getString("MaSP"));                   
                    entity.setMaHD(rs.getString("MaHD"));                   
                     entity.setThanhTien(Double.parseDouble(rs.getString("ThanhTien")));
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
}
