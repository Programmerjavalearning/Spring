package com.mycompany.invoise.service.number;

import com.mycompany.invoise.entity.Invoice;
import com.mycompany.invoise.repository.InvoiceRepositoryInterface;
import com.mycompany.invoise.service.InvoiceServiceInterface;
import org.springframework.stereotype.Service;

//@Service
public class InvoiceServiceNombre implements InvoiceServiceInterface {
    public InvoiceServiceNombre(InvoiceRepositoryInterface invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }

    private static Long lastNumber = 0L;
    private final InvoiceRepositoryInterface invoiceRepository ;

    public InvoiceRepositoryInterface getInvoiceRepository() {
        return invoiceRepository;
    }


    public void createInvoice (Invoice invoice){

        invoice.setNumber(String.valueOf(++lastNumber));
        invoiceRepository.create(invoice);

    }
}
