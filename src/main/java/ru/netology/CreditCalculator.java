package ru.netology;

public class CreditCalculator {
    public double monthlyPayment(int summaCredit, int periodCredit, double rateCredit){
        return (summaCredit * (rateCredit + (rateCredit / ((Math.pow((1 + rateCredit), periodCredit)) - 1))));
    }
    public double totalAmount(int summaCredit, int periodCredit, double rateCredit){
        return (summaCredit*(rateCredit + (rateCredit / ((Math.pow((1 + rateCredit), periodCredit)) - 1))))* periodCredit;
    }
    public double overPayment(int summaCredit, int periodCredit, double rateCredit){
        return (summaCredit*(rateCredit + (rateCredit / ((Math.pow((1 + rateCredit), periodCredit)) - 1))))* periodCredit - summaCredit;
    }
}
