public class Nodo {

   public datoPolinomio dato = null;
    public Nodo sig = null;

    public Nodo() {
        this.dato = dato;
        this.sig = null;
    }

    public datoPolinomio getDato() {
        return dato;
    }

    public void setDato(datoPolinomio dato) {
        this.dato = dato;
    }

    public Nodo getSig() {
        return sig;
    }

    public void setSig(Nodo sig) {
        this.sig = sig;
    }
}
