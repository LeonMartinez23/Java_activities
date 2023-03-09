import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        float nota1,nota2,nota3,suma;

        //Guardando las 3 notas
        System.out.println("digite tres calificaciones: ");
        nota1 = entrada.nextFloat();
        nota2 = entrada.nextFloat();
        nota3 = entrada.nextFloat();

        suma = nota1+nota2+nota3; //sumamos las 3 notas

        System.out.println("La suma es: "+suma);

    }
} 
