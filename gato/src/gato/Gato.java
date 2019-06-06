
package gato;

public class Gato {

    boolem macho;
    String name;
    int idade;
    int registro;

    public Gato(String n) {
        this.name = n;
    }
    
    
    public void miar(){
        if (idade > 2) {
            System.out.print("miii");
        } else {
            System.out.print("meown");
        }
    }

    public static void main(String[] args) {
      
    }

    private static class boolem {

        public boolem() {
        }
    }
    
}