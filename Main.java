import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        System.out.print("Введите выражение: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();
        System.out.print("Ответ: " + calc(input));
    }

    public static String calc(String input) throws Exception {
        String operator = getOperator(input);
        int[] operands = getOperands(input);

        switch (operator) {
            case "+":
                return String.valueOf(operands[0] + operands[1]);
            case "-":
                return String.valueOf(operands[0] - operands[1]);
            case "*":
                return String.valueOf(operands[0] * operands[1]);
            default:
                return String.valueOf(operands[0] / operands[1]);
        }
    }


    private static String getOperator(String str) {
        if (str.contains("+")) {
            return "+";
        } else if (str.contains("-")) {
            return "-";
        } else if (str.contains("*")) {
            return "*";
        } else {
            return "/";
        }
    }


    private static int[] getOperands(String str) throws Exception {
        String[] array = str.replaceAll("\\s+", "").split("[+\\-*/]");
        int firstOperand = 0;
        int secondOperand = 0;

        if (array.length != 2) {
            throw new Exception("Формат математической операции не удовлетворяет заданию: \\n Два операнда и один оператор (+, -, /, *)\\\")");
        } else {
            try {
                firstOperand = Integer.parseInt(array[0]);
                secondOperand = Integer.parseInt(array[1]);
            } catch (IllegalArgumentException e) {
                System.err.println("Строка не является математической операцией.");
            }
        }

        if ((firstOperand < 1 || firstOperand > 10) || (secondOperand < 0 || secondOperand > 10)) {
            throw new Exception("Калькулятор должен принимать на вход числа от 1 до 10 включительно.");
        }
        return new int[]{firstOperand, secondOperand};
    }
}
