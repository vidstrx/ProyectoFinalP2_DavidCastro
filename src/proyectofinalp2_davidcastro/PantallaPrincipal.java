
package proyectofinalp2_davidcastro;

import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class PantallaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form PantallaPrincipal
     */
    
    private String [] fuentes;
    private ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
    
    public PantallaPrincipal() {
        
        usuarios.add(new Administrador("admin", "1234"));
        fuentes = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        
        initComponents();
        
        agregarElementos();
        setLocationRelativeTo(null);
        //System.out.println(usuarios);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        frameSistemaOperativo = new javax.swing.JFrame();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        panelInicio = new javax.swing.JPanel();
        lblIconoEditorTexto = new javax.swing.JLabel();
        lblEditorTexto = new javax.swing.JLabel();
        lblFotoExploradorArchivos = new javax.swing.JLabel();
        lblExploradorArchivo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblInicio = new javax.swing.JLabel();
        panelEditorTexto = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaEditorTexto = new javax.swing.JTextArea();
        btnAtrasEditorTexto = new javax.swing.JButton();
        comboTamano = new javax.swing.JComboBox<>();
        comboFuentes = new javax.swing.JComboBox<>();
        comboEstilos = new javax.swing.JComboBox<>();
        lblTamano = new javax.swing.JLabel();
        lblFuente = new javax.swing.JLabel();
        lblEstilo = new javax.swing.JLabel();
        mBarPrincipal = new javax.swing.JMenuBar();
        menuCrearUsuario = new javax.swing.JMenu();
        menuLogout = new javax.swing.JMenu();
        panelCreacionUsuario = new javax.swing.JPanel();
        lblInicioSesion = new javax.swing.JLabel();
        lblIcono = new javax.swing.JLabel();
        lblContrasena = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtContrasena = new javax.swing.JTextField();
        btnIniciarSesion = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        frameSistemaOperativo.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelInicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblIconoEditorTexto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/editor de texto.png"))); // NOI18N
        lblIconoEditorTexto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblIconoEditorTexto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblIconoEditorTextoMouseClicked(evt);
            }
        });
        panelInicio.add(lblIconoEditorTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 140, 140));

        lblEditorTexto.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        lblEditorTexto.setForeground(new java.awt.Color(255, 255, 255));
        lblEditorTexto.setText("Editor de Texto");
        panelInicio.add(lblEditorTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 110, -1));

        lblFotoExploradorArchivos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/explorador archivos.png"))); // NOI18N
        lblFotoExploradorArchivos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelInicio.add(lblFotoExploradorArchivos, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, 140, 140));

        lblExploradorArchivo.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        lblExploradorArchivo.setForeground(new java.awt.Color(255, 255, 255));
        lblExploradorArchivo.setText("Explorador de Archivos");
        panelInicio.add(lblExploradorArchivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 300, 150, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Pantalla de Inicio");
        panelInicio.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, 300, 50));

        lblInicio.setBackground(new java.awt.Color(102, 102, 102));
        lblInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblInicio.setOpaque(true);
        panelInicio.add(lblInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 560));

        jTabbedPane1.addTab("tab1", panelInicio);

        txtAreaEditorTexto.setColumns(20);
        txtAreaEditorTexto.setRows(5);
        jScrollPane1.setViewportView(txtAreaEditorTexto);

        btnAtrasEditorTexto.setBackground(new java.awt.Color(102, 0, 0));
        btnAtrasEditorTexto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAtrasEditorTexto.setForeground(new java.awt.Color(255, 255, 255));
        btnAtrasEditorTexto.setText("Atras");
        btnAtrasEditorTexto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAtrasEditorTextoMouseClicked(evt);
            }
        });

        comboTamano.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "..." }));
        comboTamano.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboTamanoItemStateChanged(evt);
            }
        });

        comboFuentes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "..." }));
        comboFuentes.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboFuentesItemStateChanged(evt);
            }
        });

        comboEstilos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "Normal", "Negrita", "Cursiva" }));
        comboEstilos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboEstilosItemStateChanged(evt);
            }
        });

        lblTamano.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTamano.setForeground(new java.awt.Color(0, 0, 0));
        lblTamano.setText("Tamaño");

        lblFuente.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblFuente.setForeground(new java.awt.Color(0, 0, 0));
        lblFuente.setText("Fuentes");

        lblEstilo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblEstilo.setForeground(new java.awt.Color(0, 0, 0));
        lblEstilo.setText("Estilo");

        javax.swing.GroupLayout panelEditorTextoLayout = new javax.swing.GroupLayout(panelEditorTexto);
        panelEditorTexto.setLayout(panelEditorTextoLayout);
        panelEditorTextoLayout.setHorizontalGroup(
            panelEditorTextoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEditorTextoLayout.createSequentialGroup()
                .addGroup(panelEditorTextoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEditorTextoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnAtrasEditorTexto))
                    .addGroup(panelEditorTextoLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(panelEditorTextoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboTamano, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTamano, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelEditorTextoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboFuentes, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFuente, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelEditorTextoLayout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(panelEditorTextoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(comboEstilos, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelEditorTextoLayout.createSequentialGroup()
                                .addComponent(lblEstilo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(78, 78, 78)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 643, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelEditorTextoLayout.setVerticalGroup(
            panelEditorTextoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEditorTextoLayout.createSequentialGroup()
                .addGroup(panelEditorTextoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelEditorTextoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(panelEditorTextoLayout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addGroup(panelEditorTextoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTamano)
                            .addComponent(lblFuente))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelEditorTextoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboTamano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboFuentes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblEstilo)
                        .addGap(4, 4, 4)
                        .addComponent(comboEstilos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 330, Short.MAX_VALUE)
                        .addComponent(btnAtrasEditorTexto)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("tab2", panelEditorTexto);

        frameSistemaOperativo.getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 1000, 590));

        menuCrearUsuario.setText("Crear Usuario");
        mBarPrincipal.add(menuCrearUsuario);

        menuLogout.setText("Logout");
        menuLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuLogoutMouseClicked(evt);
            }
        });
        mBarPrincipal.add(menuLogout);

        frameSistemaOperativo.setJMenuBar(mBarPrincipal);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelCreacionUsuario.setPreferredSize(new java.awt.Dimension(507, 600));
        panelCreacionUsuario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblInicioSesion.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblInicioSesion.setForeground(new java.awt.Color(255, 255, 255));
        lblInicioSesion.setText("Inicio de sesion");
        panelCreacionUsuario.add(lblInicioSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 180, -1));

        lblIcono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono inicio sesion.jpg"))); // NOI18N
        panelCreacionUsuario.add(lblIcono, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, -1, -1));

        lblContrasena.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblContrasena.setForeground(new java.awt.Color(255, 255, 255));
        lblContrasena.setText("Contraseña:");
        panelCreacionUsuario.add(lblContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, -1, 30));

        lblNombre.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setText("Nombre:");
        panelCreacionUsuario.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, -1, 30));

        txtNombre.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(0, 0, 0));
        panelCreacionUsuario.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 250, 30));

        txtContrasena.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtContrasena.setForeground(new java.awt.Color(0, 0, 0));
        panelCreacionUsuario.add(txtContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, 250, 30));

        btnIniciarSesion.setBackground(new java.awt.Color(0, 0, 0));
        btnIniciarSesion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnIniciarSesion.setForeground(new java.awt.Color(255, 255, 255));
        btnIniciarSesion.setText("Iniciar sesion");
        btnIniciarSesion.setBorder(null);
        btnIniciarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIniciarSesionMouseClicked(evt);
            }
        });
        panelCreacionUsuario.add(btnIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 460, 130, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("Si es primera vez, utiliza (Nombre = admin / Contraseña = 1234) para poder entrar.");
        panelCreacionUsuario.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 470, -1));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo login.jpg"))); // NOI18N
        panelCreacionUsuario.add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelCreacionUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelCreacionUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIniciarSesionMouseClicked
        if (verificarUsuario(txtNombre.getText(), txtContrasena.getText())){
            txtNombre.setText("");
            txtContrasena.setText("");
            
            frameSistemaOperativo.pack();
            frameSistemaOperativo.setVisible(true);
            frameSistemaOperativo.setLocationRelativeTo(this);
            dispose();
            //JOptionPane.showMessageDialog(this, "Sesion iniciada");
        } else {
            
            //JOptionPane.showMessageDialog(this, "No existe ese usuario");
        }
    }//GEN-LAST:event_btnIniciarSesionMouseClicked

    private void menuLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuLogoutMouseClicked
        frameSistemaOperativo.dispose();
        setVisible(true);
    }//GEN-LAST:event_menuLogoutMouseClicked

    private void lblIconoEditorTextoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIconoEditorTextoMouseClicked
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_lblIconoEditorTextoMouseClicked

    private void btnAtrasEditorTextoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAtrasEditorTextoMouseClicked
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_btnAtrasEditorTextoMouseClicked

    private void comboTamanoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboTamanoItemStateChanged
        int tamano = Integer.parseInt(comboTamano.getSelectedItem()+"");
        String nombre = txtAreaEditorTexto.getFont().getFontName();
        int estilo = txtAreaEditorTexto.getFont().getStyle();
        txtAreaEditorTexto.setFont(new Font(nombre, estilo, tamano));
    }//GEN-LAST:event_comboTamanoItemStateChanged

    private void comboFuentesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboFuentesItemStateChanged
        int tamano = txtAreaEditorTexto.getFont().getSize();
        String nombre = comboFuentes.getSelectedItem()+"";
        int estilo = txtAreaEditorTexto.getFont().getStyle();
        txtAreaEditorTexto.setFont(new Font(nombre, estilo, tamano));
    }//GEN-LAST:event_comboFuentesItemStateChanged

    private void comboEstilosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboEstilosItemStateChanged
        int tamano = txtAreaEditorTexto.getFont().getSize();
        String nombre = txtAreaEditorTexto.getFont().getFontName();
        int estilo = comboEstilos.getSelectedIndex();
        switch (estilo){
            case 1:
                txtAreaEditorTexto.setFont(new Font(nombre, Font.PLAIN, tamano));
                break;
            case 2:
                txtAreaEditorTexto.setFont(new Font(nombre, Font.BOLD, tamano));
                break;
            case 3:
                txtAreaEditorTexto.setFont(new Font(nombre, Font.ITALIC, tamano));
                break;
        }
    }//GEN-LAST:event_comboEstilosItemStateChanged

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
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaPrincipal().setVisible(true);
            }
        });
    }
    
    private boolean verificarUsuario(String nombre, String contrasena){
        boolean isUsuario = true;
        for (Usuario usuario : usuarios) {
            if (nombre.equals(usuario.getNombre()) && contrasena.equals(usuario.getContrasena())){
                isUsuario = true;
                break;
            } else {
                isUsuario = false;
            }
        }
        return isUsuario;
    }
    
    private void agregarElementos(){
        for (int i = 10; i <= 60; i+=2) {
            comboTamano.addItem(i+"");
        }
        for (int i = 0; i < fuentes.length; i++) {
            comboFuentes.addItem(fuentes[i]);
        }
    }
    
    private Usuario usuarioActual(String nombre, String contrasena){
        Usuario usuario = new Usuario();
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getNombre().equals(nombre) && usuarios.get(i).getContrasena().equals(contrasena)){
                usuario = usuarios.get(i);
                break;
            }
        }
        return usuario;
    }
    
    /*private void barraDeProgreso() {
        frameProgressBar.pack();
        frameProgressBar.setVisible(true); 
        frameProgressBar.setLocationRelativeTo(this);
        int contador = 0;
        System.out.println(frameProgressBar.isVisible());
        Thread thread = new Thread() {
            public void run() {
                pBarCarga.setValue(0);
                while (pBarCarga.getValue() < 100) {
                    pBarCarga.setValue(pBarCarga.getValue() + 5);
                    try {
                        Thread.sleep(50);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    if (pBarCarga.getValue() == 100){
                        frameProgressBar.setVisible(false);
                        frameProgressBar.dispose();
                    }
                }
            }
        };
        thread.start();
        
    }*/
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtrasEditorTexto;
    private javax.swing.JButton btnIniciarSesion;
    private javax.swing.JComboBox<String> comboEstilos;
    private javax.swing.JComboBox<String> comboFuentes;
    private javax.swing.JComboBox<String> comboTamano;
    private javax.swing.JFrame frameSistemaOperativo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblContrasena;
    private javax.swing.JLabel lblEditorTexto;
    private javax.swing.JLabel lblEstilo;
    private javax.swing.JLabel lblExploradorArchivo;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblFotoExploradorArchivos;
    private javax.swing.JLabel lblFuente;
    private javax.swing.JLabel lblIcono;
    private javax.swing.JLabel lblIconoEditorTexto;
    private javax.swing.JLabel lblInicio;
    private javax.swing.JLabel lblInicioSesion;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTamano;
    private javax.swing.JMenuBar mBarPrincipal;
    private javax.swing.JMenu menuCrearUsuario;
    private javax.swing.JMenu menuLogout;
    private javax.swing.JPanel panelCreacionUsuario;
    private javax.swing.JPanel panelEditorTexto;
    private javax.swing.JPanel panelInicio;
    private javax.swing.JTextArea txtAreaEditorTexto;
    private javax.swing.JTextField txtContrasena;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
