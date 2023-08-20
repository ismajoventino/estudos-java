package calculadora;

import java.util.Scanner;

public class TestesCalculadora {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	Calculadora calculadora = new Calculadora();
	
	int num1;
	int num2;
	
    System.out.println("Digite os dois números: ");
    num1 = scan.nextInt();
    num2 = scan.nextInt();
    
    double resultadoSoma = calculadora.somar(num1, num2);
    System.out.println("Resultado Soma: " +resultadoSoma);
    
    double resultadoSubtracao = calculadora.subtrair(num1, num2);
    System.out.println("Resultado Subtração: " +resultadoSubtracao);
    
    double resultadoMultiplicacao = calculadora.multiplicar(num1, num2);
    System.out.println("Resultado Multiplicação: " +resultadoMultiplicacao);

    double resultadoDivisao = calculadora.dividir(num1, num2);
    System.out.println("Resultado Divisão: " +resultadoDivisao);
    
    double resultadoModulo = calculadora.modulo(num1, num2);
    System.out.println("Resultado resto da divisão: " +resultadoModulo);
    	
	scan.close();	
	}

}
