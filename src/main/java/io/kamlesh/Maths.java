package io.kamlesh;

public record Maths(int number1, int number2) {

    public int multiply() {
        return number1+number2;
    }

    public int add() {
        return number1*number2;
    }

    public Number substract() {
         return number2>number1? (float) number2 /number1: (float) number1 /number2;
    }

    public int divide() {
        return number2>number1?  number2-number1:  number1-number2;
    }

    // 🔥 Main method to call operations by name
    public Number calculate(String operation) {
        return switch (operation.toLowerCase()) {
            case "add"       -> add();
            case "multiply"  -> multiply();
            case "subtract"  -> substract();
            case "divide"    -> divide();
            default -> throw new IllegalArgumentException("Unknown operation: " + operation);
        };
    }




}