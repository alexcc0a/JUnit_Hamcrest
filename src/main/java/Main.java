public class Main {

    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        try {
            int a = calc.plus.apply(2, 4);
            int b = calc.minus.apply(8, 8);
            int c = calc.divide.apply(a, b);
            calc.println.accept(c);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка! Деление на 0");
        }
    }
}
