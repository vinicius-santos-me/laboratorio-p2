/**
 * Laboratório de Programação 2 - Lab 1
 * * @author Vinicius Santos Sousa - 20250030551
 */
import java.util.Scanner;
public class Prova{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int soma = 0,alunos = 0,acima = 0,abaixo = 0;
    int maior = 0;
    int menor = 0;
   
    while(true){
    String entrada = sc.nextLine();
    if(entrada.equals("-")){
        break;
    }else{
        String[] dados = entrada.split(" ");
        int nota = Integer.parseInt(dados[1]);
        if(alunos == 0 ){
        maior = nota;
        menor = nota;
        }else if(nota > maior){
            maior = nota;
        }else if(nota < menor){
            menor = nota;
        }
        alunos++;
        if(nota >= 700){
            acima++;
        }else{
            abaixo++;
                    }
                }
             }
    if(alunos > 0){
    int media = (soma/alunos);
    System.out.println("maior: " + maior);
    System.out.println("menor: " + menor);
    System.out.println("media: " + media);
    System.out.println("acima: " + acima);
    System.out.println("abaixo: " + abaixo);
        }
    }
}
