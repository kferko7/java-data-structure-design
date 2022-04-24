package designPatternsII.calculator;

public class Adaptor implements PriceCalculator {


    UKCarPriceCalculator ukCarPriceCalculator;

    public Adaptor(UKCarPriceCalculator ukCarPriceCalculator) {
        this.ukCarPriceCalculator = ukCarPriceCalculator;

    }

    @Override
    public String calculatorPrice() {
        return null;
    }

    @Override
    public String calculatePrice() {
        return null;
    }

    /*public  String calculatePrice() {
        return ukCarPriceCalculator.getPrice() + "GBP";

    }*/
}
