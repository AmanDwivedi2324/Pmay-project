package com.aparsh.api.pmay.dto.responses;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class SnaDetailsResponse {
    private List<SnaDtl> snaDtl;
    public SnaDetailsResponse(List<SnaDtl> snaDtl) {
        this.snaDtl = snaDtl;
    }

    public List<SnaDtl> getSnaDtl() {
        return snaDtl;
    }

    public void setSnaDtl(List<SnaDtl> snaDtl) { this.snaDtl = snaDtl; }
    public static class SnaDtl {
        private String SLSCODE;
        private String VILLAGECODE;
        private String CITYNAME;
        private String DEPT_NAME;
        private Integer STATESHARE;
        private String ACCOUNT_TYPE;
        private String CSSCODE;
        private String BLOCKCODE;
        private String IFSCCODE;
        private String SNA;
        private String SNAUNIQUEAGENCYCODE;
        private String STATE;
        private String DISTRICTNAME;
        private String TOPUP;
        private String SNAAGENCYNAME;
        private String CONTROLLERCODE;
        private String SNAACCOUNTNUMBER;
        private Integer CENTERSHARE;
        private Integer DEPT_CODE;
        private String BANKNAME;
        private String SLSNAME;
        private String PANCHAYATCODE;
        private String CSSNAME;
        private String STATEBUDGETHEAD;
        private String SCHEME_TYPE;
        private String DISTRICTCODE;
        private String CENTREBUDGETHEAD;

        // Getters / setters for all fields
        // (generate in IDE or paste the following)
        @JsonProperty("SLSCODE")
        public String getSLSCODE() { return SLSCODE; }
        public void setSLSCODE(String SLSCODE) { this.SLSCODE = SLSCODE; }
        @JsonProperty("VILLAGECODE")
        public String getVILLAGECODE() { return VILLAGECODE; }
        public void setVILLAGECODE(String VILLAGECODE) { this.VILLAGECODE = VILLAGECODE; }
        @JsonProperty("CITYNAME")
        public String getCITYNAME() { return CITYNAME; }
        public void setCITYNAME(String CITYNAME) { this.CITYNAME = CITYNAME; }
        @JsonProperty("DEPT_NAME")
        public String getDEPT_NAME() { return DEPT_NAME; }
        public void setDEPT_NAME(String DEPT_NAME) { this.DEPT_NAME = DEPT_NAME; }
        @JsonProperty("STATESHARE")
        public Integer getSTATESHARE() { return STATESHARE; }
        public void setSTATESHARE(Integer STATESHARE) { this.STATESHARE = STATESHARE; }
        @JsonProperty("ACCOUNT_TYPE")
        public String getACCOUNT_TYPE() { return ACCOUNT_TYPE; }
        public void setACCOUNT_TYPE(String ACCOUNT_TYPE) { this.ACCOUNT_TYPE = ACCOUNT_TYPE; }
        @JsonProperty("CSSCODE")
        public String getCSSCODE() { return CSSCODE; }
        public void setCSSCODE(String CSSCODE) { this.CSSCODE = CSSCODE; }
        @JsonProperty("BLOCKCODE")
        public String getBLOCKCODE() { return BLOCKCODE; }
        public void setBLOCKCODE(String BLOCKCODE) { this.BLOCKCODE = BLOCKCODE; }
        @JsonProperty("IFSCCODE")
        public String getIFSCCODE() { return IFSCCODE; }
        public void setIFSCCODE(String IFSCCODE) { this.IFSCCODE = IFSCCODE; }
        @JsonProperty("SNA")
        public String getSNA() { return SNA; }
        public void setSNA(String SNA) { this.SNA = SNA; }
        @JsonProperty("SNAUNIQUEAGENCYCODE")
        public String getSNAUNIQUEAGENCYCODE() { return SNAUNIQUEAGENCYCODE; }
        public void setSNAUNIQUEAGENCYCODE(String SNAUNIQUEAGENCYCODE) { this.SNAUNIQUEAGENCYCODE = SNAUNIQUEAGENCYCODE; }
        @JsonProperty("STATE")
        public String getSTATE() { return STATE; }
        public void setSTATE(String STATE) { this.STATE = STATE; }
        @JsonProperty("DISTRICTNAME")
        public String getDISTRICTNAME() { return DISTRICTNAME; }
        public void setDISTRICTNAME(String DISTRICTNAME) { this.DISTRICTNAME = DISTRICTNAME; }
        @JsonProperty("TOPUP")
        public String getTOPUP() { return TOPUP; }
        public void setTOPUP(String TOPUP) { this.TOPUP = TOPUP; }
        @JsonProperty("SNAAGENCYNAME")
        public String getSNAAGENCYNAME() { return SNAAGENCYNAME; }
        public void setSNAAGENCYNAME(String SNAAGENCYNAME) { this.SNAAGENCYNAME = SNAAGENCYNAME; }
        @JsonProperty("CONTROLLERCODE")
        public String getCONTROLLERCODE() { return CONTROLLERCODE; }
        public void setCONTROLLERCODE(String CONTROLLERCODE) { this.CONTROLLERCODE = CONTROLLERCODE; }
        @JsonProperty("SNAACCOUNTNUMBER")
        public String getSNAACCOUNTNUMBER() { return SNAACCOUNTNUMBER; }
        public void setSNAACCOUNTNUMBER(String SNAACCOUNTNUMBER) { this.SNAACCOUNTNUMBER = SNAACCOUNTNUMBER; }
        @JsonProperty("CENTERSHARE")
        public Integer getCENTERSHARE() { return CENTERSHARE; }
        public void setCENTERSHARE(Integer CENTERSHARE) { this.CENTERSHARE = CENTERSHARE; }
        @JsonProperty("DEPT_CODE")
        public Integer getDEPT_CODE() { return DEPT_CODE; }
        public void setDEPT_CODE(Integer DEPT_CODE) { this.DEPT_CODE = DEPT_CODE; }
        @JsonProperty("BANKNAME")
        public String getBANKNAME() { return BANKNAME; }
        public void setBANKNAME(String BANKNAME) { this.BANKNAME = BANKNAME; }
        @JsonProperty("SLSNAME")
        public String getSLSNAME() { return SLSNAME; }
        public void setSLSNAME(String SLSNAME) { this.SLSNAME = SLSNAME; }
        @JsonProperty("PANCHAYATCODE")
        public String getPANCHAYATCODE() { return PANCHAYATCODE; }
        public void setPANCHAYATCODE(String PANCHAYATCODE) { this.PANCHAYATCODE = PANCHAYATCODE; }
        @JsonProperty("CSSNAME")
        public String getCSSNAME() { return CSSNAME; }
        public void setCSSNAME(String CSSNAME) { this.CSSNAME = CSSNAME; }
        @JsonProperty("STATEBUDGETHEAD")
        public String getSTATEBUDGETHEAD() { return STATEBUDGETHEAD; }
        public void setSTATEBUDGETHEAD(String STATEBUDGETHEAD) { this.STATEBUDGETHEAD = STATEBUDGETHEAD; }
        @JsonProperty("SCHEME_TYPE")
        public String getSCHEME_TYPE() { return SCHEME_TYPE; }
        public void setSCHEME_TYPE(String SCHEME_TYPE) { this.SCHEME_TYPE = SCHEME_TYPE; }
        @JsonProperty("DISTRICTCODE")
        public String getDISTRICTCODE() { return DISTRICTCODE; }
        public void setDISTRICTCODE(String DISTRICTCODE) { this.DISTRICTCODE = DISTRICTCODE; }
        @JsonProperty("CENTREBUDGETHEAD")
        public String getCENTREBUDGETHEAD() { return CENTREBUDGETHEAD; }
        public void setCENTREBUDGETHEAD(String CENTREBUDGETHEAD) { this.CENTREBUDGETHEAD = CENTREBUDGETHEAD; }
    }
}
