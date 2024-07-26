package cuh.com.mx;
public class Panadero implements Trabajador {
    private String nombre;
    private short altura;
    private short edad;
    private double sueldo;
    private boolean trabajando;
//creacion del constructor panadero
    public Panadero(String nombre, short altura, short edad, double sueldo) {
        this.nombre = nombre;
        this.altura = altura;
        this.edad = edad;
        this.sueldo = sueldo;
        this.trabajando = false;
    }

    public String getNombre() {
        return "Sr." + nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String trabajar() {
        trabajando = !trabajando;
        return "Trabajando haciendo pan";
    }

    @Override
    public void cobrar() {
        System.out.println("Pagar sueldo del panadero");
    }

    @Override
    public void alimentarse() {
        System.out.println("Hora de comer del panadero");
    }

    @Override
    public void checar() {
        if (!trabajando)
            System.out.println("Hora de entrada del panadero registrada");
        else
            System.out.println("Hora de salida del panadero registrada");
    }
}
