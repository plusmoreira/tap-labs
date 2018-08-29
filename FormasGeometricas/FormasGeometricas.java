
import java.lang.Math;


class FormaGeometrica {
	protected double area;

	public double imprimeArea(){
		System.out.println("Área: "+area);
		return area;
	}
}

class Circulo extends FormaGeometrica {
	private double raio;

	public Circulo(double raio){
		this.raio = raio;
	}

	public void calculaArea(){
		area = Math.PI*(raio*raio);
	}

}

class Retangulo extends FormaGeometrica {
	private double base, altura;

	public Retangulo(double base, double altura){
		this.base = base;
		this.altura = altura;
	}

	public void calculaArea(){
		area = base * base;
	}
}

class Quadrado extends FormaGeometrica {
	private double lado;

	public Quadrado(double lado){
		this.lado = lado;
	}

	public void calculaArea(){
		area = lado*lado;
	}
}

class Programa {
		
	public static void main(String[] args) {
		
		Circulo c = new Circulo(2);
		c.calculaArea();
		System.out.println(c.area);
		c.imprimeArea();

		Retangulo r = new Retangulo(2,4);
		r.calculaArea();
		r.imprimeArea();
		Quadrado q = new Quadrado(4);
		q.calculaArea();
		q.imprimeArea();
	}
}