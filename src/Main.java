import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("El visitante es un empleado? Si/No");
        boolean esEmpleado = scanner.nextBoolean();

        System.out.println("Es un visitante Nuevo (Si/No)");
        boolean esVisitanteNuevo = scanner.nextBoolean();

        System.out.println("nombre del visitante");
        String nombre = scanner.next();

        System.out.println("Edad del visitante");
        byte Edad = scanner.nextByte();

        System.out.println("Genero del visitante");
        char Genero = scanner.next().charAt(0);

        System.out.println("Introduzca peso del visitante (En Kg)");
        Short Peso = scanner.nextShort();

        System.out.println("Ingresse altura del visitante (En cm)");
        int altura = scanner.nextInt();

        System.out.println("Ingrese Numero de telefono");
        long telefono = scanner.nextLong();

        System.out.println("Numero de Apartamento");
        int Apartamento = scanner.nextInt();

        System.out.println("Numero de visitantes");
        int Visitantes = scanner.nextInt();

        //Se muestra en pantalla
        System.out.println("Informacion Del Visitante");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + Edad);
        System.out.println("Telefono: " + telefono);
        System.out.println("Peso del visitante: " + Peso);
        System.out.println("Altura del visitante: " + altura);
        System.out.println("Genero: " + Genero);
        System.out.println("Es su Primera Visita: " + esVisitanteNuevo);
        System.out.println("Cantidad de Visitantes: " + Visitantes);
        System.out.println("Numero De Apartamento: " + Apartamento);
    }
}