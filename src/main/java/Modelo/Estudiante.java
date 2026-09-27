/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author usuario
 */
public class Estudiante {
    private String codigo;
    private String nombre;
    private int Tecnologia; // 1 = Sí, 2 = No
    private double notaDesarrollo;
    private double notaDefinitiva;

    public Estudiante(String codigo, String nombre, int esTecnologia, double notaDesarrollo, double notaDefinitiva) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.Tecnologia = esTecnologia;
        this.notaDesarrollo = notaDesarrollo;
        this.notaDefinitiva = notaDefinitiva;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEsTecnologia() {
        return Tecnologia;
    }

    public double getNotaDesarrollo() {
        return notaDesarrollo;
    }

    public double getNotaDefinitiva() {
        return notaDefinitiva;
    }

    // Incrementa la nota de desarrollo sin superar 5.0 (método void)
    public void incrementarNotaDesarrollo(double incremento) {
        if (this.notaDesarrollo + incremento > 5.0) {
            this.notaDesarrollo = 5.0;
        } else {
            this.notaDesarrollo += incremento;
        }
    }
}
