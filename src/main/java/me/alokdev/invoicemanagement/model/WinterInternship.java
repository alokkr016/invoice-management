package me.alokdev.invoicemanagement.model;


import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
@Table(name = "winter_internship")
public class WinterInternship {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sl_no")
    private Long slNo;

   @Column(name = "business_code")
    private String businessCode;

    @Column(name = "cust_number")
    private String customerNumber;

    @Column(name = "clear_date")
    private String clearDate;

    @Column(name = "buisness_year")
    private String businessYear;

    @Column(name = "doc_id")
    private String docId;

    @Column(name = "posting_date")
    private String postingDate;

    @Column(name = "document_create_date")
    private String documentCreateDate;

    @Column(name = "document_create_date1")
    private String documentCreateDate1;

    @Column(name = "due_in_date")
    private String dueInDate;

    @Column(name = "invoice_currency")
    private String invoiceCurrency;

    @Column(name = "document_type")
    private String documentType;

    @Column(name = "posting_id")
    private Integer postingId;

    @Column(name = "area_business")
    private String areaBusiness;

    @Column(name = "total_open_amount")
    private Double totalOpenAmount;

    @Column(name = "baseline_create_date")
    private String baselineCreateDate;

    @Column(name = "cust_payment_terms")
    private String custPaymentTerms;

    @Column(name = "invoice_id")
    private Integer invoiceId;

    @Column(name = "isOpen")
    private Boolean isOpen;

    @Column(name = "aging_bucket")
    private String agingBucket;

    @Column(name = "is_deleted")
    private Boolean isDeleted;

    // Constructors, getters, and setters (omitted for brevity)
}
