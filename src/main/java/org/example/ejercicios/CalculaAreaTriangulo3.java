package org.example.ejercicios;

public class CalculaAreaTriangulo3 {
	public static void main(String[] args) {
		Triangulo triangulo = new Triangulo("rojo", 5.0D, 4.0D);
		double areaTriangulo = calcularAreaTriangulo(triangulo);

		System.out.println("Altura del triángulo: " + triangulo.getAltura());
		System.out.println("Base del triángulo: " + triangulo.getBase());
		System.out.println("Área del triángulo: " + areaTriangulo);
	}

	public static double calcularAreaTriangulo(Triangulo triangulo) {
		double base = triangulo.getBase();
		double altura = triangulo.getAltura();
		double area = 0.5 * base * altura;
		return area;
	}

	record Triangulo(String color, double base, double altura) {
		public double getBase() {
			return base;
		}

		public double getAltura() {
			return altura;
		}
	}
}
