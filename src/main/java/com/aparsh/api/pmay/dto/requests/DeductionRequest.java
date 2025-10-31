package com.aparsh.api.pmay.dto.requests;

public class DeductionRequest {
    private String SLSCODE;

    public DeductionRequest() {}

    public DeductionRequest(String SLSCODE) { this.SLSCODE = SLSCODE; }

    public String getSLSCODE() { return SLSCODE; }
    public void setSLSCODE(String SLSCODE) { this.SLSCODE = SLSCODE; }
}
