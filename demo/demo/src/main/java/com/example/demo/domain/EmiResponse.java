package com.example.demo.domain;


public class EmiResponse {

    private double emiBeforePartPayment;
    private double emiAfterPartPayment;
    private double originalPrincipal;
    private double remainingPrincipal;

    public EmiResponse(double emiBeforePartPayment, double emiAfterPartPayment, double originalPrincipal, double remainingPrincipal) {
        this.emiBeforePartPayment = emiBeforePartPayment;
        this.emiAfterPartPayment = emiAfterPartPayment;
        this.originalPrincipal = originalPrincipal;
        this.remainingPrincipal = remainingPrincipal;
    }

    public double getEmiBeforePartPayment() {
        return emiBeforePartPayment;
    }

    public void setEmiBeforePartPayment(double emiBeforePartPayment) {
        this.emiBeforePartPayment = emiBeforePartPayment;
    }

    public double getRemainingPrincipal() {
        return remainingPrincipal;
    }

    public void setRemainingPrincipal(double remainingPrincipal) {
        this.remainingPrincipal = remainingPrincipal;
    }

    public double getOriginalPrincipal() {
        return originalPrincipal;
    }

    public void setOriginalPrincipal(double originalPrincipal) {
        this.originalPrincipal = originalPrincipal;
    }

    public double getEmiAfterPartPayment() {
        return emiAfterPartPayment;
    }

    public void setEmiAfterPartPayment(double emiAfterPartPayment) {
        this.emiAfterPartPayment = emiAfterPartPayment;
    }
}
