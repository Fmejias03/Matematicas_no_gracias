import java.security.PublicKey;
import java.util.Scanner;

public class Polinomio{
 public datoPolinomio terminoMayor;
 public int grado;

    public Polinomio(datoPolinomio terminoMayor, int grado) {
    this.terminoMayor = terminoMayor;
    this.grado = grado;
    }


 public datoPolinomio getTerminoMayor() {
  return terminoMayor;
 }

 public void setTerminoMayor(datoPolinomio terminoMayor) {
  this.terminoMayor = terminoMayor;
 }

 public int getGrado() {
  return grado;
 }

 public void setGrado(int grado) {
  this.grado = grado;
 }

 public void cargarPolinomio() {
  Scanner sc = new Scanner(System.in);
  int grado = this.grado;
  Nodo actual = new Nodo();
  for(int i = grado; i >= 0; i--) {
   System.out.println("Ingrese el coeficiente del término de grado " + i + ":");
   float coeficiente = sc.nextFloat();
   if(coeficiente != 0) {
    datoPolinomio termino = new datoPolinomio(coeficiente, i);
    Nodo siguiente = new Nodo();
    siguiente.setDato(termino);
    actual.setSig(siguiente);
    actual = siguiente;
   }
  }
 }

 public void modificarPolinomio(float termino, int grado) {
  Nodo actual = new Nodo();

  while (actual != null && actual.getDato().getTermino() > termino) {
   actual = actual.getSig();
  }
  if (actual == null || actual.getDato().getTermino() < termino) {
   Nodo nuevo = new Nodo();
   terminoMayor = nuevo.getDato();
  } else {
   actual.getDato().setTermino(termino);
  }
 }

 public double obtenerValor(float termino) {
  double valor = 0;
  Nodo actual = new Nodo();
  while (actual != null) {
   valor += actual.getDato().getTermino() * Math.pow(termino, actual.getDato().getGrado());
   actual = actual.getSig();
  }
  return valor;
 }

 public void sumarPolinomios(Polinomio polinomio) {
  Nodo actual = new Nodo();
  Nodo actual2 = new Nodo();
  while (actual != null && actual2 != null) {
   if (actual.getDato().getGrado() == actual2.getDato().getGrado()) {
    actual.getDato().setTermino(actual.getDato().getTermino() + actual2.getDato().getTermino());
    actual = actual.getSig();
    actual2 = actual2.getSig();
   } else if (actual.getDato().getGrado() > actual2.getDato().getGrado()) {
    actual = actual.getSig();
   } else {
    Nodo nuevo = new Nodo();
    nuevo.setDato(actual2.getDato());
    nuevo.setSig(actual.getSig());
    actual.setSig(nuevo);
    actual = actual.getSig();
    actual2 = actual2.getSig();
   }
  }
  if (actual2 != null) {
   actual.setSig(actual2);
  }
 }

 public void multiplicarPolinomios(Polinomio polinomio) {
  Nodo actual = new Nodo();
  Nodo actual2 = new Nodo();
  while (actual != null) {
   while (actual2 != null) {
    datoPolinomio termino = new datoPolinomio(actual.getDato().getTermino() * actual2.getDato().getTermino(), actual.getDato().getGrado() + actual2.getDato().getGrado());
    Nodo nuevo = new Nodo();
    nuevo.setDato(termino);
    nuevo.setSig(actual.getSig());
    actual.setSig(nuevo);
    actual = actual.getSig();
    actual2 = actual2.getSig();
   }
   actual = actual.getSig();
  }
 }

 public void mostrarContenido() {
  Nodo actual = new Nodo();
  while (actual != null) {
   System.out.println(actual.getDato().getTermino() + "x^" + actual.getDato().getGrado());
   actual = actual.getSig();
  }
 }

 public void eliminarTermino(){
    Nodo actual = new Nodo();
    Nodo anterior = new Nodo();
    while (actual != null) {
     if (actual.getDato().getGrado() == grado) {
        anterior.setSig(actual.getSig());
     }
     anterior = actual;
     actual = actual.getSig();
    }

 }



 public boolean existeTermino(int grado) {
  Nodo actual = new Nodo();
  while (actual != null) {
   if (actual.getDato().getGrado() == grado) {
    return true;
   }
   actual = actual.getSig();
  }
  return false;
 }

 public int calcularGrado() {
  Nodo actual = new Nodo();
  int grado = 0;
  while (actual != null) {
   if (actual.getDato().getGrado() > grado) {
    grado = actual.getDato().getGrado();
   }
   actual = actual.getSig();
  }
  return grado;
 }



}
