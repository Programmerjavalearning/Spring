package com.mycompany.invoise.repository;

import com.mycompany.invoise.entity.Invoice;

import java.util.ArrayList;
import java.util.List;

public class InvoiceRepository implements InvoiceRepositoryInterface {

    private static List<Invoice> invoices = new ArrayList<Invoice>();
    public void create (Invoice invoice) {

        invoices.add(invoice);
        System.out.println("Facture ajoute avec le numéro " + invoice.getNumber() + "pour " + invoice.getCustomerName());

    }
}
