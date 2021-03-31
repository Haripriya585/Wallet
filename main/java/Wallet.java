public class Wallet {
    private double totalRupees=0;
    private double totalDollar=0;
    public static double totalBalance=0;
    public boolean compareIf1DollarIsEqual74_85Rupees(Currency dollar,Currency rupees){
        if(dollar.getCurrencyValue()*74.85==rupees.getCurrencyValue()){
            return true;
        }else{
            return false;
        }
    }

    public void depositMoneyInWallet(Currency currency,String preferenceType){
        double totalMoney=0;
        if(currency.getCurrencyType()=="Dollar" && preferenceType=="Rupee"){
            totalBalance=totalBalance+currency.getCurrencyValue()*74.85;
        }else if(currency.getCurrencyType()=="Rupees" && preferenceType=="Dollar"){
            totalBalance=totalBalance+currency.getCurrencyValue()/74.85;
        }else{
            totalBalance=totalBalance+currency.getCurrencyValue();
        }
    }

    public double totalMoneyInWallet(){
        return totalBalance;
    }
}
