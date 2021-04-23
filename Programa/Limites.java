import java.util.Scanner;

public class Limites{

  public static void main (String[] argv){

  int num1, num2;

  Scanner leer=new Scanner (System.in);   //Variable para leer los datos

  System.out.println("Ingrese el numero de partida:");
  num1=leer.nextInt();
  System.out.println("Ingrese el numero limite:");
  num2=leer.nextInt();

  System.out.println("NUMEROS PARES");
  for (int i=num1; i<=num2; i++){
    if (i%2==0){
      System.out.println(" "+i);
    }
  } //Cierre for

  System.out.println("NUMEROS IMPARES");
  int j;
  j=num1;
  while (j<=num2){
    if (j%2!=0){
    System.out.println(" "+j);
    }
  j++;  
  } //Cierre while

  } //Cierre main
} //Ciere clase