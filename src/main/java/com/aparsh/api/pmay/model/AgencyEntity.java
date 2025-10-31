package com.aparsh.api.pmay.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
@Entity
@Table(name = "PMAY_AGENCY_DTL")
public class AgencyEntity {

    // getters & setters (generate in IDE)
    @Id
    @Column(name = "CHILDAGENCYCODE", length = 100)
    private String childAgencyCode;

    @Column(name = "STATUS")
    private String status;

    @Column(name = "SLSCODE")
    private String slsCode;

    @Column(name = "NREGA_PANCHAYAT_CODE")
    private String nregaPanchayatCode;

    @Column(name = "STATE_LGD_CODE")
    private Integer stateLGDCode;

    @Column(name = "STATE_SCHEME_CODE")
    private String stateSchemeCode;

    @Column(name = "AGENCY_TYPE")
    private String agencyType;

    @Column(name = "PARENT_AGENCY_NAME")
    private String parentAgencyName;

    @Column(name = "CHILD_AGENCY_NAME")
    private String childAgencyName;

    @Column(name = "NREGA_IMPL_AGENCY_CODE")
    private String nregaImplAgencyCode;

    @Column(name = "PARENT_AGENCY_CODE")
    private String parentAgencyCode;

    @Column(name = "NREGA_BLOCK_CODE")
    private String nregaBlockCode;

    @Column(name = "NREGA_STATE_CODE")
    private String nregaStateCode;

    @Column(name = "DDOCODE")
    private Integer ddoCode;

    @Column(name = "ENTRY_DATE")
    private LocalDateTime entryDate;

    @Column(name = "TREASCODE")
    private String treasCode;

    @Column(name = "DISTRICT_LGD_CODE")
    private String districtLGDCode;

    @Column(name = "PANCHAYAT_LGD_CODE")
    private String panchayatLGDCode;

    @Column(name = "CENTER_SCHEME_CODE")
    private String centerSchemeCode;

    @Column(name = "NREGA_DISTRICT_CODE")
    private String nregaDistrictCode;

    @Column(name = "TREAS_NAME")
    private String treasName;

    @Column(name = "BLOCK_LGD_CODE")
    private String blockLGDCode;

    @Column(name = "DDO_NAME")
    private String ddoName;

    @Column(name = "REQUEST_TYPE")
    private String requestType;

}
