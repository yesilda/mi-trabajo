public class Main {
    public static void main(String[] args) {
        Figura triangulo = new Triangulo(3, 4, 3, 4, 5);
        Figura rectangulo = new Rectangulo(5, 7);
        Figura circulo = new Circulo(4);

        System.out.println(triangulo.getNombre() + " - Área: " + triangulo.calcularArea() + ", Perímetro: " + triangulo.calcularPerimetro());
        System.out.println(rectangulo.getNombre() + " - Área: " + rectangulo.calcularArea() + ", Perímetro: " + rectangulo.calcularPerimetro());
        System.out.println(circulo.getNombre() + " - Área: " + circulo.calcularArea() + ", Perímetro: " + circulo.calcularPerimetro());
    }
}
