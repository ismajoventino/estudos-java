package calculadora;

public class Calculadora {
	
	public double somar (int numero1, int numero2) {
		return numero1 + numero2;
	}
	public double subtrair (int numero1, int numero2) {
		return numero1 - numero2;
		
	}
    public double multiplicar (int numero1, int numero2) {
		return numero1 * numero2;
	}
    public double dividir (int numero1, int numero2) {
    	if (numero2 == 0) {
    		System.out.println("ERRO: Não é possível dividir por 0!");
    	}
	    return (double) numero1 / numero2;
    }
    public double modulo (int numero1, int numero2) {
		return numero1 % numero2;
	}
	
}
