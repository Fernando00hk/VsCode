package operaciones.src;
import java.util.Scanner;

public class operaciones {
    protected Scanner teclado;
    protected int valor1;
    protected int valor2;
    protected int resultado;
    
    public operaciones() {
        teclado=new Scanner(System.in);
    }

    public void cargar1() {
        System.out.print("Ingrese el primer valor: ");
        valor1=teclado.nextInt();
    }
    
    public void cargar2() {
        System.out.print("Ingrese el segundo valor: ");
        valor2=teclado.nextInt();
    }
    
    public void mostrarResultado() {
        System.out.println (resultado);
    }
    
    public static class Suma extends operaciones{
        public void operar(){
            resultado=valor1+valor2;
        }
    }
     
    public static class Resta extends operaciones{
        public void operar(){
            resultado=valor1-valor2;
        }
    }
    
    public static class Multiplicacion extends operaciones{
        public void operar(){
            resultado=valor1*valor2;
        }
    }
    
    public static class Division extends operaciones{
        public void operar(){
            resultado=valor1/valor2;
        }
    }
    
    public static class Potencia extends operaciones{
        public void operar(){
            resultado=(int)Math.pow(valor1, valor2);
        }
    }
    
    public static class Prueba {
        public static void main(String[]arg) {
            Suma suma1=new Suma();
            suma1.cargar1();
            suma1.cargar2();
            suma1.operar();
            System.out.print("El resultado de la suma es: ");
            suma1.mostrarResultado();
            Resta resta1=new Resta();
            resta1.cargar1();
            resta1.cargar2();
            resta1.operar();
            System.out.print("El resultado de la resta es: ");
            resta1.mostrarResultado();
            Multiplicacion multiplicacion1=new Multiplicacion();
            multiplicacion1.cargar1();
            multiplicacion1.cargar2();
            multiplicacion1.operar();
            System.out.print("El resultado de la multiplicacion es: ");
            multiplicacion1.mostrarResultado();
            Division division1=new Division();
            division1.cargar1();
            division1.cargar2();
            division1.operar();
            System.out.print("El resultado de la division es: ");
            division1.mostrarResultado();
            Potencia potencia1=new Potencia();
            potencia1.cargar1();
            potencia1.cargar2();
            potencia1.operar();
            System.out.print("El resultado de la potencia es: ");
            potencia1.mostrarResultado();
        }
    }
}