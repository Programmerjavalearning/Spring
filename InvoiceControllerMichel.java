package com.mycompany.invoise.controller;

import com.mycompany.invoise.entity.Invoice;
import com.mycompany.invoise.service.InvoiceService;
import com.mycompany.invoise.service.InvoiceServiceMichel;

import java.util.Scanner;

public class InvoiceControllerMichel {

    public void createInvoiceUsingWebForm(){

        String custumerName = "Amazon";
        Invoice invoice = new Invoice();
        invoice.setCustomerName(custumerName);

        InvoiceServiceMichel invoiceService = new InvoiceServiceMichel();
        invoiceService.createInvoice(invoice);
    }
}
