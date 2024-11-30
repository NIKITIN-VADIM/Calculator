import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        System.out.print("Введите выражение: ");
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String input = reader.readLine();
            System.out.print("Ответ: " + calc(input));
        }
    }

    public static String calc(String input) throws Exception {
        int[] operands = getOperands(input);
        String operator = getOperator(input);

        return switch (operator) {
            case "+" -> String.valueOf(operands[0] + operands[1]);
            case "-" -> String.valueOf(operands[0] - operands[1]);
            case "*" -> String.valueOf(operands[0] * operands[1]);
            default -> String.valueOf(operands[0] / operands[1]);
        };
    }


    private static String getOperator(String str) throws Exception {
        if (str.contains("+")) {
            return "+";
        } else if (str.contains("-")) {
            return "-";
        } else if (str.contains("*")) {
            return "*";
        } else if (str.contains("/")) {
            return "/";
        } else {
            throw new Exception("Доступные операторы: + - * /");
        }
    }


    private static int[] getOperands(String str) throws Exception {
        String[] array = str.replaceAll("\\s+", "").split("[+\\-*/]");
        int firstOperand = 0;
        int secondOperand = 0;


        if (array.length < 2) {
            throw new Exception("Строка не является математической операцией");
        } else if (array.length > 2) {
            throw new Exception("Формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        } else {
            try {
                firstOperand = Integer.parseInt(array[0]);
                secondOperand = Integer.parseInt(array[1]);
            } catch (IllegalArgumentException e) {
                System.err.println("Строка не является математической операцией.");
            }
        }

        if ((firstOperand < 1 || firstOperand > 10) || (secondOperand < 0 || secondOperand > 10)) {
            throw new Exception();
        }
        return new int[]{firstOperand, secondOperand};
    }
}
