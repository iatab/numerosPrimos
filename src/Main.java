import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("---------VERIFICAR SE NUMERO É PRIMO---------");
        System.out.println("insira um numero: ");
        double numeroUsuario = scanner.nextInt();

        // verificar


        double raiz = Math.round(Math.sqrt(numeroUsuario));
        // verifica a raiz do numero escolhido, e este sera o numero maior a ser checado


       ArrayList<Integer> listaNumeros = new ArrayList<>();


        for (int i = 0 ; i < numeroUsuario ; i++) {
            listaNumeros.add(i+1);
        }

        listaNumeros.removeFirst(); // remove o numero 1

       for(int i = 2 ; i<raiz ; i++) {

           for (int b = 0; b < listaNumeros.size(); b++) {

               if (listaNumeros.get(b) % i == 0 && listaNumeros.get(b) != i) {


                   listaNumeros.remove(b);
               }


           }

       }
        System.out.println("Numeros Primos: " + listaNumeros);
        }
    }
