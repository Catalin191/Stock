package stock;

public class Main {

    public static void main(String[] args) {


        Stock stock = new Stock("$", "Luni");
        double stocDiferens = stock.priceDiference();

        System.out.println(stocDiferens + " %");
    }
}
