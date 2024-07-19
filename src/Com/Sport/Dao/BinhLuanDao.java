/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Com.Sport.Dao;

import Com.Sport.Entity.BinhLuan;
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
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */



/**
 *
 * @author ADMIN
 */
public class BinhLuanDao extends HomeDao<BinhLuan, String>{
     public void insert(BinhLuan model) {
        String sql = "INSERT INTO BinhLuan (MaBL, NoiDung,NgayTao,MaSP ) VALUES (?, ?, ?, ? )";
        Xjdbc.update(sql,
                
               
                model.getMaBL(),
                model.getNoiDung(),
                model.getNgayTao(),
                model.getMaSP()
                );

    }

    public void update(BinhLuan model) {
        String sql = "UPDATE BinhLuan SET  NoiDung=?,NgayTao=?,MaSP=? WHERE MaBL=?";
        Xjdbc.update(sql,
                
                
          
                model.getNoiDung(),
                model.getNgayTao(),
                model.getMaSP(),
                model.getMaBL()
                );

    }

    public void delete(String MaBL) {
        String sql = "DELETE FROM BinhLuan WHERE MaBL=?";
        Xjdbc.update(sql, MaBL);
    }

    public List<BinhLuan> selectAll() {
        String sql = "SELECT * FROM BinhLuan";
        return this.selectBySql(sql);
    }

    public BinhLuan selectById(String MaBL) {
        String sql = "SELECT * FROM BinhLuan WHERE MaBL=?";
        List<BinhLuan> list = this.selectBySql(sql, MaBL);
        return list.size() > 0 ? list.get(0) : null;
    }

    protected List<BinhLuan> selectBySql(String sql, Object... args) {
        List<BinhLuan> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = Xjdbc.query(sql, args);
                while (rs.next()) {
                    BinhLuan entity = new BinhLuan();
                    entity.setMaBL(rs.getString("MaBL"));
                    entity.setNoiDung(rs.getString("NoiDung"));
                    entity.setNgayTao(rs.getDate("NgayTao"));
                    entity.setMaKH(rs.getString("MaKH"));
                    entity.setMaSP(rs.getString("MaSP"));
                   
                   

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
    
}
