import java.lang.Math;

public class Retangulo {
    
private double base;
private double altura;

    public Retangulo(double base, double altura){
        this.base=base;
        this.altura=altura;
    }

    public double getBase(){
        return this.base;
    }

    public double getAltura(){
        return this.altura;
    }

    public double getArea(){
        return base*altura;
    }

    public double getPerimetro(){
        return 2*(base + altura);
    }

    public double getDiagonal(){
        return Math.sqrt(Math.pow(base,2) + Math.pow(altura,2));
    }
}
