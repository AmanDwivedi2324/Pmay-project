package com.aparsh.api.pmay.dto.responses;

import java.util.List;

public class ComponentResponse {

    private boolean status;
    private List<ComponentDtl> componentDtl;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public List<ComponentDtl> getComponentDtl() {
        return componentDtl;
    }

    public void setComponentDtl(List<ComponentDtl> componentDtl) {
        this.componentDtl = componentDtl;
    }

    // Inner DTO class representing component details
    public static class ComponentDtl {
        private String COMPONENTCODE;
        private String SCHEMENAME;
        private String ACTIVEFLAG;
        private String COMPONENTDESC;
        private String SCHEMECODE;
        private String PARENTCOMPONENTCODE;

        public ComponentDtl() {}

        public ComponentDtl(String COMPONENTCODE, String SCHEMENAME, String ACTIVEFLAG,
                             String COMPONENTDESC, String SCHEMECODE, String PARENTCOMPONENTCODE) {
            this.COMPONENTCODE = COMPONENTCODE;
            this.SCHEMENAME = SCHEMENAME;
            this.ACTIVEFLAG = ACTIVEFLAG;
            this.COMPONENTDESC = COMPONENTDESC;
            this.SCHEMECODE = SCHEMECODE;
            this.PARENTCOMPONENTCODE = PARENTCOMPONENTCODE;
        }

        public String getCOMPONENTCODE() {
            return COMPONENTCODE;
        }

        public void setCOMPONENTCODE(String COMPONENTCODE) {
            this.COMPONENTCODE = COMPONENTCODE;
        }

        public String getSCHEMENAME() {
            return SCHEMENAME;
        }

        public void setSCHEMENAME(String SCHEMENAME) {
            this.SCHEMENAME = SCHEMENAME;
        }

        public String getACTIVEFLAG() {
            return ACTIVEFLAG;
        }

        public void setACTIVEFLAG(String ACTIVEFLAG) {
            this.ACTIVEFLAG = ACTIVEFLAG;
        }

        public String getCOMPONENTDESC() {
            return COMPONENTDESC;
        }

        public void setCOMPONENTDESC(String COMPONENTDESC) {
            this.COMPONENTDESC = COMPONENTDESC;
        }

        public String getSCHEMECODE() {
            return SCHEMECODE;
        }

        public void setSCHEMECODE(String SCHEMECODE) {
            this.SCHEMECODE = SCHEMECODE;
        }

        public String getPARENTCOMPONENTCODE() {
            return PARENTCOMPONENTCODE;
        }

        public void setPARENTCOMPONENTCODE(String PARENTCOMPONENTCODE) {
            this.PARENTCOMPONENTCODE = PARENTCOMPONENTCODE;
        }
    }
}
