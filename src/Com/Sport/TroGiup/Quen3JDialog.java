/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package Com.Sport.TroGiup;

import Com.Sport.Dao.NhanVienDao;
import Com.Sport.Entity.NhanVien;
import Com.Sport.ultils.MsgBox;
import Com.Sport.ultils.XImage;
import java.awt.Color;
import javax.management.modelmbean.ModelMBean;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

/**
 *
 * @author ngomi
 */
public class Quen3JDialog extends javax.swing.JDialog {

    String MaNV;
    String hoTen;
    String email;
    NhanVienDao dao = new NhanVienDao();

    /**
     * Creates new form QuenMatKhau
     */
    public Quen3JDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        init();
    }

   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        btnDoiMatKhau = new javax.swing.JButton();
        btnQuayLai = new javax.swing.JButton();
        btnCauHoi = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        chkHienThi = new javax.swing.JCheckBox();
        txtmatKhauMoi = new javax.swing.JPasswordField();
        txtXacNhanMatKhau = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        lblNhanVien = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 51));
        jLabel1.setText("Thiết lập mật khẩu mới");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 20, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 53, 440, 10));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 214, 440, 10));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 255, 51));
        jLabel2.setText("Tạo mật khẩu mới:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 125, -1, -1));

        btnDoiMatKhau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Com/Sport/Icon/Unlock.png"))); // NOI18N
        btnDoiMatKhau.setText("Đổi mật khẩu");
        btnDoiMatKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoiMatKhauActionPerformed(evt);
            }
        });
        getContentPane().add(btnDoiMatKhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, -1, -1));

        btnQuayLai.setIcon(new javax.swing.ImageIcon("D:\\DuAn1\\src\\Com\\Sport\\Icon\\prev.png")); // NOI18N
        btnQuayLai.setText("Quay lại");
        btnQuayLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuayLaiActionPerformed(evt);
            }
        });
        getContentPane().add(btnQuayLai, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, -1, -1));

        btnCauHoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Com/Sport/Icon/Comment.png"))); // NOI18N
        btnCauHoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCauHoiActionPerformed(evt);
            }
        });
        getContentPane().add(btnCauHoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, -1, 33));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 255, 51));
        jLabel3.setText("Xác nhận mật khẩu mới:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 169, -1, -1));

        chkHienThi.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        chkHienThi.setForeground(new java.awt.Color(51, 255, 51));
        chkHienThi.setText("Hiển thị");
        chkHienThi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkHienThiActionPerformed(evt);
            }
        });
        getContentPane().add(chkHienThi, new org.netbeans.lib.awtextra.AbsoluteConstraints(369, 187, -1, -1));
        getContentPane().add(txtmatKhauMoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 141, 357, -1));
        getContentPane().add(txtXacNhanMatKhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 186, 357, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 255, 51));
        jLabel4.setText("Tên nhân viên");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 69, -1, -1));

        lblNhanVien.setText("Tên");
        getContentPane().add(lblNhanVien, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 97, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Com/Sport/logos/mail-3644-x-2733-background-8rakz3vu1aitg5mq - Copy.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 260));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDoiMatKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoiMatKhauActionPerformed
        doiMatKhau();
    }//GEN-LAST:event_btnDoiMatKhauActionPerformed

    private void btnCauHoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCauHoiActionPerformed
        new GhiChuJDialog(null, true).setVisible(true);
    }//GEN-LAST:event_btnCauHoiActionPerformed

    private void chkHienThiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkHienThiActionPerformed
        hienThi();
    }//GEN-LAST:event_chkHienThiActionPerformed

    private void btnQuayLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuayLaiActionPerformed
        this.dispose();
        new QuenJDialog(null, true).setVisible(true);
    }//GEN-LAST:event_btnQuayLaiActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Quen3JDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Quen3JDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Quen3JDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Quen3JDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Quen3JDialog dialog = new Quen3JDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCauHoi;
    private javax.swing.JButton btnDoiMatKhau;
    private javax.swing.JButton btnQuayLai;
    private javax.swing.JCheckBox chkHienThi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblNhanVien;
    private javax.swing.JPasswordField txtXacNhanMatKhau;
    private javax.swing.JPasswordField txtmatKhauMoi;
    // End of variables declaration//GEN-END:variables
 void init() {
        setIconImage(XImage.getAppIcon());
        setLocationRelativeTo(null);
        setTitle("QUÊN MẬT KHẨU");
        getContentPane().setBackground(Color.white);
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
        lblNhanVien.setText(MaNV);
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public NhanVien getModel() {
        String matKhauMoi = new String(txtmatKhauMoi.getPassword());
        String maNV = lblNhanVien.getText();
        NhanVien model = new NhanVien();
        model.setMaNV(maNV);
        model.setHoTen(hoTen);
        model.setEmail(email);
        model.setMatKhau(matKhauMoi);
        return model;
    }

    public void doiMatKhau() {
        if (validates()) {
            String matKhauMoi = new String(txtmatKhauMoi.getPassword());
            String xacNhanMatKhauMoi = new String(txtXacNhanMatKhau.getPassword());
            if (!xacNhanMatKhauMoi.equals(matKhauMoi)) {
                MsgBox.alert(this, "Xác nhận mật khẩu mới không khớp");
            } else {
                try {
                    NhanVien model = getModel();
                    dao.update(model);
                    MsgBox.alert(this, "Đổi mật khẩu thành công");
                    this.dispose();
                    new DangNhap(null, true).setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                    MsgBox.alert(this, "Đỏi mật khẩu thất bại"+e.getMessage());
                }
            }
        }
    }

    public void hienThi() {
        if (chkHienThi.isSelected()) {
            txtmatKhauMoi.setEchoChar((char) 0);
            txtXacNhanMatKhau.setEchoChar((char) 0);
        } else {
            txtmatKhauMoi.setEchoChar('*');
            txtXacNhanMatKhau.setEchoChar('*');
        }
    }

    public boolean validates() {
        String matKhau = new String(txtmatKhauMoi.getPassword());
        String xacNhanMatKhau = new String(txtXacNhanMatKhau.getPassword());
        if (matKhau.isEmpty()) {
            MsgBox.alert(this, "Bạn chưa nhập mật khẩu để tạo mật khẩu");
            txtmatKhauMoi.requestFocus();
            return false;
        }
        if (xacNhanMatKhau.isEmpty()) {
            MsgBox.alert(this, "Bạn chưa xác nhận mật khẩu");
            txtXacNhanMatKhau.requestFocus();
            return false;
        }
        return true;
    }
}