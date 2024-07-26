package cuh.com.mx;
public class Constructor implements Trabajador {
    private String nombre;
    private short altura;
    private short edad;
    private double sueldo;
    private boolean trabajando;

    public Constructor(String nombre, short altura, short edad, double sueldo) {
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
        return "Trabajando en la construcción de un edificio";
    }

    @Override
    public void cobrar() {
        System.out.println("Pagar sueldo del constructor");
    }

    @Override
    public void alimentarse() {
        System.out.println("Hora de comer del constructor");
    }

    @Override
    public void checar() {
        if (!trabajando)
            System.out.println("Hora de entrada del constructor registrada");
        else
            System.out.println("Hora de salida del construtor registrada");
    }
}
