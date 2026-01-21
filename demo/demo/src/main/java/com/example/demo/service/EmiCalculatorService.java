package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class EmiCalculatorService {

    public double calculateEmi(double principal, double annualRate, int months) {
        double r = annualRate / (12 * 100);
        return (principal * r * Math.pow(1 + r, months)) /
                (Math.pow(1 + r, months) - 1);
    }

    public double remainingPrincipalAfterPartPayment(
            double principal, double partPayment) {
        return principal - partPayment;
    }


}
