
package Examen8;

public class WarriorsLeague {
    public static void main(String[] args) {
        Guerrero guerrero1 = new Guerrero("Paul", 100, 20, 15, "Espada");
        Arquero arquero1 = new Arquero("Balmain", 80, 15, 20, "Arco");
        Mago mago1 = new Mago("Andres", 120, 10, 30, "Varita");

        guerrero1.atacar();
        arquero1.defender();
        mago1.atacar();

        System.out.println("Información del Guerrero:");
        guerrero1.mostrarInfo();
        System.out.println();

        System.out.println("Informacion del Arquero:");
        arquero1.mostrarInfo();
        System.out.println();
        
        System.out.print("Informacion del Mago: " );
        mago1.mostrarInfo();
        System.out.println();
   
        Mago mago2 = new Mago("WanWan", 120, 10, 30, "Varita WanWan");

        if (mago1.equals(mago2)) {
            System.out.println("Los magos son iguales");
        } else {
            System.out.println("Los magos son diferentes");
        }
    }
}
    

