package com.example.demo.domain;


//@Data
public class EmiRequest {

    private double interestRate;
    private int tenureMonths;
    private double partPayment;

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public int getTenureMonths() {
        return tenureMonths;
    }

    public void setTenureMonths(int tenureMonths) {
        this.tenureMonths = tenureMonths;
    }

    public double getPartPayment() {
        return partPayment;
    }

    public void setPartPayment(double partPayment) {
        this.partPayment = partPayment;
    }
}
