package com.mycompany.invoise.controller.clavier;
import com.mycompany.invoise.controller.InvoiceControllerInterface;
import com.mycompany.invoise.entity.Invoice;
import com.mycompany.invoise.service.InvoiceServiceInterface;
import org.springframework.stereotype.Controller;

import java.util.Scanner;
@Controller
public class InvoiceControllerClavier implements InvoiceControllerInterface {
    public InvoiceControllerClavier(InvoiceServiceInterface invoiceService) {
        this.invoiceService = invoiceService;
    }

    private final InvoiceServiceInterface invoiceService;

    public InvoiceServiceInterface getInvoiceService() {
        return invoiceService;
    }

    public void createInvoice(){
        System.out.println("Quel est le nom de votre client ?");
        Scanner sc = new Scanner(System.in);
        String custumerName = sc.nextLine();
        Invoice invoice = new Invoice();
        invoice.setCustomerName(custumerName);

        invoiceService.createInvoice(invoice);
    }


}
