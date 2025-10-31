package com.aparsh.api.pmay.model;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "PMAY_SNA_DTL")
public class SnaDetailEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SLSCODE", length = 50)
    private String slsCode;

    @Column(name = "VILLAGECODE")
    private String villageCode;

    @Column(name = "CITYNAME")
    private String cityName;

    @Column(name = "DEPT_NAME")
    private String deptName;

    @Column(name = "STATESHARE")
    private Integer stateShare;

    @Column(name = "ACCOUNT_TYPE")
    private String accountType;

    @Column(name = "CSSCODE")
    private String cssCode;

    @Column(name = "BLOCKCODE")
    private String blockCode;

    @Column(name = "IFSCCODE")
    private String ifscCode;

    @Column(name = "SNA")
    private String sna;

    @Column(name = "SNAUNIQUEAGENCYCODE")
    private String snaUniqueAgencyCode;

    @Column(name = "STATE")
    private String state;

    @Column(name = "DISTRICTNAME")
    private String districtName;

    @Column(name = "TOPUP")
    private String topup;

    @Column(name = "SNAAGENCYNAME")
    private String snaAgencyName;

    @Column(name = "CONTROLLERCODE")
    private String controllerCode;

    @Column(name = "SNAACCOUNTNUMBER")
    private String snaAccountNumber;

    @Column(name = "CENTERSHARE")
    private Integer centerShare;

    @Column(name = "DEPT_CODE")
    private Integer deptCode;

    @Column(name = "BANKNAME")
    private String bankName;

    @Column(name = "SLSNAME")
    private String slsName;

    @Column(name = "PANCHAYATCODE")
    private String panchayatCode;

    @Column(name = "CSSNAME")
    private String cssName;

    @Column(name = "STATEBUDGETHEAD")
    private String stateBudgetHead;

    @Column(name = "SCHEME_TYPE")
    private String schemeType;

    @Column(name = "DISTRICTCODE")
    private String districtCode;

    @Column(name = "CENTREBUDGETHEAD")
    private String centreBudgetHead;

}
