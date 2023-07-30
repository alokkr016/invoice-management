package me.alokdev.invoicemanagement.controller;

import me.alokdev.invoicemanagement.model.WinterInternship;
import me.alokdev.invoicemanagement.services.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MainController {

    @Autowired
    MainService service;

    @ResponseBody
    @RequestMapping("/")
    public String home(){
        return "Hello";
    }

    @GetMapping("fetch")
    public List<WinterInternship> getCustomer(){
        return service.getCustomer();
    }

    @GetMapping("delete")
    public ResponseEntity<String> deleteCustomer(@RequestParam Integer slNo){
        service.deleteCustomer(slNo);
        return new ResponseEntity<>("deleted", HttpStatus.OK);
    }


    @GetMapping("fetchBusiness")
    public List<WinterInternship> getCustomerBusinessCode(@RequestParam String businessCode){
        return service.getByBusiness(businessCode);
    }

    @GetMapping("advanceSearch")
    public ResponseEntity<List<WinterInternship>> findByDocIdCustomerNumberInvoiceIdBusinessYear(String docId,
                                                                                                 String customerNumber,Integer invoiceId,String businessCode) {
        List<WinterInternship> result = service.findByDocIdCustomerNumberInvoiceIdBusinessYear (docId, customerNumber, invoiceId, businessCode);
        return ResponseEntity.ok(result);
    }
}
