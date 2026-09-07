public class Cerradura {
    private boolean bloqueada;
    private int intentosFallidos;
    private String ubicacion;
    private int pin;
    public Cerradura(String ubicacion, int pin) {
        this.ubicacion = ubicacion;
        this.pin = pin;
        this.bloqueada = true;
        this.intentosFallidos = 0;
    }
    public void bloquear() {
        bloqueada = true;
    }
    public void desbloquear(int pinIngresado) {
        if (pinIngresado == pin) {
            bloqueada = false;
            intentosFallidos = 0;
        } else {
            intentosFallidos++;
            System.out.println("PIN incorrecto.");
        }
    }
    public void cambiarPin(int pinActual, int nuevoPin) {
        if (pinActual == pin) {
            this.pin = nuevoPin;
            System.out.println("PIN cambiado correctamente.");
        } else {
            System.out.println("No se pudo cambiar el PIN.");
        }
    }
    public void verEstadoActual() {
        System.out.println(
            "Cerradura | Ubicacion=[" + ubicacion +
            "] | Estado=[" + (bloqueada ? "BLOQUEADA" : "DESBLOQUEADA") +
            "] | Intentos fallidos=[" + intentosFallidos + "]"
        );
    }
}