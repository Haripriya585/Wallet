public class Wallet {
    public boolean compareIf1DollarIsEqual74_85Rupees(Currency dollar,Currency rupees){
        if(dollar.getCurrencyValue()*74.85==rupees.getCurrencyValue()){
            return true;
        }else{
            return false;
        }
    }


    public double sumOfMoneyInTheWalletWithCurrencyPreferenceDollar(Currency dollar, Currency rupees) {
        return (dollar.getCurrencyValue()+rupees.getCurrencyValue());
    }
}
