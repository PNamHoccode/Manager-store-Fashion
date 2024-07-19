/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package Com.Sport.QuanLy;

import Com.Sport.Dao.HoaDonDao;
import Com.Sport.Dao.HoadonchitietDao;
import Com.Sport.Dao.KhachHAngDao;
import Com.Sport.Dao.SanPhamDao;
import Com.Sport.Dao.ThongKeDAO;
import Com.Sport.Entity.SanPham;
import Com.Sport.ultils.Auth;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ADMIN
 */
public class ThongKeJDialog extends javax.swing.JDialog {

    /**
     * Creates new form ThongKeJDialog
     */
    public ThongKeJDialog(java.awt.Frame parent, boolean modal) {
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

        tabs = new javax.swing.JTabbedPane();
        lbltkdoanhthu = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbldoanhthu = new javax.swing.JTable();
        cboNam = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblkahchhang = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tbldoanhthu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Sản Phẩm", "Số hoa don", "D.Thu", "DT.CN", "DT.TN", "DT.TB"
            }
        ));
        jScrollPane2.setViewportView(tbldoanhthu);

        cboNam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboNamActionPerformed(evt);
            }
        });

        jLabel3.setText("NĂM: ");

        javax.swing.GroupLayout lbltkdoanhthuLayout = new javax.swing.GroupLayout(lbltkdoanhthu);
        lbltkdoanhthu.setLayout(lbltkdoanhthuLayout);
        lbltkdoanhthuLayout.setHorizontalGroup(
            lbltkdoanhthuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lbltkdoanhthuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lbltkdoanhthuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(lbltkdoanhthuLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboNam, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        lbltkdoanhthuLayout.setVerticalGroup(
            lbltkdoanhthuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lbltkdoanhthuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(lbltkdoanhthuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboNam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tabs.addTab("Doanh Thu", lbltkdoanhthu);

        tblkahchhang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Năm", "SốKH", "DK Sớm Nhất", "DK Muộn Nhất"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblkahchhang);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 794, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabs.addTab("Khách Hàng", jPanel1);

        jLabel1.setText("Tổn Hợp Thống Kê");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(tabs, javax.swing.GroupLayout.PREFERRED_SIZE, 803, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabs))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboNamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboNamActionPerformed
        // TODO add your handling code here:
        fillTableDoanhThu();
    }//GEN-LAST:event_cboNamActionPerformed

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
            java.util.logging.Logger.getLogger(ThongKeJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThongKeJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThongKeJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThongKeJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ThongKeJDialog dialog = new ThongKeJDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox<String> cboNam;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel lbltkdoanhthu;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JTable tbldoanhthu;
    private javax.swing.JTable tblkahchhang;
    // End of variables declaration//GEN-END:variables
    ThongKeDAO dao = new ThongKeDAO();
    KhachHAngDao khdao = new KhachHAngDao();
    // HoadonchitietDao hdctdao = new HoadonchitietDao();
    HoaDonDao hddao = new HoaDonDao();
    SanPhamDao spdao = new SanPhamDao();

    private void init() {
        setLocationRelativeTo(null);
        fillTableDoanhThu();
        fillComboBoxNam();
        filltablekhachhang();
        this.selectTab(0);
        setTitle("Quản Lý Thống kê");
       if(!Auth.isManager()){
            tabs.remove(0);
        }

        DefaultTableCellRenderer cellRenderer = new DefaultTableCellRenderer();
        cellRenderer.setHorizontalAlignment(JLabel.CENTER);
        tbldoanhthu.getColumnModel().getColumn(0).setMinWidth(250);
        tbldoanhthu.getColumnModel().getColumn(1).setCellRenderer(cellRenderer);
        tbldoanhthu.getColumnModel().getColumn(2).setCellRenderer(cellRenderer);
        tbldoanhthu.getColumnModel().getColumn(3).setCellRenderer(cellRenderer);
        tbldoanhthu.getColumnModel().getColumn(4).setCellRenderer(cellRenderer);
        tbldoanhthu.getColumnModel().getColumn(5).setCellRenderer(cellRenderer);
         tblkahchhang.getColumnModel().getColumn(0).setCellRenderer(cellRenderer);
        tblkahchhang.getColumnModel().getColumn(1).setCellRenderer(cellRenderer);
        tblkahchhang.getColumnModel().getColumn(2).setCellRenderer(cellRenderer);
        tblkahchhang.getColumnModel().getColumn(3).setCellRenderer(cellRenderer);

    }
   

    public void selectTab(int index) {
        tabs.setSelectedIndex(index);
    }

    void fillTableDoanhThu() {
        DefaultTableModel model = (DefaultTableModel) tbldoanhthu.getModel();
        model.setRowCount(0);
        Object selectedItem = cboNam.getSelectedItem();
        if (selectedItem != null) {
            int nam = (Integer) selectedItem;
            List<Object[]> list = dao.getDoanhThu(nam);
            for (Object[] row : list) {
                model.addRow(row);
            }
        }
    }

    void fillComboBoxNam() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboNam.getModel();
        model.removeAllElements();
        List<Integer> list = hddao.selectYears();
        if (list != null) {
            for (Integer year : list) {
                if (year != null) {
                    model.addElement(year);
                }
            }
        }
    }

    private void filltablekhachhang() {
        DefaultTableModel model = (DefaultTableModel) tblkahchhang.getModel();
        model.setRowCount(0);
        List<Object[]> list = dao.getLuongKhachHang();
        for(Object[] row : list){
            model.addRow(row);
        }
    }

}
