
package Examen8;


public class Arquero extends Personaje {
    
    private int punteria;
    private String arco;

    public Arquero(String nombre, int puntosVida, int fuerza, int punteria, String arco) {
        super(nombre, puntosVida, fuerza);
        this.punteria = punteria;
        this.arco = arco;
    }

    public int getPunteria() {
        return punteria;
    }

    public void setPunteria(int punteria) {
        this.punteria = punteria;
    }

    public String getArco() {
        return arco;
    }

    public void setArco(String arco) {
        this.arco = arco;
    }

    public void atacar() {
        System.out.println("El arquero " + getNombre() + " esta atacando con su " + arco + " con una punteria de " + punteria + ".");
    }

    public void defender() {
        System.out.println("El arquero " + getNombre() + " esta defendiendo con su agilidad.");
    }
    
}
