public class Main {

    public static void main(String[] args) {
        Retangulo teste = new Retangulo(5, 10);
        // System.out.println(teste.getArea());
        // System.out.println(teste.getPerimetro());
        // System.out.println(teste.getDiagonal());

        Quadrado teste2 = new Quadrado(5);
        System.out.println(teste2.getBase());
        System.out.println(teste2.getAltura());
        System.out.println(teste2.getPerimetro());
        System.out.println(teste2.getArea());
        System.out.println(teste2.getDiagonalQuadrado());

    }
}