/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.loginb;

import com.mycompany.loginb.Catedratico.AlumnosNotas;
import com.mycompany.loginb.Catedratico.ConsultarCursosProfe;
import com.mycompany.loginb.Catedratico.PerfilProfe;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import services.CursoImpl;
import services.EditarService;

/**
 *
 * @author wil
 */
public class BienvenidaProfesor extends javax.swing.JFrame {
     private EditarService<Curso> editarService;

    /**
     * Creates new form BienvenidaProfesor
     */
    public BienvenidaProfesor() {
        
        initComponents();
         editarService = new CursoImpl();
         List<Curso> cursosProfe = Loginb.buscarCursosProfe(Loginb.profesorLogeado);
         for(Curso e : cursosProfe){
            jComboBox1.addItem(e.codigo);
        }
         
         
         
        jLabel1.setText("Bienvenido profesor: "+Loginb.profesorLogeado.nombre +" "+Loginb.profesorLogeado.apellido);
         mostrarCursosProfesor();
    }
public void mostrarCursosProfesor() {
    
    // Buscar los cursos del alumno loggeado
    List<Curso> cursosProfe = Loginb.buscarCursosProfe(Loginb.profesorLogeado);

    // Crear el modelo de la tabla
    DefaultTableModel data = new DefaultTableModel(
            new String[]{"Codigo", "Nombre", "Seccion", "Profesor", "Fecha Ini", "Fecha Fin", "Hora Ini", "Hora Fin"},
            cursosProfe.size()); // Ajustar el tamaño de la tabla según la lista de cursos

    jTable_CursosProfe.setModel(data);

    int row = 0;

    for (Curso curso : cursosProfe) {
        // Establecer valores en la fila actual
        jTable_CursosProfe.setValueAt(curso.codigo, row, 0);
        jTable_CursosProfe.setValueAt(curso.nombre, row, 1);
        jTable_CursosProfe.setValueAt(curso.seccion, row, 2);
        jTable_CursosProfe.setValueAt(curso.profesor, row, 3);

        // Formatear y establecer la fecha de inicio
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String fechaIniFormatted = dateFormat.format(curso.fechaIni);
        jTable_CursosProfe.setValueAt(fechaIniFormatted, row, 4);

        // Formatear y establecer la fecha de fin
        String fechaFinFormatted = dateFormat.format(curso.fechaFin);
        jTable_CursosProfe.setValueAt(fechaFinFormatted, row, 5);

        jTable_CursosProfe.setValueAt(curso.horaIni, row, 6);
        jTable_CursosProfe.setValueAt(curso.horaFin, row, 7);

        row++;
    }

    // Mensaje si no hay cursos asignados
    if (cursosProfe.isEmpty()) {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_CursosProfe = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_notas = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();

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

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/notas.png"))); // NOI18N
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

        jTable_CursosProfe.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable_CursosProfe);

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(312, 312, 312))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 655, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(20, 20, 20))
        );

        jTabbedPane1.addTab("tab1", jPanel1);

        jTable_notas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable_notas);

        jButton2.setText("Buscar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setText("Curso:");

        jButton4.setText("Guardar nota");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(252, 252, 252)
                        .addComponent(jButton4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(285, 285, 285)
                        .addComponent(jButton2)))
                .addContainerGap(170, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 1, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addGap(16, 16, 16))
        );

        jTabbedPane1.addTab("tab2", jPanel2);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, -1, 400));
        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        PerfilProfe a = new PerfilProfe();
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
            // TODO add your handling code here:

        String nombreCurso = jComboBox1.getSelectedItem().toString();
        Curso  cursoSeleccionado= null;
        for(Curso e : Loginb.Cursos){
            if(e.codigo.equals(nombreCurso)){
                cursoSeleccionado = e;
                break;
            }
        }

        if(cursoSeleccionado !=null){
            DefaultTableModel data = new DefaultTableModel(new String[]{"Carne","Nombre","Nota Final"},cursoSeleccionado.Alumnos.size());
            jTable_notas.setModel(data);

            int row = 0;

            for (Alumno alumno : cursoSeleccionado.Alumnos) {
                String carne = alumno.carne;
                String nombre = alumno.nombre;

                // Sacar la nota final con el carnet de alumno
                double notaFinal = Loginb.buscarAlu(carne).notasFinales.getNotaFinal(cursoSeleccionado.codigo);

                jTable_notas.setValueAt(carne, row, 0);
                jTable_notas.setValueAt(nombre, row, 1);
                jTable_notas.setValueAt(notaFinal, row, 2);
                row++;
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String nombreCurso = jComboBox1.getSelectedItem().toString();
        int selectedRow = jTable_notas.getSelectedRow();
        String selectedAlum = jTable_notas.getValueAt(selectedRow, 0).toString();
        Curso cursoselec = editarService.buscarElementoId(nombreCurso);

        if (selectedRow >= 0) {
            Alumno alumno = Loginb.buscarAlu(selectedAlum);
            String codigoCurso = cursoselec.codigo;
            double notaFinal = Double.parseDouble(jTable_notas.getValueAt(selectedRow, 2).toString());
            alumno.notasFinales.agregarNotaFinal(codigoCurso, notaFinal);
            BinManager.guardarAlumnos(Loginb.alumnos);
            JOptionPane.showMessageDialog(this, "Nota agregada correctamente.");
        } else {
            JOptionPane.showMessageDialog(this, "No se encuentra algun alumno seleccionado");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel_Menu;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable_CursosProfe;
    private javax.swing.JTable jTable_notas;
    // End of variables declaration//GEN-END:variables
}
