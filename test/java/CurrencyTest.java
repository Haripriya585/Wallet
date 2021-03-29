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
        Currency dollar = new Currency(currencyType1);
        Currency rupees = new Currency(currencyType2);

        boolean actualValue = dollar.compareIf1DollarIsEqual74_85Rupees(dollar,rupees);


        assertEquals(expectedValue, actualValue);
    }
}