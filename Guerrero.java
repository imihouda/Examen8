
package Examen8;


public class Guerrero extends Personaje{
 
    private int armadura;
    private String arma;

    public Guerrero(String nombre, int puntosVida, int fuerza, int armadura, String arma) {
        super(nombre, puntosVida, fuerza);
        this.armadura = armadura;
        this.arma = arma;
    }

    public int getArmadura() {
        return armadura;
    }

    public void setArmadura(int armadura) {
        this.armadura = armadura;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public void atacar() {
        System.out.println("El guerrero " + getNombre() + " esta atacando con " + arma + ".");
    }

    public void defender() {
        System.out.println("El guerrero " + getNombre() + " esta defendiendo con una arma de " + arma + ".");
    }
   
    }



