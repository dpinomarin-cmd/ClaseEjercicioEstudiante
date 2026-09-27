/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

/**
 *
 * @author usuario
 */
import Modelo.Estudiante;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ControladorEstudiante {
    private ArrayList<Estudiante> estudiantes;

    public ControladorEstudiante() {
        this.estudiantes = new ArrayList<>();
    }

    public void agregarEstudiante(Estudiante est) {
        estudiantes.add(est);
    }

    public void reportarEstudiantesTecnologiaSuperiores(double notaLimite) {
        String reporte = "=== ESTUDIANTES DE TECNOLOGÍA ===\n";
        reporte += "Con definitiva superior a " + notaLimite + "\n\n";
        int contadorResultados = 0;

        for (Estudiante est : estudiantes) {
            if (est.getTecnologia() == 1 && est.getNotaDefinitiva() > notaLimite) {
                reporte += "Código: " + est.getCodigo() + 
                           " | Nombre: " + est.getNombre() + 
                           " | Definitiva: " + est.getNotaDefinitiva() + "\n";
                contadorResultados++;
            }
        }

        if (contadorResultados == 0) {
            reporte += "No hay estudiantes que cumplan la condición.";
        }
        
        JOptionPane.showMessageDialog(null, reporte, "Reporte de Estudiantes", JOptionPane.INFORMATION_MESSAGE);
    }
    
    // Aplica el incremento a cada alumno (método void)
    public void aplicarIncrementoDesarrollo(double incremento) {
        for (Estudiante est : estudiantes) {
            est.incrementarNotaDesarrollo(incremento);
        }
    }
}
