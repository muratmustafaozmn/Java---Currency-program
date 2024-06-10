public class Currency {

    // Constructor
    public Currency(double CAD) {
        this.CAD = CAD;
    }

    // Exchange currency
    public String exchange;

    // Canadian Dollar (CAD)
    private double CAD;

    // Exchange rates for different currencies
    private double USD = 0.74;      // US Dollar
    private double TR = 23.66;      // Turkish Lira
    private double Rial = 420000;   // Iranian Rial
    private double Yen = 111.90;    // Japanese Yen
    private double ZLOTY = 2.89;    // Polish Zloty
    private double EUR = 0.68;      // Euro
    private double GBP = 0.58;      // British Pound
    private double LBP = 65925.16;  // Lebanese Pound
    private double RUB = 68.09;     // Russian Ruble
    private double KWD = 0.23;      // Kuwaiti Dinar

    // Getters and setters for Canadian Dollar (CAD)
    public double getCAD() {
        return CAD;
    }

    public void setCAD(double CAD) {
        this.CAD = CAD;
    }

    // Getters and setters for other currencies
    // Each setter also updates the value according to the current exchange rate

    // US Dollar (USD)
    public double getUSD() {
        return USD;
    }

    public void setUSD(double USD) {
        this.USD = USD * this.CAD;
    }

    // Turkish Lira (TR)
    public double getTR() {
        return TR;
    }

    public void setTR(double TR) {
        this.TR = TR * this.CAD;
    }

    // Iranian Rial (Rial)
    public double getRial() {
        return Rial;
    }

    public void setRial(double Rial) {
        this.Rial = Rial * this.CAD;
    }

    // Japanese Yen (Yen)
    public double getYen() {
        return Yen;
    }

    public void setYen(double Yen) {
        this.Yen = Yen * this.CAD;
    }

    // Polish Zloty (ZLOTY)
    public double getZLOTY() {
        return ZLOTY;
    }

    public void setZLOTY(double ZLOTY) {
        this.ZLOTY = ZLOTY * this.CAD;
    }

    // Euro (EUR)
    public double getEUR() {
        return EUR;
    }

    public void setEUR(double EUR) {
        this.EUR = EUR * this.CAD;
    }

    // British Pound (GBP)
    public double getGBP() {
        return GBP;
    }

    public void setGBP(double GBP) {
        this.GBP = GBP * this.CAD;
    }

    // Lebanese Pound (LBP)
    public double getLBP() {
        return LBP;
    }

    public void setLBP(double LBP) {
        this.LBP = LBP * this.CAD;
    }

    // Russian Ruble (RUB)
    public double getRUB() {
        return RUB;
    }

    public void setRUB(double RUB) {
        this.RUB = RUB * this.CAD;
    }

    // Kuwaiti Dinar (KWD)
    public double getKWD() {
        return KWD;
    }

    public void setKWD(double KWD) {
        this.KWD = KWD * this.CAD;
    }
}
