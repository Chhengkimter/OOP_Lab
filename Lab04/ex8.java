package Lab04;

public class ex8 {

    public static class BasicMath {
        public double addition(double a, double b) {
            return a + b;
        }

        public double subtract(double a, double b) {
            return a - b;
        }
    }

    public static class AdvancedMath extends BasicMath {
        public double multiply(double a, double b) {
            return a * b;
        }

        public double divide(double a, double b) {
            return a / b;
        }
    }

    public static void main(String[] args) {

        BasicMath bm = new BasicMath();
        System.out.println(bm.addition(6, 9));
        System.out.println(bm.subtract(6, 9));

        AdvancedMath am = new AdvancedMath();
        System.out.println(am.addition(6, 9));
        System.out.println(am.subtract(6, 9));
        System.out.println(am.multiply(6, 9));
        System.out.println(am.divide(6, 9));
    }
}