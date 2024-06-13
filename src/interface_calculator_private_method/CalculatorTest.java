package interface_calculator_private_method;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator300 newCalculator = new Calculator300();
        newCalculator.run();

        var num1 = 5;
        var num2 = 7;
        var num3 = 12;


        var result1= newCalculator.add(num1,num2);
        var result2= newCalculator.subtract(num3,num2);

        System.out.println("If you add " + num1 + " and " + num2 + " than you will have = " + result1);
        System.out.println("If you substract " + num3 + " and " + num2 + " than you will have = " + result2);
    }
}
