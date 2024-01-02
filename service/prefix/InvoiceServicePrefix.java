package com.mycompany.invoise.service.prefix;

import com.mycompany.invoise.entity.Invoice;
import com.mycompany.invoise.repository.InvoiceRepositoryInterface;
import com.mycompany.invoise.service.InvoiceServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class InvoiceServicePrefix implements InvoiceServiceInterface {

    public InvoiceServicePrefix(InvoiceRepositoryInterface invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }

    @Value("${invoice.lastNumber}")
    private Long lastNumber;
    @Value("${invoice.prefix}")
    private String prefix;

    public Long getLastNumber() {
        return lastNumber;
    }

    public void setLastNumber(Long lastNumber) {
        this.lastNumber = lastNumber;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    private final InvoiceRepositoryInterface invoiceRepository ;

    public InvoiceRepositoryInterface getInvoiceRepository() {
        return invoiceRepository;
    }

    public void createInvoice (Invoice invoice){

        invoice.setNumber(String.valueOf(prefix+(++lastNumber)));
        invoiceRepository.create(invoice);

    }
}
