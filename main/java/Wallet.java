import java.util.ArrayList;

public class Wallet {
    private double totalRupees=0;
    private double totalDollar=0;
    public  double totalBalance=0;
    ArrayList<Double>  dollarValueList=new ArrayList<Double>();
    ArrayList<Double>  rupeesValueList=new ArrayList<Double>();
    public void depositMoneyInWallet(CurrencyType currencyType,Currency currency){
        if(currencyType==CurrencyType.DOLLAR){
            dollarValueList.add(currency.currencyValue);
        }else{
            rupeesValueList.add(currency.currencyValue);
        }
    }

    public double getTotalBalanceInRupees() {
        dollarValueList.forEach((value)->totalBalance+=value*74.85);
        rupeesValueList.forEach((value)->totalBalance+=value);
        return totalBalance;
    }
    public double getTotalBalanceInDollar() {
        dollarValueList.forEach((value)->totalBalance+=value);
        rupeesValueList.forEach((value)->totalBalance+=value/74.85);
        return totalBalance;
    }

    public boolean compareIf1DollarIsEqual74_85Rupees(Currency dollar, Currency rupees) {
        if(dollar.currencyValue*74.85==rupees.currencyValue){
            return true;
        }else{
            return false;
        }
    }

    public double withdrawMoneyFromWalletAsDollar(double amountToBeWithdrawn){
        double totalBalaceInDollar=getTotalBalanceInDollar();
        if(amountToBeWithdrawn>totalBalaceInDollar){
            throw new IllegalArgumentException("Insufficient dollars to withdraw");
        }else {
            return totalBalaceInDollar - amountToBeWithdrawn;
        }
    }

    public double withdrawMoneyFromWalletAsRupees(double amountToBeWithdrawn){
        double totalBalanceInRupees=getTotalBalanceInRupees();
        if(amountToBeWithdrawn>totalBalanceInRupees){
            throw new IllegalArgumentException("Insufficient Rupees to withdraw");
        }else {
            return totalBalanceInRupees- amountToBeWithdrawn;
        }
    }
}
