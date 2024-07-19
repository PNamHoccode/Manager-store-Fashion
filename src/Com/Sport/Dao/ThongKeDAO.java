package Com.Sport.Dao;


import Com.Sport.Entity.NhanVien;
import Com.Sport.Entity.SanPham;
import Com.Sport.ultils.Xjdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ThongKeDAO {
    private List<Object[]> getListOfArray(String sql, String[] cols, Object...args){
        try {
            List<Object[]> list=new ArrayList<>();
            ResultSet rs = Xjdbc.query(sql, args);
            while(rs.next()){
                Object[] vals = new Object[cols.length];
                for(int i=0; i<cols.length; i++){
                    vals[i] = rs.getObject(cols[i]);
                }
                list.add(vals);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    

    
    public List<Object[]> getDoanhThu(int nam){
        String sql = "{CALL sp_doanhthu (?)}";
        String[] cols = {"SanPham", "SoHD",  "DoanhThu" ,"CaoNhat", "ThapNhat", "TrungBinh"};
        return this.getListOfArray(sql, cols, nam);
    }

    public List<Object[]> getSanPham(String masp){
        String sql = "{CALL Sp_ThongKeSanPham(?)}";
        String[] cols = {"MaSP", "TenSP", "Loai","SoLuong"};
        return this.getListOfArray(sql, cols, masp);
    }
   public List<Object[]> getLuongKhachHang(){
        String sql = "{CALL sp_LuongKhachHang}";
        String[] cols = {"Nam", "SoLuong", "DauTien", "CuoiCung"};
        return this.getListOfArray(sql, cols);
    }
    
}

