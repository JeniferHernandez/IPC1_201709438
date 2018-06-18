import java.util.Random;
public class Dado {
   
    public int valorTira;
    public int calcularnu(){
        
        Random Generar = new Random();
        valorTira = Generar.nextInt(6)+1;
        
        return valorTira;
    }
}
