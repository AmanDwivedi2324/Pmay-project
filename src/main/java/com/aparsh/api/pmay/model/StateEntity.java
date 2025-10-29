package com.aparsh.api.pmay.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "STATE_MASTER") // <-- use the actual table name from your SQL database
public class StateEntity {

    @Id
    private String stateCode;

    private String stateName;
    private String shortName;
    private String lgdStateCode;
    private String localName;

    // Getters and setters
    public String getStateCode() { return stateCode; }
    public void setStateCode(String stateCode) { this.stateCode = stateCode; }

    public String getStateName() { return stateName; }
    public void setStateName(String stateName) { this.stateName = stateName; }

    public String getShortName() { return shortName; }
    public void setShortName(String shortName) { this.shortName = shortName; }

    public String getLgdStateCode() { return lgdStateCode; }
    public void setLgdStateCode(String lgdStateCode) { this.lgdStateCode = lgdStateCode; }

    public String getLocalName() { return localName; }
    public void setLocalName(String localName) { this.localName = localName; }
}
