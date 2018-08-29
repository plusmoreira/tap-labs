import java.util.Scanner;

class Calculadora{
	private double resultado, num1, num2;
	private Scanner s;

	public void operar(double num1, double num2, String operacao){
		this.num1 = num1;
		this.num2 = num2;
	 	switch (operacao) {
	 		case "+": add(); break;
	 		case "-": sub(); break;
	 		case "*": mul(); break;
	 		case "/": div(); break;
	 	}
	 	imprimirResultado();
	}

	private void add(){
		System.out.println(num1+"+"+num2);
		this.resultado = num1+num2;
	}
	
	private void sub(){
			System.out.println(num1+"-"+num2);
			this.resultado = num1+num2;
		}
		
	private void mul(){
			System.out.println(num1+"*"+num2);
			this.resultado = num1*num2;
		}
		
	private void div(){
			System.out.println(num1+"/"+num2);
			this.resultado = num1/num2;
		}

	public void imprimirResultado(){
		System.out.println("resultado: "+resultado);
	}
}


class Programa{
	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		calc.operar(45,56,"+");
		calc.operar(45,56,"-");
		calc.operar(45,56,"*");
		calc.operar(45,56,"/");
	}
}