
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

        BActuazliar.setText("ACTUALIZAR");
        BActuazliar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BActuazliarActionPerformed(evt);
            }
        });

        BRegistrar.setText("REGISTRAR");
        BRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BRegistrarActionPerformed(evt);
            }
        });

        BCancelar.setText("CANCELAR");

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
                                .addComponent(BRegistrar)
                                .addGap(18, 18, 18)
                                .addComponent(BActuazliar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BBorrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BCancelar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(CBEducadores, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CBResponsables, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(CBInfantes, 0, 88, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel4))
                                .addGap(79, 79, 79)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JLFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CBTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JLFolio, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(184, 184, 184)
                                .addComponent(jLabel10)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BHoy, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(142, 142, 142))))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CBInfantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CBResponsables, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CBEducadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BCancelar)
                            .addComponent(BRegistrar)
                            .addComponent(BActuazliar)
                            .addComponent(BBorrar)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BRegistrarActionPerformed
        SimpleDateFormat s = new  SimpleDateFormat("yyyy-MM-dd");
        Bitacora bit = new Bitacora(
               null,
                JLFolio.getText(),
                JLFecha.getText(),
                CBTipo.getSelectedItem().toString(),
                TAObservaciones.getText(),
                CBInfantes.getSelectedItem().toString(),
                CBResponsables.getSelectedItem().toString(),
                CBEducadores.getSelectedItem().toString()
        );
        
        if (bit.insertar(cnx.con) == 1) {
            JOptionPane.showMessageDialog(this, "Educador Registrado");
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Error de Registro");
        }
    }//GEN-LAST:event_BRegistrarActionPerformed

    private void BHoyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BHoyActionPerformed
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        JLFecha.setText(s.format(new Date()));
    }//GEN-LAST:event_BHoyActionPerformed

    private void BActuazliarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BActuazliarActionPerformed

        Bitacora bit = new Bitacora();

        bit.folio = JLFolio.getText();
        bit.tiempo = JLFecha.getText();

        bit.tipo = CBTipo.getSelectedItem().toString().toLowerCase();
        bit.observaciones = TAObservaciones.getText();

        bit.infantesC = CBInfantes.getSelectedItem().toString();
        bit.responsablesC = CBResponsables.getSelectedItem().toString();
        bit.educadoresC = CBEducadores.getSelectedItem().toString();

        if (bit.actualizar(cnx.con) == 1) {
            JOptionPane.showMessageDialog(this, "Bitacora actualizada correctamente");
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "No se pudo actualizar la bitacora");
        }

    }//GEN-LAST:event_BActuazliarActionPerformed

   
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
