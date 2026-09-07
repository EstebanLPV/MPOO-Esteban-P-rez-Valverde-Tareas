public class Foco {
    private boolean encendido;
    private int intensidad;
    private double potencia;
    private String ubicacion;
    public Foco(String ubicacion, double potencia) {
        this.ubicacion = ubicacion;
        this.potencia = potencia;
        this.encendido = false;
        this.intensidad = 0;
    }
    public void encender() {
        encendido = true;

        if (intensidad == 0) {
            intensidad = 100;
        }
    }
    public void apagar() {
        encendido = false;
        intensidad = 0;
    }

    public void cambiarIntensidad(int intensidad) {
        if (intensidad >= 0 && intensidad <= 100) {
            this.intensidad = intensidad;

            if (intensidad == 0) {
                encendido = false;
            } else {
                encendido = true;
            }
        } else {
            System.out.println("La intensidad debe estar entre 0 y 100.");
        }
    }
    public double calcularConsumo(double horas) {
        if (!encendido) {
            return 0;
        }

        return (potencia * (intensidad / 100.0) * horas) / 1000;
    }
    public void verEstadoActual() {
        System.out.println(
            "Foco | Ubicacion=[" + ubicacion +
            "] | Estado=[" + (encendido ? "ENCENDIDO" : "APAGADO") +
            "] | Intensidad=[" + intensidad + "%]" +
            " | Potencia=[" + potencia + " W]"
        );
    }
}