
package gato;

public class Gato {

    boolem macho;
    String name;
    int idade;
    Gato raça;
    int registro;

    public Gato(String n) {
        this.name = n;
    }
    
    
    public Gato(){
        if (idade > 2) {
            System.out.print("miii");
        } else {
            System.out.print("meown");
        }
    }

    public static void main(String[] args) {
      
    }

}
