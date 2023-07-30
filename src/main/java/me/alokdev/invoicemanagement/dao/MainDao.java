package me.alokdev.invoicemanagement.dao;

import me.alokdev.invoicemanagement.model.WinterInternship;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface MainDao extends JpaRepository<WinterInternship,Integer> {
    List<WinterInternship> findByBusinessCode(String businessCode);
    @Query("SELECT w FROM WinterInternship w " +
            "WHERE (w.docId = :docId) " +
            "OR (w.customerNumber = :customerNumber) " +
            "OR (w.invoiceId = :invoiceId) " +
            "OR (w.businessCode = :businessCode)")
    List<WinterInternship> searchWinterInternship(
            @Param("docId") String docId,
            @Param("customerNumber") String customerNumber,
            @Param("invoiceId") Integer invoiceId,
            @Param("businessCode") String businessCode
    );
}
