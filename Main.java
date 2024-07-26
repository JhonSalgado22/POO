package cuh.com.mx;

public class Main {
	 public static void main(String[] args) {
			//instanciacion de objetos
   Trabajador panadero = new Panadero("Luis Fernandez", (short) 170, (short) 20, 190);
   Trabajador soldado = new Soldado("Carlos Suarez", (short) 175, (short) 25, 200);
   Trabajador constructor = new Constructor("Juan Perez", (short) 180, (short) 30, 250);
   Trabajador jardinero = new Jardinero("Marco Lopez", (short) 165, (short) 28, 220);
   Trabajador comerciante = new Comerciante("Ana Martinez", (short) 160, (short) 32, 210);

	        // Llamar el método checar para cada trabajador
   panadero.checar();
   soldado.checar();
   constructor.checar();
   jardinero.checar();
   comerciante.checar();

	        // Implementación específica del mtodo trabajar de cada clase
    System.out.println(panadero.trabajar());
    System.out.println(soldado.trabajar());
    System.out.println(constructor.trabajar());
    System.out.println(jardinero.trabajar());
    System.out.println(comerciante.trabajar());

	        // Implementación específica del mtodo alimentarse de cada clase
    panadero.alimentarse();
    soldado.alimentarse();
    constructor.alimentarse();
    jardinero.alimentarse();
    comerciante.alimentarse();

	        // Implementación específica del método cobrar de cada clase
    panadero.cobrar();
    soldado.cobrar();
    constructor.cobrar();
    jardinero.cobrar();
    comerciante.cobrar();

	        // Llaar el mtodo checar para cada trabajador
    panadero.checar();
    soldado.checar();
    constructor.checar();
    jardinero.checar();
	  comerciante.checar();
	 }
}
