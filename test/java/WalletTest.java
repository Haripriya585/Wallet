import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class WalletTest {
    @Test
    public void test1DollarIsEqualTo74_85Rupees() {
        boolean expectedValue = true;
       double dollarValue = 1;
        double rupeeValue = 74.85;
        Currency dollar = new Currency(dollarValue);
        Currency rupees = new Currency(rupeeValue);
        Wallet wallet=new Wallet();

        boolean actualValue = wallet.compareIf1DollarIsEqual74_85Rupees(dollar,rupees);

        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void test1DollarIsNotEqualTo74_85Rupees() {
        boolean expectedValue = false;
        double dollarValue = 1;
        double rupeeValue = 100.01;
        Currency dollar = new Currency(dollarValue);
        Currency rupees = new Currency(rupeeValue);
        Wallet wallet=new Wallet();

        boolean actualValue = wallet.compareIf1DollarIsEqual74_85Rupees(dollar,rupees);

        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void testBalanceInTheWalletWithCurrencyPreferenceRupees(){
        double expectedValue = 124.85;
        CurrencyType currencyType1 = CurrencyType.DOLLAR;
        CurrencyType currencyType2 = CurrencyType.RUPEES;
        double dollarValue = 1;
        double rupeeValue = 50;
        Currency dollar = new Currency(dollarValue);
        Currency rupees = new Currency(rupeeValue);
        Wallet wallet=new Wallet();
        wallet.depositMoneyInWallet(currencyType1,dollar);
        wallet.depositMoneyInWallet(currencyType2,rupees);

        double actualValue = wallet.getTotalBalanceInRupees();

        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void testBalanceInTheWalletWithCurrencyPreferenceDollar(){
        double expectedValue = 4;
        CurrencyType currencyType1 = CurrencyType.DOLLAR;
        CurrencyType currencyType2 = CurrencyType.RUPEES;
        double dollarValue = 1;
        double rupeeValue1 = 74.85;
        double rupeeValue2=149.7;
        Currency dollar = new Currency(dollarValue);
        Currency rupees = new Currency(rupeeValue1);
        Currency rupees1 = new Currency(rupeeValue2);
        Wallet wallet=new Wallet();
        wallet.depositMoneyInWallet(currencyType1,dollar);
        wallet.depositMoneyInWallet(currencyType2,rupees);
        wallet.depositMoneyInWallet(currencyType2,rupees1);

        double actualValue = wallet.getTotalBalanceInDollar();

        assertEquals(expectedValue, actualValue);
    }
}
