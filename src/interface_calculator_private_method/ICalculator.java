package interface_calculator_private_method;

public interface ICalculator {
    default int add(int a, int b) {
        return calculate(a, b, "+");
    }

    default int subtract(int a, int b) {
        return calculate(a, b, "-");
    }

    // Private method from Java 9 version, not visible for others who use Interface
    // It make possible to do operations for upper 2 public default methods
    private int calculate(int a, int b, String mathematicalOperations ) {
        switch (mathematicalOperations ) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            default:
                throw new IllegalArgumentException("Unknow operation " + mathematicalOperations );
        }
    }


}
