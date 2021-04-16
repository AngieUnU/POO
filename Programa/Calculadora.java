import java.util.Scanner;

public class Calculadora{

  public static void Operacion(float a, float b, int op){
    float c;
    if (op==1){
      c=a+b;
      System.out.println("La suma de los dos numeros es: "+c);
    }
    if (op==2){
      c=a-b;
      System.out.println("La resta de los dos numeros es: "+c);
    }
    if (op==3){
      c=a*b;
      System.out.println("La multiplicacion de los dos numeros es: "+c);
    }
    if (op==4){
      c=a/b;
      System.out.println("La division de los dos numeros es: "+c);
    }
	}

  public static void main (String[] argv){
    float num1,num2;
    int operacion;
    System.out.print("Ingrese un valor numerico: ");
    Scanner leer=new Scanner (System.in);   //Variable para leer los datos
    num1=leer.nextInt();
    System.out.print("Ingrese otro valor numerico: ");
    num2=leer.nextInt();
    System.out.println("OPERACIONES QUE PUEDE HACER EN ESTE PROGRAMA: ");
    System.out.println("1. SUMA");
    System.out.println("2. RESTA");
    System.out.println("3. MULTILPLICACION");
    System.out.println("4. DIVISION");
    System.out.print("Ingrese el numero de la operacion que desea realizar: ");
    operacion=leer.nextInt();
    Operacion(num1,num2,operacion);
    
  }
} //Ciere clase