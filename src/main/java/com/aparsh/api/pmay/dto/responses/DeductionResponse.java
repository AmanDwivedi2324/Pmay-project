package com.aparsh.api.pmay.dto.responses;

import java.util.List;

public class DeductionResponse {
    private List<DedDtl> dedDtl;

    public DeductionResponse() {}
    public DeductionResponse(List<DedDtl> dedDtl) { this.dedDtl = dedDtl; }

    public List<DedDtl> getDedDtl() { return dedDtl; }
    public void setDedDtl(List<DedDtl> dedDtl) { this.dedDtl = dedDtl; }

    public static class DedDtl {
        private String DED_NAME;
        private String SHORT_ID;
        private String PFMS_DED_CODE;
        private String TRANS_TYPE;
        private Integer STATE_CODE;

        public String getDED_NAME() { return DED_NAME; }
        public void setDED_NAME(String DED_NAME) { this.DED_NAME = DED_NAME; }

        public String getSHORT_ID() { return SHORT_ID; }
        public void setSHORT_ID(String SHORT_ID) { this.SHORT_ID = SHORT_ID; }

        public String getPFMS_DED_CODE() { return PFMS_DED_CODE; }
        public void setPFMS_DED_CODE(String PFMS_DED_CODE) { this.PFMS_DED_CODE = PFMS_DED_CODE; }

        public String getTRANS_TYPE() { return TRANS_TYPE; }
        public void setTRANS_TYPE(String TRANS_TYPE) { this.TRANS_TYPE = TRANS_TYPE; }

        public Integer getSTATE_CODE() { return STATE_CODE; }
        public void setSTATE_CODE(Integer STATE_CODE) { this.STATE_CODE = STATE_CODE; }
    }
}
