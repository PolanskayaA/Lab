
class Stock {
    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;


    public Stock(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }


    public double getChangePercent() {
        return ((currentPrice - previousClosingPrice) / previousClosingPrice) * 100;
    }

    // Сеттеры
    public void setPreviousClosingPrice(double price) {
        this.previousClosingPrice = price;
    }

    public void setCurrentPrice(double price) {
        this.currentPrice = price;
    }

    // Геттеры
    public String getSymbol() {
        return symbol;
    }

    public String getName() {
        return name;
    }
}

class TestStock {
    public static void main(String[] args) {
        Stock sber = new Stock("SBER", "ПАО Сбербанк");
        sber.setPreviousClosingPrice(281.50);
        sber.setCurrentPrice(282.87);

        System.out.println("Stock: " + sber.getName() + " (" + sber.getSymbol() + ")");
        System.out.println("Price Change: " + sber.getChangePercent() + "%");
    }
}
