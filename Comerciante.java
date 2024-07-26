package cuh.com.mx;
public class Comerciante implements Trabajador {
    private String nombre;
    private short altura;
    private short edad;
    private double sueldo;
    private boolean trabajando;

    public Comerciante(String nombre, short altura, short edad, double sueldo) {
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
        return "Trabajando; endiendo gelatinas";
    }

    @Override
    public void cobrar() {
        System.out.println("Pagar sueldo del comerciante");
    }

    @Override
    public void alimentarse() {
        System.out.println("Hora de comer del comerciante");
    }

    @Override
    public void checar() {
        if (!trabajando)
            System.out.println("Hora de entrada del comerciante registrada");
        else
            System.out.println("Hora de salida del comerciante registrada");
    }
}
