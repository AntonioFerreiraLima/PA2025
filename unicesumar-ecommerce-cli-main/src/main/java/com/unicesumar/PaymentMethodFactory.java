package com.unicesumar;

import com.unicesumar.paymentMethods.BoletoPayment;
import com.unicesumar.paymentMethods.CreditCardPayment;
import com.unicesumar.paymentMethods.PaymentMethod;
import com.unicesumar.paymentMethods.PaymentType;
import com.unicesumar.paymentMethods.PixPayment;

public class PaymentMethodFactory {
    public static PaymentMethod create(PaymentType type) {
        switch (type) {
            case PIX:
                return new PixPayment();
            case CARTAO:
                return new CreditCardPayment();
            case BOLETO:
                return new BoletoPayment();
            default:
                return new PixPayment();
        }
    }
}