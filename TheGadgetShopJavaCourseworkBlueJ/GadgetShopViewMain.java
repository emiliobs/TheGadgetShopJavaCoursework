  


import javax.swing.ImageIcon;


/**
 *
 * @author Emilio
 */
public class GadgetShopViewMain extends javax.swing.JFrame
{

    /**
     * Creates new form GadgetShopViewMain
     */
    
         // Create an instance of TheGadgetShopController
        TheGadgetShopController gadgetShopController;

        // Create an instance of GadgetShopViewPrompt
        GadgetShopViewPrompt viewPrompt;
    
    public GadgetShopViewMain()
    {
        initComponents(); // Initialize the GUI components (presumably generated by a GUI builder tool)

        // Set the application icon using the ImageIcon class and getResource() method
        // The path to the icon resource is assumed to be "/Helps/Images/logo.png" relative to the class package
        setIconImage(new ImageIcon(getClass().getResource("/Helps/Images/logo.png")).getImage());
        
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents()
    {

        jPanelMain = new javax.swing.JPanel();
        jPanelContainer = new javax.swing.JPanel();
        lblTitleGadgetShop = new javax.swing.JLabel();
        lblTitleGadgetShop1 = new javax.swing.JLabel();
        jPanelOptionProgram = new javax.swing.JPanel();
        btnGuiProgram = new javax.swing.JButton();
        btnCommandPrompt = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        lblBy = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblIdCard = new javax.swing.JLabel();
        lblImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setBackground(new java.awt.Color(150, 204, 211));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusTraversalPolicyProvider(true);
        setFocusable(false);
        setResizable(false);

        jPanelMain.setBackground(new java.awt.Color(150, 204, 211));

        jPanelContainer.setBackground(new java.awt.Color(150, 204, 211));
        jPanelContainer.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 51, 51), 4, true), "The Gadget Shop!", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 18), new java.awt.Color(255, 51, 51))); // NOI18N

        lblTitleGadgetShop.setFont(new java.awt.Font("Segoe UI", 3, 55)); // NOI18N
        lblTitleGadgetShop.setForeground(new java.awt.Color(255, 51, 0));
        lblTitleGadgetShop.setText("WELCOME");

        lblTitleGadgetShop1.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        lblTitleGadgetShop1.setForeground(new java.awt.Color(255, 51, 0));
        lblTitleGadgetShop1.setText("The Gadget Shop!");

        jPanelOptionProgram.setBackground(new java.awt.Color(150, 204, 211));
        jPanelOptionProgram.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 51, 51), 3, true), "Select Option:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 18), new java.awt.Color(255, 51, 0))); // NOI18N

        btnGuiProgram.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        btnGuiProgram.setForeground(new java.awt.Color(255, 51, 0));
        btnGuiProgram.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Helps/Images/gui_icon.png"))); // NOI18N
        btnGuiProgram.setText("Go to GUI Program");
        btnGuiProgram.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnGuiProgramActionPerformed(evt);
            }
        });

        btnCommandPrompt.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        btnCommandPrompt.setForeground(new java.awt.Color(255, 51, 51));
        btnCommandPrompt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Helps/Images/command_icon.png"))); // NOI18N
        btnCommandPrompt.setText("Go to Command Prompt Program");
        btnCommandPrompt.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCommandPromptActionPerformed(evt);
            }
        });

        btnExit.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 51, 0));
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelOptionProgramLayout = new javax.swing.GroupLayout(jPanelOptionProgram);
        jPanelOptionProgram.setLayout(jPanelOptionProgramLayout);
        jPanelOptionProgramLayout.setHorizontalGroup(
            jPanelOptionProgramLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelOptionProgramLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(btnGuiProgram)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addComponent(btnCommandPrompt)
                .addGap(64, 64, 64)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );
        jPanelOptionProgramLayout.setVerticalGroup(
            jPanelOptionProgramLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOptionProgramLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanelOptionProgramLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCommandPrompt)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuiProgram))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        lblBy.setFont(new java.awt.Font("Arial", 3, 36)); // NOI18N
        lblBy.setForeground(new java.awt.Color(255, 51, 0));
        lblBy.setText("By");

        lblName.setFont(new java.awt.Font("Arial", 3, 36)); // NOI18N
        lblName.setForeground(new java.awt.Color(255, 51, 0));
        lblName.setText("Emilio Barrera Sepulveda.");

        lblIdCard.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        lblIdCard.setForeground(new java.awt.Color(255, 51, 0));
        lblIdCard.setText("22047090");

        lblImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Helps/Images/TheGadgetShop1.png"))); // NOI18N

        javax.swing.GroupLayout jPanelContainerLayout = new javax.swing.GroupLayout(jPanelContainer);
        jPanelContainer.setLayout(jPanelContainerLayout);
        jPanelContainerLayout.setHorizontalGroup(
            jPanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContainerLayout.createSequentialGroup()
                .addGroup(jPanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelContainerLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanelOptionProgram, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelContainerLayout.createSequentialGroup()
                        .addGroup(jPanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelContainerLayout.createSequentialGroup()
                                .addGroup(jPanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelContainerLayout.createSequentialGroup()
                                        .addGap(133, 133, 133)
                                        .addComponent(lblTitleGadgetShop1, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanelContainerLayout.createSequentialGroup()
                                        .addGap(296, 296, 296)
                                        .addComponent(lblBy, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanelContainerLayout.createSequentialGroup()
                                        .addGap(125, 125, 125)
                                        .addComponent(lblName))
                                    .addGroup(jPanelContainerLayout.createSequentialGroup()
                                        .addGap(266, 266, 266)
                                        .addComponent(lblIdCard)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelContainerLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(lblTitleGadgetShop, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(119, 119, 119)))
                        .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanelContainerLayout.setVerticalGroup(
            jPanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContainerLayout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addGroup(jPanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelContainerLayout.createSequentialGroup()
                        .addComponent(lblTitleGadgetShop, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTitleGadgetShop1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(lblBy)
                        .addGap(39, 39, 39)
                        .addComponent(lblName)
                        .addGap(41, 41, 41)
                        .addComponent(lblIdCard)
                        .addGap(72, 72, 72))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelContainerLayout.createSequentialGroup()
                        .addComponent(lblImage)
                        .addGap(27, 27, 27)))
                .addComponent(jPanelOptionProgram, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout jPanelMainLayout = new javax.swing.GroupLayout(jPanelMain);
        jPanelMain.setLayout(jPanelMainLayout);
        jPanelMainLayout.setHorizontalGroup(
            jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMainLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanelContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanelMainLayout.setVerticalGroup(
            jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMainLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jPanelContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    /**
     * Event handler for the action performed when the "Exit" button is clicked.
     * Disposes of the current window.
     */
    private void btnExitActionPerformed(java.awt.event.ActionEvent evt)                                        
    {                                            
        // Disposes of the current window
        dispose();
    }                                       

    /**
     * Event handler for the action performed when the "Command Prompt" button
     * is clicked. Shows the program in the command prompt.
     */
    private void btnCommandPromptActionPerformed(java.awt.event.ActionEvent evt)                                                 
    {                                                     
        // Create an instance of TheGadgetShopController
        //TheGadgetShopController gadgetShopController = new TheGadgetShopController();
      gadgetShopController = new TheGadgetShopController();
        
        // Create an instance of GadgetShopViewPrompt      
        
        //GadgetShopViewPrompt viewPrompt = new GadgetShopViewPrompt();
        viewPrompt = new GadgetShopViewPrompt();
   
        

        // Run the view in the command prompt
        viewPrompt.run();
    }                                                

    /**
     * Event handler for the action performed when the "GUI Program" button is
     * clicked. Displays the program in the graphical user interface (GUI).
     */
    private void btnGuiProgramActionPerformed(java.awt.event.ActionEvent evt)                                              
    {                                                  

/// Create an instance of GadgetShopViewGUI, which is presumably a GUI view for the program
        GadgetShopViewGUI gadgetShop = new GadgetShopViewGUI();

        // Set the visibility of the GUI view to true, making it visible to the user
        gadgetShop.setVisible(true);

        // Set the location of the GUI view to be centered on the screen
        gadgetShop.setLocationRelativeTo(null);


    }                                             

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify                     
    public javax.swing.JButton btnCommandPrompt;
    public javax.swing.JButton btnExit;
    public javax.swing.JButton btnGuiProgram;
    public javax.swing.JPanel jPanelContainer;
    public javax.swing.JPanel jPanelMain;
    public javax.swing.JPanel jPanelOptionProgram;
    public javax.swing.JLabel lblBy;
    public javax.swing.JLabel lblIdCard;
    public javax.swing.JLabel lblImage;
    public javax.swing.JLabel lblName;
    public javax.swing.JLabel lblTitleGadgetShop;
    public javax.swing.JLabel lblTitleGadgetShop1;
    // End of variables declaration                   
}
