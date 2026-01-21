package com.example.demo.controller;

import com.example.demo.domain.EmiRequest;
import com.example.demo.domain.EmiResponse;
import com.example.demo.service.EmiCalculatorService;
import com.example.demo.service.PrincipalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/api/emi")
@CrossOrigin(origins = "http://localhost:4200")
public class EmiController {

    @Autowired
    private PrincipalService principalService;

    @Autowired
    private EmiCalculatorService emiService;

    @GetMapping("/principal")
    public double getPrincipal() throws IOException {
        return principalService.getPrincipal();
    }

    @PostMapping("/calculate")
    public EmiResponse calculateEmi(@RequestBody EmiRequest request)
            throws IOException {

        double principal = principalService.getPrincipal();

        double emi = emiService.calculateEmi(
                principal,
                request.getInterestRate(),
                request.getTenureMonths()
        );

        double newPrincipal = emiService.remainingPrincipalAfterPartPayment(
                principal,
                request.getPartPayment()
        );

        double newEmi = emiService.calculateEmi(
                newPrincipal,
                request.getInterestRate(),
                request.getTenureMonths()
        );

        return new EmiResponse(emi, newEmi, principal, newPrincipal);
    }
}
