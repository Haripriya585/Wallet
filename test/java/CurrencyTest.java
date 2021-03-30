import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class CurrencyTest {
    @Test
    public void test1DollarIsEqualTo74_85Rupees() {
        boolean expectedValue = true;
        String currencyType1 = "Dollar";
        String currencyType2 = "Rupees";
        double dollarValue = 1;
        double rupeeValue = 74.85;
        Currency dollar = new Currency(currencyType1,dollarValue);
        Currency rupees = new Currency(currencyType2,rupeeValue);
        Wallet wallet=new Wallet();

        boolean actualValue = wallet.compareIf1DollarIsEqual74_85Rupees(dollar,rupees);

        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void test1DollarIsNotEqualTo74_85Rupees() {
        boolean expectedValue = false;
        String currencyType1 = "Dollar";
        String currencyType2 = "Rupees";
        double dollarValue = 1;
        double rupeeValue = 100.01;
        Currency dollar = new Currency(currencyType1,dollarValue);
        Currency rupees = new Currency(currencyType2,rupeeValue);
        Wallet wallet=new Wallet();

        boolean actualValue = wallet.compareIf1DollarIsEqual74_85Rupees(dollar,rupees);

        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void testSumOfMoneyInTheWalletWithCurrencyPreferenceDollar(){
        double expectedValue = 124.85;
        String currencyType1 = "Dollar";
        String currencyType2 = "Rupees";
        double dollarValue = 1;
        double rupeeValue = 50;
        Currency dollar = new Currency(currencyType1,dollarValue);
        Currency rupees = new Currency(currencyType2,rupeeValue);
        Wallet wallet=new Wallet();

        double actualValue = wallet.sumOfMoneyInTheWalletWithCurrencyPreferenceDollar(dollar,rupees);

        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void testSumOfMoneyInTheWalletWithCurrencyPreferenceRupees(){
        double expectedValue = 3;
        String currencyType1 = "Dollar";
        String currencyType2 = "Rupees";
        double dollarValue = 1;
        double rupeeValue = 74.85+149.7;
        Currency dollar = new Currency(currencyType1,dollarValue);
        Currency rupees = new Currency(currencyType2,rupeeValue);
        Wallet wallet=new Wallet();

        double actualValue = wallet.sumOfMoneyInTheWalletWithCurrencyPreferenceRupees(dollar,rupees);

        assertEquals(expectedValue, actualValue);
    }
}
