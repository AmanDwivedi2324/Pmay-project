package com.aparsh.api.pmay.dto.responses;

import java.util.List;

public class ErrorMasterResponse {
    private boolean status;
    private List<ErrorDtl> errorDtl;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public List<ErrorDtl> getErrorDtl() {
        return errorDtl;
    }

    public void setErrorDtl(List<ErrorDtl> errorDtl) {
        this.errorDtl = errorDtl;
    }

    // Inner DTO
    public static class ErrorDtl {
        private String ERRORCODE;
        private String ERRORDESC;
        private int STATELOGCODE;
        private String FLAG;

        public String getERRORCODE() {
            return ERRORCODE;
        }

        public void setERRORCODE(String ERRORCODE) {
            this.ERRORCODE = ERRORCODE;
        }

        public String getERRORDESC() {
            return ERRORDESC;
        }

        public void setERRORDESC(String ERRORDESC) {
            this.ERRORDESC = ERRORDESC;
        }

        public int getSTATELOGCODE() {
            return STATELOGCODE;
        }

        public void setSTATELOGCODE(int STATELOGCODE) {
            this.STATELOGCODE = STATELOGCODE;
        }

        public String getFLAG() {
            return FLAG;
        }

        public void setFLAG(String FLAG) {
            this.FLAG = FLAG;
        }
    }
}
