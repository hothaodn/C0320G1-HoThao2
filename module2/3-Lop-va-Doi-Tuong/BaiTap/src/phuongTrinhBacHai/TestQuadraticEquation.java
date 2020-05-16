package phuongTrinhBacHai;

public class TestQuadraticEquation {
    public static void main(String[] args) {
        QuadraticEquation ptBacHai = new QuadraticEquation();
        ptBacHai.input();
        //System.out.println(ptBacHai.getDiscriminant());
        ptBacHai.getSolution();

        QuadraticEquation ptBacHai2 = new QuadraticEquation(4,4,-8);
        ptBacHai2.getSolution();
    }
}
