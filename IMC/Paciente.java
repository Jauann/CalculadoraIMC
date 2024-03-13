
public class Paciente {
	double calcularIMC;
	double diagnostico;
	String nome;
	
	public Paciente(String nome,double peso, double altura ){
		this.nome = nome;
		calcularIMC = peso/(altura*altura);
	}
		
	void diagnostico() {
			if (calcularIMC < 16)
	            System.out.println (nome + ", Voce esta com um IMC de " + String.format("%.2f", calcularIMC) + " Kg, e esta com peso muito grave! ");
			else if (calcularIMC < 17)
	                System.out.println (nome + ", Voce esta com um IMC de " + String.format("%.2f", calcularIMC) + " Kg, e esta com Baixo peso grave!");
	        else if (calcularIMC < 18.50)
	                System.out.println (nome + ", Voce esta com um IMC de " + String.format("%.2f", calcularIMC) + " Kg, e esta com baixo peso!");
	        else if ((calcularIMC >= 18.50) &&(calcularIMC < 25))
		                System.out.println (nome + ", Voce esta com um IMC de " + String.format("%.2f", calcularIMC) + " Kg, e esta com peso normal!");
		    else if ((calcularIMC >= 25) &&(calcularIMC < 30))
	                System.out.println (nome + ", Voce esta com um IMC de " + String.format("%.2f", calcularIMC) + " Kg, e esta com Sobrepeso!");
	        else if ((calcularIMC >= 30) &&(calcularIMC < 35))
	                System.out.println (nome + ", Voce esta com um IMC de " + String.format("%.2f", calcularIMC) + " Kg, e esta com Obesidade e grau I!");
		    else if ((calcularIMC >= 35) &&(calcularIMC < 40))
	                System.out.println (nome + ", Voce esta com um IMC de " + String.format("%.2f", calcularIMC) + " Kg, e esta com Obesidade grau II!");
	        else if	(calcularIMC >= 40)
	                System.out.println (nome + ", Voce esta com um IMC de " + String.format("%.2f", calcularIMC) + " Kg, e esta com Obesidade grau III(obesidade morbida!");
	        	
	}
}
