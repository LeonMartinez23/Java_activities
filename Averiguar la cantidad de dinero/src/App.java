import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {

        //Ingreso de datos
        Scanner N = new Scanner(System.in);
        float G,L,J,t;

        //Guardando de N dolares
        System.out.println("N dolares: ");
        G = N.nextFloat();

        //Operaciones
        L = G/2;
        J = (3*G)/4;
        t=G+L+J;

        System.out.println("el dinero de guillermo es: "+G);
        System.out.println("el dinero de Luis es: "+L);
        System.out.println("el dinero de juan es: "+J);
        System.out.println("La suma es: "+t);


    }
}
