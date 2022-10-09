# -U2-Hoja-3-EJERCICIO-1
Clase Finanzas para programa en JAVA con constructores que devuelve el cambio Euro/Dolar insertado por user.


    1.- Realiza una clase finanzas que convierta dólares a euros y viceversa. 
        Como atributo tiene un número decimal para almacenar a como está el cambio entre ambas monedas.

        Como constructores tiene:

            ✅ Un constructor finanzas() por defecto, el cual establecerá el cambio Dolares a Euros en 1.06.
            ✅ (1 dólar son 1.06 euros).
            ✅ Un constructor finanzas(double), el cual permitirá configurar el cambio dólar a euro.

       Codifica los métodos dolaresToEuros y eurosToDolares. 
       Ambos métodos reciben la cantidad de dinero a cambiar, realizan la conversión de la moneda y devuelven la respuesta. 

       Prueba que dicha clase funciona correctamente haciendo conversiones entre euros y dólares 
       realizando las siguientes acciones:

           ✅ Crea un objeto finanzas denominado finanza con el constructor por defecto.
           ✅ Pide al usuario que te introduzca los dolares que tiene y muestra cuantos euros son.
           ✅ Pide al usuario que te introduzca los euros que tiene y muestra cuantos dolares son.
           ✅ Crea otro objeto finanza2 con el cambio a 1.10 y con los dolares introducidos anteriormente por el usuario muestra cuantos euros son.

```java
import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
      Scanner teclado1 = new Scanner(System.in); 
      float cantidad; 
      System.out.print("\n\n"); 
      System.out.print("Introduce una cantidad de euros: "); 
      cantidad=teclado1.nextFloat(); System.out.print(cantidad);
      System.out.printf("euros (al cambio 1.06)= %,.2f",(cantidad*1.06));
      System.out.print("$.\n\n");
 Finanzas opera=new Finanzas();  
 opera.setDolarAEuro(cantidad*1.06);
 opera.setEuroADolar(cantidad/1.06); 
       Scanner teclado2 = new Scanner(System.in);
       System.out.println("\n\nIntroduce una cantidad de dolares: "); 
       float cantidad2 = teclado2.nextFloat(); System.out.print(cantidad);
       System.out.printf("$ (al cambio 1.06) = %,.2f",(cantidad2/1.06));
       System.out.print("euros.\n");   
 System.out.print(cantidad);      
 System.out.printf("$ (al cambio 1.10) = %,.2f",(cantidad2/1.10));
 System.out.print("euros.\n\n");
    }
}
```
![1](https://user-images.githubusercontent.com/80227002/194757234-9f377b86-1c03-47a2-af75-f3ee11ecac70.png)

```java
public class Finanzas{
   private double dolarAEuro;
   private double euroADolar;
   public Finanzas(){}  
   public Finanzas(double dolarAEuroResult, double euroADolarResult){ 
     this.dolarAEuro=dolarAEuroResult;  
     this.euroADolar=euroADolarResult;}
     public double getDolarAEuro(){return dolarAEuro;}
     public double getEuroADolar(){return euroADolar;} 
     public void setDolarAEuro(double dolarAEuro){
     this.dolarAEuro=dolarAEuro; }
     public void setEuroADolar(double euroADolar)  
     {this.euroADolar=euroADolar;}
}
```
