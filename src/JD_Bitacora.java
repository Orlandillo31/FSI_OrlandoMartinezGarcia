
import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class JD_Bitacora extends javax.swing.JDialog {
    Conexion cnx;

    
    public JD_Bitacora(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    public void obtenerConexion(Conexion cnx){
        this.cnx = cnx;
        
        cnx.seleccionar(Infante.curps, CBInfantes);
        cnx.seleccionar(Responsable.curps, CBResponsables);
        cnx.seleccionar(Educadore.curps, CBEducadores);
    }
    
    public void obtenerBitacora(Bitacora bit){
        JLFolio.setText(bit.folio);
        JLFecha.setText(bit.tiempo);

        CBTipo.setSelectedItem(
                bit.tipo.equalsIgnoreCase("entrada") ? "Entrada" : "Salida"
        );

        TAObservaciones.setText(bit.observaciones);

        CBInfantes.setSelectedItem(bit.infantesC);
        CBResponsables.setSelectedItem(bit.responsablesC);
        CBEducadores.setSelectedItem(bit.educadoresC);
       
        System.out.println("Infante recibido: [" + bit.infantesC + "]");
        System.out.println("Infantes cargados: " + CBInfantes.getItemCount());

        System.out.println("Educador recibido: [" + bit.educadoresC + "]");
        System.out.println("Educadores cargados: " + CBEducadores.getItemCount());

        System.out.println("Tipo recibido: [" + bit.tipo + "]");
        System.out.println("Tipo seleccionado: [" + CBTipo.getSelectedItem() + "]");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        CBTipo = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        TAObservaciones = new javax.swing.JTextArea();
        CBInfantes = new javax.swing.JComboBox<>();
        CBEducadores = new javax.swing.JComboBox<>();
        CBResponsables = new javax.swing.JComboBox<>();
        BActuazliar = new javax.swing.JButton();
        BRegistrar = new javax.swing.JButton();
        BCancelar = new javax.swing.JButton();
        BBorrar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        JLFolio = new javax.swing.JLabel();
        JLFecha = new javax.swing.JLabel();
        BHoy = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Bitacora");
        setBackground(new java.awt.Color(204, 102, 255));
        setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        jLabel1.setText("Folio");

        jLabel2.setText("Fecha");

        jLabel3.setText("Observaciones");

        jLabel4.setText("Tipo");

        jLabel5.setText("Educadores");

        jLabel6.setText("Infantes");

        jLabel7.setText("Responsables");

        CBTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Entrada", "Salida", " " }));

        TAObservaciones.setColumns(20);
        TAObservaciones.setRows(5);
        jScrollPane1.setViewportView(TAObservaciones);

        CBInfantes.setBackground(new java.awt.Color(153, 153, 255));

        CBEducadores.setBackground(new java.awt.Color(153, 153, 255));

        CBResponsables.setBackground(new java.awt.Color(153, 153, 255));

        BActuazliar.setBackground(new java.awt.Color(51, 51, 255));
        BActuazliar.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        BActuazliar.setText("ACTUALIZAR");
        BActuazliar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BActuazliarActionPerformed(evt);
            }
        });

        BRegistrar.setBackground(new java.awt.Color(51, 51, 255));
        BRegistrar.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        BRegistrar.setText("REGISTRAR");
        BRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BRegistrarActionPerformed(evt);
            }
        });

        BCancelar.setBackground(new java.awt.Color(255, 51, 51));
        BCancelar.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        BCancelar.setText("CANCELAR");
        BCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCancelarActionPerformed(evt);
            }
        });

        BBorrar.setBackground(new java.awt.Color(51, 51, 255));
        BBorrar.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        BBorrar.setText("BORRAR");

        jLabel10.setBackground(new java.awt.Color(255, 51, 51));
        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel10.setText("BITACORA");

        JLFolio.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        JLFecha.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        BHoy.setText("Hoy");
        BHoy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BHoyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(CBResponsables, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(CBInfantes, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(CBEducadores, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(BRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BActuazliar, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(BBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 4, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel4))
                                .addGap(79, 79, 79)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(JLFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(BHoy, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(CBTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JLFolio, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(28, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(184, 184, 184)
                                .addComponent(jLabel10)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel10)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(JLFolio, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BHoy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JLFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CBTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CBInfantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(CBResponsables, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BRegistrar)
                            .addComponent(BBorrar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(BActuazliar)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(BCancelar))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CBEducadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BRegistrarActionPerformed
        
        if (JLFecha.getText().trim().isEmpty()
                || CBTipo.getSelectedItem() == null
                || CBInfantes.getSelectedItem() == null
                || CBResponsables.getSelectedItem() == null
                || CBEducadores.getSelectedItem() == null) {

            JOptionPane.showMessageDialog(this,
                    "Por favor, completa los campos obligatorios");
            return;
        }

        Bitacora bit = new Bitacora(
                null,
                null,
                JLFecha.getText().trim(),
                CBTipo.getSelectedItem().toString().toLowerCase(),
                TAObservaciones.getText(),
                CBInfantes.getSelectedItem().toString(),
                CBResponsables.getSelectedItem().toString(),
                CBEducadores.getSelectedItem().toString()
        );

        if (bit.insertar(cnx.con) == 1) {
            JOptionPane.showMessageDialog(this,
                    "Bitacora registrada correctamente");
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this,
                    "Error al registrar la bitacora");
        }

    }//GEN-LAST:event_BRegistrarActionPerformed

    private void BHoyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BHoyActionPerformed
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        JLFecha.setText(s.format(new Date()));
    }//GEN-LAST:event_BHoyActionPerformed

    private void BActuazliarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BActuazliarActionPerformed

        if (JLFolio.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "Selecciona un registro para borrar");
            return;
        }

        int confirmar = JOptionPane.showConfirmDialog(
                this,
                "¿Estas seguro de eliminar el folio "
                + JLFolio.getText() + "?",
                "Confirmar eliminacion",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE
        );

        if (confirmar == JOptionPane.YES_OPTION) {

            Bitacora bit = new Bitacora();
            bit.folio = JLFolio.getText();

            if (bit.borrar(cnx.con) == 1) {
                JOptionPane.showMessageDialog(this,
                        "Bitacora eliminada correctamente");
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this,
                        "No se pudo eliminar la bitacora");
            }
        }


    }//GEN-LAST:event_BActuazliarActionPerformed

    private void BCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_BCancelarActionPerformed

   
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
            java.util.logging.Logger.getLogger(JD_Bitacora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JD_Bitacora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JD_Bitacora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JD_Bitacora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JD_Bitacora dialog = new JD_Bitacora(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BActuazliar;
    private javax.swing.JButton BBorrar;
    private javax.swing.JButton BCancelar;
    private javax.swing.JButton BHoy;
    private javax.swing.JButton BRegistrar;
    private javax.swing.JComboBox<String> CBEducadores;
    private javax.swing.JComboBox<String> CBInfantes;
    private javax.swing.JComboBox<String> CBResponsables;
    private javax.swing.JComboBox<String> CBTipo;
    private javax.swing.JLabel JLFecha;
    private javax.swing.JLabel JLFolio;
    private javax.swing.JTextArea TAObservaciones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
