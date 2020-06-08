package stock;

public class Stock {

    private String simbol;
    private String stoc;
    private double closingPrice = 10;
    private double curentPrice = 20;

    public Stock(String simbol, String stoc){
        this.simbol = simbol;
        this.stoc = stoc;
    }

    public double priceDiference(){
        double difernce = curentPrice - closingPrice;
        double percent = (difernce*100) / closingPrice;

        return percent;
    }
}
