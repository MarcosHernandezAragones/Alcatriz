/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import herencia.Equipo;
import java.util.ArrayList;

/**
 *
 * @author daw-A
 */
public class Inicio extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    public Inicio() {
        initComponents();
        vEquipos= new ArrayList<>();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelformulario = new javax.swing.JLabel();
        jTextFieldcod_equipo = new javax.swing.JTextField();
        jTextFieldubi = new javax.swing.JTextField();
        jTextFieldPrecio = new javax.swing.JTextField();
        jCheckBoxProtec = new javax.swing.JCheckBox();
        jToggleButtonAdd_Equipo = new javax.swing.JToggleButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaVer_Equipos = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelformulario.setText("Nuevo Equipo");

        jTextFieldcod_equipo.setText("codigo equipo");
        jTextFieldcod_equipo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldcod_equipoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldcod_equipoFocusLost(evt);
            }
        });
        jTextFieldcod_equipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldcod_equipoActionPerformed(evt);
            }
        });

        jTextFieldubi.setText("ubicacion");
        jTextFieldubi.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldubiFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldubiFocusLost(evt);
            }
        });

        jTextFieldPrecio.setText("Precio");

        jCheckBoxProtec.setText("Protegido");

        jToggleButtonAdd_Equipo.setText("A??adir");
        jToggleButtonAdd_Equipo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jToggleButtonAdd_EquipoMouseClicked(evt);
            }
        });

        jToggleButton1.setText("Ver Equipos");
        jToggleButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jToggleButton1MouseClicked(evt);
            }
        });

        jTextAreaVer_Equipos.setEditable(false);
        jTextAreaVer_Equipos.setColumns(20);
        jTextAreaVer_Equipos.setRows(5);
        jScrollPane1.setViewportView(jTextAreaVer_Equipos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldcod_equipo)
                    .addComponent(jTextFieldubi)
                    .addComponent(jTextFieldPrecio)
                    .addComponent(jCheckBoxProtec, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelformulario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToggleButtonAdd_Equipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 266, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(217, 217, 217))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabelformulario)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldcod_equipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextFieldubi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jCheckBoxProtec)
                        .addGap(18, 18, 18)
                        .addComponent(jToggleButtonAdd_Equipo))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(105, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldcod_equipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldcod_equipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldcod_equipoActionPerformed

    private void jToggleButtonAdd_EquipoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButtonAdd_EquipoMouseClicked
        // TODO add your handling code here:
        String codigo,ubicacion;
        double precio;
        boolean protegido;
        
        codigo=jTextFieldcod_equipo.getText();
        ubicacion=jTextFieldubi.getText();
        precio= Double.valueOf(jTextFieldPrecio.getText());
        protegido=jCheckBoxProtec.isSelected();
        
        vEquipos.add(new Equipo(codigo, ubicacion, precio, protegido));
        
    }//GEN-LAST:event_jToggleButtonAdd_EquipoMouseClicked

    private void jToggleButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButton1MouseClicked
        // TODO add your handling code here:
        String txt="";
        for (Equipo e : vEquipos) {
            txt+=e.toString()+"\n";
        }
        jTextAreaVer_Equipos.setText(txt);
    }//GEN-LAST:event_jToggleButton1MouseClicked

    private void jTextFieldcod_equipoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldcod_equipoFocusGained
        // TODO add your handling code here:
        
        jTextFieldcod_equipo.setText("");
    }//GEN-LAST:event_jTextFieldcod_equipoFocusGained

    private void jTextFieldubiFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldubiFocusLost
        // TODO add your handling code here:
        jTextFieldcod_equipo.setText("Ubicacion");
    }//GEN-LAST:event_jTextFieldubiFocusLost

    private void jTextFieldubiFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldubiFocusGained
        // TODO add your handling code here:
        jTextFieldubi.setText("");
    }//GEN-LAST:event_jTextFieldubiFocusGained

    private void jTextFieldcod_equipoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldcod_equipoFocusLost
        // TODO add your handling code here:
        if (jTextFieldcod_equipo.getText().) {
            
        }
    }//GEN-LAST:event_jTextFieldcod_equipoFocusLost

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    private ArrayList<Equipo> vEquipos;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox jCheckBoxProtec;
    private javax.swing.JLabel jLabelformulario;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaVer_Equipos;
    private javax.swing.JTextField jTextFieldPrecio;
    private javax.swing.JTextField jTextFieldcod_equipo;
    private javax.swing.JTextField jTextFieldubi;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButtonAdd_Equipo;
    // End of variables declaration//GEN-END:variables
}
