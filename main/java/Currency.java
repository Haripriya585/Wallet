public class Currency {
    public double currencyValue;
    public String currencyType;

    public Currency(String currencyType,double currencyValue) {
        this.currencyType=currencyType;
        this.currencyValue=currencyValue;
    }

    public boolean compareIf1DollarIsEqual74_85Rupees(Currency dollar,Currency rupees){
        if(dollar.currencyValue*74.85==rupees.currencyValue){
            return true;
        }else{
            return false;
        }
    }


}
