/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.loginb;

import java.awt.BorderLayout;
import java.io.IOException;
import java.text.ParseException;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import services.CursoImpl;
import services.EditarService;
import services.ProfesorImpl;

/**
 *
 * @author wil
 */
public class Administrador extends javax.swing.JFrame {

    /**
     * Creates new form Administrador
     */
    public Administrador() {
        initComponents();
         
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel_Menu = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        btn_crearProfesor = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btn_consultarProfes = new javax.swing.JButton();
        btn_csvProfe = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton_editarCurso = new javax.swing.JButton();
        btn_consultarCursos = new javax.swing.JButton();
        btn_crearCursos = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        btn_crearEstu = new javax.swing.JButton();
        btn_editarAlumnos = new javax.swing.JButton();
        btn_crearEstudiante = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btn_consultaAlumnos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel_Menu.setBackground(new java.awt.Color(31, 75, 118));
        jPanel_Menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/umglogo(1).png"))); // NOI18N
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel3.setFocusable(false);
        jPanel_Menu.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 90));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cursos.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel_Menu.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 70, -1));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/profes.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel_Menu.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 70, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/alumnos.png"))); // NOI18N
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel_Menu.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/salir.png"))); // NOI18N
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel_Menu.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        jPanel1.add(jPanel_Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 390));

        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPane1.setFont(new java.awt.Font("Roboto Medium", 0, 13)); // NOI18N

        btn_crearProfesor.setFont(new java.awt.Font("FreeSans", 1, 12)); // NOI18N
        btn_crearProfesor.setText("Crear Profesor");
        btn_crearProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_crearProfesorActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("FreeSans", 1, 12)); // NOI18N
        jButton1.setText("Editar Profesor");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btn_consultarProfes.setFont(new java.awt.Font("FreeSans", 1, 12)); // NOI18N
        btn_consultarProfes.setText("Consultar Profesores");
        btn_consultarProfes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_consultarProfesActionPerformed(evt);
            }
        });

        btn_csvProfe.setFont(new java.awt.Font("FreeSans", 1, 12)); // NOI18N
        btn_csvProfe.setText("Importar CSV");
        btn_csvProfe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_csvProfeActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("FreeSans", 1, 12)); // NOI18N
        jButton6.setText("Export CSV");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton6)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_crearProfesor)
                            .addComponent(jButton1))
                        .addGap(54, 54, 54)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_consultarProfes)
                            .addComponent(btn_csvProfe))))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_crearProfesor)
                    .addComponent(btn_consultarProfes))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(btn_csvProfe))
                .addGap(18, 18, 18)
                .addComponent(jButton6)
                .addContainerGap(145, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("profe", jPanel3);

        jButton_editarCurso.setFont(new java.awt.Font("FreeSans", 1, 12)); // NOI18N
        jButton_editarCurso.setText("Editar Cursos");
        jButton_editarCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_editarCursoActionPerformed(evt);
            }
        });

        btn_consultarCursos.setFont(new java.awt.Font("FreeSans", 1, 12)); // NOI18N
        btn_consultarCursos.setText("Consultar Cursos");
        btn_consultarCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_consultarCursosActionPerformed(evt);
            }
        });

        btn_crearCursos.setFont(new java.awt.Font("FreeSans", 1, 12)); // NOI18N
        btn_crearCursos.setText("Crear Cursos");
        btn_crearCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_crearCursosActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("FreeSans", 1, 12)); // NOI18N
        jButton4.setText("Importar Cursos");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("FreeSans", 1, 12)); // NOI18N
        jButton7.setText("Asignación Masiva");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton7)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_crearCursos)
                            .addComponent(jButton_editarCurso))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4)
                            .addComponent(btn_consultarCursos))))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_crearCursos)
                    .addComponent(btn_consultarCursos))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_editarCurso)
                    .addComponent(jButton4))
                .addGap(30, 30, 30)
                .addComponent(jButton7)
                .addContainerGap(120, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("cursos", jPanel2);

        btn_crearEstu.setFont(new java.awt.Font("FreeSans", 1, 12)); // NOI18N
        btn_crearEstu.setText("Asignar Estudiantes");
        btn_crearEstu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_crearEstuActionPerformed(evt);
            }
        });

        btn_editarAlumnos.setFont(new java.awt.Font("FreeSans", 1, 12)); // NOI18N
        btn_editarAlumnos.setText("Editar Alumnos");
        btn_editarAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarAlumnosActionPerformed(evt);
            }
        });

        btn_crearEstudiante.setFont(new java.awt.Font("FreeSans", 1, 12)); // NOI18N
        btn_crearEstudiante.setText("Crear estudiante");
        btn_crearEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_crearEstudianteActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("FreeSans", 1, 12)); // NOI18N
        jButton5.setText("Consultar Alumnos");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("FreeSans", 1, 12)); // NOI18N
        jButton3.setText("ExportarXML");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("FreeSans", 1, 12)); // NOI18N
        jButton2.setText("Importar XML");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btn_consultaAlumnos.setFont(new java.awt.Font("FreeSans", 1, 12)); // NOI18N
        btn_consultaAlumnos.setText("Consultar alumnos de Cursos");
        btn_consultaAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_consultaAlumnosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_crearEstu)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btn_crearEstudiante)
                        .addGap(60, 60, 60)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton5)
                            .addComponent(btn_editarAlumnos)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2))
                    .addComponent(btn_consultaAlumnos))
                .addGap(37, 37, 37))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_crearEstudiante)
                    .addComponent(jButton5))
                .addGap(17, 17, 17)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_crearEstu)
                    .addComponent(btn_editarAlumnos))
                .addGap(18, 18, 18)
                .addComponent(btn_consultaAlumnos)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton2))
                .addContainerGap(138, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("alu", jPanel4);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 480, 390));
        jTabbedPane1.getAccessibleContext().setAccessibleName("tab1");
        jTabbedPane1.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
    jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jButton_editarCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_editarCursoActionPerformed
        // TODO add your handling code here:
        EditarCursos c = new EditarCursos();
        c.setVisible(true);
        EditarService<Curso> editarService = new CursoImpl();
    }//GEN-LAST:event_jButton_editarCursoActionPerformed

    private void btn_consultarCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_consultarCursosActionPerformed
        ConsultarCursos c = new ConsultarCursos();
        c.setVisible(true);
    }//GEN-LAST:event_btn_consultarCursosActionPerformed

    private void btn_crearCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_crearCursosActionPerformed
        // TODO add your handling code here:
        CrearCurso c = new CrearCurso();
        c.setVisible(true);
    }//GEN-LAST:event_btn_crearCursosActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            Loader_Export.loaderCursosJSON();
        } catch (ParseException | IOException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btn_crearProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_crearProfesorActionPerformed
        // TODO add your handling code here:
        CrearProfesor c = new CrearProfesor();
        c.setVisible(true);
    }//GEN-LAST:event_btn_crearProfesorActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        EditarProfe c = new EditarProfe();
        c.setVisible(true);
        EditarService<Profesor> editarService = new ProfesorImpl();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_consultarProfesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_consultarProfesActionPerformed
        // TODO add your handling code here:
        ConsultarProfe c = new ConsultarProfe();
        c.setVisible(true);
    }//GEN-LAST:event_btn_consultarProfesActionPerformed

    private void btn_csvProfeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_csvProfeActionPerformed
        // TODO add your handling code here:
        Loader_Export.loaderProfeCSV();
    }//GEN-LAST:event_btn_csvProfeActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void btn_crearEstuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_crearEstuActionPerformed
        // TODO add your handling code here:
        AsignarAlumno a = new AsignarAlumno();
        a.setVisible(true);
    }//GEN-LAST:event_btn_crearEstuActionPerformed

    private void btn_editarAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarAlumnosActionPerformed
        // TODO add your handling code here:
        EditarAlumno c = new EditarAlumno();
        c.setVisible(true);
    }//GEN-LAST:event_btn_editarAlumnosActionPerformed

    private void btn_crearEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_crearEstudianteActionPerformed
        // TODO add your handling code here:
        CrearAlumno c = new CrearAlumno();
        c.setVisible(true);
    }//GEN-LAST:event_btn_crearEstudianteActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        ConsultarAlumnos c = new ConsultarAlumnos();
        c.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Loader_Export.exportAlumnosXML();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Loader_Export.loaderAlumnosXML();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btn_consultaAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_consultaAlumnosActionPerformed
        // TODO add your handling code here:
        ConsultarAlumnosdeCursos c = new ConsultarAlumnosdeCursos();
        c.setVisible(true);
    }//GEN-LAST:event_btn_consultaAlumnosActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
         Login l = new Login();
        l.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        Loader_Export.exportProfeCSV();
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        Loader_Export.asignarEstudiantesMasivo();
        
    }//GEN-LAST:event_jButton7ActionPerformed
 
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_consultaAlumnos;
    private javax.swing.JButton btn_consultarCursos;
    private javax.swing.JButton btn_consultarProfes;
    private javax.swing.JButton btn_crearCursos;
    private javax.swing.JButton btn_crearEstu;
    private javax.swing.JButton btn_crearEstudiante;
    private javax.swing.JButton btn_crearProfesor;
    private javax.swing.JButton btn_csvProfe;
    private javax.swing.JButton btn_editarAlumnos;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton_editarCurso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel_Menu;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}