public class Control {
    private Foco foco;
    private Television television;
    private Cerradura cerradura;
    private Bocinas bocinas;
    private Persiana persiana;
    public void registrarFoco(Foco foco) {
        this.foco = foco;
    }
    public void registrarTelevision(Television television) {
        this.television = television;
    }
    public void registrarCerradura(Cerradura cerradura) {
        this.cerradura = cerradura;
    }
    public void registrarBocinas(Bocinas bocinas) {
        this.bocinas = bocinas;
    }
    public void registrarPersiana(Persiana persiana) {
        this.persiana = persiana;
    }
    public void modoBienvenida(int pin) {
        System.out.println("\n--- MODO BIENVENIDA ---");
        foco.encender();
        foco.cambiarIntensidad(80);
        television.encender();
        television.cambiarVolumen(25);
        cerradura.desbloquear(pin);
        bocinas.encender();
        bocinas.cambiarVolumen(30);
        bocinas.cambiarModoAudio("Musica");
        persiana.abrir();
    }
    public void modoNoche() {
        System.out.println("\n--- MODO NOCHE ---");
        foco.cambiarIntensidad(20);
        television.apagar();
        cerradura.bloquear();
        bocinas.apagar();
        persiana.cerrar();
    }
    public void modoFiesta() {
        System.out.println("\n--- MODO FIESTA ---");
        foco.encender();
        foco.cambiarIntensidad(100);
        television.encender();
        television.cambiarAplicacion("YouTube");
        television.cambiarVolumen(0);
        bocinas.encender();
        bocinas.cambiarVolumen(80);
        bocinas.cambiarModoAudio("Musica");
        persiana.cerrar();
    }
    public void verEstadoActual() {
        foco.verEstadoActual();
        television.verEstadoActual();
        cerradura.verEstadoActual();
        bocinas.verEstadoActual();
        persiana.verEstadoActual();
    }
}