package test.task.ecobike.service.console;

import java.util.Scanner;
import org.springframework.stereotype.Component;

@Component
public class ConsoleInputChecker {
    public Long readLongFromScanner(Scanner input) {
        String str;
        while (true) {
            str = input.nextLine();
            if (str.matches("[1-9][0-9]*")) {
                return Long.parseLong(str);
            } else {
                System.out.println("Incorrect input\n"
                        + "Please enter positive number without any other symbols");
            }
        }
    }

    public Boolean readBooleanFromScanner(Scanner input) {
        String str;
        while (true) {
            str = input.nextLine();
            if (str.equals("true") || str.equals("false")) {
                return Boolean.parseBoolean(str);
            } else {
                System.out.println("Incorrect input\nPlease enter \"true\" or \"false\"");
            }
        }
    }
}
