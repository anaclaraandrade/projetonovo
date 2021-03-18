package Programa;

import java.util.Scanner;

import Classes.Conta;
import Classes.TipoOperacao;

public class Programa {
    public static void main(String[] args) {
        Scanner ler = new Scanner(
System.in
);
        Conta conta = new Conta();
        double valor;
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n*******************");
            System.out.println("1 - Saque");
            System.out.println("2 - Depósito");
            System.out.println("3 - Saldo");
            System.out.println("0 - Sair");
            System.out.println("\nDigite a opção desejada;");
            opcao = ler.nextInt();

            switch(opcao){
                case 0:
                  System.out.println("Encerrando a aplicação");
                  return;  
                case 1:
                  System.out.println("Digite o valor a sacar: "); 
                  valor = ler.nextDouble();
                  conta.realizaOperacao(TipoOperacao.SAQUE, valor); 
                  break;
                case 2:
                  System.out.println("Digite o valor a depositar: ");
                  valor = ler.nextDouble();
                  conta.realizaOperacao(TipoOperacao.DEPOSITO, valor);
                  break;
                case 3:
                  conta.realizaOperacao(TipoOperacao.SALDO, 0);
                  break;
                default:
                  System.out.println("Operação inválida. Verifique");  
                    
            }


        }

        ler.close();
        
        
    }
    
}
