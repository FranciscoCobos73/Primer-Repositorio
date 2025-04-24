package ejpraccalculadoraplusplus;

//Pull en rama local
import java.util.Scanner; //Importo el paquete de Java para poder introudcir datos desde la consola.

public class EjPracCalculadoraPLUSPLUS {

   
    public static void main(String[] args) {
        System.out.println("Bienvenido a la calculadora plus plus"); 
        Scanner teclado = new Scanner(System.in); //Creo la variable teclado
        boolean infinito = true; //Creo una variable booleana la llamo infinito y le doy el valor true.
        
        //En este bucle de do while, va a correr la calculadora mientras infinito == true! OJO == !
        do {
        int numero1, numero2, operador, resultado; //Creo las 4 variables necesarias para este caso.
        
       
        System.out.println("Introduce por consola el primer valor");
        numero1 = teclado.nextInt(); //Guardo el nº introducido por consola en numero1.
        
        System.out.println("Introduce por consola el segundo valor");
        numero2 = teclado.nextInt(); //Guardo el nº introducido por consola en numero2.
        // Si hubiera puesto aquí el do estaría mejor porque se saltaría CREO.
        System.out.println("Elige el tipo de operación que quieres realizar");
        System.out.println("Pulsa 1 para sumar");
        System.out.println("Pulsa 2 para restar");
        System.out.println("Pulsa 3 para multiplicar");
        System.out.println("Pulsa 4 para dividir");
        System.out.println("Pulsa 5 para sacar el resto");
            System.out.println("Pulsa 7 para salir");
        operador = teclado.nextInt();
        //Guardo el nº introducido por consola en operador.
        //Uso el switch; y el condicionante sería la variable operador. Si el operador
        // vale 1 hace +, si vale 2 hace - .... Si pulsamos 7 damos a la variable booleana
        // el valor infinito= false... En ese caso, no se cumple el while y cierra el programa.
        switch (operador) {
            case 1:
                resultado = numero1 + numero2;
                System.out.println("El resultado es " + resultado);
                break;
            case 2:
                resultado = numero1 - numero2;
                System.out.println("El resultado es " + resultado);
                break;
            case 3:
                resultado = numero1 * numero2;
                System.out.println("El resultado es " + resultado);
                break;
            case 4:
                resultado = numero1 / numero2;
                System.out.println("El resultado es " + resultado);
                break;
            case 5:
                resultado = numero1 % numero2;
                System.out.println("El resultado es " + resultado);
                break;
            
          case 7:
                infinito = false;
                System.out.println("Has terminado con la calculadora");
                break;
            }
                
               
                }while (infinito==true); //== ES MUY IMPORTANTE PARA HACER COMPARATIVAS
       
        } 
        
        
    
}

