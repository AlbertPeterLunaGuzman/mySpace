package oopact1;
import javax.swing.*;
import java.awt.*;

public class firstFrame extends javax.swing.JFrame {

    /**
     * Creates new form firstFrame
     */
    public firstFrame() {
        initComponents();
    }

    private void displaySliderVal(){
        jSliderVal.setText("jSlider Value: " + mySlider.getValue());
        kiloToLbs(mySlider);
    }
    
    private void kiloToLbs(JSlider slider){
        double sliderValue = mySlider.getValue();
        double lbsValue = sliderValue * 2.20462262185;
        System.out.println("test: " + String.format("%.2f", lbsValue));
        kiloToLbs.setText("Convert to lbs: " + String.format("%.2f", lbsValue));
    }
    
        
    private void goToSpinner(){
        this.setVisible(false);
        new secondFrame().setVisible(true);
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        mySlider = new javax.swing.JSlider();
        jSliderVal = new javax.swing.JLabel();
        toSpinner = new javax.swing.JButton();
        kiloLabel = new javax.swing.JLabel();
        kiloToLbs = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mySlider.setMajorTickSpacing(10);
        mySlider.setMinorTickSpacing(2);
        mySlider.setPaintLabels(true);
        mySlider.setPaintTicks(true);
        mySlider.setRequestFocusEnabled(false);
        mySlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                mySliderStateChanged(evt);
            }
        });

        jSliderVal.setText("jSlider Value: ");

        toSpinner.setText("To Spinner");
        toSpinner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toSpinnerActionPerformed(evt);
            }
        });

        kiloLabel.setText("Kilo");

        kiloToLbs.setText("Convert to lbs: ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSliderVal)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(kiloToLbs)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(toSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(mySlider, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addComponent(kiloLabel)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(kiloLabel)
                .addGap(18, 18, 18)
                .addComponent(mySlider, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSliderVal)
                        .addGap(18, 18, 18)
                        .addComponent(kiloToLbs))
                    .addComponent(toSpinner))
                .addContainerGap(115, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mySliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_mySliderStateChanged
        // TODO add your handling code here:
        displaySliderVal();
    }//GEN-LAST:event_mySliderStateChanged

    private void toSpinnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toSpinnerActionPerformed
        // TODO add your handling code here:
        if(evt.getSource() == toSpinner) {goToSpinner();}
    }//GEN-LAST:event_toSpinnerActionPerformed

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
            java.util.logging.Logger.getLogger(firstFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(firstFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(firstFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(firstFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new firstFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jSliderVal;
    private javax.swing.JLabel kiloLabel;
    private javax.swing.JLabel kiloToLbs;
    private javax.swing.JSlider mySlider;
    private javax.swing.JButton toSpinner;
    // End of variables declaration//GEN-END:variables
}
