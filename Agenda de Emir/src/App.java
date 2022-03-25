import java.util.ArrayList;
import java.util.Scanner;

public class App {
    static ArrayList<Contacto> contactos = new ArrayList<Contacto>();
    static Scanner tec = new Scanner(System.in);
    static int Option;

    public static void main(String[] args) throws Exception {

        System.out.println("AGENDA EMIR ROMERO alpha 0.1");
        System.out.println("");
        System.out.println("Si quiere Ingresar un nuevo Contacto Digite - 1");
        System.out.println("Si quiere Consultar un Contacto Digite - 2");
        System.out.println("Si desea salir del programa Digite - 0");

        Option = tec.nextInt();

        do {
            switch (Option) {
                case 1:
                    IngresarContactos();

                    break;
                case 2:
                    ConsultarContacto();

                    break;

                case 0:

                    break;
                default:
                    System.out.println("Por favor Ingrese una de las Opciones antes mencionadas");
                    Option = tec.nextInt();
                    break;
            }
        } while (Option != 1 || Option != 2);

    }

    public static void IngresarContactos() {

        String Nombre;
        String Email;
        int Numero;

        Contacto aux;
        int i, N;

        do {
            System.out.print("Número de Contactos a Ingresar? ");
            N = tec.nextInt();
        } while (N < 0);
        tec.nextLine();

        for (i = 1; i <= N; i++) {

            System.out.println("Contacto " + i);
            System.out.print("Nombre: ");
            Nombre = tec.next();
            System.out.print("Numero: ");
            Numero = tec.nextInt();
            System.out.print("Email: ");
            Email = tec.next();

            aux = new Contacto();

            aux.setNombre(Nombre);
            aux.setNumero(Numero);
            aux.setEmail(Email);

            contactos.add(aux);
            System.out.println("");
        }
        System.out.println("");
        System.out.println("Contacto/s Ingresados!");
        System.out.println("");
        System.out.println("Si desea volver a ingresar otros contactos digite - 1");
        System.out.println("Si quiere Consultar un Contacto Digite - 2");
        System.out.println("Si desea salir del programa Digite - 0");
        Option = tec.nextInt();
    }

    public static void ConsultarContacto() {
        String nombre;
        System.out.print("Introduce nombre del contacto que quieras consultar: ");
        nombre = tec.next();
        System.out.println("");
        System.out.println("Informacion del contacto llamado " + nombre + ": ");
        for (int i = 0; i < contactos.size(); i++) {
            if (contactos.get(i).getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("");
                System.out.println("Nombre: " + contactos.get(i).getNombre());
                System.out.println("Telefono: " + contactos.get(i).getNumero());
                System.out.println("Email: " + contactos.get(i).getEmail());
            }
        }
        System.out.println("");
        System.out.println("Si quiere Ingresar un nuevo Contacto Digite - 1");
        System.out.println("Si quiere volver a Consultar un Contacto Digite - 2");
        System.out.println("Si desea salir del programa Digite - 0");
        Option = tec.nextInt();

    }
}
