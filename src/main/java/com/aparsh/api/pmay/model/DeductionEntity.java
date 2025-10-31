package com.aparsh.api.pmay.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "PMAY_DEDUCTION_DTL")
public class DeductionEntity {

    @Id
    @Column(name = "PFMS_DED_CODE", length = 100)
    private String pfmsDedCode; // primary key

    @Column(name = "DED_NAME")
    private String dedName;

    @Column(name = "SHORT_ID")
    private String shortId;

    @Column(name = "TRANS_TYPE")
    private String transType;

    @Column(name = "STATE_CODE")
    private Integer stateCode;

    @Column(name = "SLSCODE")
    private String slsCode; // to map which state/scheme this deduction belongs to

    // getters & setters
    public String getPfmsDedCode() { return pfmsDedCode; }
    public void setPfmsDedCode(String pfmsDedCode) { this.pfmsDedCode = pfmsDedCode; }

    public String getDedName() { return dedName; }
    public void setDedName(String dedName) { this.dedName = dedName; }

    public String getShortId() { return shortId; }
    public void setShortId(String shortId) { this.shortId = shortId; }

    public String getTransType() { return transType; }
    public void setTransType(String transType) { this.transType = transType; }

    public Integer getStateCode() { return stateCode; }
    public void setStateCode(Integer stateCode) { this.stateCode = stateCode; }

    public String getSlsCode() { return slsCode; }
    public void setSlsCode(String slsCode) { this.slsCode = slsCode; }
}
