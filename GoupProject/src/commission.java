public class commission {
    public static double calculateCommission(double currency, String country , double credit) {
        // Create a Currency object with the provided credit
        Currency currency1 = new Currency(credit);

        // Declare variables
        double rate;
        double result = 0;
        double commission;
        double commissionAmount = 0;

        // Switch statement to determine the rate based on the country
        switch (country.toUpperCase()) {
            case "USA":
            case "USD":
                rate = new Banks().getUSA();
                result = currency1.getUSD();
                break;
            case "TURKIYE":
            case "TR":
                rate = new Banks().getTurkiye();
                result = currency1.getTR();
                break;
            case "IRAN":
            case "RIAL":
                result = currency1.getRial();
                rate = new Banks().getIran();
                break;
            case "JAPAN":
            case "YEN":
                rate = new Banks().getJapan();
                result = currency1.getYen();
                break;
            case "POLAND":
            case "ZLOTY":
                result = currency1.getZLOTY();
                rate = new Banks().getPoland();
                break;
            case "EUROPE":
            case "EUR":
                result = currency1.getEUR();
                rate = new Banks().getEurope();
                break;
            case "UK":
            case "GBP":
                rate = new Banks().getUK();
                break;
            case "LEBANON":
            case "LBP":
                result = currency1.getLBP();
                rate = new Banks().getLebanon();
                break;
            case "RUSSIA":
            case "RUB":
                rate = new Banks().getRussia();
                break;
            case "KUWAIT":
            case "KWD":
                result = currency1.getKWD();
                rate = new Banks().getKuwait();
                break;
            default:
                throw new IllegalArgumentException("Invalid country");
        }

        // Calculate commission and commission amount based on the currency amount
        if (currency < 100) {
            commission = (100 - 2 - rate) * 0.01;
            commissionAmount = result * commission * 100;
            System.out.println("Commission Rate: " + (-(-2 - rate)) + "%");
        } else if (currency < 1000) {
            commission = (100 - 1 - rate) * 0.01;
            commissionAmount = result * commission * 100;
            System.out.println("Commission Rate: " + (-(-1 - rate)) + "%");
        } else {
            commission = (100 - rate) * 0.01;
            commissionAmount = result * commission * 100;
            System.out.println("Commission Rate: " + (-(-rate)) + "%");
        }

        // Return the commission amount
        return commissionAmount;
    }

}
