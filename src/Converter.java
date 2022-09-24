import java.util.Scanner;

public class Converter {

    public static void convertUnits(String value, String inputUnit1, String inputUnit2) {
        double convertedValue = 0;
        double inputValue = 0;
        String startingUnit = inputUnit1.toLowerCase(); // allows the input units to be case-insensitive
        String desiredUnit = inputUnit2.toLowerCase(); // however, the result is displayed with the same capitalization
                                                       // as the user input
        try {
            inputValue = Double.parseDouble(value);
        } catch (Exception ex) {
            System.out.println("Invalid value entered! Please input a double (decimal number)!");
            return;
        } // ensure that the user input a valid number value

        // When first writing the code for converting the units, the type of measurement
        // written was length.
        // At that point, it had not been determined that the program would allow the
        // user to convert to
        // the same unit that the user started with (example: cm to cm).
        // This is why the cases in the nested switch statement do not have a fixed
        // order for units of length,
        // with the unit which is same as the starting unit being the case directly
        // before the default.
        switch (startingUnit) {
            case "km":
                switch (desiredUnit) {
                    case "m":
                        convertedValue = inputValue * 1000;
                        break;
                    case "cm":
                        convertedValue = inputValue * 1000 * 100;
                        break;
                    case "mm":
                        convertedValue = inputValue * 1000 * 1000;
                        break;
                    case "in":
                        convertedValue = inputValue * 1000 * 100 / 2.54;
                        break;
                    case "ft":
                        convertedValue = inputValue * 1000 * 100 / 2.54 / 12.0;
                        break;
                    case "yd":
                        convertedValue = inputValue * 1000 * 100 / 2.54 / 36.0;
                        break;
                    case "mi":
                        convertedValue = inputValue * 1000 * 100 / 2.54 / 12.0 / 5280.0;
                        break;
                    case "km":
                        convertedValue = inputValue;
                        break;
                    default:
                        System.out.println("Invalid desired unit entered!");
                        System.out.println("Please type \"help\" to see a list of all accepted units!");
                        return;
                }
                break;
            case "m":
                switch (desiredUnit) {
                    case "km":
                        convertedValue = inputValue / 1000.0;
                        break;
                    case "cm":
                        convertedValue = inputValue * 100;
                        break;
                    case "mm":
                        convertedValue = inputValue * 1000;
                        break;
                    case "in":
                        convertedValue = inputValue * 100 / 2.54;
                        break;
                    case "ft":
                        convertedValue = inputValue * 100 / 2.54 / 12.0;
                        break;
                    case "yd":
                        convertedValue = inputValue * 100 / 2.54 / 36.0;
                        break;
                    case "mi":
                        convertedValue = inputValue * 100 / 2.54 / 12.0 / 5280.0;
                        break;
                    case "m":
                        convertedValue = inputValue;
                        break;
                    default:
                        System.out.println("Invalid desired unit entered!");
                        System.out.println("Please type \"help\" to see a list of all accepted units!");
                        return;
                }
                break;
            case "cm":
                switch (desiredUnit) {
                    case "km":
                        convertedValue = inputValue / 1000.0 / 100.0;
                        break;
                    case "m":
                        convertedValue = inputValue / 100.0;
                        break;
                    case "mm":
                        convertedValue = inputValue * 10;
                        break;
                    case "in":
                        convertedValue = inputValue / 2.54;
                        break;
                    case "ft":
                        convertedValue = inputValue / 2.54 / 12.0;
                        break;
                    case "yd":
                        convertedValue = inputValue / 2.54 / 36.0;
                        break;
                    case "mi":
                        convertedValue = inputValue / 2.54 / 12.0 / 5280.0;
                        break;
                    case "cm":
                        convertedValue = inputValue;
                        break;
                    default:
                        System.out.println("Invalid desired unit entered!");
                        System.out.println("Please type \"help\" to see a list of all accepted units!");
                        return;
                }
                break;
            case "mm":
                switch (desiredUnit) {
                    case "km":
                        convertedValue = inputValue / 1000.0 / 1000.0;
                        break;
                    case "m":
                        convertedValue = inputValue / 1000.0;
                        break;
                    case "cm":
                        convertedValue = inputValue / 10.0;
                        break;
                    case "in":
                        convertedValue = inputValue / 10.0 / 2.54;
                        break;
                    case "ft":
                        convertedValue = inputValue / 10.0 / 2.54 / 12.0;
                        break;
                    case "yd":
                        convertedValue = inputValue / 10.0 / 2.54 / 36.0;
                        break;
                    case "mi":
                        convertedValue = inputValue / 10.0 / 2.54 / 12.0 / 5280.0;
                        break;
                    case "mm":
                        convertedValue = inputValue;
                        break;
                    default:
                        System.out.println("Invalid desired unit entered!");
                        System.out.println("Please type \"help\" to see a list of all accepted units!");
                        return;
                }
                break;
            case "in":
                switch (desiredUnit) {
                    case "km":
                        convertedValue = inputValue * 2.54 / 100 / 1000;
                        break;
                    case "m":
                        convertedValue = inputValue * 2.54 / 100;
                        break;
                    case "cm":
                        convertedValue = inputValue * 2.54;
                        break;
                    case "mm":
                        convertedValue = inputValue * 2.54 * 10.0;
                        break;
                    case "ft":
                        convertedValue = inputValue / 12.0;
                        break;
                    case "yd":
                        convertedValue = inputValue / 36.0;
                        break;
                    case "mi":
                        convertedValue = inputValue / 12.0 / 5280.0;
                        break;
                    case "in":
                        convertedValue = inputValue;
                        break;
                    default:
                        System.out.println("Invalid desired unit entered!");
                        System.out.println("Please type \"help\" to see a list of all accepted units!");
                        return;
                }
                break;
            case "ft":
                switch (desiredUnit) {
                    case "km":
                        convertedValue = inputValue * 12.0 * 2.54 / 100 / 1000;
                        break;
                    case "m":
                        convertedValue = inputValue * 12.0 * 2.54 / 100;
                        break;
                    case "cm":
                        convertedValue = inputValue * 12.0 * 2.54;
                        break;
                    case "mm":
                        convertedValue = inputValue * 12.0 * 2.54 * 10.0;
                        break;
                    case "in":
                        convertedValue = inputValue * 12.0;
                        break;
                    case "yd":
                        convertedValue = inputValue / 3.0;
                        break;
                    case "mi":
                        convertedValue = inputValue / 5280.0;
                        break;
                    case "ft":
                        convertedValue = inputValue;
                        break;
                    default:
                        System.out.println("Invalid desired unit entered!");
                        System.out.println("Please type \"help\" to see a list of all accepted units!");
                        return;
                }
                break;
            case "yd":
                switch (desiredUnit) {
                    case "km":
                        convertedValue = inputValue * 36.0 * 2.54 / 100 / 1000;
                        break;
                    case "m":
                        convertedValue = inputValue * 36.0 * 2.54 / 100;
                        break;
                    case "cm":
                        convertedValue = inputValue * 36.0 * 2.54;
                        break;
                    case "mm":
                        convertedValue = inputValue * 36.0 * 2.54 * 10.0;
                        break;
                    case "in":
                        convertedValue = inputValue * 36.0;
                        break;
                    case "ft":
                        convertedValue = inputValue * 3.0;
                        break;
                    case "mi":
                        convertedValue = inputValue * 3.0 / 5280.0;
                        break;
                    case "yd":
                        convertedValue = inputValue;
                        break;
                    default:
                        System.out.println("Invalid desired unit entered!");
                        System.out.println("Please type \"help\" to see a list of all accepted units!");
                        return;
                }
                break;
            case "mi":
                switch (desiredUnit) {
                    case "km":
                        convertedValue = inputValue * 5280.0 * 12.0 * 2.54 / 100 / 1000;
                        break;
                    case "m":
                        convertedValue = inputValue * 5280.0 * 12.0 * 2.54 / 100;
                        break;
                    case "cm":
                        convertedValue = inputValue * 5280.0 * 12.0 * 2.54;
                        break;
                    case "mm":
                        convertedValue = inputValue * 5280.0 * 12.0 * 2.54 * 10.0;
                        break;
                    case "in":
                        convertedValue = inputValue * 5280.0 * 12.0;
                        break;
                    case "ft":
                        convertedValue = inputValue * 5280.0;
                        break;
                    case "yd":
                        convertedValue = inputValue * 5280.0 / 3.0;
                        break;
                    case "mi":
                        convertedValue = inputValue;
                        break;
                    default:
                        System.out.println("Invalid desired unit entered!");
                        System.out.println("Please type \"help\" to see a list of all accepted units!");
                        return;
                }
                break;

            case "mg":
                switch (desiredUnit) {
                    case "mg":
                        convertedValue = inputValue;
                        break;
                    case "g":
                        convertedValue = inputValue / 1000.0;
                        break;
                    case "kg":
                        convertedValue = inputValue / 1000.0 / 1000.0;
                        break;
                    case "oz":
                        convertedValue = inputValue / 1000.0 / 1000.0 * 2.20462 * 16;
                        break;
                    case "lb":
                        convertedValue = inputValue / 1000.0 / 1000.0 * 2.20462;
                        break;
                    default:
                        System.out.println("Invalid desired unit entered!");
                        System.out.println("Please type \"help\" to see a list of all accepted units!");
                        return;
                }
                break;
            case "g":
                switch (desiredUnit) {
                    case "mg":
                        convertedValue = inputValue * 1000.0;
                        break;
                    case "g":
                        convertedValue = inputValue;
                        break;
                    case "kg":
                        convertedValue = inputValue / 1000.0;
                        break;
                    case "oz":
                        convertedValue = inputValue / 1000.0 * 2.20462 * 16;
                        break;
                    case "lb":
                        convertedValue = inputValue / 1000.0 * 2.20462;
                        break;
                    default:
                        System.out.println("Invalid desired unit entered!");
                        System.out.println("Please type \"help\" to see a list of all accepted units!");
                        return;
                }
                break;
            case "kg":
                switch (desiredUnit) {
                    case "mg":
                        convertedValue = inputValue * 1000.0 * 1000.0;
                        break;
                    case "g":
                        convertedValue = inputValue * 1000.0;
                        break;
                    case "kg":
                        convertedValue = inputValue;
                        break;
                    case "oz":
                        convertedValue = inputValue * 2.20462 * 16;
                        break;
                    case "lb":
                        convertedValue = inputValue * 2.20462;
                        break;
                    default:
                        System.out.println("Invalid desired unit entered!");
                        System.out.println("Please type \"help\" to see a list of all accepted units!");
                        return;
                }
                break;
            case "oz":
                switch (desiredUnit) {
                    case "mg":
                        convertedValue = inputValue / 16.0 / 2.20462 * 1000.0 * 1000.0;
                        break;
                    case "g":
                        convertedValue = inputValue / 16.0 / 2.20462 * 1000.0;
                        break;
                    case "kg":
                        convertedValue = inputValue / 16.0 / 2.20462;
                        break;
                    case "oz":
                        convertedValue = inputValue;
                        break;
                    case "lb":
                        convertedValue = inputValue / 16.0;
                        break;
                    default:
                        System.out.println("Invalid desired unit entered!");
                        System.out.println("Please type \"help\" to see a list of all accepted units!");
                        return;
                }
                break;
            case "lb":
                switch (desiredUnit) {
                    case "mg":
                        convertedValue = inputValue / 2.20462 * 1000.0 * 1000.0;
                        break;
                    case "g":
                        convertedValue = inputValue / 2.20462 * 1000.0;
                        break;
                    case "kg":
                        convertedValue = inputValue / 2.20462;
                        break;
                    case "oz":
                        convertedValue = inputValue * 16.0;
                        break;
                    case "lb":
                        convertedValue = inputValue;
                        break;
                    default:
                        System.out.println("Invalid desired unit entered!");
                        System.out.println("Please type \"help\" to see a list of all accepted units!");
                        return;
                }
                break;

            case "f":
                switch (desiredUnit) {
                    case "f":
                        convertedValue = inputValue;
                        break;
                    case "c":
                        convertedValue = (inputValue - 32) * (5.0 / 9.0);
                        break;
                    case "k":
                        convertedValue = ((inputValue - 32) * (5.0 / 9.0)) + 273.15;
                        break;
                    default:
                        System.out.println("Invalid desired unit entered!");
                        System.out.println("Please type \"help\" to see a list of all accepted units!");
                        return;
                }
                break;
            case "c":
                switch (desiredUnit) {
                    case "f":
                        convertedValue = ((9.0 / 5.0) * inputValue) + 32;
                        break;
                    case "c":
                        convertedValue = inputValue;
                        break;
                    case "k":
                        convertedValue = inputValue + 273.15;
                        break;
                    default:
                        System.out.println("Invalid desired unit entered!");
                        System.out.println("Please type \"help\" to see a list of all accepted units!");
                        return;
                }
                break;
            case "k":
                switch (desiredUnit) {
                    case "f":
                        convertedValue = ((9.0 / 5.0) * (inputValue - 273.15)) + 32;
                        break;
                    case "c":
                        convertedValue = inputValue - 273.15;
                        break;
                    case "k":
                        convertedValue = inputValue;
                        break;
                    default:
                        System.out.println("Invalid desired unit entered!");
                        System.out.println("Please type \"help\" to see a list of all accepted units!");
                        return;
                }
                break;

            case "ms":
                switch (desiredUnit) {
                    case "ms":
                        convertedValue = inputValue;
                        break;
                    case "s":
                        convertedValue = inputValue / 1000.0;
                        break;
                    case "min":
                        convertedValue = inputValue / 1000.0 / 60.0;
                        break;
                    case "h":
                        convertedValue = inputValue / 1000.0 / 60.0 / 60.0;
                        break;
                    case "d":
                        convertedValue = inputValue / 1000.0 / 60.0 / 60.0 / 24.0;
                        break;
                    default:
                        System.out.println("Invalid desired unit entered!");
                        System.out.println("Please type \"help\" to see a list of all accepted units!");
                        return;
                }
                break;
            case "s":
                switch (desiredUnit) {
                    case "ms":
                        convertedValue = inputValue * 1000.0;
                        break;
                    case "s":
                        convertedValue = inputValue;
                        break;
                    case "min":
                        convertedValue = inputValue / 60.0;
                        break;
                    case "h":
                        convertedValue = inputValue / 60.0 / 60.0;
                        break;
                    case "d":
                        convertedValue = inputValue / 60.0 / 60.0 / 24.0;
                        break;
                    default:
                        System.out.println("Invalid desired unit entered!");
                        System.out.println("Please type \"help\" to see a list of all accepted units!");
                        return;
                }
                break;
            case "min":
                switch (desiredUnit) {
                    case "ms":
                        convertedValue = inputValue * 1000.0 * 60.0;
                        break;
                    case "s":
                        convertedValue = inputValue * 60.0;
                        break;
                    case "min":
                        convertedValue = inputValue;
                        break;
                    case "h":
                        convertedValue = inputValue / 60.0;
                        break;
                    case "d":
                        convertedValue = inputValue / 60.0 / 24.0;
                        break;
                    default:
                        System.out.println("Invalid desired unit entered!");
                        System.out.println("Please type \"help\" to see a list of all accepted units!");
                        return;
                }
                break;
            case "h":
                switch (desiredUnit) {
                    case "ms":
                        convertedValue = inputValue * 1000.0 * 60.0 * 60.0;
                        break;
                    case "s":
                        convertedValue = inputValue * 60.0 * 60.0;
                        break;
                    case "min":
                        convertedValue = inputValue * 60.0;
                        break;
                    case "h":
                        convertedValue = inputValue;
                        break;
                    case "d":
                        convertedValue = inputValue / 24.0;
                        break;
                    default:
                        System.out.println("Invalid desired unit entered!");
                        System.out.println("Please type \"help\" to see a list of all accepted units!");
                        return;
                }
                break;
            case "d":
                switch (desiredUnit) {
                    case "ms":
                        convertedValue = inputValue * 1000.0 * 60.0 * 60.0 * 24.0;
                        break;
                    case "s":
                        convertedValue = inputValue * 60.0 * 60.0 * 24.0;
                        break;
                    case "min":
                        convertedValue = inputValue * 60.0 * 24.0;
                        break;
                    case "h":
                        convertedValue = inputValue * 24.0;
                        break;
                    case "d":
                        convertedValue = inputValue;
                        break;
                    default:
                        System.out.println("Invalid desired unit entered!");
                        System.out.println("Please type \"help\" to see a list of all accepted units!");
                        return;
                }
                break;

            default:
                System.out.println("Invalid starting unit entered!");
                System.out.println("Please type \"help\" to see a list of all accepted units!");
                return;

        }

        System.out.printf("%s %s = %.4e %s \n", value, inputUnit1, convertedValue, inputUnit2);
    }

    public static void main(String[] args) throws Exception {
        Scanner scnr = new Scanner(System.in);

        System.out.println("\nWelcome to the unit converter!"); // Displays a welcome message when the program
                                                                // is first opened
        System.out.println("Type \"help\" for help or \"quit\" to quit!");

        System.out.println("Please use the following format with this unit converter: ");
        System.out.println("[value] [starting unit] = [desired unit]");
        System.out.println("Example: 15.4 kg = lb");

        while (true) {

            System.out.println("\nPlease enter your desired conversion:");

            String input;
            input = scnr.nextLine();

            String[] userInput;
            userInput = input.split(" ");

            if (input.equalsIgnoreCase("quit")) {
                break;

            } else if (input.equalsIgnoreCase("help")) {
                System.out.println("\nPlease enter the value you wish to have converted in the following format: ");
                System.out.println("[value] [starting unit] = [desired unit]");
                System.out.println("Example: 15.4 kg = lb");
                System.out.println("Your answer will be displayed in scientific notation.");
                System.out.println("When you would like to quit, please type \"quit\" to quit.");
                System.out.println("\nValid units:");
                System.out.println("\tMass: mg, g, kg, oz, lb");
                System.out.println("\tLength: mm, cm, m, km, in, ft, yd, mi");
                System.out.println("\tTemperature: C, K, F");
                System.out.println("\tTime: ms, s, min, h, d");
            } else if ((userInput.length != 4) || !(userInput[2].equals("="))) {
                System.out.println("\nInvalid input formatting!");
                System.out.println("\nPlease enter the value you wish to have converted in the following format: ");
                System.out.println("[value] [starting unit] = [desired unit]");
                System.out.println("Example: 15.4 kg = lb");

            } else {

                convertUnits(userInput[0], userInput[1], userInput[3]);

            }

        }
        scnr.close(); // closes scanner after the user inputs "quit",
                      // which breaks out of the while loop
        System.out.println("\nGoodbye!"); // Displays a goodbye message
        System.out.println("Thank you for using the unit converter!");
    }
}
