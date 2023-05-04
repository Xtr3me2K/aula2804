import java.util.Scanner;

public class CalculadoraSimples{

 public static void main(String[] args) {
    

    //Declaração de variáveis
    int n1, n2, total, op;

    //Criação e instância do objeto de entrada
    Scanner entrada = new Scanner(System.in);
do{

    System.out.println("n\t\t\t -- Calculadora Simples -- \n");

    System.out.println("1. Soma");
    System.out.println("2. Subtração");
    System.out.println("3. Multiplicação");
    System.out.println("4. Divisão");
    System.out.println("5. Sair");
    
    System.out.println("Opção: ");
    op = entrada.nextInt();

    if(op == 1){
        System.out.println("\n\t\t\t -- Soma --\n");
    }else if(op == 2){
    System.out.println("\n\t\t\t -- Subtração -- \n");
}else if(op == 3){
    System.out.println("\n\t\t\t -- Multiplicação -- \n");
}else if(op == 4){
    System.out.println("\n\t\t\t -- Divisão -- \n");
    } else if(op == 5){
        System.out.println("Forte abraço!");
    }else{
        System.out.println("Opção" + op + "Incorreta!");
    }

}while(op!=5);

 }
 
}