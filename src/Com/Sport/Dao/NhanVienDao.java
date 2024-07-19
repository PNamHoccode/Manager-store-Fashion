/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Com.Sport.Dao;

import Com.Sport.Entity.NhanVien;
import Com.Sport.ultils.Xjdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class NhanVienDao extends HomeDao<NhanVien, String> {

    public void insert(NhanVien model) {
        String sql = "INSERT INTO NhanVien (MaNV, MatKhau, HoTen,SoDT ,VaiTro,GioiTinh,Diachi,NgaySinh,Email,Hinh) VALUES (?, ?, ?, ? , ? , ?,?,?,?,?)";
        Xjdbc.update(sql,
                model.getMaNV(),
                model.getMatKhau(),
                model.getHoTen(),
                model.getSoDT(),
                model.getVaiTro(),
                model.getGioiTinh(),
                model.getDiaChi(),
                model.getNgaySinh(),
                model.getEmail(),
                model.getHinh());

    }

    public void update(NhanVien model) {
        String sql = "UPDATE NhanVien SET MatKhau=?, HoTen=?, SoDT=?,VaiTro=?,GioiTinh=? ,Diachi=?,NgaySinh=?,Email=?,Hinh=? WHERE MaNV=?";
        Xjdbc.update(sql,
                model.getMatKhau(),
                model.getHoTen(),
                model.getSoDT(),
                model.getVaiTro(),
                model.getGioiTinh(),
                model.getDiaChi(),
                model.getNgaySinh(),
                model.getEmail(),
                model.getHinh(),
                model.getMaNV());

    }

    public void delete(String MaNV) {
        String sql = "DELETE FROM NhanVien WHERE MaNV=?";
        Xjdbc.update(sql, MaNV);
    }

    public List<NhanVien> selectAll() {
        String sql = "SELECT * FROM NhanVien";
        return this.selectBySql(sql);
    }

    public NhanVien selectById(String manv) {
        String sql = "SELECT * FROM NhanVien WHERE MaNV=?";
        List<NhanVien> list = this.selectBySql(sql, manv);
        return list.size() > 0 ? list.get(0) : null;
    }

    protected List<NhanVien> selectBySql(String sql, Object... args) {
        List<NhanVien> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = Xjdbc.query(sql, args);
                while (rs.next()) {
                    NhanVien entity = new NhanVien();
                    entity.setMaNV(rs.getString("MaNV"));
                    entity.setMatKhau(rs.getString("MatKhau"));
                    entity.setHoTen(rs.getString("HoTen"));
                    entity.setSoDT(rs.getString("SoDT"));
                    entity.setVaiTro(rs.getBoolean("VaiTro"));
                    entity.setGioiTinh(rs.getString("GioiTinh"));
                    entity.setDiaChi(rs.getString("DiaChi"));
                    entity.setNgaySinh(rs.getDate("NgaySinh"));
                    entity.setEmail(rs.getString("Email"));
                    entity.setHinh(rs.getString("Hinh"));

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
     public NhanVien selectByEmail(String Email){
        String sql = " select * from NhanVien where Email = ?";
        List<NhanVien> list = selectBySql(sql, Email);
        if(list.isEmpty()){
            return null;
        }else{
            return list.get(0);
        }
    }
}
