/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Com.Sport.Dao;

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
public class KhachHAngDao extends HomeDao<KhachHang, String>{
     public void insert(KhachHang model) {
        String sql = "INSERT INTO KhachHang (MaKH, TenKH, GioiTinh,ThanhVien ,SoDT,Email,DiaChi,NgayMua) VALUES (?, ?, ?, ? , ? , ?,?,?)";
        Xjdbc.update(sql,
                model.getMaKH(),
                model.getTenKH(),
                model.getGioiTinh(),
                model.isThanhVien(),
                model.getSoDT(),
                model.getEmail(),
                model.getDiaChi(),
                model.getNgayMua()
                );
    }

    public void update(KhachHang model) {
        String sql = "UPDATE KhachHang SET  TenKH=?, GioiTinh=?,ThanhVien=? ,SoDT=?,Email=?,DiaChi=?,NgayMua=? WHERE MaKH=?";
        Xjdbc.update(sql,
                
                model.getTenKH(),
                model.getGioiTinh(),
                model.isThanhVien(),
                model.getSoDT(),
                model.getEmail(),
                model.getDiaChi(),
                model.getNgayMua(),
                model.getMaKH()
        );

    }

    public void delete(String MaNV) {
        String sql = "DELETE FROM KhachHang WHERE MaKH=?";
        Xjdbc.update(sql, MaNV);
    }

    public List<KhachHang> selectAll() {
        String sql = "SELECT * FROM KhachHang";
        return this.selectBySql(sql);
    }

    public KhachHang selectById(String makh) {
        String sql = "SELECT * FROM KhachHang WHERE MaKH=?";
        List<KhachHang> list = this.selectBySql(sql, makh);
        return list.size() > 0 ? list.get(0) : null;
    }

    protected List<KhachHang> selectBySql(String sql, Object... args) {
        List<KhachHang> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = Xjdbc.query(sql, args);
                while (rs.next()) {
                    KhachHang entity = new KhachHang();
                    entity.setMaKH(rs.getString("MaKH"));
                    entity.setTenKH(rs.getString("TenKH"));
                    entity.setGioiTinh(rs.getString("GioiTinh"));
                    entity.setThanhVien(rs.getBoolean("ThanhVien"));
                    entity.setSoDT(rs.getString("SoDT"));
                    entity.setEmail(rs.getString("Email"));
                    entity.setDiaChi(rs.getString("DiaChi"));
                    entity.setNgayMua(rs.getDate("NgayMua"));
                   

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
         return list ;
        
    }
      public List<KhachHang> selectByKeyword(String keyword) {
        String sql = "SELECT * FROM KhachHang WHERE TenKh LIKE ? ";
        return this.selectBySql(sql, "%" + keyword + "%");
    }

    public List<KhachHang> selectNotInCourse(int makh, String keyword) {
        String sql = "SELECT * FROM KhachHang "
                + " WHERE HoTen LIKE ? AND "
                + " MaNH NOT IN (SELECT MaKH FROM KhachHang WHERE MaKH=?)";
        return this.selectBySql(sql, "%" + keyword + "%", makh);
    }
     
    
}
