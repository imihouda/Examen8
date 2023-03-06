
package Examen8;

public class Mago extends Personaje{
   
    private int magia;
    private String varita;

    public Mago(String nombre, int puntosDeVida, int fuerza, int magia, String varita) {
        super(nombre, puntosDeVida, fuerza);
        this.magia = magia;
        this.varita = varita;
    }

    public int getMagia() {
        return magia;
    }

    public void setMagia(int magia) {
        this.magia = magia;
    }

    public String getVarita() {
        return varita;
    }

    public void setVarita(String varita) {
        this.varita = varita;
    }

    @Override
    public void atacar() {
        System.out.println("El mago " + getNombre() + " lanza una fuerza con su varita " + getVarita() + "!");
    }

    @Override
    public void defender() {
        System.out.println("El mago " + getNombre() + " invoca algo magico para protegerse!");
    }
    public void mostrarInfo(){
        System.out.println("Nombre:" + getNombre ());
        System.out.println("Puntos de vida: " + getPuntosDeVida());
        System.out.println("Fueraza:"+ getFuerza() );
        System.out.println("Magia: " + getMagia());
        System.out.println("Varita:" + getVarita());
    }
 }


    

