package ua.edu.ucu.apps.lab10.payment;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor @Getter
public class CreditCard {
    private String cardNumber;
    private String expDate;
    private String cvv;
    private double balance;
}
