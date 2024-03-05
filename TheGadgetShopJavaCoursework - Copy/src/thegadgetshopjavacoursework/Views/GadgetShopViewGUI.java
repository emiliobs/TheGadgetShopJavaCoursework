package thegadgetshopjavacoursework.Views;

import java.util.InputMismatchException;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import thegadgetshopjavacoursework.Controllers.TheGadgetShopController;
import thegadgetshopjavacoursework.Models.Gadget;
import thegadgetshopjavacoursework.Models.MP3;
import thegadgetshopjavacoursework.Models.Mobile;

/**
 * This class represents the GUI view for a gadget shop application. It contains
 * components and functionalities to interact with the user.
 *
 * @author Emilio
 */
public class GadgetShopViewGUI extends javax.swing.JFrame
{

    // Instance variables declaration
    TheGadgetShopController gadgetShopController;
    Gadget gadget = new Gadget();
    Mobile mobile;
    MP3 mp3;
    ButtonGroup buttonGroup = new ButtonGroup();

    /**
     * Creates a new instance of GadgetShopViewGUI. This constructor initializes
     * the GUI components and sets up initial configurations.
     */
    public GadgetShopViewGUI()
    {
        initComponents(); // Initialize GUI components

        // Set application icon
        setIconImage(new ImageIcon(getClass().getResource("/Helps/Images/logo.png")).getImage());

        // Instantiate controller
        gadgetShopController = new TheGadgetShopController();

        // Set focus to txtModel text field
        txtModel.requestFocus();

        // Add radio buttons to a button group
        buttonGroup.add(jRadioButtonMObile);
        buttonGroup.add(jRadioButtonMPS);

        // Disable text fields and buttons
        txtModel.setEnabled(false);
        txtPrice.setEnabled(false);
        txtWeight.setEnabled(false);
        txtSize.setEnabled(false);
        txtCredit.setEnabled(false);
        txtMemory.setEnabled(false);

        btnAddMobile.setEnabled(false);
        btnAddMP3.setEnabled(false);
        btnDisplayAll.setEnabled(false);

        btnShowAllMobiles.setEnabled(false);
        txtSelectMobileId.setEnabled(false);
        txtPhoneNumber.setEnabled(false);
        txtDuration.setEnabled(false);
        txtDisplayNumber.setEnabled(false);
        txtAddCallingCreditToMObile.setEnabled(false);
        btnMakeACall.setEnabled(false);
        btnAddCallingCredit.setEnabled(false);

        btnSHowAllMP3.setEnabled(false);
        txtSelectMP3Id.setEnabled(false);
        txtDownload.setEnabled(false);
        txtDeleteMusicFromMp3Player.setEnabled(false);
        btnDownloadMusic.setEnabled(false);
        btnDeleteMusicMP3.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanelMain = new javax.swing.JPanel();
        jPanelContent = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        jPanelMobileMp3 = new javax.swing.JPanel();
        jPanelSlectAnOption = new javax.swing.JPanel();
        jRadioButtonMObile = new javax.swing.JRadioButton();
        jRadioButtonMPS = new javax.swing.JRadioButton();
        jLabelcelll = new javax.swing.JLabel();
        jLabelcelll1 = new javax.swing.JLabel();
        jPanelEnterData = new javax.swing.JPanel();
        lblMemory = new javax.swing.JLabel();
        txtMemory = new javax.swing.JTextField();
        lblMP3 = new javax.swing.JLabel();
        btnClear = new javax.swing.JButton();
        lblCredit = new javax.swing.JLabel();
        txtCredit = new javax.swing.JTextField();
        lblMobile = new javax.swing.JLabel();
        btnDisplayAll = new javax.swing.JButton();
        lblSize = new javax.swing.JLabel();
        txtSize = new javax.swing.JTextField();
        lblsize2 = new javax.swing.JLabel();
        lblWeight = new javax.swing.JLabel();
        txtWeight = new javax.swing.JTextField();
        btnAddMP3 = new javax.swing.JButton();
        txtPrice = new javax.swing.JTextField();
        lblPrice = new javax.swing.JLabel();
        lbpModel = new javax.swing.JLabel();
        txtModel = new javax.swing.JTextField();
        btnAddMobile = new javax.swing.JButton();
        jLabelLogo = new javax.swing.JLabel();
        jPanelCallDowbloads = new javax.swing.JPanel();
        jPanelSelectMobilToAddCalled = new javax.swing.JPanel();
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
        jPanelSelectMP3DOwnloadDeleteMusic = new javax.swing.JPanel();
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
        lblResults = new javax.swing.JLabel();
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

        jPanelMobileMp3.setBackground(new java.awt.Color(150, 204, 211));
        jPanelMobileMp3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 51, 51), 3, true), "Mobile and MP3 Players.", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 18), new java.awt.Color(255, 51, 51))); // NOI18N
        jPanelMobileMp3.setForeground(new java.awt.Color(255, 51, 51));
        jPanelMobileMp3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanelMobileMp3.setNextFocusableComponent(txtPrice);

        jPanelSlectAnOption.setBackground(new java.awt.Color(150, 204, 211));
        jPanelSlectAnOption.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 0), 3), "Please.You Must Select An Option:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 22), new java.awt.Color(255, 51, 51))); // NOI18N

        jRadioButtonMObile.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jRadioButtonMObile.setForeground(new java.awt.Color(255, 51, 0));
        jRadioButtonMObile.setText("Mobiles");
        jRadioButtonMObile.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jRadioButtonMObileActionPerformed(evt);
            }
        });

        jRadioButtonMPS.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jRadioButtonMPS.setForeground(new java.awt.Color(255, 51, 51));
        jRadioButtonMPS.setText("MP3 Players");
        jRadioButtonMPS.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jRadioButtonMPSActionPerformed(evt);
            }
        });

        jLabelcelll.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Helps/Images/day_heart_love_mp3_valentine_icon.png"))); // NOI18N

        jLabelcelll1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Helps/Images/Showmobile_phone_icon.png"))); // NOI18N

        javax.swing.GroupLayout jPanelSlectAnOptionLayout = new javax.swing.GroupLayout(jPanelSlectAnOption);
        jPanelSlectAnOption.setLayout(jPanelSlectAnOptionLayout);
        jPanelSlectAnOptionLayout.setHorizontalGroup(
            jPanelSlectAnOptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSlectAnOptionLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabelcelll1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButtonMObile)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelcelll)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButtonMPS)
                .addGap(52, 52, 52))
        );
        jPanelSlectAnOptionLayout.setVerticalGroup(
            jPanelSlectAnOptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSlectAnOptionLayout.createSequentialGroup()
                .addGroup(jPanelSlectAnOptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelSlectAnOptionLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelcelll1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelSlectAnOptionLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanelSlectAnOptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jRadioButtonMPS)
                            .addComponent(jRadioButtonMObile)
                            .addComponent(jLabelcelll))
                        .addGap(11, 11, 11)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanelEnterData.setBackground(new java.awt.Color(150, 204, 211));
        jPanelEnterData.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51), 3), "Enter Data.", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 18), new java.awt.Color(255, 51, 51))); // NOI18N

        lblMemory.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblMemory.setForeground(new java.awt.Color(255, 51, 51));
        lblMemory.setText("Memory:");

        txtMemory.setNextFocusableComponent(btnAddMobile);

        lblMP3.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblMP3.setForeground(new java.awt.Color(255, 0, 0));
        lblMP3.setText("(MP3)");

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

        lblCredit.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblCredit.setForeground(new java.awt.Color(255, 51, 51));
        lblCredit.setText("Credit: ");

        txtCredit.setNextFocusableComponent(txtMemory);

        lblMobile.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblMobile.setForeground(new java.awt.Color(255, 0, 0));
        lblMobile.setText("(Mobile)");

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

        lblSize.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblSize.setForeground(new java.awt.Color(255, 51, 51));
        lblSize.setText("Size:");

        txtSize.setNextFocusableComponent(txtCredit);

        lblsize2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblsize2.setForeground(new java.awt.Color(255, 0, 0));
        lblsize2.setText("(Ej: 12mm x 15 mm x 3 mm)");

        lblWeight.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblWeight.setForeground(new java.awt.Color(255, 51, 51));
        lblWeight.setText("Weight:");

        txtWeight.setNextFocusableComponent(txtSize);

        btnAddMP3.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btnAddMP3.setForeground(new java.awt.Color(222, 8, 8));
        btnAddMP3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Helps/Images/7574_mp3_icon.png"))); // NOI18N
        btnAddMP3.setText("Add MP3 Players");
        btnAddMP3.setToolTipText("Add MP3");
        btnAddMP3.setNextFocusableComponent(btnDisplayAll);
        btnAddMP3.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnAddMP3ActionPerformed(evt);
            }
        });

        txtPrice.setNextFocusableComponent(txtWeight);

        lblPrice.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblPrice.setForeground(new java.awt.Color(255, 51, 51));
        lblPrice.setText("Price:");

        lbpModel.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lbpModel.setForeground(new java.awt.Color(255, 51, 51));
        lbpModel.setText("Model: ");

        txtModel.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtModel.setNextFocusableComponent(txtPrice);

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

        javax.swing.GroupLayout jPanelEnterDataLayout = new javax.swing.GroupLayout(jPanelEnterData);
        jPanelEnterData.setLayout(jPanelEnterDataLayout);
        jPanelEnterDataLayout.setHorizontalGroup(
            jPanelEnterDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEnterDataLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanelEnterDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelEnterDataLayout.createSequentialGroup()
                        .addComponent(lbpModel)
                        .addGap(18, 18, 18)
                        .addComponent(txtModel, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblPrice)
                    .addGroup(jPanelEnterDataLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanelEnterDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelEnterDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanelEnterDataLayout.createSequentialGroup()
                                    .addGroup(jPanelEnterDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEnterDataLayout.createSequentialGroup()
                                            .addComponent(lblWeight)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEnterDataLayout.createSequentialGroup()
                                            .addComponent(lblSize)
                                            .addGap(39, 39, 39)))
                                    .addGroup(jPanelEnterDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtSize, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblsize2)
                                        .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanelEnterDataLayout.createSequentialGroup()
                                .addComponent(lblCredit)
                                .addGap(18, 18, 18)
                                .addGroup(jPanelEnterDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblMobile, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCredit, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblMP3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEnterDataLayout.createSequentialGroup()
                        .addComponent(lblMemory)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMemory, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanelEnterDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelEnterDataLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(btnAddMP3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanelEnterDataLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelEnterDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAddMobile, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDisplayAll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanelEnterDataLayout.setVerticalGroup(
            jPanelEnterDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEnterDataLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanelEnterDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelEnterDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbpModel))
                    .addComponent(btnAddMobile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanelEnterDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelEnterDataLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanelEnterDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPrice))
                        .addGap(34, 34, 34)
                        .addGroup(jPanelEnterDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblWeight))
                        .addGap(11, 11, 11)
                        .addComponent(lblsize2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelEnterDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSize))
                        .addGap(18, 18, Short.MAX_VALUE))
                    .addGroup(jPanelEnterDataLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(btnAddMP3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(57, 57, 57)))
                .addGroup(jPanelEnterDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelEnterDataLayout.createSequentialGroup()
                        .addComponent(lblMobile)
                        .addGap(10, 10, 10)
                        .addGroup(jPanelEnterDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCredit)
                            .addComponent(txtCredit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(lblMP3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanelEnterDataLayout.createSequentialGroup()
                        .addComponent(btnDisplayAll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(32, 32, 32)
                        .addGroup(jPanelEnterDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtMemory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMemory))))
                .addGap(38, 38, 38))
        );

        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Helps/Images/logo.png"))); // NOI18N

        javax.swing.GroupLayout jPanelMobileMp3Layout = new javax.swing.GroupLayout(jPanelMobileMp3);
        jPanelMobileMp3.setLayout(jPanelMobileMp3Layout);
        jPanelMobileMp3Layout.setHorizontalGroup(
            jPanelMobileMp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMobileMp3Layout.createSequentialGroup()
                .addGroup(jPanelMobileMp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelMobileMp3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanelEnterData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelMobileMp3Layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(jLabelLogo))
                    .addGroup(jPanelMobileMp3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanelSlectAnOption, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelMobileMp3Layout.setVerticalGroup(
            jPanelMobileMp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMobileMp3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanelSlectAnOption, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanelEnterData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanelCallDowbloads.setBackground(new java.awt.Color(150, 204, 211));
        jPanelCallDowbloads.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51), 3), "Call, Add, Download And Delete.", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 18), new java.awt.Color(255, 51, 51))); // NOI18N

        jPanelSelectMobilToAddCalled.setBackground(new java.awt.Color(150, 204, 211));
        jPanelSelectMobilToAddCalled.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51), 3), "Select Mobile To Add Calling Credit.", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 18), new java.awt.Color(255, 51, 0))); // NOI18N

        btnShowAllMobiles.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btnShowAllMobiles.setForeground(new java.awt.Color(222, 8, 8));
        btnShowAllMobiles.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Helps/Images/cell_mobile_phone_telefono_icon.png"))); // NOI18N
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
        txtPhoneNumber.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                txtPhoneNumberKeyTyped(evt);
            }
        });

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

        javax.swing.GroupLayout jPanelSelectMobilToAddCalledLayout = new javax.swing.GroupLayout(jPanelSelectMobilToAddCalled);
        jPanelSelectMobilToAddCalled.setLayout(jPanelSelectMobilToAddCalledLayout);
        jPanelSelectMobilToAddCalledLayout.setHorizontalGroup(
            jPanelSelectMobilToAddCalledLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSelectMobilToAddCalledLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanelSelectMobilToAddCalledLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelSelectMobilToAddCalledLayout.createSequentialGroup()
                        .addGroup(jPanelSelectMobilToAddCalledLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanelSelectMobilToAddCalledLayout.createSequentialGroup()
                                .addComponent(lblDisplayNumber)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtDisplayNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelSelectMobilToAddCalledLayout.createSequentialGroup()
                                .addComponent(lblAddCallingCreditToMobile)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtAddCallingCreditToMObile, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelSelectMobilToAddCalledLayout.createSequentialGroup()
                                .addGroup(jPanelSelectMobilToAddCalledLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPhoneNumber)
                                    .addComponent(lblSelectMobileId)
                                    .addComponent(lblDuration))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanelSelectMobilToAddCalledLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDuration, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPhoneNumber, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSelectMobileId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btnShowAllMobiles, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelSelectMobilToAddCalledLayout.createSequentialGroup()
                        .addGroup(jPanelSelectMobilToAddCalledLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanelSelectMobilToAddCalledLayout.createSequentialGroup()
                                .addComponent(btnMakeACall)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAddCallingCredit))
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanelSelectMobilToAddCalledLayout.setVerticalGroup(
            jPanelSelectMobilToAddCalledLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSelectMobilToAddCalledLayout.createSequentialGroup()
                .addGroup(jPanelSelectMobilToAddCalledLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelSelectMobilToAddCalledLayout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addGroup(jPanelSelectMobilToAddCalledLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPhoneNumber)))
                    .addGroup(jPanelSelectMobilToAddCalledLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(btnShowAllMobiles)
                        .addGap(18, 18, 18)
                        .addGroup(jPanelSelectMobilToAddCalledLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSelectMobileId)
                            .addComponent(txtSelectMobileId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(19, 19, 19)
                .addGroup(jPanelSelectMobilToAddCalledLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDuration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDuration))
                .addGap(15, 15, 15)
                .addGroup(jPanelSelectMobilToAddCalledLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDisplayNumber)
                    .addComponent(txtDisplayNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelSelectMobilToAddCalledLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAddCallingCreditToMobile)
                    .addComponent(txtAddCallingCreditToMObile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelSelectMobilToAddCalledLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddCallingCredit)
                    .addComponent(btnMakeACall))
                .addGap(0, 19, Short.MAX_VALUE))
        );

        jPanelSelectMP3DOwnloadDeleteMusic.setBackground(new java.awt.Color(150, 204, 211));
        jPanelSelectMP3DOwnloadDeleteMusic.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 0), 3), "Select MP3 To Download And Delete Music From MP3.", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 18), new java.awt.Color(255, 0, 0))); // NOI18N

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
        btnSHowAllMP3.setText("Show All MP3 Playes.");
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

        javax.swing.GroupLayout jPanelSelectMP3DOwnloadDeleteMusicLayout = new javax.swing.GroupLayout(jPanelSelectMP3DOwnloadDeleteMusic);
        jPanelSelectMP3DOwnloadDeleteMusic.setLayout(jPanelSelectMP3DOwnloadDeleteMusicLayout);
        jPanelSelectMP3DOwnloadDeleteMusicLayout.setHorizontalGroup(
            jPanelSelectMP3DOwnloadDeleteMusicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSelectMP3DOwnloadDeleteMusicLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSelectMP3DOwnloadDeleteMusicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelSelectMP3DOwnloadDeleteMusicLayout.createSequentialGroup()
                        .addComponent(btnDownloadMusic)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDeleteMusicMP3))
                    .addGroup(jPanelSelectMP3DOwnloadDeleteMusicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSelectMP3DOwnloadDeleteMusicLayout.createSequentialGroup()
                            .addGroup(jPanelSelectMP3DOwnloadDeleteMusicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnSHowAllMP3, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanelSelectMP3DOwnloadDeleteMusicLayout.createSequentialGroup()
                                    .addGroup(jPanelSelectMP3DOwnloadDeleteMusicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblAddCallingCreditToMobile1)
                                        .addComponent(lblDownload)
                                        .addComponent(lblSelectMobileId1))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanelSelectMP3DOwnloadDeleteMusicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtSelectMP3Id, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtDownload, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtDeleteMusicFromMp3Player, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGap(15, 15, 15))))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        jPanelSelectMP3DOwnloadDeleteMusicLayout.setVerticalGroup(
            jPanelSelectMP3DOwnloadDeleteMusicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSelectMP3DOwnloadDeleteMusicLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSHowAllMP3)
                .addGap(18, 18, 18)
                .addGroup(jPanelSelectMP3DOwnloadDeleteMusicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSelectMobileId1)
                    .addComponent(txtSelectMP3Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelSelectMP3DOwnloadDeleteMusicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDownload)
                    .addComponent(txtDownload, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelSelectMP3DOwnloadDeleteMusicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDeleteMusicFromMp3Player, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAddCallingCreditToMobile1))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelSelectMP3DOwnloadDeleteMusicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
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
                    .addComponent(jPanelSelectMobilToAddCalled, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelSelectMP3DOwnloadDeleteMusic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelCallDowbloadsLayout.setVerticalGroup(
            jPanelCallDowbloadsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCallDowbloadsLayout.createSequentialGroup()
                .addComponent(jPanelSelectMobilToAddCalled, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelSelectMP3DOwnloadDeleteMusic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
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
        jPanelShowData.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51), 3), "Show Data From Mobile And MP3 Players.", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 18), new java.awt.Color(255, 51, 0))); // NOI18N

        lblResults.setFont(new java.awt.Font("Segoe UI", 3, 26)); // NOI18N
        lblResults.setForeground(new java.awt.Color(255, 51, 51));
        lblResults.setText("Results:");

        TextAreaShowData.setBackground(new java.awt.Color(150, 204, 211));
        TextAreaShowData.setColumns(20);
        TextAreaShowData.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        TextAreaShowData.setForeground(new java.awt.Color(0, 0, 0));
        TextAreaShowData.setRows(5);
        TextAreaShowData.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51), 3));
        TextAreaShowData.setNextFocusableComponent(btnExit);
        jScrollPane1.setViewportView(TextAreaShowData);

        javax.swing.GroupLayout jPanelShowDataLayout = new javax.swing.GroupLayout(jPanelShowData);
        jPanelShowData.setLayout(jPanelShowDataLayout);
        jPanelShowDataLayout.setHorizontalGroup(
            jPanelShowDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelShowDataLayout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(lblResults)
                .addContainerGap(119, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelShowDataLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanelShowDataLayout.setVerticalGroup(
            jPanelShowDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelShowDataLayout.createSequentialGroup()
                .addComponent(lblResults)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 707, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout jPanelContentLayout = new javax.swing.GroupLayout(jPanelContent);
        jPanelContent.setLayout(jPanelContentLayout);
        jPanelContentLayout.setHorizontalGroup(
            jPanelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelContentLayout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1546, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 15, Short.MAX_VALUE))
                    .addGroup(jPanelContentLayout.createSequentialGroup()
                        .addComponent(jPanelMobileMp3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelCallDowbloads, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelShowData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelContentLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(425, 425, 425)
                        .addComponent(btnExit)
                        .addGap(23, 23, 23))))
        );
        jPanelContentLayout.setVerticalGroup(
            jPanelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTitle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelCallDowbloads, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelMobileMp3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelShowData, javax.swing.GroupLayout.PREFERRED_SIZE, 793, Short.MAX_VALUE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelMainLayout = new javax.swing.GroupLayout(jPanelMain);
        jPanelMain.setLayout(jPanelMainLayout);
        jPanelMainLayout.setHorizontalGroup(
            jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMainLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelContent, javax.swing.GroupLayout.PREFERRED_SIZE, 1589, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        jPanelMainLayout.setVerticalGroup(
            jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelContent, javax.swing.GroupLayout.PREFERRED_SIZE, 953, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMain, javax.swing.GroupLayout.PREFERRED_SIZE, 1619, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleName("GADGET SHOP");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Handles the action event when the user clicks the "Download Music"
     * button. This method retrieves the MP3 ID and the memory to free from the
     * UI components. It performs validations and then attempts to download
     * music to the specified MP3 player. If successful, it updates the UI with
     * the information of the MP3 player and the download status. If
     * unsuccessful, it displays an error message.
     *
     * @param evt The ActionEvent representing the user's action
     */

    private void btnDownloadMusicActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnDownloadMusicActionPerformed
    {//GEN-HEADEREND:event_btnDownloadMusicActionPerformed
        String mp3Id = txtSelectMP3Id.getText();
        String downloadMusic = txtDownload.getText();

        // Check if the gadget list is empty
        if (gadgetShopController.getGadgets().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Sorry!. No Gadgets Available To Delete Music MP3.");
            return;
        }

        // Validate MP3 ID input
        if (mp3Id.trim().isBlank() && mp3Id.trim().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Error: Please Enter A MP3 Id From The List. ");
            return;
        }

        // Validate if MP3 ID is a non-negative number
        if (!isNonNegativeNumeric(mp3Id))
        {
            JOptionPane.showMessageDialog(null, "Error: Please Enter a Valid MP3 Id Number (1,2...) Not Un: " + mp3Id);
            return;
        }

        // Validate memory input
        if (downloadMusic.trim().isBlank() && downloadMusic.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Error: Please Enter Memory To Free From The Delete Music (MB).");
            return;
        }

        // Validate if memory input is a non-negative number
        if (!isNonNegativeNumeric(downloadMusic))
        {
            JOptionPane.showMessageDialog(null, "Error: Please Enter a Valid Memory  Number  From MP3 (1,2...) Not A: " + downloadMusic);
            return;
        }

        try
        {
            // Parsing MP3 ID
            int idMp3 = Integer.parseInt(mp3Id);

            // Validation and Checking MP3 ID
            if (idMp3 >= 1 && idMp3 <= gadgetShopController.getGadgets().size() && gadgetShopController.getGadgets().get(idMp3 - 1) instanceof MP3)
            {
                // Attempting to download music
                boolean resultDownload = ((MP3) gadgetShopController.getGadgets().get(idMp3 - 1)).downloadMusic(Integer.parseInt(downloadMusic));

                // Handling Download Result
                if (resultDownload)
                {
                    // Actions if download is successful
                    TextAreaShowData.append("MP3 Update With Download Music In MB:\n");
                    JOptionPane.showMessageDialog(null, "Great!. The Download Music To MP3 Was Successfully: " + downloadMusic + " MB");
                    TextAreaShowData.append(((MP3) gadgetShopController.getGadgets().get(idMp3 - 1)).display());

                    txtSelectMP3Id.setText("");
                    txtDownload.setText("");
                    txtDeleteMusicFromMp3Player.setText("");
                }
                else
                {
                    // Actions if download fails
                    JOptionPane.showMessageDialog(null, "Sorry!. Not Enough Memory To Download Music!");
                    return;
                }
            }
            else
            {
                // Invalid MP3 ID
                throw new IndexOutOfBoundsException();
            }
        }
        catch (IndexOutOfBoundsException | InputMismatchException e)
        {
            // Exception Handling
            JOptionPane.showMessageDialog(null, "Error: Invalid Choice. Please Enter a Valid Number On The List.): " + e.getMessage());
            return;
        }

        // Appending to TextArea
        TextAreaShowData.append("\n-------------------------------------------------------------\n");
    }//GEN-LAST:event_btnDownloadMusicActionPerformed

    
    /**
     * Handles the action event when the user clicks the "Show All Mobiles"
     * button. This method clears the TextAreaShowData and then iterates through
     * the gadget list. It displays information only for the gadgets that are
     * instances of Mobile. If no mobile gadgets are found, it displays an error
     * message.
     *
     * @param evt The ActionEvent representing the user's action
     */
    private void btnShowAllMobilesActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnShowAllMobilesActionPerformed
    {//GEN-HEADEREND:event_btnShowAllMobilesActionPerformed

        // Clearing the text area
        TextAreaShowData.setText("");

        // Checking if the list of gadgets is empty
        if (gadgetShopController.getGadgets().isEmpty())
        {
            // Displaying a message if there are no gadgets available
            JOptionPane.showMessageDialog(null, "Sorry!. No Gadgets Available From Mobiles");
            // Exiting the method
            return;
        }

        // Appending a header for the Mobiles List
        TextAreaShowData.append("Mobiles List:\n");

        // Iterating over each gadget in the list
        for (Gadget gadget : gadgetShopController.getGadgets())
        {
            // Checking if the gadget is an instance of Mobile
            if (gadget instanceof Mobile)
            {
                // Displaying information about the mobile gadget
                TextAreaShowData.append(" " + gadget.display() + "\n");
                // Adding a newline after displaying each mobile gadget
                TextAreaShowData.append("\n");
            }
        }

        // Appending a separator line
        TextAreaShowData.append("-------------------------------------------------------------\n");

        // Resetting input fields 
        txtSelectMP3Id.setText("");
        txtDeleteMusicFromMp3Player.setText("");
        txtDownload.setText("");


    }//GEN-LAST:event_btnShowAllMobilesActionPerformed

    /**
     * Handles the action event when the user clicks the "Display All" button.
     * This method clears the TextAreaShowData and then iterates through the
     * gadget list. It displays information for all gadgets. If the gadget list
     * is empty, it displays an error message.
     *
     * @param evt The ActionEvent representing the user's action
     */
    private void btnDisplayAllActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnDisplayAllActionPerformed
    {//GEN-HEADEREND:event_btnDisplayAllActionPerformed

        // Clearing the text area
        TextAreaShowData.setText("");

        // Checking if the list of gadgets is empty
        if (gadgetShopController.getGadgets().isEmpty())
        {
            // Displaying a message if the list is empty
            JOptionPane.showMessageDialog(null, "Sorry! There Is Not gadgets To Display (Empty List.)");
            // Exiting the method
            return;
        }

        // Appending a header for displaying all gadgets
        TextAreaShowData.append("Display All Gadgets:\n");

        // Iterating over each gadget in the list
        for (Gadget gadget : gadgetShopController.getGadgets())
        {
            // Displaying information about the gadget
            TextAreaShowData.append(" " + gadget.display() + "\n");
            // Adding a newline after displaying each gadget
            TextAreaShowData.append("\n");
        }

        // Appending a separator line
        TextAreaShowData.append("-------------------------------------------------------------\n");


    }//GEN-LAST:event_btnDisplayAllActionPerformed

    /**
     * This method is an event handler for the button "btnExit". It is invoked
     * when the user clicks on the button to exit the application. It disposes
     * of the current window, effectively closing it.
     *
     * @param evt The ActionEvent representing the user's action (clicking the
     * button)
     */
    private void btnExitActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnExitActionPerformed
    {//GEN-HEADEREND:event_btnExitActionPerformed
        dispose(); // Dispose of the current window
    }//GEN-LAST:event_btnExitActionPerformed

    /**
     * This method is an event handler for the button "btnAddMobile". It is
     * invoked when the user clicks on the button to add a mobile gadget.
     *
     * @param evt The ActionEvent representing the user's action (clicking the
     * button)
     */
    private void btnAddMobileActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAddMobileActionPerformed
    {//GEN-HEADEREND:event_btnAddMobileActionPerformed

        // Retrieving input values from text fields
        String model = txtModel.getText();
        String price = txtPrice.getText();
        String weight = txtWeight.getText();
        String size = txtSize.getText();
        String credit = txtCredit.getText();

        try
        {
            // Input validation
            if (model.trim().isBlank() && model.trim().isEmpty())
            {
                // Display an error message if the model field is empty
                JOptionPane.showMessageDialog(null, "Please, Enter a Gadget Mobile Model.");
                return;
            }
            else
            {
                // Enabling buttons and text fields related to mobile gadgets
                btnDisplayAll.setEnabled(true);
                btnShowAllMobiles.setEnabled(true);
                txtSelectMobileId.setEnabled(true);
                txtPhoneNumber.setEnabled(true);
                txtDuration.setEnabled(true);
                txtDisplayNumber.setEnabled(true);
                txtAddCallingCreditToMObile.setEnabled(true);
                btnMakeACall.setEnabled(true);
                btnAddCallingCredit.setEnabled(true);
            }

            if (price.trim().isBlank() && price.trim().isEmpty())
            {
                // Display an error message if the price field is empty
                JOptionPane.showMessageDialog(null, "Please, Enter a Gadget Mobile Price (£).");
                return;
            }

            if (weight.isBlank() && weight.isEmpty())
            {
                // Display an error message if the weight field is empty
                JOptionPane.showMessageDialog(null, "Please, Enter a Gadget Mobile Weight (Grams).");
                return;
            }

            if (size.isBlank() && size.isEmpty())
            {
                // Display an error message if the size field is empty
                JOptionPane.showMessageDialog(null, "Please, Enter a Gadget Mobile Size (12mm X 17mm x 4mm).");
                return;
            }

            if (credit.isBlank() && credit.isEmpty())
            {
                // Display an error message if the credit field is empty
                JOptionPane.showMessageDialog(null, "Please, Enter Calling Credit (Minutes).");
                return;
            }

            // Creating a new Mobile object
            Mobile mobile = new Mobile();
            // Setting properties of the Mobile object
            mobile.setModel(model);
            mobile.setPrice(Double.parseDouble(price));
            mobile.setWeight(Integer.parseInt(weight));
            mobile.setSize(size);
            mobile.setNumberOfMinutesOfCallingCreditRemaining(Integer.parseInt(credit));
            // Adding the Mobile object to the gadget shop controller
            gadgetShopController.addGadget(mobile);

        }
        catch (Exception e)
        {
            // Exception handling
            JOptionPane.showMessageDialog(null, "Error: Please, Enter a Number (e.g., 1, 2, or 5.5): " + e.getMessage());
            return;
        }

        // Displaying a success message
        JOptionPane.showMessageDialog(null, "Great!. Mobile Added Successfully!");

        // Clearing input fields
        txtModel.setText("");
        txtPrice.setText("");
        txtWeight.setText("");
        txtSize.setText("");
        txtCredit.setText("");


    }//GEN-LAST:event_btnAddMobileActionPerformed

    /**
     * This method is an event handler for the button "btnClear". It is invoked
     * when the user clicks on the button to clear/reset some data or
     * components.
     *
     * @param evt The ActionEvent representing the user's action (clicking the
     * button)
     */
    private void btnClearActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnClearActionPerformed
    {//GEN-HEADEREND:event_btnClearActionPerformed
        Clear(); //method is defined as private, indicating that it is only accessible within the same class
    }//GEN-LAST:event_btnClearActionPerformed

    /**
     * This method is an event handler for the button "btnAddMP3". It is invoked
     * when the user clicks on the button to add an MP3 gadget.
     *
     * @param evt The ActionEvent representing the user's action (clicking the
     * button)
     */

    private void btnAddMP3ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAddMP3ActionPerformed
    {//GEN-HEADEREND:event_btnAddMP3ActionPerformed

        // Retrieving input values from text fields
        String model = txtModel.getText();
        String price = txtPrice.getText();
        String weight = txtWeight.getText();
        String size = txtSize.getText();
        String memory = txtMemory.getText();

        try
        {
            // Input validation
            if (model.trim().isBlank() && model.trim().isEmpty())
            {
                // Display an error message if the model field is empty
                JOptionPane.showMessageDialog(null, "Please, Enter a MP3 Model.");
                return;
            }
            else
            {
                // Enabling buttons and text fields related to MP3 gadgets
                btnDisplayAll.setEnabled(true);
                btnSHowAllMP3.setEnabled(true);
                txtSelectMP3Id.setEnabled(true);
                txtDownload.setEnabled(true);
                txtDeleteMusicFromMp3Player.setEnabled(true);
                btnDownloadMusic.setEnabled(true);
                btnDeleteMusicMP3.setEnabled(true);
            }

            if (price.trim().isBlank() && price.trim().isEmpty())
            {
                // Display an error message if the price field is empty
                JOptionPane.showMessageDialog(null, "Please, Enter a MP3 Price (£).");
                return;
            }

            if (weight.isBlank() && weight.isEmpty())
            {
                // Display an error message if the weight field is empty
                JOptionPane.showMessageDialog(null, "Please, Enter a MP3 Weight (Grams).");
                return;
            }

            if (size.isBlank() && size.isEmpty())
            {
                // Display an error message if the size field is empty
                JOptionPane.showMessageDialog(null, "Please, Enter a MP3 Size (12mm X 17mm x 4mm).");
                return;
            }

            if (memory.isBlank() && memory.isEmpty())
            {
                // Display an error message if the memory field is empty
                JOptionPane.showMessageDialog(null, "Please, Enter Available Memory (MB).");
                return;
            }

            // Creating a new MP3 object
            mp3 = new MP3();
            // Setting properties of the MP3 object
            mp3.setModel(model);
            mp3.setPrice(Double.parseDouble(price));
            mp3.setWeight(Integer.parseInt(weight));
            mp3.setSize(size);
            mp3.setAvailableMemory(Double.parseDouble(memory));
            // Adding the MP3 object to the gadget shop controller
            gadgetShopController.addGadget(mp3);

        }
        catch (Exception e)
        {
            // Exception handling
            JOptionPane.showMessageDialog(null, "Error: Please, You Must Enter a Number (e.g., 1, 2, or 5.5): " + e.getMessage());
            return;
        }

        // Displaying a success message
        JOptionPane.showMessageDialog(null, "Great!. MP3 Added Successfully!");

        // Clearing input fields
        txtModel.setText("");
        txtPrice.setText("");
        txtWeight.setText("");
        txtSize.setText("");
        txtMemory.setText("");


    }//GEN-LAST:event_btnAddMP3ActionPerformed

    private void txtDeleteMusicFromMp3PlayerActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txtDeleteMusicFromMp3PlayerActionPerformed
    {//GEN-HEADEREND:event_txtDeleteMusicFromMp3PlayerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDeleteMusicFromMp3PlayerActionPerformed

    /*
        This method appears to handle adding calling credit to a mobile gadget in a shop's inventory. 
        It validates user input, performs necessary checks, 
        updates the gadget's calling credit, and displays appropriate messages.
     */
    private void btnAddCallingCreditActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAddCallingCreditActionPerformed
    {//GEN-HEADEREND:event_btnAddCallingCreditActionPerformed
        // Step 1: Extracting Input
        String mobileId = txtSelectMobileId.getText();
        String creditToAdd = txtAddCallingCreditToMObile.getText();

        // Step 2: Checking for Empty Gadget List
        if (gadgetShopController.getGadgets().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Sorry!. No Gadgets Available to Add Calling Credit..");
            return;
        }

        // Step 3: Validating Mobile ID
        if (mobileId.trim().isBlank() && mobileId.trim().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Error: Please Enter A Mobile Id From The List. ");
            return;
        }

        // Step 4: Validating Mobile ID Format
        if (!isNonNegativeNumeric(mobileId))
        {
            JOptionPane.showMessageDialog(null, "Error: Please Enter a Valid Mobile Id Number (1,2...) Not Un: " + mobileId);
            return;

        }

        // Step 5: Validating Credit to Add
        if (creditToAdd.trim().isBlank() && creditToAdd.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Error: Please Enter A Calling Credit  To Mobile (MInutes).");
            return;
        }

        // Step 6: Validating Credit to Add Format
        if (!isNonNegativeNumeric(creditToAdd))
        {
            JOptionPane.showMessageDialog(null, "Error: Please Enter a Valid Add Credit From Mobile Minutes  (1,2...) Not A: " + creditToAdd);
            return;
        }

        try
        {
            // Step 7: Parsing Mobile ID
            int id = Integer.parseInt(mobileId);

            // Step 8: Checking Mobile ID Range and Type
            if (id >= 1 && id <= gadgetShopController.getGadgets().size() && gadgetShopController.getGadgets().get(id - 1) instanceof Mobile)
            {
                // Step 9: Updating Mobile's Calling Credit
                TextAreaShowData.append("Mobiles Update with Calling Credit:\n");
                ((Mobile) gadgetShopController.getGadgets().get(id - 1)).addCallingCredit(Integer.parseInt(creditToAdd));

                // Step 10: Displaying Updates
                JOptionPane.showMessageDialog(null, "Great!. The Calling Credit To Add Was Successfully." + creditToAdd + " Minutes");
                TextAreaShowData.append(((Mobile) gadgetShopController.getGadgets().get(id - 1)).display() + "\n");

                // Step 11: Clearing Text Fields
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
            // Step 12: Exception Handling
            JOptionPane.showMessageDialog(null, "Error: Invalid Choice. Please Enter a Valid Number On The List.): " + e.getMessage());
        }
        // Step 13: Appending Separator
        TextAreaShowData.append("-------------------------------------------------------------\n");
    }//GEN-LAST:event_btnAddCallingCreditActionPerformed

    /*
        This method handles the deletion of music from an MP3 player in a Java GUI application. 
        It takes input from text fields for MP3 ID and the amount of memory to delete, performs validation checks, 
        updates the MP3 player's memory, and displays appropriate messages. Finally, 
        it appends a separator to the text area for visual distinction.
     */
    private void btnDeleteMusicMP3ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnDeleteMusicMP3ActionPerformed
    {//GEN-HEADEREND:event_btnDeleteMusicMP3ActionPerformed
        // Extract MP3 ID and memory to delete from text fields
        String mp3Id = txtSelectMP3Id.getText();
        String deleteMusic = txtDeleteMusicFromMp3Player.getText();

        // Check if the gadget list is empty
        if (gadgetShopController.getGadgets().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Sorry!. No Gadgets Available To Delete Music MP3.");
            return;
        }

        // Check for empty or invalid MP3 ID
        if (mp3Id.trim().isBlank() && mp3Id.trim().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Error: Please Enter A MP3 Id From The List. ");
            return;
        }

        // Validate if MP3 ID is a non-negative numeric value
        if (!isNonNegativeNumeric(mp3Id))
        {
            JOptionPane.showMessageDialog(null, "Error: Please Enter a Valid MP3 Id Number (1,2...) Not Un: " + mp3Id);
            return;
        }

        // Check for empty or invalid memory value
        if (deleteMusic.trim().isBlank() && deleteMusic.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Error: Please Enter Memory To Free From The Delete Music (MB).");
            return;
        }

        // Validate if memory value is a non-negative numeric value
        if (!isNonNegativeNumeric(deleteMusic))
        {
            JOptionPane.showMessageDialog(null, "Error: Please Enter a Valid Memory  Number  From MP3 (1,2...) Not A: " + deleteMusic);
            return;
        }

        try
        {
            // Attempt to parse MP3 ID to an integer
            int idMp3 = Integer.parseInt(mp3Id);

            // Check if the ID is within the range and if it's an MP3
            if (idMp3 >= 1 && idMp3 <= gadgetShopController.getGadgets().size() && gadgetShopController.getGadgets().get(idMp3 - 1) instanceof MP3)
            {
                // Display update message
                TextAreaShowData.append("MP3 Update with Delete Music Memory:\n");

                // Delete music from MP3 and display success message
                ((MP3) gadgetShopController.getGadgets().get(idMp3 - 1)).deleteMusic(Integer.parseInt(deleteMusic));
                JOptionPane.showMessageDialog(null, "Great!. The Delete Music To MP3 Was Successfully." + deleteMusic + " Minutes");

                // Display updated MP3 details
                TextAreaShowData.append(((MP3) gadgetShopController.getGadgets().get(idMp3 - 1)).display() + "\n");

                // Reset text fields
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
            // Handle exceptions
            JOptionPane.showMessageDialog(null, "Error: Invalid Choice. Please Enter a Valid Number On The List.): " + e.getMessage());
            return;
        }

        // Append separator to the text area
        TextAreaShowData.append("-------------------------------------------------------------\n");

    }//GEN-LAST:event_btnDeleteMusicMP3ActionPerformed

    /**
     * Action performed when the make a call button for mobile is clicked.
     *
     * @param evt Action event generated when the button is clicked.
     *
     * The instanceof operator in Java is used to test whether an object is an
     * instance of a particular class or interface. It also checks if an object
     * is an instance of a subclass of the specified class or interface.
     */

    private void btnMakeACallActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnMakeACallActionPerformed
    {//GEN-HEADEREND:event_btnMakeACallActionPerformed
        // Extract mobile ID, phone number, and call duration from text fields
        String mobileId = txtSelectMobileId.getText();
        String phoneNumber = txtPhoneNumber.getText();
        String duration = txtDuration.getText();

        // Check if the gadget list is empty
        if (gadgetShopController.getGadgets().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Sorry!. No Gadgets Available to Make Call From Mobile.");
            return;
        }

        // Check for empty or invalid mobile ID
        if (mobileId.trim().isBlank() && mobileId.trim().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Error: Please Enter A Mobile Id From The List. ");
            return;
        }

        // Validate if mobile ID is a non-negative numeric value
        if (!isNonNegativeNumeric(mobileId))
        {
            JOptionPane.showMessageDialog(null, "Error: Please Enter a Valid Mobile Id Number (1,2...) Not A: " + mobileId);
            return;
        }

        // Check for empty or invalid phone number
        if (phoneNumber.trim().isBlank() && phoneNumber.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Error: Please Enter A Phone Number  To Make A Call (Minutes).");
            return;
        }

        // Validate phone number format
        if (phoneNumber.length() != 9 || !isNonNegativeNumeric(phoneNumber))
        {
            JOptionPane.showMessageDialog(null, "Error: Please Enter a Valid Phone Number To Make A Call  (9-Digits) Not A: " + phoneNumber);
            return;
        }

        // Check for empty or invalid call duration
        if (duration.trim().isBlank() && duration.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Error: Please Enter A Duration The Call. (Minutes).");
            return;
        }

        // Validate if call duration is a non-negative numeric value
        if (!isNonNegativeNumeric(duration))
        {
            JOptionPane.showMessageDialog(null, "Error: Please Enter a Valid Duration Number (1,2... (Minutes)) Not A: " + duration);
            return;
        }

        try
        {
            // Attempt to parse values to integers
            int mobileID = Integer.parseInt(mobileId);
            int NumberPhone = Integer.parseInt(phoneNumber);
            int callDuration = Integer.parseInt(duration);

            // Check if the mobile ID is within the range and if it's a Mobile object
            if (mobileID >= 1 && mobileID <= gadgetShopController.getGadgets().size() && gadgetShopController.getGadgets().get(mobileID - 1) instanceof Mobile)
            {
                // Make the call and handle the result
                boolean resultMakeCAll = ((Mobile) gadgetShopController.getGadgets().get(mobileID - 1)).mobileMakeCall(NumberPhone, callDuration);
                if (resultMakeCAll)
                {
                    // Display success message and updated details
                    TextAreaShowData.append("Making A Call From Mobile\n");
                    JOptionPane.showMessageDialog(null, "Great!. Call Was Successfully");
                    TextAreaShowData.append("CALLING NUMBER: " + phoneNumber + " FOR: " + duration + " MINUTES.\n");
                    TextAreaShowData.append(((Mobile) gadgetShopController.getGadgets().get(mobileID - 1)).display() + "\n");

                    // Reset text fields
                    txtDisplayNumber.setText(txtPhoneNumber.getText());
                    txtSelectMobileId.setText("");
                    txtPhoneNumber.setText("");
                    txtDuration.setText("");
                    txtAddCallingCreditToMObile.setText("");
                    TextAreaShowData.append("-------------------------------------------------------------\n");

                }
                else
                {
                    // Display error message for insufficient credit
                    JOptionPane.showMessageDialog(null, "Sorry!. Insufficient Credit To Make The Call.");
                }
            }
            else
            {
                throw new IndexOutOfBoundsException();
            }
        }
        catch (IndexOutOfBoundsException | InputMismatchException e)
        {
            // Handle exceptions
            JOptionPane.showMessageDialog(null, "Error: Invalid Choice. Please Enter A Valid Number On The List.: " + e.getMessage());
        }
    }//GEN-LAST:event_btnMakeACallActionPerformed

    private void txtDisplayNumberActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txtDisplayNumberActionPerformed
    {//GEN-HEADEREND:event_txtDisplayNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDisplayNumberActionPerformed

    /**
     * Action performed when the button to show all MP3 gadgets is clicked.
     *
     * @param evt Action event generated when the button is clicked.
     */

    private void btnSHowAllMP3ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnSHowAllMP3ActionPerformed
    {//GEN-HEADEREND:event_btnSHowAllMP3ActionPerformed
        // Clear the text area
        TextAreaShowData.setText("");

        // Check if the gadget list is empty
        if (gadgetShopController.getGadgets().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Sorry!. No Gadgets Available From MP3s.");
            return;
        }
        else
        {
            // Iterate through the list of gadgets
            // Display MP3 gadgets
            TextAreaShowData.append("MP3s List:\n");
            for (Gadget gadget : gadgetShopController.getGadgets())
            {
                if (gadget instanceof MP3)
                {
                    // Display MP3 gadget details
                    TextAreaShowData.append(" " + gadget.display() + "\n");
                    TextAreaShowData.append("\n");
                }
            }
            // Append separator to the text area
            TextAreaShowData.append("-------------------------------------------------------------\n");
        }
    }//GEN-LAST:event_btnSHowAllMP3ActionPerformed


    private void txtSelectMobileIdActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txtSelectMobileIdActionPerformed
    {//GEN-HEADEREND:event_txtSelectMobileIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSelectMobileIdActionPerformed

    private void txtSelectMP3IdActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txtSelectMP3IdActionPerformed
    {//GEN-HEADEREND:event_txtSelectMP3IdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSelectMP3IdActionPerformed

    /**
     * Event handler triggered when a key is typed in the txtPhoneNumber text
     * field.
     *
     * @param evt The KeyEvent representing the key typed event.
     */

    private void txtPhoneNumberKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtPhoneNumberKeyTyped
    {//GEN-HEADEREND:event_txtPhoneNumberKeyTyped
        // Check if the length of the text in the txtPhoneNumber field is greater than or equal to 9
        if (txtPhoneNumber.getText().length() >= 9)
        {
            // If the length is greater than or equal to 9, consume the event (ignore the key input)
            evt.consume();
        }
    }//GEN-LAST:event_txtPhoneNumberKeyTyped

    /**
     * Event handler triggered when the "Mobile" radio button is selected.
     *
     * @param evt The ActionEvent representing the action performed event.
     */

    private void jRadioButtonMObileActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jRadioButtonMObileActionPerformed
    {//GEN-HEADEREND:event_jRadioButtonMObileActionPerformed
        // Display a message indicating that mobiles are selected
        JOptionPane.showMessageDialog(null, "Brilliant!. Your Select Was Add Mobiles.");

        // Enable text fields related to mobile information
        txtModel.setEnabled(true);
        txtPrice.setEnabled(true);
        txtWeight.setEnabled(true);
        txtSize.setEnabled(true);
        txtCredit.setEnabled(true);

        // Disable text field related to MP3 memory (assuming it's related to MP3s)
        txtMemory.setEnabled(false);

        // Enable buttons related to adding mobiles and disable buttons related to adding MP3s
        btnAddMobile.setEnabled(true);
        btnAddMP3.setEnabled(false);
    }//GEN-LAST:event_jRadioButtonMObileActionPerformed

    /**
     * Event handler triggered when the "MP3" radio button is selected.
     *
     * @param evt The ActionEvent representing the action performed event.
     */

    private void jRadioButtonMPSActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jRadioButtonMPSActionPerformed
    {//GEN-HEADEREND:event_jRadioButtonMPSActionPerformed
        // Display a message indicating that MP3 players are selected
        JOptionPane.showMessageDialog(null, "Brilliant!. Your Select Was Add MP3 Players.");

        // Enable text fields related to MP3 player information
        txtModel.setEnabled(true);
        txtPrice.setEnabled(true);
        txtWeight.setEnabled(true);
        txtSize.setEnabled(true);

        // Disable text fields related to mobile credit (assuming it's related to mobiles)
        txtCredit.setEnabled(false);

        // Enable text field related to MP3 memory
        txtMemory.setEnabled(true);

        // Enable button related to adding MP3s and disable button related to adding mobiles
        btnAddMobile.setEnabled(false);
        btnAddMP3.setEnabled(true);

    }//GEN-LAST:event_jRadioButtonMPSActionPerformed

    /**
     * Checks if the given text represents a non-negative numeric value.
     *
     * @param text The text to be checked.
     * @return True if the text represents a non-negative numeric value,
     * otherwise false.
     */
    private boolean isNonNegativeNumeric(String text)
    {
        // The regular expression "\\d+" matches one or more digits
        // The method matches checks if the entire text matches the regular expression
        // Integer.parseInt(text) parses the text to an integer value
        // Returns true if the text consists of one or more digits and the parsed integer value is non-negative
        return text.matches("\\d+") && Integer.parseInt(text) >= 0;
    }

    /**
     * Clears the content of all text fields and text area.
     */
    private void Clear()
    {
        // Clear the text in each text field and text area by setting their text to an empty string
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

        // Clear the text area
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
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelcelll;
    private javax.swing.JLabel jLabelcelll1;
    private javax.swing.JPanel jPanelCallDowbloads;
    private javax.swing.JPanel jPanelContent;
    private javax.swing.JPanel jPanelEnterData;
    private javax.swing.JPanel jPanelMain;
    private javax.swing.JPanel jPanelMobileMp3;
    private javax.swing.JPanel jPanelSelectMP3DOwnloadDeleteMusic;
    private javax.swing.JPanel jPanelSelectMobilToAddCalled;
    private javax.swing.JPanel jPanelShowData;
    private javax.swing.JPanel jPanelSlectAnOption;
    private javax.swing.JRadioButton jRadioButtonMObile;
    private javax.swing.JRadioButton jRadioButtonMPS;
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
    private javax.swing.JLabel lblMP3;
    private javax.swing.JLabel lblMemory;
    private javax.swing.JLabel lblMobile;
    private javax.swing.JLabel lblPhoneNumber;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblResults;
    private javax.swing.JLabel lblSelectMobileId;
    private javax.swing.JLabel lblSelectMobileId1;
    private javax.swing.JLabel lblSize;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblWeight;
    private javax.swing.JLabel lblsize2;
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
