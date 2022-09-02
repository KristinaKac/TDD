import org.junit.jupiter.api.Test;
import ru.netology.CreditCalculator;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestCreditCalculator {
    Random random = new Random();
    CreditCalculator creditCalculator = new CreditCalculator();
    int summaCredit = random.nextInt(100_000, 1_000_000);
    int periodCredit = random.nextInt(6, 96);
    double rateCredit = random.nextInt(1, 30);

    @Test
    public void testMonthlyPaument() {

        double monthlyPay = creditCalculator.monthlyPayment(summaCredit, periodCredit, rateCredit);
        assertTrue((summaCredit * (rateCredit + (rateCredit / ((Math.pow((1 + rateCredit), periodCredit)) - 1)))) == monthlyPay,
                "Неверный расчет: " + summaCredit + " и " + periodCredit + " и " + rateCredit);
    }
    @Test
    public void testTotalAmount(){
        double totalPay = creditCalculator.totalAmount(summaCredit, periodCredit, rateCredit);
        assertTrue((summaCredit*(rateCredit + (rateCredit / ((Math.pow((1 + rateCredit), periodCredit)) - 1))))* periodCredit == totalPay,
                "Nevernyi raschet: " + summaCredit + " i " + periodCredit + " i " + rateCredit);
    }
    @Test
    public void testOverpayment(){
        double overPay = creditCalculator.overPayment(summaCredit, periodCredit, rateCredit);
            assertTrue((summaCredit*(rateCredit + (rateCredit / ((Math.pow((1 + rateCredit), periodCredit)) - 1))))* periodCredit - summaCredit == overPay,
                    "Неверный расчет: " + summaCredit + " и " + periodCredit + " и " + rateCredit);
    }
}
