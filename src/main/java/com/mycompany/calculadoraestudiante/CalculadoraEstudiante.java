/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadoraestudiante;
import Controlador.ControladorEstudiante;
import Modelo.Estudiante;
import javax.swing.JOptionPane;
/**
 *
 * @author usuario
 */
public class CalculadoraEstudiante {

    public static void main(String[] args) {
        ControladorEstudiante controlador = new ControladorEstudiante();

        // 1. Ingreso de número de estudiantes
        int numEstudiantes = Integer.parseInt(JOptionPane.showInputDialog(null, 
                "Ingrese el número de estudiantes a registrar:", 
                "Cantidad de Estudiantes", JOptionPane.QUESTION_MESSAGE));

        for (int i = 0; i < numEstudiantes; i++) {
            String titulo = "Registro Estudiante " + (i + 1);
            
            String codigo = JOptionPane.showInputDialog(null, "Ingrese el Código:", titulo, JOptionPane.QUESTION_MESSAGE);
            String nombre = JOptionPane.showInputDialog(null, "Ingrese el Nombre:", titulo, JOptionPane.QUESTION_MESSAGE);
            
            int esTecnologia = Integer.parseInt(JOptionPane.showInputDialog(null, 
                    "¿Es estudiante de tecnología?\n1 = Sí\n2 = No", titulo, JOptionPane.QUESTION_MESSAGE));
            
            double notaDesarrollo = Double.parseDouble(JOptionPane.showInputDialog(null, 
                    "Ingrese la Nota de Desarrollo (0.0 - 5.0):", titulo, JOptionPane.QUESTION_MESSAGE));
            
            double notaDefinitiva = Double.parseDouble(JOptionPane.showInputDialog(null, 
                    "Ingrese la Nota Definitiva (0.0 - 5.0):", titulo, JOptionPane.QUESTION_MESSAGE));

            controlador.agregarEstudiante(new Estudiante(codigo, nombre, esTecnologia, notaDesarrollo, notaDefinitiva));
        }

        // 2. Captura y validación de notaLimite entre 0.0 y 4.9
        double notaLimite;
        do {
            notaLimite = Double.parseDouble(JOptionPane.showInputDialog(null, 
                    "Ingrese la nota límite para el reporte de tecnologías (entre 0.0 y 4.9):", 
                    "Filtro de Reporte", JOptionPane.WARNING_MESSAGE));
        } while (notaLimite < 0.0 || notaLimite > 4.9);

        // Generar reporte
        controlador.reportarEstudiantesTecnologiaSuperiores(notaLimite);

        // 3. Captura y validación de la cifra de incremento entre 0.0 y 0.5
        double incremento;
        do {
            incremento = Double.parseDouble(JOptionPane.showInputDialog(null, 
                    "Ingrese el incremento para la nota de desarrollo (entre 0.0 y 0.5):", 
                    "Incremento de Notas", JOptionPane.WARNING_MESSAGE));
        } while (incremento < 0.0 || incremento > 0.5);

        // Aplicar incremento
        controlador.aplicarIncrementoDesarrollo(incremento);
        
        JOptionPane.showMessageDialog(null, 
                "El incremento de " + incremento + " se ha aplicado correctamente a todos los estudiantes (máximo 5.0).", 
                "Proceso Terminado", JOptionPane.INFORMATION_MESSAGE);
    }
}
