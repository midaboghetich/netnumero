package com.numhero.server.convert;

import com.google.inject.Singleton;
import com.numhero.client.model.pojoc.ClientSupplierC;
import com.numhero.client.model.pojoc.ClientSupplierContactC;
import com.numhero.server.model.pojo.ClientSupplier;
import com.numhero.server.model.pojo.ClientSupplierContact;
                                                                         
import java.util.List;

@Singleton
public class ClientSupplierConverter {

    public void mergeIntoClientSupplier(ClientSupplierC clientSupplierC, ClientSupplier clientSupplier) {
        clientSupplier.setId(clientSupplierC.getId());
        clientSupplier.setPartnerType(clientSupplierC.getType());
        clientSupplier.setSendInvoiceType(clientSupplierC.getSendInvoiceType());
        clientSupplier.setCompanyName(clientSupplierC.getCompanyName());
        clientSupplier.setAddress(clientSupplierC.getAddress());
        clientSupplier.setCity(clientSupplierC.getCity());
        clientSupplier.setRegion(clientSupplierC.getRegion());
        clientSupplier.setZipCode(clientSupplierC.getZipCode());
        clientSupplier.setCountry(clientSupplierC.getCountry());
        clientSupplier.setNotes(clientSupplierC.getNotes());
        clientSupplier.setCreated(clientSupplierC.getCreated());

        List<ClientSupplierContactC> contactsC = clientSupplierC.getContacts();
        for (int i = 0; i < contactsC.size(); i++) {
            ClientSupplierContactC clientSupplierContactC = contactsC.get(i);
            ClientSupplierContact contact = new ClientSupplierContact();
            contact.setName(clientSupplierContactC.getName());
            contact.setEmail(clientSupplierContactC.getEmail());
            contact.setFax(clientSupplierContactC.getFax());
            contact.setMobile(clientSupplierContactC.getMobile());
            contact.setPhone(clientSupplierContactC.getPhone());
            clientSupplier.getContacts().add(contact);
        }
    }

    public ClientSupplierC toClientSupplierC(ClientSupplier clientSupplier) {
        ClientSupplierC clientSupplierC = new ClientSupplierC();
        clientSupplierC.setId(clientSupplier.getId());
        clientSupplierC.setType(clientSupplier.getPartnerType());
        clientSupplierC.setSendInvoiceType(clientSupplier.getSendInvoiceType());
        clientSupplierC.setCompanyName(clientSupplier.getCompanyName());
        clientSupplierC.setAddress(clientSupplier.getAddress());
        clientSupplierC.setCity(clientSupplier.getCity());
        clientSupplierC.setRegion(clientSupplier.getRegion());
        clientSupplierC.setZipCode(clientSupplier.getZipCode());
        clientSupplierC.setCountry(clientSupplier.getCountry());
        clientSupplierC.setNotes(clientSupplier.getNotes());
        clientSupplierC.setCreated(clientSupplier.getCreated());

        List<ClientSupplierContact> contacts = clientSupplier.getContacts();
        for (int i = 0; i < contacts.size(); i++) {
            ClientSupplierContact clientSupplierContact = contacts.get(i);
            ClientSupplierContactC contactC = new ClientSupplierContactC();
            contactC.setName(clientSupplierContact.getName());
            contactC.setEmail(clientSupplierContact.getEmail());
            contactC.setFax(clientSupplierContact.getFax());
            contactC.setMobile(clientSupplierContact.getMobile());
            contactC.setPhone(clientSupplierContact.getPhone());
            contactC.setCreated(clientSupplierContact.getCreated());
            clientSupplierC.getContacts().add(contactC);
        }
        
        return clientSupplierC;
    }
}
