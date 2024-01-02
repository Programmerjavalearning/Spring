package com.mycompany.invoise.repository.database;

import com.mycompany.invoise.entity.Invoice;
import com.mycompany.invoise.repository.InvoiceRepositoryInterface;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class InvoiceRepositoryBaseDeDonnee implements InvoiceRepositoryInterface {

    private static List<Invoice> invoices = new ArrayList<Invoice>();
    public void create (Invoice invoice) {

        invoices.add(invoice);
        System.out.println("Database : Facture ajoute avec le numéro " + invoice.getNumber() + " pour " + invoice.getCustomerName());

    }
}
