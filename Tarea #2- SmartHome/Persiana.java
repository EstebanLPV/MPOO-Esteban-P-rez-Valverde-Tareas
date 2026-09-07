public class Persiana {
    private boolean abierta;
    private int nivelApertura;
    private String ubicacion;
    public Persiana(String ubicacion) {
        this.ubicacion = ubicacion;
        this.abierta = false;
        this.nivelApertura = 0;
    }
    public void abrir() {
        abierta = true;
        nivelApertura = 100;
    }
    public void cerrar() {
        abierta = false;
        nivelApertura = 0;
    }
    public void cambiarApertura(int nivelApertura) {
        if (nivelApertura >= 0 && nivelApertura <= 100) {
            this.nivelApertura = nivelApertura;

            if (nivelApertura == 0) {
                abierta = false;
            } else {
                abierta = true;
            }
        } else {
            System.out.println("El nivel de apertura debe estar entre 0 y 100.");
        }
    }
    public int calcularPorcentajeCerrado() {
        return 100 - nivelApertura;
    }
    public void verEstadoActual() {
        System.out.println(
            "Persiana | Ubicacion=[" + ubicacion +
            "] | Estado=[" + (abierta ? "ABIERTA" : "CERRADA") +
            "] | Apertura=[" + nivelApertura + "%]"
        );
    }
}