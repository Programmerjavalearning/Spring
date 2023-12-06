package com.mycompany.invoise.controller;
import com.mycompany.invoise.entity.Invoice;
import com.mycompany.invoise.service.InvoiceServiceInterface;

import java.util.Scanner;

public class InvoiceController implements InvoiceControllerInterface {

    private InvoiceServiceInterface invoiceService;

    public void createInvoice(){
        System.out.println("Quel est le nom de votre client ?");
        Scanner sc = new Scanner(System.in);
        String custumerName = sc.nextLine();
        Invoice invoice = new Invoice();
        invoice.setCustomerName(custumerName);

        invoiceService.createInvoice(invoice);
    }


}
