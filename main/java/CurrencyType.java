public enum CurrencyType {

    DOLLAR("Dollar"),
    RUPEES("Rupees");
    String currencyType;

    CurrencyType(String currencyType) {
        this.currencyType=currencyType;
    }
    public String getCurrencyType(){
        return currencyType;
    }

}
