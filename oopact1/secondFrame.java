package oopact1;
import javax.swing.*;
import java.awt.*;

public class secondFrame extends javax.swing.JFrame {

    public secondFrame() {
        initComponents();
    }
    
    private void displaySpinnerVal(){
        displayJSpinnerValL.setText("jSpinner Value: " + myJSpinner.getValue());
        kiloToLbs(myJSpinner);
    }
    
    private void kiloToLbs(JSpinner spinner){
        int spinnerValue = (int) myJSpinner.getValue();
        double lbsValue = spinnerValue * 2.20462262185;
        System.out.println("test: " + String.format("%.2f", lbsValue));
        kiloToPound.setText("Convert to lbs: " + String.format("%.2f", lbsValue));
    }
    
    private void goToSlider(){
        this.setVisible(false);
        new firstFrame().setVisible(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        myJSpinner = new javax.swing.JSpinner();
        displayJSpinnerValL = new javax.swing.JLabel();
        kiloLabel = new javax.swing.JLabel();
        kiloToPound = new javax.swing.JLabel();
        backToSlider = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        myJSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        myJSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                myJSpinnerStateChanged(evt);
            }
        });

        displayJSpinnerValL.setText("jSpinner Value: ");

        kiloLabel.setText("Kilo");

        kiloToPound.setText("Convert to lbs: ");

        backToSlider.setText("Go back to Slider");
        backToSlider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backToSliderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(displayJSpinnerValL)
                    .addComponent(kiloToPound)
                    .addComponent(kiloLabel)
                    .addComponent(myJSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(241, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backToSlider)
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(kiloLabel)
                .addGap(18, 18, 18)
                .addComponent(myJSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(displayJSpinnerValL)
                .addGap(18, 18, 18)
                .addComponent(kiloToPound)
                .addGap(18, 18, 18)
                .addComponent(backToSlider)
                .addContainerGap(90, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void myJSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_myJSpinnerStateChanged
        // TODO add your handling code here:
        displaySpinnerVal();
    }//GEN-LAST:event_myJSpinnerStateChanged

    private void backToSliderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backToSliderActionPerformed
        // TODO add your handling code here:
        if(evt.getSource() == backToSlider){goToSlider();}
    }//GEN-LAST:event_backToSliderActionPerformed

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
            java.util.logging.Logger.getLogger(secondFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(secondFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(secondFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(secondFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new secondFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backToSlider;
    private javax.swing.JLabel displayJSpinnerValL;
    private javax.swing.JLabel kiloLabel;
    private javax.swing.JLabel kiloToPound;
    private javax.swing.JSpinner myJSpinner;
    // End of variables declaration//GEN-END:variables
}
