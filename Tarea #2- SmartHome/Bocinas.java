public class Bocinas {
    private boolean encendidas;
    private int volumen;
    private String modoAudio;
    private double potencia;
    public Bocinas(String modoAudio, double potencia) {
        this.modoAudio = modoAudio;
        this.potencia = potencia;
        this.encendidas = false;
        this.volumen = 20;
    }
    public void encender() {
        encendidas = true;
    }

    public void apagar() {
        encendidas = false;
        volumen = 0;
    }
    public void cambiarVolumen(int volumen) {
        if (volumen >= 0 && volumen <= 100) {
            this.volumen = volumen;

            if (volumen > 0) {
                encendidas = true;
            }
        } else {
            System.out.println("El volumen debe estar entre 0 y 100.");
        }
    }
    public void cambiarModoAudio(String modoAudio) {
        this.modoAudio = modoAudio;
    }
    public double calcularConsumo(double horas) {
        if (!encendidas) {
            return 0;
        }

        return (potencia * horas) / 1000;
    }
    public void verEstadoActual() {
        System.out.println(
            "Bocinas | Estado=[" + (encendidas ? "ENCENDIDAS" : "APAGADAS") +
            "] | Volumen=[" + volumen +
            "] | Modo=[" + modoAudio +
            "] | Potencia=[" + potencia + " W]"
        );
    }
}