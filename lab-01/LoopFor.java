/**
 * Laboratório de Programação 2 - Lab 1
 * * @author Vinicius Santos Sousa - 20250030551
 */
public class LoopFor{
    public static void main(String args[]){
        String linha = "Olá mundo!"; 
        for (String palavra : linha.split(" ")) {
    System.out.println("Palavra: " + palavra);
        }
    }
}
