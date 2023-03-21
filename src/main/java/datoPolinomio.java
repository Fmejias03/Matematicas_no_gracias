public class datoPolinomio {

    public float termino;
    public int grado;

    public datoPolinomio(float termino, int grado) {
        this.termino = termino;
        this.grado = grado;
    }

    public float getTermino() {
        return termino;
    }

    public void setTermino(float termino) {
        this.termino = termino;
    }

    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }

    public String toString() {
        return "datoPolinomio{" +
                "termino=" + termino +
                ", grado=" + grado +
                '}';
    }

}
