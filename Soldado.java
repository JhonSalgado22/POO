package cuh.com.mx;
public class Soldado implements Trabajador {
    //creamos varioables con metodos de acceso
    private String nombre;
    private short altura;
    private short edad;
    private double sueldo;
    private boolean trabajando;

    public Soldado(String nombre, short altura, short edad, double sueldo) {
        this.nombre = nombre;
        this.altura = altura;
        this.edad = edad;
        this.sueldo = sueldo;
        this.trabajando = false;
    }

    public String getNombre() {
        return "Sr." + nombre;
    }
//Hice los get y set de los atrobutos
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String trabajar() {
        trabajando = !trabajando;
        return "Trabajando en contra del narco";
    }

    @Override
    public void cobrar() {
        System.out.println("Pagar sueldo de soldado");
    }

    @Override
    public void alimentarse() {
        System.out.println("Hora de comer del soldado");
    }

    @Override
    public void checar() {
        if (!trabajando)
            System.out.println("Hora de entrada del soldado registrada");
        else
            System.out.println("Hora de salida del soldado registrada");
    }
}
