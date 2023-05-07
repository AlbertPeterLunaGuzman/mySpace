package gamebuild;
import javax.swing.*;
import java.awt.*;
import java.util.*;

public class gameRebuild extends javax.swing.JFrame implements Runnable{

    
    @Override
    public void run (){
        resetButtonDelayed ();
    }
    
    public gameRebuild() {
        initComponents();
        welcome();
    }
    /* 
    
    ask
    shuffle values
    start playing 
    GetText of button
    compare text??
    if text1 == text2 disable BUtton then set Text of disabled button It's a match
    if text1 != text2 reset button text???
    CONGRATULATE PLAYER
    
        A B
        A B
    */
    
    private JButton firstSelectedButton = null;
    private JButton secondSelectedButton = null;
    private boolean isMatched = false;
    
    //BUTTON VALUE STORAGE             0    1    2    3   =   4 index
    private String [] buttonValues = {"A", "B", "A", "B",
                                      "C", "D", "C", "D",
                                      "E", "F", "E", "F",
                                      };
    
    //BUTTON STORAGE
    private JButton [] allButtons () {
                     // 0    1    2    3     =   4 index
        JButton [] b = {vB, vB1, vB2, vB3,
                       vB4, vB5, vB6, vB7,
                       vB8, vB9, vB10, vB11
        };
        return b;
    } 
    
    //Call THis first then call "allButtons"
    //SetText ON MY BUTTONS TEST
    private void setTextButtons (JButton [] buttons) {
        for(int i = 0; i <  buttons.length; i++){
            buttons[i].setText("");
            buttons[i].setEnabled(true);
        }
    }
    
    //Shuffle Values of buttonValues(); before starting game
    private void shuffleValues() {
        Collections.shuffle(Arrays.asList(buttonValues));
    }
    
    // TEST ERROR BECAUSE THE BUTTONS HAS NO VALUES
    
    private void performThis(JButton button){
        
        String bVal = buttonValues[getIndex(button)];
        //if first is null get First 
        
        if(firstSelectedButton == null){
            firstSelectedButton = button;
            System.out.println("First Button: " + bVal); 
            firstSelectedButton.setText(bVal);
        }
        //if first is not null getSecond
        else if (secondSelectedButton == null){//fix Later
            secondSelectedButton = button;
            System.out.println("Second Button: " + bVal);
            secondSelectedButton.setText(bVal);
            checkMatch();
        }
    }
    
    private void checkMatch (){
        
        //get Text of buttons
        String [] bText = {
            firstSelectedButton.getText(),
            secondSelectedButton.getText()
        };
        
        setButtonText(bText[0], bText[1]);
        
        //Compare the text of buttons and check for match
        if(bText[0].equals(bText[1])){
            //disable buttons if match
            disableButtons();
        }else{
            //if not then reset Button Text
            new Thread (this).start();
        }
    }
    
    //Disable Button 
    private void disableButtons(){
            firstSelectedButton.setEnabled(false);
            secondSelectedButton.setEnabled(false);
        itsAMatch();
    }
    
    //"MATCH" text setter
    private void itsAMatch(){
        firstSelectedButton.setText("Match");
        secondSelectedButton.setText("Match");
        buttonNull();
        
    //IF all buttons are matched then perform this
        boolean allMatched = true;
        
        //if not every button Text == "Match"
        for(JButton button : allButtons()){ 
            if(!button.getText().equalsIgnoreCase("Match")){
                allMatched = false;
                break;
            }
        }
        if(allMatched){
            gameFinished ();
        }
    }
    //Index Getter
    private int getIndex (JButton button) {
        return Arrays.asList(allButtons()).indexOf(button);
    }
    
    private void buttonNull () {
        firstSelectedButton = null;
        secondSelectedButton = null;
    }
    
    // Delay for a bit 
    private void resetButtonDelayed () {
        try{
            Thread.sleep(1000);
                firstSelectedButton.setText("");
                secondSelectedButton.setText("");
                
                firstSelectedButton.setEnabled(true);
                secondSelectedButton.setEnabled(true);
            buttonNull();
        }catch (InterruptedException e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(
                    this, e, "WARNING",JOptionPane.WARNING_MESSAGE);
        }
    }
    
    //button setText
    private void setButtonText(String text1, String text2) {
        firstSelectedButton.setText(text1);
        secondSelectedButton.setText(text2);
    }

//==============================================================================    
//==============================================================================    
//==============================================================================    
    
    private void welcome() { 
        String [] label = {
            "Welcome, do you want to play Memory Matching game?",
            "Welcome"
        };
        
        //Ask first
        int dialog = JOptionPane.showConfirmDialog(
                this, label[0], label[1], JOptionPane.YES_NO_OPTION);
        
        //user decide
        if(dialog == JOptionPane.YES_NO_OPTION){
            shuffleValues();
        }else{
            System.exit(0);
        }   
    }
    private void gameFinished () {
        String [] label = {
            "Congratulations!",
            "Do you want to play again?",
            "Play again?"
        };

        //Congratulate
        JOptionPane.showMessageDialog(this, label[0]);
        
        int choice = JOptionPane.showConfirmDialog(this, label[1], label[2], JOptionPane.YES_NO_OPTION);
        
        //user decide
        if(choice == JOptionPane.YES_NO_OPTION){
            shuffleValues();
            setTextButtons(allButtons());
        }else{
            System.exit(0);
        }   
    }    

    // 0 1 2 3 = 4
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        vB = new javax.swing.JButton();
        vB1 = new javax.swing.JButton();
        vB2 = new javax.swing.JButton();
        vB3 = new javax.swing.JButton();
        vB4 = new javax.swing.JButton();
        vB5 = new javax.swing.JButton();
        vB6 = new javax.swing.JButton();
        vB7 = new javax.swing.JButton();
        vB8 = new javax.swing.JButton();
        vB9 = new javax.swing.JButton();
        vB10 = new javax.swing.JButton();
        vB11 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        vB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vBActionPerformed(evt);
            }
        });

        vB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vB1ActionPerformed(evt);
            }
        });

        vB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vB2ActionPerformed(evt);
            }
        });

        vB3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vB3ActionPerformed(evt);
            }
        });

        vB4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vB4ActionPerformed(evt);
            }
        });

        vB5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vB5ActionPerformed(evt);
            }
        });

        vB6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vB6ActionPerformed(evt);
            }
        });

        vB7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vB7ActionPerformed(evt);
            }
        });

        vB8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vB8ActionPerformed(evt);
            }
        });

        vB9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vB9ActionPerformed(evt);
            }
        });

        vB10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vB10ActionPerformed(evt);
            }
        });

        vB11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vB11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(vB, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(vB1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(vB2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(vB3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(vB4, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(vB5, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(vB6, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(vB7, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(vB8, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(vB9, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(vB10, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(vB11, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(vB1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vB, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vB2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vB3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(vB4, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vB5, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vB6, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vB7, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(vB9, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vB8, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vB10, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vB11, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(494, 385));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void vBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vBActionPerformed
        // TODO add your handling code here:
        if(evt.getSource() == vB){performThis(vB);}
    }//GEN-LAST:event_vBActionPerformed

    private void vB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vB1ActionPerformed
        // TODO add your handling code here:
        if(evt.getSource() == vB1){performThis(vB1);}
    }//GEN-LAST:event_vB1ActionPerformed

    private void vB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vB2ActionPerformed
        // TODO add your handling code here:
        if(evt.getSource() == vB2){performThis(vB2);}
    }//GEN-LAST:event_vB2ActionPerformed

    private void vB3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vB3ActionPerformed
        // TODO add your handling code here:
        if(evt.getSource() == vB3){performThis(vB3);}
    }//GEN-LAST:event_vB3ActionPerformed

    private void vB4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vB4ActionPerformed
        // TODO add your handling code here:
        if(evt.getSource() == vB4){performThis(vB4);}
    }//GEN-LAST:event_vB4ActionPerformed

    private void vB5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vB5ActionPerformed
        // TODO add your handling code here:
        if(evt.getSource() == vB5){performThis(vB5);}
    }//GEN-LAST:event_vB5ActionPerformed

    private void vB6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vB6ActionPerformed
        // TODO add your handling code here:
        if(evt.getSource() == vB6){performThis(vB6);}
    }//GEN-LAST:event_vB6ActionPerformed

    private void vB7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vB7ActionPerformed
        // TODO add your handling code here:
        if(evt.getSource() == vB7){performThis(vB7);}
    }//GEN-LAST:event_vB7ActionPerformed

    private void vB8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vB8ActionPerformed
        // TODO add your handling code here:
        if(evt.getSource() == vB8){performThis(vB8);}
    }//GEN-LAST:event_vB8ActionPerformed

    private void vB9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vB9ActionPerformed
        // TODO add your handling code here:
        if(evt.getSource() == vB9){performThis(vB9);}
    }//GEN-LAST:event_vB9ActionPerformed

    private void vB10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vB10ActionPerformed
        // TODO add your handling code here:
        if(evt.getSource() == vB10){performThis(vB10);}
    }//GEN-LAST:event_vB10ActionPerformed

    private void vB11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vB11ActionPerformed
        // TODO add your handling code here:
        if(evt.getSource() == vB11){performThis(vB11);}
    }//GEN-LAST:event_vB11ActionPerformed

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
            java.util.logging.Logger.getLogger(gameRebuild.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gameRebuild.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gameRebuild.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gameRebuild.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gameRebuild().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton vB;
    private javax.swing.JButton vB1;
    private javax.swing.JButton vB10;
    private javax.swing.JButton vB11;
    private javax.swing.JButton vB2;
    private javax.swing.JButton vB3;
    private javax.swing.JButton vB4;
    private javax.swing.JButton vB5;
    private javax.swing.JButton vB6;
    private javax.swing.JButton vB7;
    private javax.swing.JButton vB8;
    private javax.swing.JButton vB9;
    // End of variables declaration//GEN-END:variables
}
