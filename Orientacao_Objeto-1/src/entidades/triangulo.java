package entidades;

public class triangulo {
	
	public double medida_1;
	public double medida_2;
	public double medida_3;
	
	public double area() {
		double aux = (medida_1 + medida_2 + medida_3) / 2.0;
		return Math.sqrt(aux * (aux - medida_1) * (aux - medida_2) * (aux - medida_3));	
	}
}
