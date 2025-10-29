package com.aparsh.api.pmay.dto.responses;

import java.util.List;

public class DdoAllotmentResponse {

    private boolean status;
    private List<Result> result;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public List<Result> getResult() {
        return result;
    }

    public void setResult(List<Result> result) {
        this.result = result;
    }

    // Inner DTO for result data
    public static class Result {
        private String HEADDESCRIPTION;
        private String HEADCODE;
        private double ALLOTTEDAMOUNT;
        private String ALLOTMENTNO;
        private String ALLOTMENTDATE;
        private String SCHEMECODE;
        private String SCHEMENAME;
        private String FINYEAR;
        private String DDO_CODE;
        private String LOC_ID;
        private String LOC_NAME;

        public Result() {}

        public Result(String HEADDESCRIPTION, String HEADCODE, double ALLOTTEDAMOUNT, String ALLOTMENTNO,
                      String ALLOTMENTDATE, String SCHEMECODE, String SCHEMENAME,
                      String FINYEAR, String DDO_CODE, String LOC_ID, String LOC_NAME) {
            this.HEADDESCRIPTION = HEADDESCRIPTION;
            this.HEADCODE = HEADCODE;
            this.ALLOTTEDAMOUNT = ALLOTTEDAMOUNT;
            this.ALLOTMENTNO = ALLOTMENTNO;
            this.ALLOTMENTDATE = ALLOTMENTDATE;
            this.SCHEMECODE = SCHEMECODE;
            this.SCHEMENAME = SCHEMENAME;
            this.FINYEAR = FINYEAR;
            this.DDO_CODE = DDO_CODE;
            this.LOC_ID = LOC_ID;
            this.LOC_NAME = LOC_NAME;
        }

        public String getHEADDESCRIPTION() {
            return HEADDESCRIPTION;
        }

        public void setHEADDESCRIPTION(String HEADDESCRIPTION) {
            this.HEADDESCRIPTION = HEADDESCRIPTION;
        }

        public String getHEADCODE() {
            return HEADCODE;
        }

        public void setHEADCODE(String HEADCODE) {
            this.HEADCODE = HEADCODE;
        }

        public double getALLOTTEDAMOUNT() {
            return ALLOTTEDAMOUNT;
        }

        public void setALLOTTEDAMOUNT(double ALLOTTEDAMOUNT) {
            this.ALLOTTEDAMOUNT = ALLOTTEDAMOUNT;
        }

        public String getALLOTMENTNO() {
            return ALLOTMENTNO;
        }

        public void setALLOTMENTNO(String ALLOTMENTNO) {
            this.ALLOTMENTNO = ALLOTMENTNO;
        }

        public String getALLOTMENTDATE() {
            return ALLOTMENTDATE;
        }

        public void setALLOTMENTDATE(String ALLOTMENTDATE) {
            this.ALLOTMENTDATE = ALLOTMENTDATE;
        }

        public String getSCHEMECODE() {
            return SCHEMECODE;
        }

        public void setSCHEMECODE(String SCHEMECODE) {
            this.SCHEMECODE = SCHEMECODE;
        }

        public String getSCHEMENAME() {
            return SCHEMENAME;
        }

        public void setSCHEMENAME(String SCHEMENAME) {
            this.SCHEMENAME = SCHEMENAME;
        }

        public String getFINYEAR() {
            return FINYEAR;
        }

        public void setFINYEAR(String FINYEAR) {
            this.FINYEAR = FINYEAR;
        }

        public String getDDO_CODE() {
            return DDO_CODE;
        }

        public void setDDO_CODE(String DDO_CODE) {
            this.DDO_CODE = DDO_CODE;
        }

        public String getLOC_ID() {
            return LOC_ID;
        }

        public void setLOC_ID(String LOC_ID) {
            this.LOC_ID = LOC_ID;
        }

        public String getLOC_NAME() {
            return LOC_NAME;
        }

        public void setLOC_NAME(String LOC_NAME) {
            this.LOC_NAME = LOC_NAME;
        }
    }
}
