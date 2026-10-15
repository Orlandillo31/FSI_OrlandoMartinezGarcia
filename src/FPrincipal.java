
import java.sql.Connection;
import javax.swing.JOptionPane;

public class FPrincipal extends javax.swing.JFrame {
    
    Conexion cnx = new Conexion();

    
    public FPrincipal() {
        initComponents();
        TQuery.setAutoCreateColumnsFromModel(true);
        
        if (cnx.conectar("127.0.0.1","kindergarden","root","")==1) {
            cnx.entablar(Infante.todos,TQuery);
        } else {
            JOptionPane.showMessageDialog(this,"No se pudo conectar a la base de datos");
            System.exit(0);
        }
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jToolBar1 = new javax.swing.JToolBar();
        BInfante = new javax.swing.JToggleButton();
        BEducadores = new javax.swing.JToggleButton();
        BResponsables = new javax.swing.JToggleButton();
        BBitacora = new javax.swing.JToggleButton();
        BNuevo = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TQuery = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setBackground(new java.awt.Color(153, 204, 255));
        jToolBar1.setRollover(true);

        buttonGroup1.add(BInfante);
        BInfante.setSelected(true);
        BInfante.setText("INFANTES");
        BInfante.setFocusable(false);
        BInfante.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BInfante.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BInfante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BInfanteActionPerformed(evt);
            }
        });
        jToolBar1.add(BInfante);

        buttonGroup1.add(BEducadores);
        BEducadores.setText("EDUCADORES");
        BEducadores.setFocusable(false);
        BEducadores.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BEducadores.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BEducadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BEducadoresActionPerformed(evt);
            }
        });
        jToolBar1.add(BEducadores);

        buttonGroup1.add(BResponsables);
        BResponsables.setText("RESPONSABLES");
        BResponsables.setFocusable(false);
        BResponsables.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BResponsables.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BResponsables.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BResponsablesActionPerformed(evt);
            }
        });
        jToolBar1.add(BResponsables);

        buttonGroup1.add(BBitacora);
        BBitacora.setText("BITACORA");
        BBitacora.setFocusable(false);
        BBitacora.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BBitacora.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BBitacora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBitacoraActionPerformed(evt);
            }
        });
        jToolBar1.add(BBitacora);

        BNuevo.setText("NUEVO");
        BNuevo.setFocusable(false);
        BNuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BNuevo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BNuevoActionPerformed(evt);
            }
        });
        jToolBar1.add(BNuevo);

        TQuery.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(TQuery);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BInfanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BInfanteActionPerformed
         cnx.entablar(Infante.todos,TQuery);
    
    }//GEN-LAST:event_BInfanteActionPerformed

    private void BEducadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BEducadoresActionPerformed
        cnx.entablar(Educadore.todos,TQuery);
    }//GEN-LAST:event_BEducadoresActionPerformed

    private void BResponsablesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BResponsablesActionPerformed
        cnx.entablar(Responsable.todos,TQuery);
    }//GEN-LAST:event_BResponsablesActionPerformed

    private void BBitacoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBitacoraActionPerformed
        cnx.entablar(Bitacora.todos,TQuery);
    }//GEN-LAST:event_BBitacoraActionPerformed

    private void BNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BNuevoActionPerformed
        if(BInfante.isSelected()){
            JD_Infantes di = new JD_Infantes(this, true);
            di.setVisible(true);
            di.obtenerConexion(cnx);
        }
        else if(BEducadores.isSelected()){
            JD_Educadores di = new JD_Educadores(this, true);
            di.setVisible(true);
            di.obtenerConexion(cnx);
        }
        else if(BResponsables.isSelected()){
            JD_Responsables di = new JD_Responsables(this, true);
            di.setVisible(true);
            di.obtenerConexion(cnx);
        }
        else if(BBitacora.isSelected()){
            JD_Bitacora di = new JD_Bitacora(this, true);
            di.setVisible(true);
            di.obtenerConexion(cnx);
        }
        
    }//GEN-LAST:event_BNuevoActionPerformed

   
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
            java.util.logging.Logger.getLogger(FPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton BBitacora;
    private javax.swing.JToggleButton BEducadores;
    private javax.swing.JToggleButton BInfante;
    private javax.swing.JButton BNuevo;
    private javax.swing.JToggleButton BResponsables;
    private javax.swing.JTable TQuery;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
