package com.company.strtucturals.adapterImportant;
import static java.lang.System.out;

import com.company.strtucturals.adapterImportant.adapters.MercadoPagoAdapter;
import com.company.strtucturals.adapterImportant.mercadoPago.MercadoPago;
import com.company.strtucturals.adapterImportant.paypal.IPayPalPayments;

import java.io.PrintStream;

/** In software engineering, the adapter pattern is a software design pattern (also known as wrapper,
 *  an alternative naming shared with the decorator pattern) that allows the interface of an
 *  existing class to be used as another interface.
 *  It is often used to make existing classes work with others without modifying their source code. */
public class Adapter {

    public static void main(String[] args) {

        // Flow one
        /*IPayPalPayments payment = new PayPal();
        payment.paypalPayment();
        payment.paypalReceive();*/

        // Flow two
        /*IPayoneerPayment payoneerPayment = new Payoneer();
        payoneerPayment.sendPayment();
        payoneerPayment.receivePayment();*/

        // Flow three
       /* IMercadoPago mercadoPagoPayment = new MercadoPago();
        mercadoPagoPayment.paymentSender();
        mercadoPagoPayment.paymentReceiver();*/

        // Flow three adapted to flow one
       IPayPalPayments payments = new MercadoPagoAdapter(new MercadoPago());
       payments.paypalPayment();
       payments.paypalReceive();
    }

}
