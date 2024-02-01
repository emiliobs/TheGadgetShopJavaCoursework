package thegadgetshopjavacoursework.Views;

import java.awt.Image;
import  javax.swing.ImageIcon;

/**
 *
 * @author Emilio
 */
public class GadgetShop extends javax.swing.JFrame
{

    /**
     * Creates new form GadgetShop
     */
    public GadgetShop()
    {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/Helps/Images/logo.png")).getImage());
    }

     @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        lbpModel = new javax.swing.JLabel();
        txtModel1 = new javax.swing.JTextField();
        lblPrice = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        lblWeight = new javax.swing.JLabel();
        txtWeight = new javax.swing.JTextField();
        lblSize = new javax.swing.JLabel();
        txtSize = new javax.swing.JTextField();
        lblCredit = new javax.swing.JLabel();
        txtCredit = new javax.swing.JTextField();
        lblMemory = new javax.swing.JLabel();
        txtMemory = new javax.swing.JTextField();
        btnAddMobile = new javax.swing.JButton();
        btnAddMP3 = new javax.swing.JButton();
        btnDisplayAll = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        lblPhoneNumber = new javax.swing.JLabel();
        txtPhoneNumber = new javax.swing.JTextField();
        lblDuration = new javax.swing.JLabel();
        txtDuration = new javax.swing.JTextField();
        lblWeight1 = new javax.swing.JLabel();
        txtDownload = new javax.swing.JTextField();
        lblSize1 = new javax.swing.JLabel();
        txtDisplayNumber = new javax.swing.JTextField();
        btnMakeACall = new javax.swing.JButton();
        btnMakeACall1 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GADGET SHOP!");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(150, 204, 211));

        jPanel2.setBackground(new java.awt.Color(150, 204, 211));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 0), 2), "Data Form.", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 18), new java.awt.Color(255, 51, 0))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.setPreferredSize(new java.awt.Dimension(1375, 1000));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("The Gadget Shop!");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Helps/Images/TheGadgetShop1.png"))); // NOI18N

        jSeparator1.setForeground(new java.awt.Color(255, 51, 0));
        jSeparator1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 51, 51), 2, true));

        jPanel3.setBackground(new java.awt.Color(150, 204, 211));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 51, 51), 2, true), "Enter Mobile and MP3 Data.", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 18), new java.awt.Color(255, 51, 51))); // NOI18N
        jPanel3.setForeground(new java.awt.Color(255, 51, 51));

        lbpModel.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lbpModel.setForeground(new java.awt.Color(255, 51, 51));
        lbpModel.setText("Model: ");

        lblPrice.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblPrice.setForeground(new java.awt.Color(255, 51, 51));
        lblPrice.setText("Price:");

        lblWeight.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblWeight.setForeground(new java.awt.Color(255, 51, 51));
        lblWeight.setText("Weight:");

        lblSize.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblSize.setForeground(new java.awt.Color(255, 51, 51));
        lblSize.setText("Size:");

        lblCredit.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblCredit.setForeground(new java.awt.Color(255, 51, 51));
        lblCredit.setText("Credit: ");

        lblMemory.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblMemory.setForeground(new java.awt.Color(255, 51, 51));
        lblMemory.setText("Memory:");

        btnAddMobile.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btnAddMobile.setForeground(new java.awt.Color(222, 8, 8));
        btnAddMobile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Helps/Images/44636_mobile_phone_icon (1).png"))); // NOI18N
        btnAddMobile.setText("Add Mobile");

        btnAddMP3.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btnAddMP3.setForeground(new java.awt.Color(222, 8, 8));
        btnAddMP3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Helps/Images/7574_mp3_icon.png"))); // NOI18N
        btnAddMP3.setText("Add MP3");

        btnDisplayAll.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btnDisplayAll.setForeground(new java.awt.Color(222, 8, 8));
        btnDisplayAll.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Helps/Images/1055084_screen_monitor_display_icon.png"))); // NOI18N
        btnDisplayAll.setText("Display All");

        btnClear.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btnClear.setForeground(new java.awt.Color(222, 8, 8));
        btnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Helps/Images/38988_edit_clear_sweep_sweeper_icon.png"))); // NOI18N
        btnClear.setText("Clear");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblWeight)
                            .addComponent(lblSize))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtWeight, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                            .addComponent(txtSize)))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addComponent(lblMemory)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtMemory, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addComponent(lblCredit)
                            .addGap(18, 18, 18)
                            .addComponent(txtCredit))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                    .addComponent(lbpModel)
                                    .addGap(18, 18, 18))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                    .addComponent(lblPrice)
                                    .addGap(32, 32, 32)))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtModel1, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                                .addComponent(txtPrice)))))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnDisplayAll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAddMP3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAddMobile, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbpModel)
                            .addComponent(txtModel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPrice)
                            .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblWeight)
                            .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(btnAddMobile, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                        .addGap(26, 26, 26)
                        .addComponent(btnAddMP3)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSize)
                            .addComponent(txtSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCredit)
                            .addComponent(txtCredit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(btnDisplayAll)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMemory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMemory)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(btnClear)))
                .addGap(30, 30, 30))
        );

        jPanel4.setBackground(new java.awt.Color(150, 204, 211));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 51, 0), 2, true), "Calls and Downnloads", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 18), new java.awt.Color(255, 51, 0)))); // NOI18N

        lblPhoneNumber.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblPhoneNumber.setForeground(new java.awt.Color(255, 51, 51));
        lblPhoneNumber.setText("Phone Number:");

        lblDuration.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblDuration.setForeground(new java.awt.Color(255, 51, 51));
        lblDuration.setText("Duration:");

        lblWeight1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblWeight1.setForeground(new java.awt.Color(255, 51, 51));
        lblWeight1.setText("Download:");

        lblSize1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblSize1.setForeground(new java.awt.Color(255, 51, 51));
        lblSize1.setText("Display Numbar:");

        btnMakeACall.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btnMakeACall.setForeground(new java.awt.Color(222, 8, 8));
        btnMakeACall.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Helps/Images/5964548_call_mobile_phone_technology_icon.png"))); // NOI18N
        btnMakeACall.setText("Download Music");
        btnMakeACall.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnMakeACallActionPerformed(evt);
            }
        });

        btnMakeACall1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btnMakeACall1.setForeground(new java.awt.Color(222, 8, 8));
        btnMakeACall1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Helps/Images/5964548_call_mobile_phone_technology_icon.png"))); // NOI18N
        btnMakeACall1.setText("Make a Call");
        btnMakeACall1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnMakeACall1ActionPerformed(evt);
            }
        });

        jSeparator2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 51, 51), 2, true));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSize1)
                            .addComponent(lblWeight1))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(txtDownload, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDisplayNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPhoneNumber)
                            .addComponent(lblDuration))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDuration, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator2))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnMakeACall1)
                        .addGap(18, 18, 18)
                        .addComponent(btnMakeACall)
                        .addGap(0, 9, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPhoneNumber)
                    .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDuration)
                    .addComponent(txtDuration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblWeight1)
                    .addComponent(txtDownload, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSize1)
                    .addComponent(txtDisplayNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMakeACall1)
                    .addComponent(btnMakeACall))
                .addGap(40, 40, 40))
        );

        btnExit.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 51, 0));
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Helps/Images/38999_exit_icon.png"))); // NOI18N
        btnExit.setText("Exit!");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(500, 500, 500)
                        .addComponent(btnExit))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addGap(14, 14, 14)))
                .addGap(48, 48, 48))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1586, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnExit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(179, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1618, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 833, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("GADGET SHOP");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMakeACallActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnMakeACallActionPerformed
    {//GEN-HEADEREND:event_btnMakeACallActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMakeACallActionPerformed

    private void btnMakeACall1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnMakeACall1ActionPerformed
    {//GEN-HEADEREND:event_btnMakeACall1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMakeACall1ActionPerformed
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddMP3;
    private javax.swing.JButton btnAddMobile;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDisplayAll;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnMakeACall;
    private javax.swing.JButton btnMakeACall1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblCredit;
    private javax.swing.JLabel lblDuration;
    private javax.swing.JLabel lblMemory;
    private javax.swing.JLabel lblPhoneNumber;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblSize;
    private javax.swing.JLabel lblSize1;
    private javax.swing.JLabel lblWeight;
    private javax.swing.JLabel lblWeight1;
    private javax.swing.JLabel lbpModel;
    private javax.swing.JTextField txtCredit;
    private javax.swing.JTextField txtDisplayNumber;
    private javax.swing.JTextField txtDownload;
    private javax.swing.JTextField txtDuration;
    private javax.swing.JTextField txtMemory;
    private javax.swing.JTextField txtModel1;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtSize;
    private javax.swing.JTextField txtWeight;
    // End of variables declaration//GEN-END:variables
}
