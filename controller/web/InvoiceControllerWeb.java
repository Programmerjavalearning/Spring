package com.mycompany.invoise.controller.web;
import com.mycompany.invoise.controller.InvoiceControllerInterface;
import com.mycompany.invoise.entity.Invoice;
import com.mycompany.invoise.service.InvoiceServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class InvoiceControllerWeb implements InvoiceControllerInterface {

    public InvoiceControllerWeb(InvoiceServiceInterface invoiceService) {
        this.invoiceService = invoiceService;
    }

    private final InvoiceServiceInterface invoiceService;

    public InvoiceServiceInterface getInvoiceService() {
        return invoiceService;
    }

    public void createInvoice(){

        String custumerName = "Amazon";
        Invoice invoice = new Invoice();
        invoice.setCustomerName(custumerName);

        invoiceService.createInvoice(invoice);
    }
}
