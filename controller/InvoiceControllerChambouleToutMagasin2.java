package com.mycompany.invoise.controller;

import com.mycompany.invoise.entity.Invoice;
import com.mycompany.invoise.service.InvoiceServiceInterface;

public class InvoiceControllerChambouleToutMagasin2 implements InvoiceControllerInterface{

    private InvoiceServiceInterface invoiceService;

    public InvoiceServiceInterface getInvoiceService() {
        return invoiceService;
    }

    public void setInvoiceService(InvoiceServiceInterface invoiceService) {
        this.invoiceService = invoiceService;
    }
    @Override
    public void createInvoice() {
        System.out.println("Utilisation d'un scanner");
        Invoice invoice = new Invoice();
        invoice.setCustomerName("Toyota");
        invoiceService.createInvoice(invoice);


    }
}