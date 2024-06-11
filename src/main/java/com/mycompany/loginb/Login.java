/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.loginb;

import javax.swing.JOptionPane;

/**
 *
 * @author wil
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Bg = new javax.swing.JPanel();
        jPasswordField1 = new javax.swing.JPasswordField();
        btn_login = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setLocationByPlatform(true);
        setResizable(false);

        Bg.setBackground(new java.awt.Color(255, 255, 255));
        Bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPasswordField1.setForeground(new java.awt.Color(102, 102, 102));
        jPasswordField1.setBorder(null);
        Bg.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 290, 20));

        btn_login.setBackground(new java.awt.Color(31, 75, 118));
        btn_login.setFont(new java.awt.Font("Roboto Medium", 0, 13)); // NOI18N
        btn_login.setForeground(new java.awt.Color(255, 255, 255));
        btn_login.setText("Iniciar sesion");
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });
        Bg.add(btn_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, -1, 30));

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 13)); // NOI18N
        jLabel1.setText("Usuario:");
        Bg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        jLabel2.setFont(new java.awt.Font("Roboto Medium", 0, 13)); // NOI18N
        jLabel2.setText("Password:");
        Bg.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        jTextField1.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(102, 102, 102));
        jTextField1.setBorder(null);
        Bg.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 290, 30));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        Bg.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 290, 10));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        Bg.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 290, 10));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/umglogo(1).png"))); // NOI18N
        Bg.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 90, 90));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Bg, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Bg, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed

        String usuario = jTextField1.getText();
        String pass = jPasswordField1.getText();

        if("admin".equals(usuario)&&"admin".equals(pass)){
            Administrador a = new Administrador();
            a.setVisible(true);
            this.dispose();
        }
        else{
            boolean encontradoProfesor = false;
            boolean encontradoAlumno = false;

            // Validar profesores

            for(Profesor p : Loginb.profesores){
                if(p.usuario.equals(usuario) && p.password.equals(pass)){
                    Loginb.profesorLogeado = p;
                    BienvenidaProfesor b = new BienvenidaProfesor();
                    b.setVisible(true);
                    encontradoProfesor = true;
                    this.dispose();
                    break;
                }
            }

            // Validar alumnos
            if (!encontradoProfesor) {
                for(Alumno a : Loginb.alumnos){
                    if(a.carne.equals(usuario) && a.password.equals(pass)){
                        Loginb.alumnoLogeado = a;
                        BienvenidaAlumno b = new BienvenidaAlumno();
                        b.setVisible(true);
                        encontradoAlumno = true;
                        this.dispose();
                        break;
                    }
                }
            }

            // Mostrar mensaje de error si no se encuentra ningún usuario
            if(!encontradoProfesor && !encontradoAlumno){
                JOptionPane.showMessageDialog(this, "Usuario y/o contraseña incorrectos.");
            }

    }//GEN-LAST:event_btn_loginActionPerformed

        }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Bg;
    private javax.swing.JButton btn_login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
