/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.loginb;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


/**
 *
 * @author wil
 */
public class Loader_Export {
    public static void loaderAlumnosXML() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Seleccionar archivo XML");
        fileChooser.setFileFilter(new FileNameExtensionFilter("Archivos XML", "xml"));

        int seleccion = fileChooser.showOpenDialog(null);
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            File archivo = fileChooser.getSelectedFile();
            ArrayList<Alumno> alumnos = new ArrayList<>();

            try {
                DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
                DocumentBuilder builder = factory.newDocumentBuilder();
                Document doc = builder.parse(archivo);
                doc.getDocumentElement().normalize();

                NodeList nodeList = doc.getElementsByTagName("alumno");
                for (int i = 0; i < nodeList.getLength(); i++) {
                    Node node = nodeList.item(i);
                    if (node.getNodeType() == Node.ELEMENT_NODE) {
                        Element element = (Element) node;
                        String carne = element.getElementsByTagName("carne").item(0).getTextContent();
                        String nombre = element.getElementsByTagName("nombre").item(0).getTextContent();
                        String apellido = element.getElementsByTagName("apellido").item(0).getTextContent();
                        String password = element.getElementsByTagName("password").item(0).getTextContent();

                        Alumno alumno = new Alumno();
                        alumno.carne = carne;
                        alumno.nombre = nombre;
                        alumno.apellido = apellido;
                        alumno.password = password;

                        alumnos.add(alumno);
                    }
                }

                // Agregar los alumnos a la lista existente (Loginb.alumnos)
                Loginb.alumnos.addAll(alumnos);
                BinManager.guardarAlumnos(Loginb.alumnos);
                JOptionPane.showMessageDialog(null, "Alumnos creados exitosamente desde XML.");
            } catch (ParserConfigurationException | SAXException | IOException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error al cargar los alumnos desde el archivo XML.");
            }
        }
    }
    
    public static void exportAlumnosXML() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Guardar archivo XML");
        fileChooser.setFileFilter(new FileNameExtensionFilter("Archivos XML", "xml"));

        int seleccion = fileChooser.showSaveDialog(null);
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            File archivo = fileChooser.getSelectedFile();
            if (!archivo.getName().toLowerCase().endsWith(".xml")) {
                archivo = new File(archivo.getParentFile(), archivo.getName() + ".xml");
            }

            try (FileWriter writer = new FileWriter(archivo)) {
                writer.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
                writer.write("<alumnos>\n");

                for (Alumno alumno : Loginb.alumnos) {
                    writer.write("\t<alumno>\n");
                    writer.write("\t\t<carne>" + alumno.carne + "</carne>\n");
                    writer.write("\t\t<nombre>" + alumno.nombre + "</nombre>\n");
                    writer.write("\t\t<apellido>" + alumno.apellido + "</apellido>\n");
                    writer.write("\t\t<password>" + alumno.password + "</password>\n");
                    writer.write("\t</alumno>\n");
                }

                writer.write("</alumnos>");
                JOptionPane.showMessageDialog(null, "Alumnos exportados exitosamente a XML.");
            } catch (IOException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error al exportar los alumnos a XML.");
            }
        }
    } 
    public static void loaderCursosJSON() throws ParseException, IOException {
    JFileChooser fileChooser = new JFileChooser();
    fileChooser.setDialogTitle("Seleccionar archivo JSON");
    fileChooser.setFileFilter(new FileNameExtensionFilter("Archivos JSON", "json"));

    int seleccion = fileChooser.showOpenDialog(null);
    if (seleccion == JFileChooser.APPROVE_OPTION) {
        File archivo = fileChooser.getSelectedFile();
        ArrayList<Curso> cursos = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            // Parse the JSON file using Gson
            JsonParser parser = new JsonParser();
            JsonArray jsonArray = parser.parse(br).getAsJsonArray();

            // Iterate over each JSON object in the array
            for (JsonElement element : jsonArray) {
                JsonObject cursoObject = element.getAsJsonObject();

                // Read course data from the JSON
                String codigo = cursoObject.get("id").getAsString();
                String nombre = cursoObject.get("nombre").getAsString();
                String seccion = cursoObject.get("seccion").getAsString();

                // Parse and convert fecha_inicio and fecha_fin strings to Date objects
                String fechaInicioString = cursoObject.get("fecha_inicio").getAsString();
                String fechaFinString = cursoObject.get("fecha_fin").getAsString();
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
                Date fechaInicio = dateFormat.parse(fechaInicioString);
                Date fechaFin = dateFormat.parse(fechaFinString);

                String horaInicio = cursoObject.get("hora_inicio").getAsString();
                String horaFin = cursoObject.get("hora_fin").getAsString();
                String profesor = cursoObject.get("profesor").getAsString();

                // Create a Curso object and add it to the list
                Curso curso = new Curso();
                curso.codigo = codigo;
                curso.nombre = nombre;
                curso.seccion = seccion;
                curso.fechaIni = fechaInicio; // Use the parsed Date objects
                curso.fechaFin = fechaFin;
                curso.horaIni = horaInicio;
                curso.horaFin = horaFin;
                curso.profesor = profesor;

                cursos.add(curso);
            }

            // Add courses to existing list and save
            Loginb.Cursos.addAll(cursos);
            BinManager.guardarCursos(Loginb.Cursos);
            JOptionPane.showMessageDialog(null, "Cursos creados exitosamente desde JSON.");
        } 
    }
}
    public static void asignarEstudiantesMasivo() {
    JFileChooser fileChooser = new JFileChooser();
    fileChooser.setDialogTitle("Seleccionar archivo .progra1");
    fileChooser.setFileFilter(new FileNameExtensionFilter("Archivos progra1", "progra1"));

    int seleccion = fileChooser.showOpenDialog(null);
    if (seleccion == JFileChooser.APPROVE_OPTION) {
        File archivo = fileChooser.getSelectedFile();

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                if (linea.startsWith("#")) { 
                    continue;
                }

                String[] datos = linea.split("#");
                if (datos.length == 2) {
                    String idCursoStr = datos[0].trim();
                    String carnetEstudiante = datos[1].trim();

                    if (!idCursoStr.matches("\\d+")) { 
                        System.err.println("Error: ID de curso inválido en la línea: " + linea);
                        continue; 
                    }

                    
                    Curso curso = buscarCursoPorId(idCursoStr); 
                    Alumno estudiante = Loginb.buscarAlu(carnetEstudiante); 

                    if (curso != null && estudiante != null) {
                       
                            curso.Alumnos.add(estudiante);
                            System.out.println("Estudiante " + carnetEstudiante + " asignado al curso " + idCursoStr);
                       
                        
                    } else {
                        System.err.println("Error: Curso o estudiante no encontrado: " + linea);
                    }
                }
            }

            // Guardar cambios después de procesar todo el archivo
            BinManager.guardarCursos(Loginb.Cursos); 
            JOptionPane.showMessageDialog(null, "Asignaciones procesadas.");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error al cargar las asignaciones desde el archivo.");
        }
    }
}

// Métodos auxiliares (debes implementarlos según tu estructura de datos)
private static Curso buscarCursoPorId(String idCurso) {
    Curso cursoSeleccionado = null;
    for(Curso e : Loginb.Cursos){
            if(e.codigo.equals(idCurso)){
                cursoSeleccionado = e;
                return cursoSeleccionado;
            }
        }
        return null;
    }


     
     public static void loaderProfeCSV() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Seleccionar archivo CSV");
        fileChooser.setFileFilter(new FileNameExtensionFilter("Archivos CSV", "csv"));

        int seleccion = fileChooser.showOpenDialog(null);
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            File archivo = fileChooser.getSelectedFile();
            ArrayList<Profesor> profesores = new ArrayList<>();

          try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                if (datos.length == 4) {
                    String usuario = datos[0];
                    String nombre = datos[1];
                    String apellido = datos[2];
                    String password = datos[3];

                    // Crear un nuevo profesor con los datos del archivo CSV
                    Profesor p = new Profesor();
                    p.usuario = usuario;
                    p.nombre = nombre;
                    p.apellido = apellido;
                    p.password = password;
                    profesores.add(p);
                }
            }

            // Agregar los profesores a la lista existente (Loginb.profesores)
            Loginb.profesores.addAll(profesores);
            BinManager.guardarProfesores(Loginb.profesores);
            JOptionPane.showMessageDialog(null, "Profesores creados exitosamente.");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error al cargar los profesores desde el archivo CSV.");
        }
    }
}
     
     public static void exportProfeCSV() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Guardar archivo CSV");
            // Crear un FileNameExtensionFilter para archivos CSV sin extensiones
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos CSV", "csv");
        fileChooser.setFileFilter(filter);


        int seleccion = fileChooser.showSaveDialog(null);
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            File archivo = fileChooser.getSelectedFile();
            // Agregar la extensión .csv si no está presente
        if (!archivo.getName().endsWith(".csv")) {
            archivo = new File(archivo.getAbsolutePath() + ".csv");
        }
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivo))) {
                // Escribir la cabecera del archivo CSV (opcional)
                writer.write("Usuario,Nombre,Apellido,Password\n");

                // Iterar sobre la lista de profesores y escribir cada uno en el archivo CSV
                for (Profesor profesor : Loginb.profesores) {
                    String linea = String.format("%s,%s,%s,%s\n",
                            profesor.usuario, profesor.nombre, profesor.apellido, profesor.password);
                    writer.write(linea);
                }

                System.out.println("Profesores exportados exitosamente a CSV.");
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("Error al exportar los profesores a CSV.");
            }
        }
     }
}
