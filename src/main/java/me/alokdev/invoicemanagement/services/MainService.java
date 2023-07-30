package me.alokdev.invoicemanagement.services;


import me.alokdev.invoicemanagement.dao.MainDao;
import me.alokdev.invoicemanagement.model.WinterInternship;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MainService {

    @Autowired
    MainDao dao;
    public List<WinterInternship> getCustomer() {
        return dao.findAll();
    }

    public void deleteCustomer(Integer slNo) {
        dao.deleteById(slNo);
    }

    public List<WinterInternship> getByBusiness(String businessCode) {
        return dao.findByBusinessCode(businessCode);
    }

    public List<WinterInternship> findByDocIdCustomerNumberInvoiceIdBusinessYear(String docId, String customerNumber, Integer invoiceId, String businessCode) {
        return dao.searchWinterInternship(docId,customerNumber,invoiceId,businessCode);
    }
}
