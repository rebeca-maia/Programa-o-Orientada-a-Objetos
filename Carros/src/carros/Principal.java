
package carros;

public class Principal {
    
   public static void main(String [] args){
       Carro c1 = new Carro();
       c1.potencia= 10;
       c1.nome= "Corcel";
       c1.velocidade= 0;
       
       Carro c2 = new Carro();
       c2.potencia= 15;
       c2.nome= "Carango";
       c2.velocidade= 0;
       
       c1.acelerar();
       c1.acelerar();
       c1.acelerar();
       c1.frear();
       c1.imprimir();
       
       c2.acelerar();
       c2.acelerar();
       c2.imprimir();
    }
}
