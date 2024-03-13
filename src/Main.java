import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите выражение: ");
        String input = scanner.nextLine();
        String output = calc(input);
        System.out.println("Ответ: " + output);
    }


    public static String calc(String input) throws Exception {
        String operands = getOperands(input);
        int[] arrayOperators = convertStrings(input);
        int result = 0;
        switch (operands) {
            case "+":
                result = arrayOperators[0] + arrayOperators[1];
                break;
            case "-":
                result = arrayOperators[0] - arrayOperators[1];
                break;
            case "*":
                result = arrayOperators[0] * arrayOperators[1];
                break;
            default:
                result = arrayOperators[0] / arrayOperators[1];
        }
            return String.valueOf(result);
    }


    private static String getOperands(String str) {
        String operand = null;
        if (str.contains("+")) {
            operand = "+";
        } else if (str.contains("-")) {
            operand = "-";
        } else if (str.contains("*")) {
            operand = "*";
        } else {
            operand = "/";
        }
        return operand;
    }


    private static int[] convertStrings(String str) throws Exception {
        String[] arrayStrings = str.replaceAll(" ", "").split("[+\\-*/]");
        int operatorFirst;
        int operatorSecond;

        if (arrayStrings.length > 2) {
            throw new Exception("Формат математической операции не удовлетворяет заданию: \n Два операнда и один оператор (+, -, /, *)\")");
        } else if (arrayStrings.length < 2) {
            throw new Exception("Строка не является математической операцией.");
        }

        operatorFirst = Integer.parseInt(arrayStrings[0]);
        operatorSecond = Integer.parseInt(arrayStrings[1]);

        if ((operatorFirst < 1 || operatorFirst > 10) || (operatorSecond < 1 || operatorSecond > 10)) {
            throw new Exception("Калькулятор должен принимать на вход числа от 1 до 10 включительно, не более.");
        }

        int[] arrayInts = {operatorFirst, operatorSecond};
        return arrayInts;
    }
}
