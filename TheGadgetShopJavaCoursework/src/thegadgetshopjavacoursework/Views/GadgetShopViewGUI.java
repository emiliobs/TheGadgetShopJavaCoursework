package thegadgetshopjavacoursework.Views;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Emilio
 */
public class GadgetShopViewGUI extends javax.swing.JFrame
{

    /**
     * Creates new form GadgetShop
     */
    public GadgetShopViewGUI()
    {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/Helps/Images/logo.png")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanelMain = new javax.swing.JPanel();
        jPanelContent = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        lblImagen = new javax.swing.JLabel();
        jPanelEnterMobileMp3Data = new javax.swing.JPanel();
        lbpModel = new javax.swing.JLabel();
        txtModel = new javax.swing.JTextField();
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
        jPanelCallDowbloads = new javax.swing.JPanel();
        lblPhoneNumber = new javax.swing.JLabel();
        txtPhoneNumber = new javax.swing.JTextField();
        lblDuration = new javax.swing.JLabel();
        txtDuration = new javax.swing.JTextField();
        lblDownload = new javax.swing.JLabel();
        txtDownload = new javax.swing.JTextField();
        lblDisplayNumber = new javax.swing.JLabel();
        txtDisplayNumber = new javax.swing.JTextField();
        btnDownloadMusic = new javax.swing.JButton();
        btnMakeACall1 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        btnExit = new javax.swing.JButton();
        jPanelShowData = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextAreaShowData = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("GADGET SHOP!");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jPanelMain.setBackground(new java.awt.Color(150, 204, 211));

        jPanelContent.setBackground(new java.awt.Color(150, 204, 211));
        jPanelContent.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 0), 3), "Data Form.", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 18), new java.awt.Color(255, 51, 0))); // NOI18N
        jPanelContent.setForeground(new java.awt.Color(0, 0, 0));
        jPanelContent.setPreferredSize(new java.awt.Dimension(1375, 1000));

        lblTitle.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 51, 51));
        lblTitle.setText("The Gadget Shop!");

        lblImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Helps/Images/TheGadgetShop1.png"))); // NOI18N

        jPanelEnterMobileMp3Data.setBackground(new java.awt.Color(150, 204, 211));
        jPanelEnterMobileMp3Data.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 51, 51), 3, true), "Enter Mobile and MP3 Data.", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 18), new java.awt.Color(255, 51, 51))); // NOI18N
        jPanelEnterMobileMp3Data.setForeground(new java.awt.Color(255, 51, 51));

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
        btnAddMobile.setToolTipText("Add Mobile");

        btnAddMP3.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btnAddMP3.setForeground(new java.awt.Color(222, 8, 8));
        btnAddMP3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Helps/Images/7574_mp3_icon.png"))); // NOI18N
        btnAddMP3.setText("Add MP3");
        btnAddMP3.setToolTipText("Add MP3");

        btnDisplayAll.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btnDisplayAll.setForeground(new java.awt.Color(222, 8, 8));
        btnDisplayAll.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Helps/Images/1055084_screen_monitor_display_icon.png"))); // NOI18N
        btnDisplayAll.setText("Display All");
        btnDisplayAll.setToolTipText("Display All");
        btnDisplayAll.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnDisplayAllActionPerformed(evt);
            }
        });

        btnClear.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btnClear.setForeground(new java.awt.Color(222, 8, 8));
        btnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Helps/Images/38988_edit_clear_sweep_sweeper_icon.png"))); // NOI18N
        btnClear.setText("Clear");
        btnClear.setToolTipText("Clear");

        javax.swing.GroupLayout jPanelEnterMobileMp3DataLayout = new javax.swing.GroupLayout(jPanelEnterMobileMp3Data);
        jPanelEnterMobileMp3Data.setLayout(jPanelEnterMobileMp3DataLayout);
        jPanelEnterMobileMp3DataLayout.setHorizontalGroup(
            jPanelEnterMobileMp3DataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEnterMobileMp3DataLayout.createSequentialGroup()
                .addGroup(jPanelEnterMobileMp3DataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelEnterMobileMp3DataLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanelEnterMobileMp3DataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbpModel)
                            .addComponent(lblPrice)
                            .addComponent(lblWeight)
                            .addComponent(lblSize)
                            .addComponent(lblCredit))
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEnterMobileMp3DataLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblMemory)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanelEnterMobileMp3DataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMemory, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelEnterMobileMp3DataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtCredit, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanelEnterMobileMp3DataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtSize, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                            .addComponent(txtPrice, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtModel, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtWeight, javax.swing.GroupLayout.Alignment.LEADING))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jPanelEnterMobileMp3DataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnDisplayAll, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAddMP3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAddMobile, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                    .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanelEnterMobileMp3DataLayout.setVerticalGroup(
            jPanelEnterMobileMp3DataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEnterMobileMp3DataLayout.createSequentialGroup()
                .addGroup(jPanelEnterMobileMp3DataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelEnterMobileMp3DataLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanelEnterMobileMp3DataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbpModel)
                            .addComponent(txtModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(jPanelEnterMobileMp3DataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPrice))
                        .addGap(39, 39, 39)
                        .addGroup(jPanelEnterMobileMp3DataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblWeight)
                            .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelEnterMobileMp3DataLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(btnAddMobile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(33, 33, 33)
                        .addComponent(btnAddMP3, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                        .addGap(2, 2, 2)))
                .addGroup(jPanelEnterMobileMp3DataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelEnterMobileMp3DataLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanelEnterMobileMp3DataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSize))
                        .addGap(36, 36, 36)
                        .addGroup(jPanelEnterMobileMp3DataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCredit)
                            .addComponent(txtCredit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanelEnterMobileMp3DataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMemory)
                            .addComponent(txtMemory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelEnterMobileMp3DataLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(btnDisplayAll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(34, 34, 34)
                        .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                        .addGap(40, 40, 40))))
        );

        jPanelCallDowbloads.setBackground(new java.awt.Color(150, 204, 211));
        jPanelCallDowbloads.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 51, 0), 3, true), "Calls and Downloads", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 18), new java.awt.Color(255, 51, 0)), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 18), new java.awt.Color(255, 51, 0))); // NOI18N

        lblPhoneNumber.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblPhoneNumber.setForeground(new java.awt.Color(255, 51, 51));
        lblPhoneNumber.setText("Phone Number:");

        lblDuration.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblDuration.setForeground(new java.awt.Color(255, 51, 51));
        lblDuration.setText("Duration:");

        lblDownload.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblDownload.setForeground(new java.awt.Color(255, 51, 51));
        lblDownload.setText("Download:");

        lblDisplayNumber.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblDisplayNumber.setForeground(new java.awt.Color(255, 51, 51));
        lblDisplayNumber.setText("Display Number:");

        btnDownloadMusic.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btnDownloadMusic.setForeground(new java.awt.Color(222, 8, 8));
        btnDownloadMusic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Helps/Images/678152_arrow_dowload_down_file_icon.png"))); // NOI18N
        btnDownloadMusic.setText("Download Music");
        btnDownloadMusic.setToolTipText("Download Music");
        btnDownloadMusic.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnDownloadMusicActionPerformed(evt);
            }
        });

        btnMakeACall1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btnMakeACall1.setForeground(new java.awt.Color(222, 8, 8));
        btnMakeACall1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Helps/Images/5964548_call_mobile_phone_technology_icon.png"))); // NOI18N
        btnMakeACall1.setText("Make a Call");
        btnMakeACall1.setToolTipText("Make a Call");
        btnMakeACall1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnMakeACall1ActionPerformed(evt);
            }
        });

        jSeparator2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 51, 51), 3, true));

        javax.swing.GroupLayout jPanelCallDowbloadsLayout = new javax.swing.GroupLayout(jPanelCallDowbloads);
        jPanelCallDowbloads.setLayout(jPanelCallDowbloadsLayout);
        jPanelCallDowbloadsLayout.setHorizontalGroup(
            jPanelCallDowbloadsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCallDowbloadsLayout.createSequentialGroup()
                .addGroup(jPanelCallDowbloadsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCallDowbloadsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator2))
                    .addGroup(jPanelCallDowbloadsLayout.createSequentialGroup()
                        .addGroup(jPanelCallDowbloadsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelCallDowbloadsLayout.createSequentialGroup()
                                .addGroup(jPanelCallDowbloadsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelCallDowbloadsLayout.createSequentialGroup()
                                        .addGap(55, 55, 55)
                                        .addGroup(jPanelCallDowbloadsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblPhoneNumber)
                                            .addComponent(lblDuration)
                                            .addComponent(lblDownload))
                                        .addGap(30, 30, 30))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCallDowbloadsLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(lblDisplayNumber)
                                        .addGap(18, 18, 18)))
                                .addGroup(jPanelCallDowbloadsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDuration, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDownload, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDisplayNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanelCallDowbloadsLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(btnMakeACall1)
                                .addGap(18, 18, 18)
                                .addComponent(btnDownloadMusic)))
                        .addGap(0, 22, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelCallDowbloadsLayout.setVerticalGroup(
            jPanelCallDowbloadsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCallDowbloadsLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanelCallDowbloadsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPhoneNumber)
                    .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanelCallDowbloadsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDuration)
                    .addComponent(txtDuration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanelCallDowbloadsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDisplayNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDisplayNumber))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelCallDowbloadsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDownload)
                    .addComponent(txtDownload, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanelCallDowbloadsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMakeACall1)
                    .addComponent(btnDownloadMusic))
                .addGap(40, 40, 40))
        );

        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51), 4));

        btnExit.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 51, 51));
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Helps/Images/38999_exit_icon.png"))); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnExitActionPerformed(evt);
            }
        });

        jPanelShowData.setBackground(new java.awt.Color(150, 204, 211));
        jPanelShowData.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51), 3), "Show Data", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 18), new java.awt.Color(255, 51, 0))); // NOI18N

        TextAreaShowData.setColumns(20);
        TextAreaShowData.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        TextAreaShowData.setForeground(new java.awt.Color(255, 51, 51));
        TextAreaShowData.setRows(5);
        jScrollPane1.setViewportView(TextAreaShowData);

        javax.swing.GroupLayout jPanelShowDataLayout = new javax.swing.GroupLayout(jPanelShowData);
        jPanelShowData.setLayout(jPanelShowDataLayout);
        jPanelShowDataLayout.setHorizontalGroup(
            jPanelShowDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelShowDataLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 991, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanelShowDataLayout.setVerticalGroup(
            jPanelShowDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelShowDataLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelContentLayout = new javax.swing.GroupLayout(jPanelContent);
        jPanelContent.setLayout(jPanelContentLayout);
        jPanelContentLayout.setHorizontalGroup(
            jPanelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelContentLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(581, 581, 581))
                    .addGroup(jPanelContentLayout.createSequentialGroup()
                        .addGroup(jPanelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1562, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelContentLayout.createSequentialGroup()
                                .addGroup(jPanelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelContentLayout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(jPanelEnterMobileMp3Data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jPanelCallDowbloads, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(19, 19, 19))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelContentLayout.createSequentialGroup()
                                        .addComponent(jPanelShowData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)))
                                .addGroup(jPanelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanelContentLayout.createSequentialGroup()
                                        .addGap(175, 175, 175)
                                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 18, Short.MAX_VALUE))))
        );
        jPanelContentLayout.setVerticalGroup(
            jPanelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContentLayout.createSequentialGroup()
                .addComponent(lblTitle)
                .addGap(35, 35, 35)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelContentLayout.createSequentialGroup()
                        .addGroup(jPanelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanelEnterMobileMp3Data, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanelCallDowbloads, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelShowData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(27, Short.MAX_VALUE))
                    .addGroup(jPanelContentLayout.createSequentialGroup()
                        .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41))))
        );

        javax.swing.GroupLayout jPanelMainLayout = new javax.swing.GroupLayout(jPanelMain);
        jPanelMain.setLayout(jPanelMainLayout);
        jPanelMainLayout.setHorizontalGroup(
            jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMainLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelContent, javax.swing.GroupLayout.PREFERRED_SIZE, 1604, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanelMainLayout.setVerticalGroup(
            jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMainLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanelContent, javax.swing.GroupLayout.DEFAULT_SIZE, 814, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleName("GADGET SHOP");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDownloadMusicActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnDownloadMusicActionPerformed
    {//GEN-HEADEREND:event_btnDownloadMusicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDownloadMusicActionPerformed

    private void btnMakeACall1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnMakeACall1ActionPerformed
    {//GEN-HEADEREND:event_btnMakeACall1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMakeACall1ActionPerformed

    private void btnDisplayAllActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnDisplayAllActionPerformed
    {//GEN-HEADEREND:event_btnDisplayAllActionPerformed
        String data = txtModel.getText();
        data += txtPrice.getText();
        data += txtWeight.getText();
        data += txtSize.getText();
        data += txtCredit.getText();
        data += txtMemory.getText();

        TextAreaShowData.setText(data);

    }//GEN-LAST:event_btnDisplayAllActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnExitActionPerformed
    {//GEN-HEADEREND:event_btnExitActionPerformed
        dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea TextAreaShowData;
    private javax.swing.JButton btnAddMP3;
    private javax.swing.JButton btnAddMobile;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDisplayAll;
    private javax.swing.JButton btnDownloadMusic;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnMakeACall1;
    private javax.swing.JPanel jPanelCallDowbloads;
    private javax.swing.JPanel jPanelContent;
    private javax.swing.JPanel jPanelEnterMobileMp3Data;
    private javax.swing.JPanel jPanelMain;
    private javax.swing.JPanel jPanelShowData;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblCredit;
    private javax.swing.JLabel lblDisplayNumber;
    private javax.swing.JLabel lblDownload;
    private javax.swing.JLabel lblDuration;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblMemory;
    private javax.swing.JLabel lblPhoneNumber;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblSize;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblWeight;
    private javax.swing.JLabel lbpModel;
    private javax.swing.JTextField txtCredit;
    private javax.swing.JTextField txtDisplayNumber;
    private javax.swing.JTextField txtDownload;
    private javax.swing.JTextField txtDuration;
    private javax.swing.JTextField txtMemory;
    private javax.swing.JTextField txtModel;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtSize;
    private javax.swing.JTextField txtWeight;
    // End of variables declaration//GEN-END:variables
}
