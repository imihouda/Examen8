package Examen8;

public class Personaje {
    private String nombre;
    private int puntosDeVida;
    private int  fuerza;

    public Personaje(String nombre, int puntosDeVida, int fuerza) {
        this.nombre = nombre;
        this.puntosDeVida = puntosDeVida;
        this.fuerza = fuerza;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntosDeVida() {
        return puntosDeVida;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPuntosDeVida(int puntosDeVida) {
        this.puntosDeVida = puntosDeVida;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }
   
    public void atacar() {
        System.out.println("El personaje " + nombre + " esta atacando.");
    }

    public void defender() {
        System.out.println("El personaje " + nombre + " esta defendiendo.");
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Puntos de vida: " + puntosDeVida);
        System.out.println("Fuerza: " + fuerza);
    }
}



