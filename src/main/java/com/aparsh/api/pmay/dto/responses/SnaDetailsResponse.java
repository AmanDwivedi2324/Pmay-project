package com.aparsh.api.pmay.dto.responses;

import java.util.List;

public class SnaDetailsResponse {
    private List<SnaDtl> snaDtl;

    public List<SnaDtl> getSnaDtl() {
        return snaDtl;
    }

    public void setSnaDtl(List<SnaDtl> snaDtl) {
        this.snaDtl = snaDtl;
    }

    public static class SnaDtl {
        private String SLSCODE;
        private String VILLAGECODE;
        private String CITYNAME;
        private String DEPT_NAME;
        private String STATEBASR;
        private String ACCOUNT_TYPE;
        private String CSSCODE;
        private String BLOCKCODE;
        private String IPSCODE;
        private String SNA;
        private String SNAUNIQUEAGENCYCODE;
        private String STATE;
        private String DISTRICTNAME;
        private String PROJECT;
        private String SCHEMENAME;
        private String SNACODE;
        private String SNAACCOUNTCODE;
        private String CENTERSHARE;
        private String SNATYPE;
        private String SCHEMETYPE;
        private String DISTRICTCODE;
        private String CENTERBUDGETHEAD;

        // Getters and Setters
        public String getSLSCODE() { return SLSCODE; }
        public void setSLSCODE(String SLSCODE) { this.SLSCODE = SLSCODE; }

        public String getVILLAGECODE() { return VILLAGECODE; }
        public void setVILLAGECODE(String VILLAGECODE) { this.VILLAGECODE = VILLAGECODE; }

        public String getCITYNAME() { return CITYNAME; }
        public void setCITYNAME(String CITYNAME) { this.CITYNAME = CITYNAME; }

        public String getDEPT_NAME() { return DEPT_NAME; }
        public void setDEPT_NAME(String DEPT_NAME) { this.DEPT_NAME = DEPT_NAME; }

        public String getSTATEBASR() { return STATEBASR; }
        public void setSTATEBASR(String STATEBASR) { this.STATEBASR = STATEBASR; }

        public String getACCOUNT_TYPE() { return ACCOUNT_TYPE; }
        public void setACCOUNT_TYPE(String ACCOUNT_TYPE) { this.ACCOUNT_TYPE = ACCOUNT_TYPE; }

        public String getCSSCODE() { return CSSCODE; }
        public void setCSSCODE(String CSSCODE) { this.CSSCODE = CSSCODE; }

        public String getBLOCKCODE() { return BLOCKCODE; }
        public void setBLOCKCODE(String BLOCKCODE) { this.BLOCKCODE = BLOCKCODE; }

        public String getIPSCODE() { return IPSCODE; }
        public void setIPSCODE(String IPSCODE) { this.IPSCODE = IPSCODE; }

        public String getSNA() { return SNA; }
        public void setSNA(String SNA) { this.SNA = SNA; }

        public String getSNAUNIQUEAGENCYCODE() { return SNAUNIQUEAGENCYCODE; }
        public void setSNAUNIQUEAGENCYCODE(String SNAUNIQUEAGENCYCODE) { this.SNAUNIQUEAGENCYCODE = SNAUNIQUEAGENCYCODE; }

        public String getSTATE() { return STATE; }
        public void setSTATE(String STATE) { this.STATE = STATE; }

        public String getDISTRICTNAME() { return DISTRICTNAME; }
        public void setDISTRICTNAME(String DISTRICTNAME) { this.DISTRICTNAME = DISTRICTNAME; }

        public String getPROJECT() { return PROJECT; }
        public void setPROJECT(String PROJECT) { this.PROJECT = PROJECT; }

        public String getSCHEMENAME() { return SCHEMENAME; }
        public void setSCHEMENAME(String SCHEMENAME) { this.SCHEMENAME = SCHEMENAME; }

        public String getSNACODE() { return SNACODE; }
        public void setSNACODE(String SNACODE) { this.SNACODE = SNACODE; }

        public String getSNAACCOUNTCODE() { return SNAACCOUNTCODE; }
        public void setSNAACCOUNTCODE(String SNAACCOUNTCODE) { this.SNAACCOUNTCODE = SNAACCOUNTCODE; }

        public String getCENTERSHARE() { return CENTERSHARE; }
        public void setCENTERSHARE(String CENTERSHARE) { this.CENTERSHARE = CENTERSHARE; }

        public String getSNATYPE() { return SNATYPE; }
        public void setSNATYPE(String SNATYPE) { this.SNATYPE = SNATYPE; }

        public String getSCHEMETYPE() { return SCHEMETYPE; }
        public void setSCHEMETYPE(String SCHEMETYPE) { this.SCHEMETYPE = SCHEMETYPE; }

        public String getDISTRICTCODE() { return DISTRICTCODE; }
        public void setDISTRICTCODE(String DISTRICTCODE) { this.DISTRICTCODE = DISTRICTCODE; }

        public String getCENTERBUDGETHEAD() { return CENTERBUDGETHEAD; }
        public void setCENTERBUDGETHEAD(String CENTERBUDGETHEAD) { this.CENTERBUDGETHEAD = CENTERBUDGETHEAD; }
    }
}
