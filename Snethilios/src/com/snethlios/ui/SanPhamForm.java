/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snethlios.ui;

import com.snethlios.dao.SanPhamDao;
import com.snethlios.entity.SanPham;
import com.snethlios.utils.MsgBox;
import com.snethlios.utils.XImage;
import java.io.File;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class SanPhamForm extends javax.swing.JInternalFrame {
int index = -1;
    /**
     * Creates new form TrangChu
     */
    public SanPhamForm() {
        initComponents();
    }
  SanPhamDao dao = new SanPhamDao();
void loadData() {
        DefaultTableModel model = (DefaultTableModel) tblSanPham.getModel();
        model.setRowCount(0);
        try {
            List<SanPham> list = dao.selectAll();
            for (SanPham sp : list) {
                Object[] row = {
                    sp.getMaSp(),
                    sp.getTenSp(),
                    sp.getLoai(),
                    sp.getDonGia(),
                    sp.getSoLuong(),
                    sp.getMau(),
                    sp.getKichThuoc(),
                    sp.getHang(),
                    sp.getHinh(),
                    sp.getNgayNhap()
                };
                model.addRow(row);
            }
        } catch (Exception e) {
            MsgBox.alert(this, "Lỗi truy vấn dữ liệu!");
        }
    }

    void fillComboBoxHang() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboHang.getModel();
        model.removeAllElements();
        try {
            List<SanPham> list = dao.selectAll();
            for (SanPham cd : list) {
                model.addElement(cd);
            }
        } catch (Exception e) {
           MsgBox.alert(this, "Lỗi truy vấn dữ liệu!");
        }
    }

    void edit() {
        String maSP = (String) tblSanPham.getValueAt(index, 0);
        SanPham model = dao.selectByID(String.valueOf(maSP));
        this.setForm(model);
        this.setStatus(false);

    }
//    ChuyenDeDAO cddao = new ChuyenDeDAO();

    void setForm(SanPham model) {
        txtmaSP.setText(model.getMaSp());
        txttenSP.setText(model.getTenSp());
        txtLoai.setText(model.getLoai());
//        cboLoaiSP.setToolTipText(String.valueOf(model.getLoai()));
        txtDonGia.setText(String.valueOf(model.getDonGia()));
        txtSoLuong.setText(String.valueOf(model.getSoLuong()));
        txtMau.setText(model.getMau());
        txtKichThuoc.setText(String.valueOf(model.getKichThuoc()));
        txtNgayNhap.setText(String.valueOf(model.getNgayNhap()));
        cboHang.setToolTipText(String.valueOf(model.getHang()));
        lblAnh.setText(model.getHinh());
        
//        cboChuyenDe.setToolTipText(String.valueOf(model.getMaKH()));
//        cboChuyenDe.setSelectedItem(cddao.findById(model.getMaCD()));
//        txtChuyenDe.setText(String.valueOf(model.getMaCD()));

    }

    SanPham getForm() {
        SanPham model = new SanPham();
        model.setMaSp(txtmaSP.getText());
        model.setTenSp(txttenSP.getText());
       model.setLoai(txtLoai.getText());
        model.setDonGia(Double.parseDouble(txtDonGia.getText()));
        model.setSoLuong(Integer.parseInt(txtSoLuong.getText()));
        model.setMau(txtMau.getText());
        model.setKichThuoc(Integer.parseInt(txtKichThuoc.getText()));
        model.setHang(String.valueOf(cboHang.getToolTipText()));
//        model.setMaPn();
//        ChuyenDe chuyenDe = (ChuyenDe) cboChuyenDe.getSelectedItem();
//        model.setMaCD(chuyenDe.getMaCD());
//        model.setNgayKG(XDate.toDate(txtKhaiGiang.getText(), "dd-MM-yyy"));
//        model.setHocPhi(Double.valueOf(txtHocPhi.getText()));
//        model.setThoiLuong(Integer.valueOf(txtThoiLuong.getText()));
//        model.setGhiChu(txtGhiChu.getText());
////        model.setMaNV(txtNguoiTao.getText());
//        model.setMaNV(ShareHelper.USER.getMaNV());
//
//        Date now = new Date();
//        model.setNgayTao(XDate.addDays(now, 10));
//        model.setMaKH(Integer.valueOf(cboChuyenDe.getToolTipText()));
//        model.setNgayTao(XDate.addDays(, WIDTH));
        return model;
    }

    void setStatus(boolean insertable) {
        btninsert.setEnabled(insertable);
        btnupdate.setEnabled(!insertable);
        btndelete.setEnabled(!insertable);

        boolean first = this.index > 0;
        boolean last = this.index < tblSanPham.getRowCount() - 1;
//        btnFirst.setEnabled(!insertable && first);
//        btnPrev.setEnabled(!insertable && first);
//        btnLast.setEnabled(!insertable && last);
//        btnNext.setEnabled(!insertable && last);

    }

    JFileChooser FileChooser = new JFileChooser();
    public void chonAnh() {
        if (FileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            File file = FileChooser.getSelectedFile();
            XImage.save(file);
            lblAnh.setIcon(XImage.read(file.getName()));
            lblAnh.setToolTipText(file.getName());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        lblAnh = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtmaSP = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txttenSP = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        txtDonGia = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        cboHang = new javax.swing.JComboBox<>();
        btndelete = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btninsert = new javax.swing.JButton();
        btnnew = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        txtSoLuong = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        txtMau = new javax.swing.JTextField();
        txtKichThuoc = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        txtNgayNhap = new javax.swing.JTextField();
        txtLoai = new javax.swing.JTextField();
        jPanel20 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jTextField19 = new javax.swing.JTextField();
        jComboBox5 = new javax.swing.JComboBox<>();
        jLabel30 = new javax.swing.JLabel();
        jTextField21 = new javax.swing.JTextField();
        jComboBox6 = new javax.swing.JComboBox<>();
        jSeparator5 = new javax.swing.JSeparator();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblSanPham = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jPanel18.setBorder(javax.swing.BorderFactory.createTitledBorder("Quản Lý Sản Phẩm"));

        jPanel19.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblAnh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAnhMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAnh, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAnh, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel22.setText("Mã Sản Phẩm");

        jLabel23.setText("Tên Sản Phẩm:");

        jLabel24.setText("Loại Sản Phẩm:");

        jLabel25.setText("Đơn Giá:");

        jLabel26.setText("Số Lượng");

        jLabel27.setText("Kích Thước:");

        jLabel28.setText("Hãng");

        cboHang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btndelete.setText("XÓA");

        btnupdate.setText("CẬP NHẬT");

        btninsert.setText("THÊM");

        btnnew.setText("MỚI");

        jButton17.setText("Thêm Ảnh");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jLabel31.setText("Màu Sắc:");

        jLabel32.setText("Ngày Nhập:");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jButton17))))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btndelete)))
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel18Layout.createSequentialGroup()
                                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                                    .addComponent(jLabel23)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txttenSP))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                                    .addComponent(jLabel22)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtmaSP, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addComponent(jLabel24)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtMau, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel18Layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cboHang, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel18Layout.createSequentialGroup()
                            .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel18Layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btninsert))
                                .addGroup(jPanel18Layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel18Layout.createSequentialGroup()
                                    .addGap(39, 39, 39)
                                    .addComponent(btnupdate)
                                    .addGap(59, 59, 59)
                                    .addComponent(btnnew, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel18Layout.createSequentialGroup()
                                    .addGap(12, 12, 12)
                                    .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtNgayNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtKichThuoc, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtmaSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txttenSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(25, 25, 25)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtKichThuoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNgayNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnnew, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btndelete, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btninsert, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel20.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông Tin Sản Phẩm"));
        jPanel20.setDoubleBuffered(false);
        jPanel20.setEnabled(false);

        jLabel29.setText("Tên SP:");

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất Cả", " " }));

        jLabel30.setText("Loại SP:");

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất Cả", " " }));

        jSeparator5.setForeground(new java.awt.Color(51, 51, 51));

        tblSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã SP", "Tên SP", "Loại SP", "Đơn Giá", "Số Lượng ", "Màu Sắc", "Kích thước", "Hãng", "Hình Ảnh", "Hình Thức", "MaPN"
            }
        ));
        tblSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSanPhamMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(tblSanPham);

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator5)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(67, 67, 67)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField19, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                            .addComponent(jTextField21))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23))))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(7, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblAnhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAnhMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {
            chonAnh();
        }
    }//GEN-LAST:event_lblAnhMouseClicked

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
        this.chonAnh();
    }//GEN-LAST:event_jButton17ActionPerformed

    private void tblSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSanPhamMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 1) {
            index = tblSanPham.getSelectedRow();
            edit();
        }
    }//GEN-LAST:event_tblSanPhamMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btninsert;
    private javax.swing.JButton btnnew;
    private javax.swing.JButton btnupdate;
    private javax.swing.JComboBox<String> cboHang;
    private javax.swing.JButton jButton17;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JLabel lblAnh;
    private javax.swing.JTable tblSanPham;
    private javax.swing.JTextField txtDonGia;
    private javax.swing.JTextField txtKichThuoc;
    private javax.swing.JTextField txtLoai;
    private javax.swing.JTextField txtMau;
    private javax.swing.JTextField txtNgayNhap;
    private javax.swing.JTextField txtSoLuong;
    private javax.swing.JTextField txtmaSP;
    private javax.swing.JTextField txttenSP;
    // End of variables declaration//GEN-END:variables
}
