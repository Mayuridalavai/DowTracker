package com.analyzer.model;

public class Stock {
    private String ticker;
    private String companyName;
    private double currentPrice;
    private double previousDayPrice;
    private String volume;
    private String oneYearTargetEst;
    private double fiftyTwoWeekHigh;
    private double fiftyTwoWeekLow;
    private double eps;
    private double peRatio;

    //Creating Constructor
    public Stock(String ticker, String companyName, double currentPrice,
                 double previousDayPrice, String volume,
                 String oneYearTargetEst, double fiftyTwoWeekHigh,
                 double fiftyTwoWeekLow, double eps, double peRatio) {
        setTicker(ticker);
        setCompanyName(companyName);
        setCurrentPrice(currentPrice);
        setPreviousDayPrice(previousDayPrice);
        setVolume(volume);
        setOneYearTargetEst(oneYearTargetEst);
        setEps(eps);
        setPeRatio(peRatio);
        this.fiftyTwoWeekLow = fiftyTwoWeekLow;
        this.fiftyTwoWeekHigh = fiftyTwoWeekHigh;

    }

    //Creating Getter and Setter
    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    public String getVolume() {
        return volume;
    }

    public double getPreviousDayPrice() {
        return previousDayPrice;
    }

    public void setPreviousDayPrice(double previousDayPrice) {
        this.previousDayPrice = previousDayPrice;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getOneYearTargetEst() {
        return oneYearTargetEst;
    }

    public void setOneYearTargetEst(String oneYearTargetEst) {
        this.oneYearTargetEst = oneYearTargetEst;
    }

    public double getEps() {
        return eps;
    }

    public void setEps(double eps) {
        this.eps = eps;
    }

    public double getPeRatio() {
        return peRatio;
    }

    public void setPeRatio(double peRatio) {
        this.peRatio = peRatio;
    }

    public String displayStockInfo() {
        return String.format("Ticker: %s    Company: %s     Current Price: %s      Closing Price:%s       Volume:%s" +
                        "     One YR TGT Estimate:%s        EPS:%s         PE Ratio:%s       ",
                getTicker(), getCompanyName(), getCurrentPrice(), getPreviousDayPrice(), getVolume(), getOneYearTargetEst()
                , getEps(), getPeRatio());
    }
}
