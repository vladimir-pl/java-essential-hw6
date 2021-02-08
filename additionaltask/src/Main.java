public class Main {

  public static void main(String[] args) {
    Calculator calculator = new Calculator();

    double add = calculator.addition(2.6, 2.0);
    double sub = calculator.subtraction(2.6, 2.0);
    double mul = calculator.multiplication(2.6, 2.0);
    double div = calculator.division(2.6, 2.0);

    System.out.println(
        "Сложение: " + add + "\n" + "Вычитание: " + sub + "\n" + "Умножение: " + mul + "\n" + "Деление: " + div);
  }
}
