/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ClientDemo;
import javax.swing.JOptionPane;
/**
 *
 * @author ChTimTsubasa
 */
public class JDialogFamily extends javax.swing.JDialog {
    static public String familyID;
    public String familyPW;
    public ClientDemo jParent=null;
    public JDialogIndividual jIndividual;
    private FinalClient connection;
    /**
     * Creates new form JDialogFamily
     */
    public JDialogFamily(ClientDemo parent, boolean modal) {
        super(parent, modal);
        this.jParent=parent;
        initComponents();
        this.setTitle("家庭组");
        connection=new FinalClient(); 
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jAutoLogin = new javax.swing.JRadioButton();
        jRmberPassword = new javax.swing.JRadioButton();
        jPasswordLabel1 = new javax.swing.JLabel();
        jFamilyLogin = new javax.swing.JButton();
        jForgetPW = new javax.swing.JButton();
        jFamilyIDLogin = new javax.swing.JTextField();
        家庭组用户名1 = new javax.swing.JLabel();
        jFamilyPWLogin = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jFamilyIDRegist = new javax.swing.JTextField();
        jActivekey = new javax.swing.JTextField();
        jFamilyRegistConfirm = new javax.swing.JToggleButton();
        jFamilyPWReg1 = new javax.swing.JPasswordField();
        jFamilyPWReg2 = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jAutoLogin.setText("下次自动登录");

        jRmberPassword.setText("记住密码");

        jPasswordLabel1.setText("密码");

        jFamilyLogin.setText("登录");
        jFamilyLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFamilyLoginActionPerformed(evt);
            }
        });

        jForgetPW.setText("忘记密码？");

        家庭组用户名1.setText("家庭组用户名");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jFamilyLogin))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(jForgetPW))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(家庭组用户名1))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jPasswordLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jFamilyIDLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                            .addComponent(jFamilyPWLogin))))
                .addContainerGap(148, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGap(174, 174, 174)
                            .addComponent(jAutoLogin))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGap(64, 64, 64)
                            .addComponent(jRmberPassword)))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFamilyIDLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(家庭组用户名1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFamilyPWLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(jFamilyLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jForgetPW)
                .addGap(28, 28, 28))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(151, 151, 151)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jAutoLogin)
                        .addComponent(jRmberPassword))
                    .addContainerGap(103, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("家庭组登录", jPanel4);

        jLabel2.setText("用户名");

        jLabel1.setText("验证码");

        jLabel4.setText("请再次输入密码");

        jLabel3.setText("密码");

        jFamilyRegistConfirm.setText("注册");
        jFamilyRegistConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFamilyRegistConfirmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jFamilyPWReg1)
                            .addComponent(jFamilyPWReg2, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                        .addComponent(jActivekey, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jFamilyIDRegist, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(168, 168, 168))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jFamilyRegistConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jActivekey, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 23, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jFamilyIDRegist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jFamilyPWReg1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 27, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jFamilyPWReg2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 26, Short.MAX_VALUE)
                .addComponent(jFamilyRegistConfirm)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("家庭组注册", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jFamilyLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFamilyLoginActionPerformed
       if(evt.getSource().equals(jFamilyLogin)){
           familyID=jFamilyIDLogin.getText();
           familyPW=jFamilyPWLogin.getText();
           if(true){//connection.familyLog(familyID,familyPW)==1){
               JOptionPane.showMessageDialog(null,"登录成功");
               jParent.familyID=this.familyID;
               jIndividual=new JDialogIndividual(this,this.jParent,true,familyID);
               jIndividual.setVisible(true);
               System.out.println("登陆成功");
           }
           else{
               JOptionPane.showMessageDialog(null,"服务器连接失败\n请检查网络连接");
            }
       }
    }//GEN-LAST:event_jFamilyLoginActionPerformed

    private void jFamilyRegistConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFamilyRegistConfirmActionPerformed
        if(evt.getSource().equals(jFamilyRegistConfirm)){
            if(jFamilyPWReg2.getText().equals(jFamilyPWReg1.getText())){
                if(true){//connection.familyReg(jActivekey.getText(),jFamilyIDRegist.getText(),jFamilyPWReg1.getText())==1){
                    JOptionPane.showMessageDialog(null,"注册成功，请重新登录");
                }
                else JOptionPane.showMessageDialog(null,"服务器连接失败\n请检查网络连接");
            }
            else JOptionPane.showMessageDialog(null,"两次输入密码不一致\n请重新输入");
        }
    
    }//GEN-LAST:event_jFamilyRegistConfirmActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField jActivekey;
    private javax.swing.JRadioButton jAutoLogin;
    private javax.swing.JTextField jFamilyIDLogin;
    private javax.swing.JTextField jFamilyIDRegist;
    private javax.swing.JButton jFamilyLogin;
    private javax.swing.JPasswordField jFamilyPWLogin;
    private javax.swing.JPasswordField jFamilyPWReg1;
    private javax.swing.JPasswordField jFamilyPWReg2;
    private javax.swing.JToggleButton jFamilyRegistConfirm;
    private javax.swing.JButton jForgetPW;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel jPasswordLabel1;
    private javax.swing.JRadioButton jRmberPassword;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel 家庭组用户名1;
    // End of variables declaration//GEN-END:variables
}
