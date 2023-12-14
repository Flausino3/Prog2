public class Quadrado extends Retangulo {
    
    private double lado;

    public Quadrado(double lado){
        super(lado, lado);
        this.lado=lado;
    }

    public double getDiagonalQuadrado(){
        return lado*Math.sqrt(2);
    }
}
