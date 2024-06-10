
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         // Declaring Currency object outside try-catch block
        double credit = 0;



        for(int i = 0 ; i < 1 ; i ++) {
            //We want to make sure that user puts a valid answer


            // Repeat this section if we catch an exception
            do {
                try {
                    System.out.printf("%n");
                    System.out.println("Welcome to Canadian Currency Exchange Office!");
                    System.out.println("Here you can convert your money from CAD to any other currencies in the list.");
                    System.out.println("To see the List follow the steps!");
                    System.out.println("Please Enter your Credit (CAD):");
                    credit = scanner.nextDouble();
                } catch (InputMismatchException e) {
                    System.out.printf("Invalid input!!%nPlease enter a valid number.");
                    scanner.nextLine(); // Consume invalid input
                    continue; // Repeat the loop if an exception is caught
                }
                break; // Exit the loop if no exception is caught
            } while (true); // Loop until a valid credit value is entered

            Currency currency = new Currency(credit);

            System.out.println("To prevent errors, please enter the country to which you wish to convert your currency exactly as listed!");
            System.out.println("Currency Exchange List :");


            System.out.printf("%nWhich currency do you want to convert to?%n Country          Rate  %nUSA (USD): %.2f%nTURKIYE (TR): %.2f%nIran (Rial): %.2f%nJapan (Yen): %.2f%nPoland (Zloty): %.2f%nEurope (EUR): %.2f%nUnited kingdom (GBP): %.2f%nLebanon (LBP): %.2f%nRussia (RUB): %.2f%nKuwait (KWD): %.2f%n",
                    currency.getUSD(),
                    currency.getTR(),
                    currency.getRial(),
                    currency.getYen(),
                    currency.getZLOTY(),
                    currency.getEUR(),
                    currency.getGBP(),
                    currency.getLBP(),
                    currency.getRUB(),
                    currency.getKWD());


            // Consume the newline character left in the input buffer
            scanner.nextLine();

            String exchange = scanner.nextLine();

            switch (exchange.toUpperCase()) {
                case "USD":
                case "USA":
                    currency.setUSD(currency.getUSD());
                    System.out.println("Without commission : " + currency.getUSD() +" USD");
                    System.out.println("With commission : " + commission.calculateCommission(currency.getUSD(),exchange ,credit) + " USD");
                    break;

                case "TR":
                case "TURKIYE":
                    currency.setTR(currency.getTR());
                    System.out.println("Without commission : " + currency.getTR() + " TR");
                    System.out.println("With commission : " + commission.calculateCommission(currency.getTR(),exchange ,credit) + " TR");
                    break;

                case "RIAL":
                case "IRAN":
                    currency.setRial(currency.getRial());
                    System.out.println("Without commission : " + currency.getRial() +" Rial");
                    System.out.println("With commission : " + commission.calculateCommission(currency.getRial(),exchange ,credit) + " Rial");
                    break;

                case "YEN":
                case "JAPAN":
                    currency.setYen(currency.getYen());
                    System.out.println("Without commission : " + currency.getYen() +" Yen");
                    System.out.println("With commission : " + commission.calculateCommission(currency.getYen(),exchange ,credit) + " Yen");
                    break;

                case "ZLOTY":
                case "POLAND":
                    currency.setZLOTY(currency.getZLOTY());
                    System.out.println("Without commission : " + currency.getZLOTY() + " Zloty");
                    System.out.println("With commission : " + commission.calculateCommission(currency.getZLOTY(),exchange ,credit) + " Zloty");
                    break;

                case "EUR":
                case "EUROPE":
                    currency.setEUR(currency.getEUR());
                    System.out.println("Without commission : " + currency.getEUR() + " EUR");
                    System.out.println("With commission : " + commission.calculateCommission(currency.getEUR(),exchange ,credit) + " EUR");
                    break;

                case "GBP":
                case "UK":
                    currency.setGBP(currency.getGBP());
                    System.out.println("Without commission : " + currency.getGBP() + " GBP");
                    System.out.println("With commission : " + commission.calculateCommission(currency.getGBP(),exchange ,credit) + " GBP");
                    break;

                case "LBP":
                case "LEBANON":
                    currency.setLBP(currency.getLBP());
                    System.out.println("Without commission : " + currency.getLBP() +" LBP");
                    System.out.println("With commission : " + commission.calculateCommission(currency.getLBP(),exchange ,credit) + " LBP");
                    break;

                case "RUB":
                case "RUSSIA":
                    currency.setRUB(currency.getRUB());
                    System.out.println("Without commission : " + currency.getRUB() +" RUB");
                    System.out.println("With commission : " + commission.calculateCommission(currency.getRUB(),exchange ,credit) + " RUB");
                    break;

                case "KWD":
                case "KUWAIT":
                    currency.setKWD(currency.getKWD());
                    System.out.println("Without commission : " + currency.getKWD() +" KWD");
                    System.out.println("With commission : " + commission.calculateCommission(currency.getKWD(),exchange ,credit)+ " KWD");
                    break;

                default:
                    System.out.println("Invalid currency option!");
                    break;
            }

            // Asking if the user wants to restart
            System.out.printf("%n");
            System.out.println("To restart press 1");
            int Restart = scanner.nextInt();
            if (Restart == 1)
                i--;
        }
    }
}
