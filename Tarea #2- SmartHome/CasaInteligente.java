import java.util.Scanner;
public class CasaInteligente {
    private Foco foco;
    private Television television;
    private Cerradura cerradura;
    private Bocinas bocinas;
    private Persiana persiana;
    private Control control;
    public CasaInteligente(Foco foco, Television television,
                           Cerradura cerradura, Bocinas bocinas,
                           Persiana persiana, Control control) {
        this.foco = foco;
        this.television = television;
        this.cerradura = cerradura;
        this.bocinas = bocinas;
        this.persiana = persiana;
        this.control = control;
    }
    public void verEstadoActual() {
        System.out.println("\n--- ESTADO ACTUAL DE LA CASA ---");
        foco.verEstadoActual();
        television.verEstadoActual();
        cerradura.verEstadoActual();
        bocinas.verEstadoActual();
        persiana.verEstadoActual();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Foco foco = new Foco("Sala", 12);
        Television television = new Television("Netflix", 120);
        Cerradura cerradura = new Cerradura("Puerta principal", 1234);
        Bocinas bocinas = new Bocinas("Musica", 100);
        Persiana persiana = new Persiana("Sala");
        Control control = new Control();
        control.registrarFoco(foco);
        control.registrarTelevision(television);
        control.registrarCerradura(cerradura);
        control.registrarBocinas(bocinas);
        control.registrarPersiana(persiana);
        CasaInteligente casa = new CasaInteligente(
            foco, television, cerradura, bocinas, persiana, control
        );
        int opcion;
        do {
            System.out.println("\n============================");
            System.out.println("         SMART HOME");
            System.out.println("============================");
            System.out.println("1. Modo Bienvenida");
            System.out.println("2. Modo Noche");
            System.out.println("3. Modo Fiesta");
            System.out.println("4. Ver estado actual");
            System.out.println("0. Salir");
            System.out.print("Selecciona una opcion: ");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("Ingresa el PIN: ");
                    int pin = scanner.nextInt();
                    control.modoBienvenida(pin);
                    casa.verEstadoActual();
                    break;
                case 2:
                    control.modoNoche();
                    casa.verEstadoActual();
                    break;
                case 3:
                    control.modoFiesta();
                    casa.verEstadoActual();
                    break;
                case 4:
                    casa.verEstadoActual();
                    break;
                case 0:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        } while (opcion != 0);
        scanner.close();
    }
}