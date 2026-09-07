public class Television {
    private boolean encendida;
    private int volumen;
    private String aplicacion;
    private double potencia;
    public Television(String aplicacion, double potencia) {
        this.aplicacion = aplicacion;
        this.potencia = potencia;
        this.encendida = false;
        this.volumen = 20;
    }
    public void encender() {
        encendida = true;
    }

    public void apagar() {
        encendida = false;
    }
    public void cambiarVolumen(int volumen) {
        if (volumen >= 0 && volumen <= 100) {
            this.volumen = volumen;
        } else {
            System.out.println("El volumen debe estar entre 0 y 100.");
        }
    }
    public void cambiarAplicacion(String aplicacion) {
        this.aplicacion = aplicacion;
    }
    public double calcularConsumo(double horas) {
        if (!encendida) {
            return 0;
        }

        return (potencia * horas) / 1000;
    }
    public void verEstadoActual() {
        System.out.println(
            "Television | Estado=[" + (encendida ? "ENCENDIDA" : "APAGADA") +
            "] | Volumen=[" + volumen +
            "] | Aplicacion=[" + aplicacion +
            "] | Potencia=[" + potencia + " W]"
        );
    }
}