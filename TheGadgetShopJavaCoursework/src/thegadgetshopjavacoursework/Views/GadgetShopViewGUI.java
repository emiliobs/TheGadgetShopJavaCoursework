package thegadgetshopjavacoursework.Views;

import java.awt.Image;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import thegadgetshopjavacoursework.Controllers.TheGadgetShopController;
import thegadgetshopjavacoursework.Models.Gadget;
import thegadgetshopjavacoursework.Models.MP3;
import thegadgetshopjavacoursework.Models.Mobile;

/**
 *
 * @author Emilio
 */
public class GadgetShopViewGUI extends javax.swing.JFrame
{

    TheGadgetShopController gadgetShopController;
    Gadget gadget = new Gadget();
    Mobile mobile;
    MP3 mp3;

    /**
     * Creates new form GadgetShop
     */
    public GadgetShopViewGUI()
    {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/Helps/Images/logo.png")).getImage());

        gadgetShopController = new TheGadgetShopController();

        txtModel.requestFocus();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanelMain = new javax.swing.JPanel();
        jPanelContent = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
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
        lblsize2 = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        lblsize3 = new javax.swing.JLabel();
        lblsize4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanelCallDowbloads = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnShowAllMobiles = new javax.swing.JButton();
        lblAddCallingCreditToMobile = new javax.swing.JLabel();
        txtAddCallingCreditToMObile = new javax.swing.JTextField();
        lblDisplayNumber = new javax.swing.JLabel();
        txtDisplayNumber = new javax.swing.JTextField();
        lblDuration = new javax.swing.JLabel();
        txtDuration = new javax.swing.JTextField();
        lblPhoneNumber = new javax.swing.JLabel();
        txtPhoneNumber = new javax.swing.JTextField();
        lblSelectMobileId = new javax.swing.JLabel();
        txtSelectMobileId = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        btnMakeACall = new javax.swing.JButton();
        btnAddCallingCredit = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblDownload = new javax.swing.JLabel();
        txtDownload = new javax.swing.JTextField();
        lblAddCallingCreditToMobile1 = new javax.swing.JLabel();
        txtDeleteMusicFromMp3Player = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        btnSHowAllMP3 = new javax.swing.JButton();
        btnDeleteMusicMP3 = new javax.swing.JButton();
        btnDownloadMusic = new javax.swing.JButton();
        lblSelectMobileId1 = new javax.swing.JLabel();
        txtSelectMP3Id = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        btnExit = new javax.swing.JButton();
        jPanelShowData = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextAreaShowData = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("GADGET SHOP!");
        setBackground(new java.awt.Color(150, 204, 211));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jPanelMain.setBackground(new java.awt.Color(150, 204, 211));

        jPanelContent.setBackground(new java.awt.Color(150, 204, 211));
        jPanelContent.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51), 5), "THe Gadget Shop Options!", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 18), new java.awt.Color(255, 51, 51)), "The Gadget Shop Options!", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 18), new java.awt.Color(255, 51, 51))); // NOI18N
        jPanelContent.setForeground(new java.awt.Color(255, 51, 51));
        jPanelContent.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanelContent.setNextFocusableComponent(txtModel);
        jPanelContent.setPreferredSize(new java.awt.Dimension(1375, 1000));

        lblTitle.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 51, 51));
        lblTitle.setText("The Gadget Shop!");

        jPanelEnterMobileMp3Data.setBackground(new java.awt.Color(150, 204, 211));
        jPanelEnterMobileMp3Data.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 51, 51), 3, true), "Enter Mobile and MP3 Data.", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 18), new java.awt.Color(255, 51, 51))); // NOI18N
        jPanelEnterMobileMp3Data.setForeground(new java.awt.Color(255, 51, 51));
        jPanelEnterMobileMp3Data.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanelEnterMobileMp3Data.setNextFocusableComponent(txtPrice);

        lbpModel.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lbpModel.setForeground(new java.awt.Color(255, 51, 51));
        lbpModel.setText("Model: ");

        txtModel.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtModel.setNextFocusableComponent(txtPrice);

        lblPrice.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblPrice.setForeground(new java.awt.Color(255, 51, 51));
        lblPrice.setText("Price:");

        txtPrice.setNextFocusableComponent(txtWeight);

        lblWeight.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblWeight.setForeground(new java.awt.Color(255, 51, 51));
        lblWeight.setText("Weight:");

        txtWeight.setNextFocusableComponent(txtSize);

        lblSize.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblSize.setForeground(new java.awt.Color(255, 51, 51));
        lblSize.setText("Size:");

        txtSize.setNextFocusableComponent(txtCredit);

        lblCredit.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblCredit.setForeground(new java.awt.Color(255, 51, 51));
        lblCredit.setText("Credit: ");

        txtCredit.setNextFocusableComponent(txtMemory);

        lblMemory.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblMemory.setForeground(new java.awt.Color(255, 51, 51));
        lblMemory.setText("Memory:");

        txtMemory.setNextFocusableComponent(btnAddMobile);

        btnAddMobile.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btnAddMobile.setForeground(new java.awt.Color(222, 8, 8));
        btnAddMobile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Helps/Images/44636_mobile_phone_icon (1).png"))); // NOI18N
        btnAddMobile.setText("Add Mobile");
        btnAddMobile.setToolTipText("Add Mobile");
        btnAddMobile.setNextFocusableComponent(btnAddMP3);
        btnAddMobile.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnAddMobileActionPerformed(evt);
            }
        });

        btnAddMP3.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btnAddMP3.setForeground(new java.awt.Color(222, 8, 8));
        btnAddMP3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Helps/Images/7574_mp3_icon.png"))); // NOI18N
        btnAddMP3.setText("Add MP3");
        btnAddMP3.setToolTipText("Add MP3");
        btnAddMP3.setNextFocusableComponent(btnDisplayAll);
        btnAddMP3.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnAddMP3ActionPerformed(evt);
            }
        });

        btnDisplayAll.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btnDisplayAll.setForeground(new java.awt.Color(222, 8, 8));
        btnDisplayAll.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Helps/Images/1055084_screen_monitor_display_icon.png"))); // NOI18N
        btnDisplayAll.setText("Display All");
        btnDisplayAll.setToolTipText("Display All");
        btnDisplayAll.setNextFocusableComponent(btnClear);
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
        btnClear.setNextFocusableComponent(btnShowAllMobiles);
        btnClear.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnClearActionPerformed(evt);
            }
        });

        lblsize2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblsize2.setForeground(new java.awt.Color(255, 0, 0));
        lblsize2.setText("(Ej: 12mm x 15 mm x 3 mm)");

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Helps/Images/add_clear_folder_win_open_icon.png"))); // NOI18N

        lblsize3.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblsize3.setForeground(new java.awt.Color(255, 0, 0));
        lblsize3.setText("(Mobile)");

        lblsize4.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblsize4.setForeground(new java.awt.Color(255, 0, 0));
        lblsize4.setText("(MP3)");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Helps/Images/logo.png"))); // NOI18N

        javax.swing.GroupLayout jPanelEnterMobileMp3DataLayout = new javax.swing.GroupLayout(jPanelEnterMobileMp3Data);
        jPanelEnterMobileMp3Data.setLayout(jPanelEnterMobileMp3DataLayout);
        jPanelEnterMobileMp3DataLayout.setHorizontalGroup(
            jPanelEnterMobileMp3DataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEnterMobileMp3DataLayout.createSequentialGroup()
                .addGap(0, 199, Short.MAX_VALUE)
                .addComponent(lblLogo)
                .addGap(205, 205, 205))
            .addGroup(jPanelEnterMobileMp3DataLayout.createSequentialGroup()
                .addGroup(jPanelEnterMobileMp3DataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelEnterMobileMp3DataLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanelEnterMobileMp3DataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelEnterMobileMp3DataLayout.createSequentialGroup()
                                .addComponent(lblMemory)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMemory, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelEnterMobileMp3DataLayout.createSequentialGroup()
                                .addGroup(jPanelEnterMobileMp3DataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelEnterMobileMp3DataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanelEnterMobileMp3DataLayout.createSequentialGroup()
                                            .addGroup(jPanelEnterMobileMp3DataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lbpModel)
                                                .addComponent(lblCredit))
                                            .addGap(5, 5, 5))
                                        .addComponent(lblWeight, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addComponent(lblPrice)
                                    .addComponent(lblSize))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelEnterMobileMp3DataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelEnterMobileMp3DataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanelEnterMobileMp3DataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtWeight, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtModel, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(txtSize, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblsize2, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(txtCredit, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblsize3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblsize4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelEnterMobileMp3DataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnDisplayAll, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAddMP3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAddMobile, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelEnterMobileMp3DataLayout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelEnterMobileMp3DataLayout.setVerticalGroup(
            jPanelEnterMobileMp3DataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEnterMobileMp3DataLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblLogo)
                .addGap(30, 30, 30)
                .addGroup(jPanelEnterMobileMp3DataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelEnterMobileMp3DataLayout.createSequentialGroup()
                        .addGroup(jPanelEnterMobileMp3DataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbpModel)
                            .addComponent(txtModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanelEnterMobileMp3DataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPrice)
                            .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanelEnterMobileMp3DataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblWeight))
                        .addGap(24, 24, 24)
                        .addComponent(lblsize2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelEnterMobileMp3DataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSize)
                            .addComponent(txtSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addComponent(lblsize3))
                    .addGroup(jPanelEnterMobileMp3DataLayout.createSequentialGroup()
                        .addComponent(btnAddMobile)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAddMP3)
                        .addGap(42, 42, 42)
                        .addComponent(btnDisplayAll)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelEnterMobileMp3DataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCredit)
                    .addComponent(txtCredit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelEnterMobileMp3DataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelEnterMobileMp3DataLayout.createSequentialGroup()
                        .addComponent(lblsize4)
                        .addGap(3, 3, 3)
                        .addGroup(jPanelEnterMobileMp3DataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMemory)
                            .addComponent(txtMemory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnClear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(65, 65, 65))
        );

        jPanelCallDowbloads.setBackground(new java.awt.Color(150, 204, 211));
        jPanelCallDowbloads.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51), 3), "Call And Download .", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 18), new java.awt.Color(255, 51, 51))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(150, 204, 211));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51), 3), "Select Mobile Id To Add Calling Credit.", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 18), new java.awt.Color(255, 51, 0))); // NOI18N

        btnShowAllMobiles.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btnShowAllMobiles.setForeground(new java.awt.Color(222, 8, 8));
        btnShowAllMobiles.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Helps/Images/Showmobile_phone_icon.png"))); // NOI18N
        btnShowAllMobiles.setText("Show All Mobiles");
        btnShowAllMobiles.setToolTipText("Make a Call");
        btnShowAllMobiles.setNextFocusableComponent(txtSelectMobileId);
        btnShowAllMobiles.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnShowAllMobilesActionPerformed(evt);
            }
        });

        lblAddCallingCreditToMobile.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblAddCallingCreditToMobile.setForeground(new java.awt.Color(255, 51, 51));
        lblAddCallingCreditToMobile.setText("Add Credit From Mobile:");

        txtAddCallingCreditToMObile.setNextFocusableComponent(btnMakeACall);

        lblDisplayNumber.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblDisplayNumber.setForeground(new java.awt.Color(255, 51, 51));
        lblDisplayNumber.setText("Display Number:");

        txtDisplayNumber.setNextFocusableComponent(txtAddCallingCreditToMObile);
        txtDisplayNumber.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txtDisplayNumberActionPerformed(evt);
            }
        });

        lblDuration.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblDuration.setForeground(new java.awt.Color(255, 51, 51));
        lblDuration.setText("Duration:");

        txtDuration.setNextFocusableComponent(txtDisplayNumber);

        lblPhoneNumber.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblPhoneNumber.setForeground(new java.awt.Color(255, 51, 51));
        lblPhoneNumber.setText("Phone Number:");

        txtPhoneNumber.setNextFocusableComponent(txtDuration);

        lblSelectMobileId.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblSelectMobileId.setForeground(new java.awt.Color(255, 51, 51));
        lblSelectMobileId.setText("Select Mobile Id From LIst:");

        txtSelectMobileId.setNextFocusableComponent(txtPhoneNumber);
        txtSelectMobileId.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txtSelectMobileIdActionPerformed(evt);
            }
        });

        jSeparator3.setBackground(new java.awt.Color(255, 51, 0));
        jSeparator3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51), 3));

        btnMakeACall.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btnMakeACall.setForeground(new java.awt.Color(222, 8, 8));
        btnMakeACall.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Helps/Images/5964548_call_mobile_phone_technology_icon.png"))); // NOI18N
        btnMakeACall.setText("Make a Call");
        btnMakeACall.setToolTipText("Make a Call");
        btnMakeACall.setNextFocusableComponent(btnAddCallingCredit);
        btnMakeACall.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnMakeACallActionPerformed(evt);
            }
        });

        btnAddCallingCredit.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btnAddCallingCredit.setForeground(new java.awt.Color(222, 8, 8));
        btnAddCallingCredit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Helps/Images/add_add credit card_card_credit_icon.png"))); // NOI18N
        btnAddCallingCredit.setText("Add Calling Credit");
        btnAddCallingCredit.setToolTipText("Clear");
        btnAddCallingCredit.setNextFocusableComponent(btnSHowAllMP3);
        btnAddCallingCredit.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnAddCallingCreditActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblDisplayNumber)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtDisplayNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblAddCallingCreditToMobile)
                                .addGap(18, 18, 18)
                                .addComponent(txtAddCallingCreditToMObile, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPhoneNumber)
                                    .addComponent(lblSelectMobileId)
                                    .addComponent(lblDuration))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDuration, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPhoneNumber, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSelectMobileId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btnShowAllMobiles, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnMakeACall)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAddCallingCredit))
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(btnShowAllMobiles)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSelectMobileId)
                            .addComponent(txtSelectMobileId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblPhoneNumber)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDuration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDuration))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDisplayNumber)
                    .addComponent(txtDisplayNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAddCallingCreditToMobile)
                    .addComponent(txtAddCallingCreditToMObile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddCallingCredit)
                    .addComponent(btnMakeACall))
                .addGap(0, 19, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(150, 204, 211));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 0), 3), "Select MP3 Id To Download And Delete Music From MP3.", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 18), new java.awt.Color(255, 0, 0))); // NOI18N

        lblDownload.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblDownload.setForeground(new java.awt.Color(255, 51, 51));
        lblDownload.setText("Download:");

        txtDownload.setNextFocusableComponent(txtDeleteMusicFromMp3Player);

        lblAddCallingCreditToMobile1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblAddCallingCreditToMobile1.setForeground(new java.awt.Color(255, 51, 51));
        lblAddCallingCreditToMobile1.setText("Delete Music From MP3: ");

        txtDeleteMusicFromMp3Player.setNextFocusableComponent(btnDownloadMusic);
        txtDeleteMusicFromMp3Player.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txtDeleteMusicFromMp3PlayerActionPerformed(evt);
            }
        });

        jSeparator2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 51, 51), 3, true));

        btnSHowAllMP3.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btnSHowAllMP3.setForeground(new java.awt.Color(222, 8, 8));
        btnSHowAllMP3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Helps/Images/ipod_listen_mp3_music_player_icon.png"))); // NOI18N
        btnSHowAllMP3.setText("Show All MP3");
        btnSHowAllMP3.setToolTipText("Make a Call");
        btnSHowAllMP3.setNextFocusableComponent(txtSelectMP3Id);
        btnSHowAllMP3.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnSHowAllMP3ActionPerformed(evt);
            }
        });

        btnDeleteMusicMP3.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btnDeleteMusicMP3.setForeground(new java.awt.Color(222, 8, 8));
        btnDeleteMusicMP3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Helps/Images/music_email_delete_recycle_trash_icon.png"))); // NOI18N
        btnDeleteMusicMP3.setText("Delete Music MP3");
        btnDeleteMusicMP3.setToolTipText("Clear");
        btnDeleteMusicMP3.setNextFocusableComponent(btnExit);
        btnDeleteMusicMP3.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnDeleteMusicMP3ActionPerformed(evt);
            }
        });

        btnDownloadMusic.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btnDownloadMusic.setForeground(new java.awt.Color(222, 8, 8));
        btnDownloadMusic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Helps/Images/678152_arrow_dowload_down_file_icon.png"))); // NOI18N
        btnDownloadMusic.setText("Download Music");
        btnDownloadMusic.setToolTipText("Download Music");
        btnDownloadMusic.setNextFocusableComponent(btnDeleteMusicMP3);
        btnDownloadMusic.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnDownloadMusicActionPerformed(evt);
            }
        });

        lblSelectMobileId1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblSelectMobileId1.setForeground(new java.awt.Color(255, 51, 51));
        lblSelectMobileId1.setText("Select MP3 Id From List:");

        txtSelectMP3Id.setNextFocusableComponent(txtDownload);
        txtSelectMP3Id.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txtSelectMP3IdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnDownloadMusic)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDeleteMusicMP3))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnSHowAllMP3, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblAddCallingCreditToMobile1)
                                        .addComponent(lblDownload)
                                        .addComponent(lblSelectMobileId1))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtSelectMP3Id, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtDownload, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtDeleteMusicFromMp3Player, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGap(15, 15, 15))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(btnSHowAllMP3)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSelectMobileId1)
                    .addComponent(txtSelectMP3Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDownload)
                    .addComponent(txtDownload, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDeleteMusicFromMp3Player, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAddCallingCreditToMobile1))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDownloadMusic)
                    .addComponent(btnDeleteMusicMP3))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout jPanelCallDowbloadsLayout = new javax.swing.GroupLayout(jPanelCallDowbloads);
        jPanelCallDowbloads.setLayout(jPanelCallDowbloadsLayout);
        jPanelCallDowbloadsLayout.setHorizontalGroup(
            jPanelCallDowbloadsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCallDowbloadsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCallDowbloadsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanelCallDowbloadsLayout.setVerticalGroup(
            jPanelCallDowbloadsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCallDowbloadsLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        jPanelShowData.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51), 3), "Show Data.", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 18), new java.awt.Color(255, 51, 0))); // NOI18N

        TextAreaShowData.setColumns(20);
        TextAreaShowData.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        TextAreaShowData.setForeground(new java.awt.Color(255, 51, 51));
        TextAreaShowData.setRows(5);
        TextAreaShowData.setNextFocusableComponent(btnExit);
        jScrollPane1.setViewportView(TextAreaShowData);

        javax.swing.GroupLayout jPanelShowDataLayout = new javax.swing.GroupLayout(jPanelShowData);
        jPanelShowData.setLayout(jPanelShowDataLayout);
        jPanelShowDataLayout.setHorizontalGroup(
            jPanelShowDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelShowDataLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelShowDataLayout.setVerticalGroup(
            jPanelShowDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelShowDataLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 741, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelContentLayout = new javax.swing.GroupLayout(jPanelContent);
        jPanelContent.setLayout(jPanelContentLayout);
        jPanelContentLayout.setHorizontalGroup(
            jPanelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContentLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jPanelEnterMobileMp3Data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelCallDowbloads, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelShowData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelContentLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelContentLayout.createSequentialGroup()
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(376, 376, 376)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1532, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56))
        );
        jPanelContentLayout.setVerticalGroup(
            jPanelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContentLayout.createSequentialGroup()
                .addGroup(jPanelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitle)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelContentLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addGroup(jPanelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanelCallDowbloads, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanelShowData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanelContentLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanelEnterMobileMp3Data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelMainLayout = new javax.swing.GroupLayout(jPanelMain);
        jPanelMain.setLayout(jPanelMainLayout);
        jPanelMainLayout.setHorizontalGroup(
            jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMainLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelContent, javax.swing.GroupLayout.PREFERRED_SIZE, 1573, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );
        jPanelMainLayout.setVerticalGroup(
            jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelContent, javax.swing.GroupLayout.PREFERRED_SIZE, 954, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMain, javax.swing.GroupLayout.PREFERRED_SIZE, 1607, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getAccessibleContext().setAccessibleName("GADGET SHOP");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDownloadMusicActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnDownloadMusicActionPerformed
    {//GEN-HEADEREND:event_btnDownloadMusicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDownloadMusicActionPerformed

    private void btnShowAllMobilesActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnShowAllMobilesActionPerformed
    {//GEN-HEADEREND:event_btnShowAllMobilesActionPerformed
        if (gadgetShopController.getGadgets().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Sorry! There Is Not Mobiles To Display (Empty LIst.)");
            return;
        }

        TextAreaShowData.append("Mobiles List:\n");

        for (Gadget gadget : gadgetShopController.getGadgets())
        {
            if (gadget instanceof Mobile)
            {
                TextAreaShowData.append(" " + gadget.display());
                TextAreaShowData.append("\n");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Sorry! There Is Not Mobiles To Display (Empty LIst.)");
                TextAreaShowData.append("Sorry!. Mobiles List Empty:\n");
                return;
            }
        }
        TextAreaShowData.append("----------------------------------------------------------------------\n");
    }//GEN-LAST:event_btnShowAllMobilesActionPerformed

    private void btnDisplayAllActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnDisplayAllActionPerformed
    {//GEN-HEADEREND:event_btnDisplayAllActionPerformed

        TextAreaShowData.setText("");

        if (gadgetShopController.getGadgets().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Sorry! There Is Not gadgets To Display (Empty LIst.)");
            return;
        }

        TextAreaShowData.append("Display All Gadgets:\n");
        for (Gadget gadget : gadgetShopController.getGadgets())
        {
            TextAreaShowData.append("  " + gadget.display());
            TextAreaShowData.append("\n\n");
        }
        TextAreaShowData.append("----------------------------------------------------------------------\n");

    }//GEN-LAST:event_btnDisplayAllActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnExitActionPerformed
    {//GEN-HEADEREND:event_btnExitActionPerformed
        dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnAddMobileActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAddMobileActionPerformed
    {//GEN-HEADEREND:event_btnAddMobileActionPerformed

        String model = txtModel.getText();
        String price = txtPrice.getText();
        String weight = txtWeight.getText();
        String size = txtSize.getText();;
        String credit = txtCredit.getText();
        txtMemory.setText("");

        try
        {
            if (model.trim().isBlank() && model.trim().isEmpty())
            {
                JOptionPane.showMessageDialog(null, "Please, Enter a Gadget Mobil Model.");
                return;
            }

            if (price.trim().isBlank() && price.trim().isEmpty())
            {

                JOptionPane.showMessageDialog(null, "Please, Enter a Gadget Mobil Price (£).");
                return;
            }

            if (weight.isBlank() && weight.isEmpty())
            {

                JOptionPane.showMessageDialog(null, "Please, Enter a Gadget Mobil Weight (Grams).");
                return;
            }

            if (size.isBlank() && size.isEmpty())
            {
                JOptionPane.showMessageDialog(null, "Please, Enter a Gadget Mobil Size (12mm X 17mm x 4mm).");
                return;
            }

            if (credit.isBlank() && credit.isEmpty())
            {
                JOptionPane.showMessageDialog(null, "Please, Enter a Calling Credit (Minutes).");
                return;
            }

            mobile = new Mobile();
            mobile.setModel(model);
            mobile.setPrice(Double.parseDouble(price));
            mobile.setWeight(Integer.parseInt(weight));
            mobile.setSize(size);
            mobile.setNumberOfMinutesOfCallingCreditRemaining(Integer.parseInt(credit));
            gadgetShopController.addGadget(mobile);

        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error: Please, You Must Enter  A Number (Ej: 1,2.... OR 5.5....): " + e.getMessage());
            return;
        }

        Clear();
        JOptionPane.showMessageDialog(null, "Great!. Mobile Added Successfully!");

    }//GEN-LAST:event_btnAddMobileActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnClearActionPerformed
    {//GEN-HEADEREND:event_btnClearActionPerformed
        Clear();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnAddMP3ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAddMP3ActionPerformed
    {//GEN-HEADEREND:event_btnAddMP3ActionPerformed

        String model = txtModel.getText();
        String price = txtPrice.getText();
        String weight = txtWeight.getText();
        String size = txtSize.getText();;
        String memory = txtMemory.getText();
        txtMemory.setText("");

        try
        {

            if (model.trim().isBlank() && model.trim().isEmpty())
            {
                JOptionPane.showMessageDialog(null, "Please, Enter a MP3 Model.");
                return;
            }

            if (price.trim().isBlank() && price.trim().isEmpty())
            {

                JOptionPane.showMessageDialog(null, "Please, Enter a MP3 Price (£).");
                return;
            }

            if (weight.isBlank() && weight.isEmpty())
            {

                JOptionPane.showMessageDialog(null, "Please, Enter a MP3 Weight (Grams).");
                return;
            }

            if (size.isBlank() && size.isEmpty())
            {
                JOptionPane.showMessageDialog(null, "Please, Enter a MP3 Size (12mm X 17mm x 4mm).");
                return;
            }

            if (memory.isBlank() && memory.isEmpty())
            {
                JOptionPane.showMessageDialog(null, "Please, Enter a Available Memory (MB).");
                return;
            }

            mp3 = new MP3();
            mp3.setModel(model);
            mp3.setPrice(Double.parseDouble(price));
            mp3.setWeight(Integer.parseInt(weight));
            mp3.setSize(size);
            mp3.setAvailableMemory(Double.parseDouble(memory));
            gadgetShopController.addGadget(mp3);

        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error: Please, You Must Enter  A Number (Ej: 1,2.... OR 5.5....): " + e.getMessage());
            return;
        }

        Clear();

        JOptionPane.showMessageDialog(null, "Great!. MP3 Added Successfully!");

    }//GEN-LAST:event_btnAddMP3ActionPerformed

    private void txtDeleteMusicFromMp3PlayerActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txtDeleteMusicFromMp3PlayerActionPerformed
    {//GEN-HEADEREND:event_txtDeleteMusicFromMp3PlayerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDeleteMusicFromMp3PlayerActionPerformed

    private void btnAddCallingCreditActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAddCallingCreditActionPerformed
    {//GEN-HEADEREND:event_btnAddCallingCreditActionPerformed
        String mobileId = txtSelectMobileId.getText();
        String creditToAdd = txtAddCallingCreditToMObile.getText();

        if (gadgetShopController.getGadgets().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Sorry!. No Gadgets Available to Add Calling Credit..");
            return;

        }

        if (mobileId.trim().isBlank() && mobileId.trim().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Error: Please Enter A Mobile Id From The List. ");
            return;
        }

        if (!isNonNegativeNumeric(mobileId))
        {
            JOptionPane.showMessageDialog(null, "Error: Please Enter a Valid Mobile Id Number (1,2...) Not Un: " + mobileId);
            return;

        }

        if (creditToAdd.trim().isBlank() && creditToAdd.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Error: Please Enter A Calling Credit  To Mobile (MInutes).");
            return;
        }

        if (!isNonNegativeNumeric(creditToAdd))
        {
            JOptionPane.showMessageDialog(null, "Error: Please Enter a Valid Add Credit From Mobile Minutes  (1,2...) Not A: " + creditToAdd);
            return;

        }

        try
        {
            int id = Integer.parseInt(mobileId);

            if (id >= 1 && id <= gadgetShopController.getGadgets().size() && gadgetShopController.getGadgets().get(id - 1) instanceof Mobile)
            {
                TextAreaShowData.append("Mobiles Update with Calling Credit:\n");
                ((Mobile) gadgetShopController.getGadgets().get(id - 1)).addCallingCredit(Integer.parseInt(creditToAdd));
                JOptionPane.showMessageDialog(null, "Great!. The Calling Credit To Add Was Successfully." + creditToAdd + " Minutes");
                TextAreaShowData.append(((Mobile) gadgetShopController.getGadgets().get(id - 1)).display());

                txtSelectMobileId.setText("");
                txtPhoneNumber.setText("");
                txtDuration.setText("");
                txtAddCallingCreditToMObile.setText("");
            }
            else
            {
                throw new IndexOutOfBoundsException();
            }

        }
        catch (IndexOutOfBoundsException | InputMismatchException e)
        {
            JOptionPane.showMessageDialog(null, "Error: Invalid Choice. Please Enter a Valid Number On The List.): " + e.getMessage());

        }

        TextAreaShowData.append("\n----------------------------------------------------------------------\n");
    }//GEN-LAST:event_btnAddCallingCreditActionPerformed

    private void btnDeleteMusicMP3ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnDeleteMusicMP3ActionPerformed
    {//GEN-HEADEREND:event_btnDeleteMusicMP3ActionPerformed
        String mp3Id = txtSelectMP3Id.getText();
        String deleteMusic = txtDeleteMusicFromMp3Player.getText();

        if (gadgetShopController.getGadgets().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Sorry!. No Gadgets Available To Delete Music MP3.");
            return;

        }

        if (mp3Id.trim().isBlank() && mp3Id.trim().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Error: Please Enter A MP3 Id From The List. ");
            return;
        }

        if (!isNonNegativeNumeric(mp3Id))
        {
            JOptionPane.showMessageDialog(null, "Error: Please Enter a Valid MP3 Id Number (1,2...) Not Un: " + mp3Id);
            return;

        }

        if (deleteMusic.trim().isBlank() && deleteMusic.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Error: Please Enter Memory To Free From The Delete Music (MB).");
            return;
        }

        if (!isNonNegativeNumeric(deleteMusic))
        {
            JOptionPane.showMessageDialog(null, "Error: Please Enter a Valid Memory  Number  From MP3 (1,2...) Not A: " + deleteMusic);
            return;

        }

        try
        {
            int idMp3 = Integer.parseInt(mp3Id);

            if (idMp3 >= 1 && idMp3 <= gadgetShopController.getGadgets().size() && gadgetShopController.getGadgets().get(idMp3 - 1) instanceof MP3)
            {
                TextAreaShowData.append("MP3 Update with Delete Memory:\n");
                ((MP3) gadgetShopController.getGadgets().get(idMp3 - 1)).deleteMusic(Integer.parseInt(deleteMusic));
                JOptionPane.showMessageDialog(null, "Great!. The Delete Music To MP3 Was Successfuully." + deleteMusic + " Minutes");
                TextAreaShowData.append(((MP3) gadgetShopController.getGadgets().get(idMp3 - 1)).display());

                txtSelectMP3Id.setText("");
                txtDownload.setText("");
                txtDeleteMusicFromMp3Player.setText("");

            }
            else
            {
                throw new IndexOutOfBoundsException();
            }

        }
        catch (IndexOutOfBoundsException | InputMismatchException e)
        {
            JOptionPane.showMessageDialog(null, "Error: Invalid Choice. Please Enter a Valid Number On The List.): " + e.getMessage());
            return;
        }

        TextAreaShowData.append("\n----------------------------------------------------------------------\n");
    }//GEN-LAST:event_btnDeleteMusicMP3ActionPerformed

    private void btnMakeACallActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnMakeACallActionPerformed
    {//GEN-HEADEREND:event_btnMakeACallActionPerformed

        String mobileId = txtSelectMobileId.getText();
        String phoneNumber = txtPhoneNumber.getText();
        String duration = txtDuration.getText();

        try
        {

            if (gadgetShopController.getGadgets().isEmpty())
            {
                JOptionPane.showMessageDialog(null, "Sorry!. No Gadgets Available to Make Call From Mobile.");
                return;

            }

            if (mobileId.trim().isBlank() && mobileId.trim().isEmpty())
            {
                JOptionPane.showMessageDialog(null, "Error: Please Enter A Mobile Id From The List. ");
                return;
            }

            if (!isNonNegativeNumeric(mobileId))
            {
                JOptionPane.showMessageDialog(null, "Error: Please Enter a Valid Mobile Id Number (1,2...) Not A: " + mobileId);
                return;

            }

            if (phoneNumber.trim().isBlank() && phoneNumber.isEmpty())
            {
                JOptionPane.showMessageDialog(null, "Error: Please Enter A Phone Number  To Make A Call (MInutes).");
                return;
            }

            if (!isValidUKPhoneNumber(phoneNumber))
            {
                JOptionPane.showMessageDialog(null, "Error: Please Enter A Phone Number  Valid To Make A Call (MInutes)." + phoneNumber);
                return;
            }

            if (!isNonNegativeNumeric(phoneNumber))
            {
                JOptionPane.showMessageDialog(null, "Error: Please Enter a Valid Phone Number To Make A Call  (1,2... Minutes) Not A: " + phoneNumber);
                return;

            }

            if (duration.trim().isBlank() && duration.isEmpty())
            {
                JOptionPane.showMessageDialog(null, "Error: Please Enter A Duration The Call. (MInutes).");
                return;
            }

            if (!isNonNegativeNumeric(duration))
            {
                JOptionPane.showMessageDialog(null, "Error: Please Enter a Valid Duration Number (1,2... (Minutes)) Not A: " + duration);
                return;

            }

            int mobileID = Integer.parseInt(mobileId);
            int NumberPhone = Integer.parseInt(phoneNumber);
            int callDuration = Integer.parseInt(duration);

            var resultMakeCall = gadgetShopController.makeCallFromMobile(mobileID, NumberPhone, callDuration);
            if (resultMakeCall.isBlank() && resultMakeCall.isEmpty())
            {
                TextAreaShowData.append("Making A Call From Mobile\n");
                JOptionPane.showMessageDialog(null, "Great!. Call Was Successfully");

                TextAreaShowData.append("CALLING NUMBER:" + phoneNumber + " FOR: " + duration + " MINUTES.\n");
                TextAreaShowData.append(resultMakeCall);
                txtDisplayNumber.setText(txtPhoneNumber.getText());
                txtSelectMobileId.setText("");
                txtPhoneNumber.setText("");
                txtDuration.setText("");
                txtAddCallingCreditToMObile.setText("");

            }
            else
            {
                JOptionPane.showMessageDialog(null, "Sorry!. Insufficient Credit To Make The Call.");

            }
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
            return;
        }

        TextAreaShowData.append("\n----------------------------------------------------------------------\n");


    }//GEN-LAST:event_btnMakeACallActionPerformed

    private void txtDisplayNumberActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txtDisplayNumberActionPerformed
    {//GEN-HEADEREND:event_txtDisplayNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDisplayNumberActionPerformed

    private void btnSHowAllMP3ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnSHowAllMP3ActionPerformed
    {//GEN-HEADEREND:event_btnSHowAllMP3ActionPerformed

        if (gadgetShopController.getGadgets().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Sorry! There Is Not MP3s To Display (Empty LIst.)");
            return;
        }

        TextAreaShowData.append("MP3s List:\n");

        for (Gadget gadget : gadgetShopController.getGadgets())
        {
            if (gadget instanceof MP3)
            {
                TextAreaShowData.append(" " + gadget.display());
                TextAreaShowData.append("\n");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Sorry! There Is Not Mobiles To Display (Empty LIst.)");
                TextAreaShowData.append("Sorry!. MP3 List Empty:\n");
                return;
            }
        }

        TextAreaShowData.append("\n----------------------------------------------------------------------\n");
    }//GEN-LAST:event_btnSHowAllMP3ActionPerformed

    private void txtSelectMobileIdActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txtSelectMobileIdActionPerformed
    {//GEN-HEADEREND:event_txtSelectMobileIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSelectMobileIdActionPerformed

    private void txtSelectMP3IdActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txtSelectMP3IdActionPerformed
    {//GEN-HEADEREND:event_txtSelectMP3IdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSelectMP3IdActionPerformed

    private boolean isNonNegativeNumeric(String text)
    {
        return text.matches("\\d+") && Integer.parseInt(text) >= 0;

    }

    public static boolean isValidUKPhoneNumber(String phoneNumber)
    {
        // Patrón de expresión regular para validar números de teléfono del Reino Unido
        String regex = "\\d{10}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }

    private void Clear()
    {
        txtModel.setText("");
        txtPrice.setText("");
        txtWeight.setText("");
        txtSize.setText("");
        txtCredit.setText("");
        txtMemory.setText("");
        txtSelectMobileId.setText("");
        txtSelectMP3Id.setText("");
        txtPhoneNumber.setText("");
        txtDuration.setText("");
        txtDisplayNumber.setText("");
        txtAddCallingCreditToMObile.setText("");
        txtDownload.setText("");
        txtDeleteMusicFromMp3Player.setText("");
        TextAreaShowData.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea TextAreaShowData;
    private javax.swing.JButton btnAddCallingCredit;
    private javax.swing.JButton btnAddMP3;
    private javax.swing.JButton btnAddMobile;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDeleteMusicMP3;
    private javax.swing.JButton btnDisplayAll;
    private javax.swing.JButton btnDownloadMusic;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnMakeACall;
    private javax.swing.JButton btnSHowAllMP3;
    private javax.swing.JButton btnShowAllMobiles;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelCallDowbloads;
    private javax.swing.JPanel jPanelContent;
    private javax.swing.JPanel jPanelEnterMobileMp3Data;
    private javax.swing.JPanel jPanelMain;
    private javax.swing.JPanel jPanelShowData;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblAddCallingCreditToMobile;
    private javax.swing.JLabel lblAddCallingCreditToMobile1;
    private javax.swing.JLabel lblCredit;
    private javax.swing.JLabel lblDisplayNumber;
    private javax.swing.JLabel lblDownload;
    private javax.swing.JLabel lblDuration;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblMemory;
    private javax.swing.JLabel lblPhoneNumber;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblSelectMobileId;
    private javax.swing.JLabel lblSelectMobileId1;
    private javax.swing.JLabel lblSize;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblWeight;
    private javax.swing.JLabel lblsize2;
    private javax.swing.JLabel lblsize3;
    private javax.swing.JLabel lblsize4;
    private javax.swing.JLabel lbpModel;
    private javax.swing.JTextField txtAddCallingCreditToMObile;
    private javax.swing.JTextField txtCredit;
    private javax.swing.JTextField txtDeleteMusicFromMp3Player;
    private javax.swing.JTextField txtDisplayNumber;
    private javax.swing.JTextField txtDownload;
    private javax.swing.JTextField txtDuration;
    private javax.swing.JTextField txtMemory;
    private javax.swing.JTextField txtModel;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtSelectMP3Id;
    private javax.swing.JTextField txtSelectMobileId;
    private javax.swing.JTextField txtSize;
    private javax.swing.JTextField txtWeight;
    // End of variables declaration//GEN-END:variables
}
