/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.loginb;

import com.mycompany.loginb.Estudiante.Perfil;
import com.mycompany.loginb.Estudiante.AsignarCurso;
import com.mycompany.loginb.Estudiante.ConsultarCurso;
import static com.mycompany.loginb.Loginb.validarInscritos;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author wil
 */
public class BienvenidaAlumno extends javax.swing.JFrame {

    /**
     * Creates new form BienvenidaAlumno
     */
    public BienvenidaAlumno() {
        initComponents();
        jLabel8.setText("Bienvenido alumno: "+Loginb.alumnoLogeado.nombre +" "+Loginb.alumnoLogeado.apellido);
         mostrarCursosAlumnoLogeado();
         
        jLabel1.setText(Loginb.alumnoLogeado.nombre + " puedes asignarte a 5 como maximo");
         for(Curso e : Loginb.Cursos){
            jComboBox3.addItem(e.nombre);
        }
    }
 public void mostrarCursosAlumnoLogeado() {
    
    // Buscar los cursos del alumno loggeado
    List<Curso> cursosAlumno = Loginb.buscarCursosAlumno(Loginb.alumnoLogeado);

    // Crear el modelo de la tabla
    DefaultTableModel data = new DefaultTableModel(
            new String[]{"Codigo", "Nombre", "Seccion", "Profesor", "Fecha Ini", "Fecha Fin", "Hora Ini", "Hora Fin", "Nota Final"},
            cursosAlumno.size()); // Ajustar el tamaño de la tabla según la lista de cursos

    jTable1.setModel(data);

    int row = 0;

    for (Curso curso : cursosAlumno) {
        // Establecer valores en la fila actual
        jTable1.setValueAt(curso.codigo, row, 0);
        jTable1.setValueAt(curso.nombre, row, 1);
        jTable1.setValueAt(curso.seccion, row, 2);
        jTable1.setValueAt(curso.profesor, row, 3);

        // Formatear y establecer la fecha de inicio
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String fechaIniFormatted = dateFormat.format(curso.fechaIni);
        jTable1.setValueAt(fechaIniFormatted, row, 4);

        // Formatear y establecer la fecha de fin
        String fechaFinFormatted = dateFormat.format(curso.fechaFin);
        jTable1.setValueAt(fechaFinFormatted, row, 5);

        jTable1.setValueAt(curso.horaIni, row, 6);
        jTable1.setValueAt(curso.horaFin, row, 7);
        double notaFinal = Loginb.alumnoLogeado.notasFinales.getNotaFinal(curso.codigo);
        jTable1.setValueAt(notaFinal, row, 8);

        row++;
    }

    // Mensaje si no hay cursos asignados
    if (cursosAlumno.isEmpty()) {
        JOptionPane.showMessageDialog(this, "No tiene cursos asignados.");
    }
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_Menu = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btn_designarCurso = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel_Menu.setBackground(new java.awt.Color(31, 75, 118));
        jPanel_Menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/umglogo(1).png"))); // NOI18N
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel3.setFocusable(false);
        jPanel_Menu.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 90));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cursos.png"))); // NOI18N
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel_Menu.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 160, -1, -1));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/perfil.png"))); // NOI18N
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel_Menu.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 100, 100, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cursos Disponibles.png"))); // NOI18N
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel_Menu.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 220, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/salir.png"))); // NOI18N
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel_Menu.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));

        getContentPane().add(jPanel_Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 400));

        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        jLabel8.setText("Bienvenido alumno");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        btn_designarCurso.setText("Designar");
        btn_designarCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_designarCursoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 655, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(291, 291, 291)
                        .addComponent(btn_designarCurso)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_designarCurso)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab1", jPanel1);

        jLabel2.setText("Curso:");

        jButton2.setText("Asignar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addGap(45, 45, 45))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(26, 26, 26)
                                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(333, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(34, 34, 34)
                .addComponent(jButton2)
                .addGap(189, 189, 189))
        );

        jTabbedPane1.addTab("tab2", jPanel2);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        jTabbedPane1.setSelectedIndex(0);
         mostrarCursosAlumnoLogeado();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
       Perfil a = new Perfil();
        a.setVisible(true);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        Login l = new Login();
        l.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel7MouseClicked

    private void btn_designarCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_designarCursoActionPerformed
        // TODO add your handling code here:
        // Obtener la fila seleccionada
        int selectedRow = jTable1.getSelectedRow();

        if (selectedRow != -1) { // Verificar que se haya seleccionado una fila
            String codigoCurso = jTable1.getValueAt(selectedRow, 0).toString();

            // Quitar al alumno logueado de ese curso
            Loginb.quitarAlumnoCurso(Loginb.alumnoLogeado, codigoCurso);
            JOptionPane.showMessageDialog(this, "Curso eliminado correctamente");

            // Actualizar la tabla para reflejar los cambios
            mostrarCursosAlumnoLogeado();
        } else {
            // Mostrar un mensaje de error si no se seleccionó ninguna fila
            JOptionPane.showMessageDialog(this, "Por favor, seleccione un curso.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_designarCursoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        String nombreCurso = jComboBox3.getSelectedItem().toString();

        Curso cursoSeleccionado = null;

        for(Curso e : Loginb.Cursos){
            if(e.nombre.equals(nombreCurso)){
                cursoSeleccionado = e;
                break;
            }
        }

        if(cursoSeleccionado!=null){
            if (Loginb.validarCursos(cursoSeleccionado) && validarInscritos(Loginb.alumnoLogeado)) {
                cursoSeleccionado.Alumnos.add(Loginb.alumnoLogeado);
                BinManager.guardarCursos(Loginb.Cursos);
                JOptionPane.showMessageDialog(this, "Alumno asignado exitosamente.");
            }
            
        }
    }//GEN-LAST:event_jButton2ActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_designarCurso;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel_Menu;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
