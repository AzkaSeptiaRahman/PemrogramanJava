package GUI;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Azka
 */
public class CalcSuhu extends javax.swing.JFrame {
    double celcius;
    double fahrenheit;
    double kelvin;
    double reamur;
    
    public CalcSuhu() {
        initComponents();
    }

    private void Celcius(){
        celcius = Double.parseDouble(InputField.getText());
        fahrenheit = celcius * 1.8 + 32;
        kelvin = celcius +273.15;
        reamur = celcius *0.8;
       resCelcius.setText("Celcius  : "+ celcius);
       resFahrenheit.setText("Fahrenheit  : "+ fahrenheit);
       resKelvin.setText("Kelvin  : " + kelvin);
       resReamur.setText("Reamur  : " + reamur);
    }
    private void Fahrenheit(){
        fahrenheit = Double.parseDouble(InputField.getText());
        celcius = (fahrenheit - 32)/1.8;
        kelvin = (fahrenheit + 459.67);
        reamur = (fahrenheit - 32)/2.25;
       resCelcius.setText("Celcius  : "+ celcius);
       resFahrenheit.setText("Fahrenheit  : "+ fahrenheit);
       resKelvin.setText("Kelvin  : " + kelvin);
       resReamur.setText("Reamur  : " + reamur);
    }
    private void Kelvin(){
        kelvin = Double.parseDouble(InputField.getText());
        fahrenheit = kelvin * 1.8 - 459.67;
        celcius = kelvin - 273.15;
        reamur = (kelvin - 273.15)*0.8;
       resCelcius.setText("Celcius  : "+ celcius);
       resFahrenheit.setText("Fahrenheit  : "+ fahrenheit);
       resKelvin.setText("Kelvin  : " + kelvin);
       resReamur.setText("Reamur  : " + reamur);
    }
    private void Reamur(){
        reamur = Double.parseDouble(InputField.getText());
        fahrenheit = (reamur * 2.25) + 32;
        celcius = reamur / 0.8;
        kelvin = (reamur / 0.8) + 273.15;
       resCelcius.setText("Celcius  : "+ celcius);
       resFahrenheit.setText("Fahrenheit  : "+ fahrenheit);
       resKelvin.setText("Kelvin  : " + kelvin);
       resReamur.setText("Reamur  : " + reamur);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        JudulLabel = new javax.swing.JLabel();
        Input = new javax.swing.JLabel();
        InputField = new javax.swing.JTextField();
        chCelcius = new javax.swing.JRadioButton();
        chFahrenheit = new javax.swing.JRadioButton();
        chKelvin = new javax.swing.JRadioButton();
        chReamur = new javax.swing.JRadioButton();
        btnConvert = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        ResultArea = new javax.swing.JLabel();
        resCelcius = new javax.swing.JLabel();
        resKelvin = new javax.swing.JLabel();
        resFahrenheit = new javax.swing.JLabel();
        resReamur = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));

        JudulLabel.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        JudulLabel.setForeground(new java.awt.Color(255, 255, 255));
        JudulLabel.setText("Temperature Converter");

        Input.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        Input.setForeground(new java.awt.Color(255, 255, 255));
        Input.setText("Masukan Suhu :");

        chCelcius.setBackground(new java.awt.Color(255, 153, 0));
        chCelcius.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        chCelcius.setForeground(new java.awt.Color(255, 255, 255));
        chCelcius.setText("Celcius");

        chFahrenheit.setBackground(new java.awt.Color(255, 153, 0));
        chFahrenheit.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        chFahrenheit.setForeground(new java.awt.Color(255, 255, 255));
        chFahrenheit.setText("Fahrenheit");

        chKelvin.setBackground(new java.awt.Color(255, 153, 0));
        chKelvin.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        chKelvin.setForeground(new java.awt.Color(255, 255, 255));
        chKelvin.setText("Kelvin");

        chReamur.setBackground(new java.awt.Color(255, 153, 0));
        chReamur.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        chReamur.setForeground(new java.awt.Color(255, 255, 255));
        chReamur.setText("Reamur");

        btnConvert.setBackground(new java.awt.Color(255, 204, 153));
        btnConvert.setText("Konversi");
        btnConvert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConvertActionPerformed(evt);
            }
        });

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        ResultArea.setForeground(new java.awt.Color(255, 255, 255));
        ResultArea.setText("Results :");

        resCelcius.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        resCelcius.setForeground(new java.awt.Color(255, 255, 255));
        resCelcius.setText("Celcius");

        resKelvin.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        resKelvin.setForeground(new java.awt.Color(255, 255, 255));
        resKelvin.setText("Kelvin");

        resFahrenheit.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        resFahrenheit.setForeground(new java.awt.Color(255, 255, 255));
        resFahrenheit.setText("Fahrenheit");

        resReamur.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        resReamur.setForeground(new java.awt.Color(255, 255, 255));
        resReamur.setText("Reamur");

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Pilih Kategori :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(JudulLabel)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(183, 183, 183)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(resReamur)
                                    .addComponent(resFahrenheit)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(resKelvin)
                                    .addComponent(resCelcius)))
                            .addComponent(ResultArea)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chCelcius)
                                    .addComponent(chKelvin))
                                .addGap(102, 102, 102)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chFahrenheit)
                                    .addComponent(chReamur)))
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Input, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(InputField, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnConvert)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnReset)))))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JudulLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Input)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(InputField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConvert)
                    .addComponent(btnReset))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chCelcius)
                    .addComponent(chFahrenheit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chKelvin)
                    .addComponent(chReamur))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(ResultArea)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resCelcius)
                    .addComponent(resFahrenheit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resKelvin)
                    .addComponent(resReamur))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConvertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConvertActionPerformed
        if(chCelcius.isSelected()){
            Celcius();
        }
        else if (chFahrenheit.isSelected()){
            Fahrenheit();
        }
        else if (chKelvin.isSelected()){
            Kelvin();
        }
        else if (chReamur.isSelected()){
            Reamur();
        }
        
    }//GEN-LAST:event_btnConvertActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        InputField.setText("");
        resCelcius.setText("Celcius");
        resFahrenheit.setText("Fahrenheit");
        resKelvin.setText("Kelvin");
        resReamur.setText("Reamur");
    }//GEN-LAST:event_btnResetActionPerformed

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
            java.util.logging.Logger.getLogger(CalcSuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalcSuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalcSuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalcSuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalcSuhu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Input;
    private javax.swing.JTextField InputField;
    private javax.swing.JLabel JudulLabel;
    private javax.swing.JLabel ResultArea;
    private javax.swing.JButton btnConvert;
    private javax.swing.JButton btnReset;
    private javax.swing.JRadioButton chCelcius;
    private javax.swing.JRadioButton chFahrenheit;
    private javax.swing.JRadioButton chKelvin;
    private javax.swing.JRadioButton chReamur;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel resCelcius;
    private javax.swing.JLabel resFahrenheit;
    private javax.swing.JLabel resKelvin;
    private javax.swing.JLabel resReamur;
    // End of variables declaration//GEN-END:variables
}
