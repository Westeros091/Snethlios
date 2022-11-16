package form;

import java.awt.CardLayout;
import javax.swing.ImageIcon;
import model.Model_Card;

public class ThongKeJPanel extends javax.swing.JPanel {
//[998, 649]
    public ThongKeJPanel() {
        initComponents();
        card1.setData(new Model_Card(new ImageIcon(getClass().getResource("/icon/stock.png")), "Tổng khách hàng/ngày", "23", "Increased by 60%"));
        card2.setData(new Model_Card(new ImageIcon(getClass().getResource("/icon/profit.png")), "Tổng doanh thu/ngày", "$15000", "Increased by 25%"));
        card3.setData(new Model_Card(new ImageIcon(getClass().getResource("/icon/flag.png")), "Tổng doanh thu/tháng", "$300000", "Increased by 70%"));
        card4.setData(new Model_Card(new ImageIcon(getClass().getResource("/icon/flag.png")), "Tổng doanh thu/năm", "$9300000", "Increased by 50%"));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        card1 = new component.CardJPanel();
        card2 = new component.CardJPanel();
        card3 = new component.CardJPanel();
        card4 = new component.CardJPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        pnlCard = new javax.swing.JPanel();
        jPanel35 = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        jTable8 = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jButton33 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        Năm = new javax.swing.JLabel();
        jComboBox10 = new javax.swing.JComboBox<>();
        Năm1 = new javax.swing.JLabel();
        ThongKe_rdoBang = new javax.swing.JRadioButton();
        ThongKe_rdoBieuDo = new javax.swing.JRadioButton();
        jButton19 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();

        setBackground(new java.awt.Color(247, 247, 247));

        jPanel1.setBackground(new java.awt.Color(237, 237, 237));
        jPanel1.setLayout(new java.awt.GridLayout(1, 0, 10, 0));

        card1.setColor1(new java.awt.Color(21, 96, 192));
        card1.setColor2(new java.awt.Color(185, 43, 39));
        jPanel1.add(card1);

        card2.setColor1(new java.awt.Color(56, 239, 125));
        card2.setColor2(new java.awt.Color(17, 153, 142));
        jPanel1.add(card2);

        card3.setColor1(new java.awt.Color(255, 153, 102));
        card3.setColor2(new java.awt.Color(255, 94, 98));
        jPanel1.add(card3);

        card4.setColor1(new java.awt.Color(195, 20, 50));
        card4.setColor2(new java.awt.Color(36, 11, 53));
        jPanel1.add(card4);

        jPanel2.setOpaque(false);

        pnlCard.setLayout(new java.awt.CardLayout());

        jPanel35.setBackground(new java.awt.Color(255, 255, 255));
        jPanel35.setOpaque(false);

        jLabel51.setText("CHI TIẾT DOANH THU");

        jTable8.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Tháng", "Sản phẩm bán", "Tổng số bán", "Tổng giảm giá", "Doanh thu"
            }
        ));
        jScrollPane12.setViewportView(jTable8);

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel35Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel51)
                .addGap(304, 304, 304))
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane12, javax.swing.GroupLayout.DEFAULT_SIZE, 726, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel51)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlCard.add(jPanel35, "card3");

        jButton33.setText("jButton33");

        jButton34.setText("jButton34");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(365, 365, 365)
                        .addComponent(jButton33))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(575, 575, 575)
                        .addComponent(jButton34)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jButton34)
                .addGap(92, 92, 92)
                .addComponent(jButton33)
                .addContainerGap(163, Short.MAX_VALUE))
        );

        pnlCard.add(jPanel7, "card2");

        Năm.setText("Năm");

        jComboBox10.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        Năm1.setText("Lựa chọn hiển thị ");

        buttonGroup1.add(ThongKe_rdoBang);
        ThongKe_rdoBang.setSelected(true);
        ThongKe_rdoBang.setText("Bảng");
        ThongKe_rdoBang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThongKe_rdoBangActionPerformed(evt);
            }
        });

        buttonGroup1.add(ThongKe_rdoBieuDo);
        ThongKe_rdoBieuDo.setText("Biểu đồ");
        ThongKe_rdoBieuDo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThongKe_rdoBieuDoActionPerformed(evt);
            }
        });

        jButton19.setText("Xuất file excel");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Năm)
                    .addComponent(jComboBox10, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Năm1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(ThongKe_rdoBang)
                        .addGap(18, 18, 18)
                        .addComponent(ThongKe_rdoBieuDo))
                    .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(764, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(242, 242, 242)
                    .addComponent(pnlCard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(Năm)
                .addGap(18, 18, 18)
                .addComponent(jComboBox10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Năm1)
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ThongKe_rdoBang)
                    .addComponent(ThongKe_rdoBieuDo))
                .addGap(40, 40, 40)
                .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(103, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pnlCard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Doanh thu", jPanel2);

        jPanel3.setOpaque(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 986, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 379, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Sản phẩm", jPanel3);
        jTabbedPane1.addTab("Thẻ thành viên", jTabbedPane2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 958, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 986, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ThongKe_rdoBangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThongKe_rdoBangActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) pnlCard.getLayout();
        layout.first(pnlCard);
    }//GEN-LAST:event_ThongKe_rdoBangActionPerformed

    private void ThongKe_rdoBieuDoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThongKe_rdoBieuDoActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) pnlCard.getLayout();
        layout.last(pnlCard);
    }//GEN-LAST:event_ThongKe_rdoBieuDoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Năm;
    private javax.swing.JLabel Năm1;
    private javax.swing.JRadioButton ThongKe_rdoBang;
    private javax.swing.JRadioButton ThongKe_rdoBieuDo;
    private javax.swing.ButtonGroup buttonGroup1;
    private component.CardJPanel card1;
    private component.CardJPanel card2;
    private component.CardJPanel card3;
    private component.CardJPanel card4;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JComboBox<String> jComboBox10;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTable8;
    private javax.swing.JPanel pnlCard;
    // End of variables declaration//GEN-END:variables
}
