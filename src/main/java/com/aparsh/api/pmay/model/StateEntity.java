package com.aparsh.api.pmay.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Setter;

@Setter
@Entity
@Table(name = "STATE_MASTER")
public class StateEntity {

    @Id
    private String stateCode;
    private String stateName;
    private String shortName;
    private String lgdStateCode;
    private String localName;

    // Getters and setters
    public String getStateCode() {
        return stateCode;
    }

    public String getStateName() {
        return stateName;
    }

    public String getShortName() {
        return shortName;
    }

    public String getLgdStateCode() {
        return lgdStateCode;
    }

    public String getLocalName() {
        return localName;
    }

}
