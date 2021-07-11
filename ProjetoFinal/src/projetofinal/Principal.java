
package projetofinal;

import java.util.Scanner;


public class Principal {
    
    public static void main(String[] args) {
        ProjetoCalculadora calculadora = new ProjetoCalculadora();
        Scanner scan = new Scanner(System.in);
        System.out.println("Escolha Qual Operacão Deseja: (1) Somar, (2) Subtrair, (3) Mutiplicar, (4) Dividir");
        int escolha = scan.nextInt();
        System.out.println("Digite o Primeiro Valor: ");
        double numero1 = scan.nextDouble();
        System.out.println("Digite o Segundo Valor: ");
        double numero2 = scan.nextDouble();
              
         switch(escolha){
                case 1:
                    System.out.println("Somar");
                    double valorSomar = calculadora.somar(numero1, numero2);
        
                    System.out.println("O Valor é: " + valorSomar );
                    break;
                case 2:
                    System.out.println("Subtrair");
                    double valorSubtrair = calculadora.subtrair(numero1, numero2);
        
                    System.out.println("O Valor é: " + valorSubtrair );
                    break; 
                case 3:
                    System.out.println("Mutiplicar");
                    double valorMutiplicar = calculadora.mutiplicar(numero1, numero2);
        
                    System.out.println("O Valor é: " + valorMutiplicar );
                    break;
                case 4:
                    System.out.println("Dividir");
                    double valorDividir = calculadora.dividir(numero1, numero2);
        
                    System.out.println("O Valor é: " + valorDividir );
                    break;    
                default:
                    System.out.println("Opção Invalida");
         }                 
        }
    }

