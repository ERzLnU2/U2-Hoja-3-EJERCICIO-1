/**
 * @author Daw120
 */
package com.solomongo.ejercicio1;
public class Finanzas {
  // Variables   
   private double dolarAEuro;
   private double euroADolar;
 
  // Constructor default QUE INICIALIZA la clase:
   public Finanzas(){}  
     
  // Constructor que OTORGA LOS VALORES, con THIS:
   public Finanzas(double dolarAEuroResult, double euroADolarResult){ //con this se ASIGNA valor AL atributo nombre: 
     this.dolarAEuro=dolarAEuroResult; // (se iguala al parametro del constructor). 
     this.euroADolar=euroADolarResult; // idem: LO QUE CONTENGA ed --> se almacena el atributo: (this.edad)
     }
     public double getDolarAEuro(){return dolarAEuro;}
     public double getEuroADolar(){return euroADolar;}
 
  // metodos set, no retornan: mete los datos, modifica atributos de Clase Persona 
  public void setDolarAEuro(double dolarAEuro){
     this.dolarAEuro=dolarAEuro; //dice que el atributo nom: se almacena en el primero: nombre.
     }
 
   public void setEuroADolar(double euroADolar) //dice que el atributo es: 
   {
   this.euroADolar=euroADolar;//se almacena en el primero: edad.
   } 
    
}
