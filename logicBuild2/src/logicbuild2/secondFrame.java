package logicbuild2;

public class secondFrame extends javax.swing.JFrame {
public int amount = 0;
    public secondFrame() {
        initComponents();
    }
// test if my second frame can send inputs to table
public String firstValue, secondValue;

    public void sendToTableTest(){
        secondValue = textValue.getText();
        tableFrame.addToTable(new Object[]{secondValue});
        System.out.println("The second frame input: " + secondValue + ", has been passed.");
    }
    
    
    
// All of my First Value recievers
    
    public String recieveAndGet (String valueFromFirst){
        firstFrame first = new firstFrame ();
        //first.jMealMenu[]
        firstValue = valueFromFirst;
        System.out.println("Value from first frame is recieved in second Frame: " + firstValue);
        return firstValue;
    }
    
    public void printIfRecieved (String firstValue){
        
        firstFrame first = new firstFrame ();
        String fVal = first.valOfFirst(firstValue);
        System.out.println("Printed in Second Frame: " + fVal);
    }
    
//All of my ValueCombiners
    public void combineValues (){
        showLBar();
        firstFrame first = new firstFrame ();
        // The value of the first fame
        String fVal = first.valOfFirst(firstValue);
        System.out.println("Printed in Second Frame: " + fVal);
        
        // The value of the second Frame
        String sVal = textValue.getText();
        
        //Display on the Table
        tableFrame.addToTable(new Object []{fVal, sVal});
    }
    
    
//All of my shortcut Methods
    public void showTable(){
        tableFrame table = new tableFrame();
        table.setVisible(true);
    }
    public void showLBar (){
        loadBar showLoad = new loadBar();
        showLoad.setVisible(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        showTable = new javax.swing.JButton();
        sendToTable = new javax.swing.JButton();
        textValue = new javax.swing.JTextField();
        showRecieved = new javax.swing.JButton();
        increase = new javax.swing.JButton();
        decrease = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        showTable.setText("Show Table");
        showTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showTableActionPerformed(evt);
            }
        });

        sendToTable.setText("Pass Second Value To Table");
        sendToTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendToTableActionPerformed(evt);
            }
        });

        showRecieved.setText("Show the recieved Input from first frame");
        showRecieved.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showRecievedActionPerformed(evt);
            }
        });

        increase.setText("+");
        increase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                increaseActionPerformed(evt);
            }
        });

        decrease.setText("-");
        decrease.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decreaseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(showRecieved)
                .addGap(53, 53, 53))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(textValue, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(increase, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(decrease, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(showTable)
                        .addGap(28, 28, 28)
                        .addComponent(sendToTable)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(increase)
                    .addComponent(decrease))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(showTable)
                    .addComponent(sendToTable))
                .addGap(18, 18, 18)
                .addComponent(showRecieved)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void showTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showTableActionPerformed
        // TODO add your handling code here:
        if(evt.getSource() == showTable){
            showTable();
        }
    }//GEN-LAST:event_showTableActionPerformed

    private void sendToTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendToTableActionPerformed
        // TODO add your handling code here:
        if(evt.getSource() == sendToTable){
            //sendToTableTest();
            //recieveAndGet(firstValue);
            
            combineValues();
        }
    }//GEN-LAST:event_sendToTableActionPerformed

    private void showRecievedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showRecievedActionPerformed
        // TODO add your handling code here:
        if(evt.getSource() == showRecieved){
            printIfRecieved(firstValue);
        }
    }//GEN-LAST:event_showRecievedActionPerformed

    private void increaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_increaseActionPerformed
        // TODO add your handling code here:
        if(evt.getSource() == increase){
            
            amount ++;

            textValue.setText(Integer.toString(amount));
            System.out.println(amount);

        }
    }//GEN-LAST:event_increaseActionPerformed

    private void decreaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decreaseActionPerformed
        // TODO add your handling code here:
        if (evt.getSource() == decrease){
            
            amount = Integer.parseInt(textValue.getText());
            amount --;
            System.out.println(amount);
            textValue.setText(Integer.toString(amount));
            if (amount == 0){textValue.setText(Integer.toString(1));}
        }
    }//GEN-LAST:event_decreaseActionPerformed

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
    private javax.swing.JButton decrease;
    private javax.swing.JButton increase;
    private javax.swing.JButton sendToTable;
    private javax.swing.JButton showRecieved;
    private javax.swing.JButton showTable;
    private javax.swing.JTextField textValue;
    // End of variables declaration//GEN-END:variables
}
