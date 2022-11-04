public class TrianguloRetangulo {
    private double c1;
    private double c2;
    private double h;
    private double area;

    public TrianguloRetangulo() {
        c1 = 0.0;
        c2 = 0.0;
        h = 0.0;
        area = 0.0;
    }

    public TrianguloRetangulo(double c1, double c2, double h, double area) {
        this.c1 = c1;
        this.c2 = c2;
        this.h = h;
        this.area = area;
    }

    public double getC1() {
        return c1;
    }

    public void setC1(double c1) {
        this.c1 = c1;
    }

    public double getC2() {
        return c2;
    }

    public void setC2(double c2) {
        this.c2 = c2;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double calculaArea(){
        this.area = ((this.c1 * this.c2)/2.0);
        return this.area;
    }

    public double calculaHipotenusa(){
        this.h = Math.sqrt((Math.pow(c1, 2)) + (Math.pow(c2, 2)));
        return this.h;
    }
}
