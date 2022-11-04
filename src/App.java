import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        TrianguloRetangulo triangulo = new TrianguloRetangulo();

        double c1;

        System.out.println("Digite os valores dos catetos:");

        c1 = sc.nextDouble();
        triangulo.setC1(c1);

        triangulo.setC2(sc.nextDouble());

        System.out.println("Área: " + triangulo.calculaArea());
        System.out.println("Hipotenusa: " + triangulo.calculaHipotenusa());

        sc.close();
    }
}
