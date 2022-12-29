public class Main {
    public static void main(String[] args) {

        Calculator calc = new Calculator();

        System.out.println(calc.sum(10,30));
        System.out.println(calc.multiplication(10,30));

    }

    static class Calculator {
        public int sum(int n1, int n2){
            return n1 + n2;
        }
        public int multiplication(int n1, int n2){
            return n1 * n2;
        }
    }

}