package com.mycompany.invoise.controller;
import com.mycompany.invoise.entity.Invoice;
import com.mycompany.invoise.service.InvoiceServiceInterface;


public class InvoiceControllerMichel implements InvoiceControllerInterface{

    private InvoiceServiceInterface invoiceService;

    public void createInvoice(){

        String custumerName = "Amazon";
        Invoice invoice = new Invoice();
        invoice.setCustomerName(custumerName);

        invoiceService.createInvoice(invoice);
    }
}
