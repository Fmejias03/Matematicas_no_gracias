import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Polinomio polinomio = new Polinomio();

        while (true){
        System.out.println("Bienvenido al menu principal");
        System.out.println("1. Cargar polinomio");
        System.out.println("2. Modificar polinomio");
        System.out.println("3. Obtener valor");
        System.out.println("4. Sumar polinomios");
        System.out.println("5. Multiplicar polinomios");
        System.out.println("6. Mostrar contenido");
        System.out.println("7. Eliminar termino");
        System.out.println("8. Existe termino");
        System.out.println("0. Salir");

        int menu = sc.nextInt();

        switch (menu){
            case 0:
                System.out.println("Gracias por usar el programa");
                System.exit(0);
                break;
            case 1:
                System.out.println("Ingrese el grado del polinomio");
                int grado = sc.nextInt();
                polinomio.setGrado(grado);
                polinomio.cargarPolinomio();
                break;
            case 2:
                System.out.println("Ingrese el termino a modificar");
                float termino = sc.nextFloat();
                System.out.println("Ingrese el grado del termino");
                int gradoTermino = sc.nextInt();
                polinomio.modificarPolinomio(termino, gradoTermino);
                break;
            case 3:
                System.out.println("Ingrese el valor de x");
                float valor = sc.nextFloat();
                polinomio.obtenerValor(valor);
                break;
            case 4:
                System.out.println("Ingrese el grado del polinomio");
                int grado2 = sc.nextInt();
                Polinomio polinomio2 = new Polinomio();
                polinomio2.setGrado(grado2);
                polinomio2.cargarPolinomio();
                polinomio.sumarPolinomios(polinomio2);
                break;
            case 5:
                System.out.println("Ingrese el grado del polinomio");
                int grado3 = sc.nextInt();
                Polinomio polinomio3 = new Polinomio();
                polinomio3.setGrado(grado3);
                polinomio3.cargarPolinomio();
                polinomio.multiplicarPolinomios(polinomio3);
                break;
            case 6:
                polinomio.mostrarContenido();
                break;
            case 7:
                System.out.println("Ingrese el termino a eliminar");
                float terminoEliminar = sc.nextFloat();
                System.out.println("Ingrese el grado del termino");
                int gradoTerminoEliminar = sc.nextInt();
                polinomio.eliminarTermino(terminoEliminar, gradoTerminoEliminar);
                break;
            case 8:
                System.out.println("Ingrese el termino a buscar");
                float terminoBuscar = sc.nextFloat();
                System.out.println("Ingrese el grado del termino");
                int gradoTerminoBuscar = sc.nextInt();
                polinomio.existeTermino(terminoBuscar, gradoTerminoBuscar);
                break;
            default:
                System.out.println("Opcion invalida");
                break;


        }



    }



}
