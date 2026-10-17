
import java.sql.Connection;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

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
        BEditar = new javax.swing.JButton();
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

        BEditar.setText("EDITAR");
        BEditar.setFocusable(false);
        BEditar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BEditar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BEditarActionPerformed(evt);
            }
        });
        jToolBar1.add(BEditar);

        TQuery.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE)
                .addContainerGap())
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
            di.obtenerConexion(cnx);
            di.setVisible(true);
        }
        else if(BEducadores.isSelected()){
            JD_Educadores di = new JD_Educadores(this, true);
            di.setVisible(true);
            di.obtenerConexion(cnx);
        }
        else if(BResponsables.isSelected()){
            JD_Responsables di = new JD_Responsables(this, true);
            di.obtenerConexion(cnx);
            di.setVisible(true);
        }
        else if(BBitacora.isSelected()){
            JD_Bitacora di = new JD_Bitacora(this, true);
            di.obtenerConexion(cnx);
            di.setVisible(true);
        }
        
    }//GEN-LAST:event_BNuevoActionPerformed

    private void BEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BEditarActionPerformed
       if(TQuery.getSelectedRow() < 0){
           JOptionPane.showMessageDialog(this, "Primmero selecciona un renglon de la tabla para editar");
           return;  
       }
        
        if(BInfante.isSelected()){
            JD_Infantes di = new JD_Infantes(this, true);
            di.obtenerConexion(cnx);
            di.obtenerInfante(crearInfante());
            di.setVisible(true);
        }
        else if(BEducadores.isSelected()){
            JD_Educadores di = new JD_Educadores(this, true);
            di.obtenerConexion(cnx);
            di.obtenerEducador(crearEducador());
            di.setVisible(true);
        }
        else if(BResponsables.isSelected()){
            JD_Responsables di = new JD_Responsables(this, true);
            di.obtenerConexion(cnx);
            di.obtenerResponsable(crearResponsable());
            di.setVisible(true);
        }
        else if(BBitacora.isSelected()){
            JD_Bitacora di = new JD_Bitacora(this, true);
            di.obtenerConexion(cnx);
            di.obtenerBitacora(crearBitacora());
            di.setVisible(true);
        }
    }//GEN-LAST:event_BEditarActionPerformed

   
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
    private javax.swing.JButton BEditar;
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

    public Infante crearInfante(){
        DefaultTableModel modelo = (DefaultTableModel) TQuery.getModel();
        int ren = TQuery.getSelectedRow();
        Infante kid = new Infante();
        
        if (ren >= 0) {
            kid.curp = modelo.getValueAt(ren, 0).toString();
            kid.nombre = modelo.getValueAt(ren, 1).toString();
            kid.sexo = modelo.getValueAt(ren, 2).toString();
            kid.fecha = modelo.getValueAt(ren, 3).toString();
            kid.estado = modelo.getValueAt(ren, 4).toString();
        } else {
            JOptionPane.showConfirmDialog(this, "Selecciona un renglón de la tabla");
        }
        return kid;
    }
    
    public Responsable crearResponsable(){
        DefaultTableModel modelo = (DefaultTableModel) TQuery.getModel();
        int ren = TQuery.getSelectedRow();
        Responsable res = new Responsable();
        
        if (ren >= 0) {
            res.curp = modelo.getValueAt(ren, 0).toString();
            res.nombre = modelo.getValueAt(ren, 1).toString();
            res.sexo = modelo.getValueAt(ren, 2).toString();
            res.telefono = modelo.getValueAt(ren, 3).toString();
            res.parentesco = modelo.getValueAt(ren, 4).toString();
            res.estado = modelo.getValueAt(ren, 5).toString();
        } else {
            JOptionPane.showConfirmDialog(this, "Selecciona un renglón de la tabla");
        }
        return res;
    }
    public Educadore crearEducador(){
        DefaultTableModel modelo = (DefaultTableModel) TQuery.getModel();
        int ren = TQuery.getSelectedRow();
        Educadore edu = new Educadore();
        
        if (ren >= 0) {
            edu.curp = modelo.getValueAt(ren, 0).toString();
            edu.nombre = modelo.getValueAt(ren, 1).toString();
            edu.sexo = modelo.getValueAt(ren, 2).toString();
            edu.telefono = modelo.getValueAt(ren, 3).toString();
            edu.direccion = modelo.getValueAt(ren, 4).toString();
            edu.estado = modelo.getValueAt(ren, 5).toString();
        } else {
            JOptionPane.showConfirmDialog(this, "Selecciona un renglón de la tabla");
        }
        return edu;
    }
    public Bitacora crearBitacora(){
        DefaultTableModel modelo = (DefaultTableModel) TQuery.getModel();
        int ren = TQuery.getSelectedRow();
        Bitacora bit = new Bitacora();
        
        if (ren >= 0) {
            bit.folio = modelo.getValueAt(ren, 0).toString();
            bit.tiempo = modelo.getValueAt(ren, 1).toString();
            bit.tipo = modelo.getValueAt(ren, 2).toString();
            bit.observaciones = modelo.getValueAt(ren, 3).toString();
            bit.infantesC = modelo.getValueAt(ren, 4).toString();
            bit.responsablesC = modelo.getValueAt(ren, 5).toString();
            bit.educadoresC = modelo.getValueAt(ren, 6).toString();
        } else {
            JOptionPane.showConfirmDialog(this, "Selecciona un renglón de la tabla");
        }
        return bit;
    }

}
