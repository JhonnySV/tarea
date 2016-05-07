package tarea.view;
import javax.swing.JOptionPane;
import tarea.dto.TareaDto;
import tarea.service.TareaService;

/**
 *
 * @author JHONNY
 */
public class TareaView extends javax.swing.JFrame {

    /**
     * Creates new form TareaView
     */
    public TareaView() {
        initComponents();
        setLocationRelativeTo(null);
        txt1.setVisible(false);
        txt2.setVisible(false);
        txt3.setVisible(false);
        txt4.setVisible(false);
        txt5.setVisible(false);
        btnProcesar.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnProcesar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cbo1 = new javax.swing.JComboBox<>();
        txt1 = new javax.swing.JTextField();
        txt2 = new javax.swing.JTextField();
        txt3 = new javax.swing.JTextField();
        txt4 = new javax.swing.JTextField();
        txt5 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnProcesar.setText("Promedio");
        btnProcesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcesarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Numeros");
        jLabel1.setToolTipText("");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        cbo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Seleccione-", "2", "3", "4", "5" }));
        cbo1.setToolTipText("");
        cbo1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cbo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo1ActionPerformed(evt);
            }
        });

        txt1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt1.setToolTipText("");
        txt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt1ActionPerformed(evt);
            }
        });
        txt1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt1KeyTyped(evt);
            }
        });

        txt2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt2KeyTyped(evt);
            }
        });

        txt3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt3KeyTyped(evt);
            }
        });

        txt4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt4KeyTyped(evt);
            }
        });

        txt5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt5KeyTyped(evt);
            }
        });

        jButton1.setText("Limpiar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnProcesar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbo1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt3)
                    .addComponent(txt1)
                    .addComponent(txt2)
                    .addComponent(txt4)
                    .addComponent(txt5)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE))
                .addGap(0, 28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProcesar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProcesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcesarActionPerformed
        try {
        TareaDto dto=new TareaDto();
        dto.setCuantos(Integer.parseInt((String) cbo1.getSelectedItem()));       
        TareaService service=new TareaService();
        //---------------------------------------------------------------------
        if(cbo1.getSelectedItem()=="2"){
            if (txt1.getText().length()==0 || txt2.getText().length()==0){
            JOptionPane.showMessageDialog(rootPane, "Llene todos los campos");
            }
            else{
            dto.setNumero1(Double.parseDouble(txt1.getText()));
            dto.setNumero2(Double.parseDouble(txt2.getText()));
            dto.setNumero3(0);
            dto.setNumero4(0);
            dto.setNumero5(0);
            service.promedio(dto);
            String repo;
            repo="El promedio de los "+(String) cbo1.getSelectedItem()+" numeros es :\n"+dto.getPromedio();
            JOptionPane.showMessageDialog(rootPane, repo);  
            }
        }
        //---------------------------------------------------------------------
        else if(cbo1.getSelectedItem()=="3"){
            if (txt1.getText().length()==0 || txt2.getText().length()==0 || txt3.getText().length()==0){
            JOptionPane.showMessageDialog(rootPane, "Llene todos los campos");
            }
            else{
            dto.setNumero1(Double.parseDouble(txt1.getText()));
            dto.setNumero2(Double.parseDouble(txt2.getText()));
            dto.setNumero3(Double.parseDouble(txt3.getText()));
            dto.setNumero4(0);
            dto.setNumero5(0);
            service.promedio(dto);
            String repo;
            repo="El promedio de los "+(String) cbo1.getSelectedItem()+" numeros es :\n"+dto.getPromedio();
            JOptionPane.showMessageDialog(rootPane, repo);  
            }
        }
        //--------------------------------------------------------------------
        else if(cbo1.getSelectedItem()=="4"){
            if (txt1.getText().length()==0 || txt2.getText().length()==0
                || txt3.getText().length()==0 || txt4.getText().length()==0){
            JOptionPane.showMessageDialog(rootPane, "Llene todos los campos");
            }
            else{
            dto.setNumero1(Double.parseDouble(txt1.getText()));
            dto.setNumero2(Double.parseDouble(txt2.getText()));
            dto.setNumero3(Double.parseDouble(txt3.getText()));
            dto.setNumero4(Double.parseDouble(txt4.getText()));
            dto.setNumero5(0);
            service.promedio(dto);
            String repo;
            repo="El promedio de los "+(String) cbo1.getSelectedItem()+" numeros es :\n"+dto.getPromedio();
            JOptionPane.showMessageDialog(rootPane, repo);  
            }
        }
        //---------------------------------------------------------------------
        else if(cbo1.getSelectedItem()=="5"){
            if (txt1.getText().length()==0 || txt2.getText().length()==0
                || txt3.getText().length()==0 || txt4.getText().length()==0 ||
                txt5.getText().length()==0){
            JOptionPane.showMessageDialog(rootPane, "Llene todos los campos");
            }
            else{
            dto.setNumero1(Double.parseDouble(txt1.getText()));
            dto.setNumero2(Double.parseDouble(txt2.getText()));
            dto.setNumero3(Double.parseDouble(txt3.getText()));
            dto.setNumero4(Double.parseDouble(txt4.getText()));
            dto.setNumero5(Double.parseDouble(txt5.getText()));
            service.promedio(dto);
            String repo;
            repo="El promedio de los "+(String) cbo1.getSelectedItem()+" numeros es :\n"+dto.getPromedio();
            JOptionPane.showMessageDialog(rootPane, repo);  
            }
        }
        //---------------------------------------------------------------------
        else{
            JOptionPane.showMessageDialog(rootPane, "Error en el combobox");
        }
        //---------------------------------------------------------------------
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Error: \n"+e);
        } 
        //---------------------------------------------------------------------
    }//GEN-LAST:event_btnProcesarActionPerformed

    private void cbo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo1ActionPerformed
           
           txt1.setVisible(false);
           txt2.setVisible(false);
           txt3.setVisible(false);
           txt4.setVisible(false);
           txt5.setVisible(false);
           txt1.setText("");
           txt2.setText("");
           txt3.setText("");
           txt4.setText("");
           txt5.setText("");
           txt1.requestFocus();
           btnProcesar.setVisible(false);
                
        if(cbo1.getSelectedItem()=="2"){
           txt1.setVisible(true);
           txt2.setVisible(true);
           btnProcesar.setVisible(true);
           txt1.requestFocus();
       } else if(cbo1.getSelectedItem()=="3"){
           txt1.setVisible(true);
           txt2.setVisible(true);
           txt3.setVisible(true);
           btnProcesar.setVisible(true);
           txt1.requestFocus();
       }
         else if(cbo1.getSelectedItem()=="4"){
           txt1.setVisible(true);
           txt2.setVisible(true);
           txt3.setVisible(true);
           txt4.setVisible(true);
           btnProcesar.setVisible(true);
           txt1.requestFocus();
           
       }  else if(cbo1.getSelectedItem()=="5"){
           txt1.setVisible(true);
           txt2.setVisible(true);
           txt3.setVisible(true);
           txt4.setVisible(true);
           txt5.setVisible(true);
           btnProcesar.setVisible(true);
           txt1.requestFocus();
       }else{
           txt1.setVisible(false);
           txt2.setVisible(false);
           txt3.setVisible(false);
           txt4.setVisible(false);
           txt5.setVisible(false);
           btnProcesar.setVisible(false);
           txt1.requestFocus();
       }
    }//GEN-LAST:event_cbo1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
           txt1.setText("");
           txt2.setText("");
           txt3.setText("");
           txt4.setText("");
           txt5.setText("");
           txt1.requestFocus();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt1KeyTyped
        char x=evt.getKeyChar();
        if(x<'0' || x>'9') evt.consume();
    }//GEN-LAST:event_txt1KeyTyped

    private void txt2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt2KeyTyped
        char x=evt.getKeyChar();
        if(x<'0' || x>'9') evt.consume();
    }//GEN-LAST:event_txt2KeyTyped

    private void txt3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt3KeyTyped
        char x=evt.getKeyChar();
        if(x<'0' || x>'9') evt.consume();
    }//GEN-LAST:event_txt3KeyTyped

    private void txt4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt4KeyTyped
        char x=evt.getKeyChar();
        if(x<'0' || x>'9') evt.consume();
    }//GEN-LAST:event_txt4KeyTyped

    private void txt5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt5KeyTyped
        char x=evt.getKeyChar();
        if(x<'0' || x>'9') evt.consume();
    }//GEN-LAST:event_txt5KeyTyped

    private void txt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt1ActionPerformed

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
            java.util.logging.Logger.getLogger(TareaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TareaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TareaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TareaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TareaView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnProcesar;
    private javax.swing.JComboBox<String> cbo1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt2;
    private javax.swing.JTextField txt3;
    private javax.swing.JTextField txt4;
    private javax.swing.JTextField txt5;
    // End of variables declaration//GEN-END:variables
}
