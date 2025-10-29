package com.aparsh.api.pmay.dto.responses;

import java.util.List;

public class MotherSanctionResponse {
    private boolean status;
    private AllotmentDtl allotmentDtl;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public AllotmentDtl getAllotmentDtl() {
        return allotmentDtl;
    }

    public void setAllotmentDtl(AllotmentDtl allotmentDtl) {
        this.allotmentDtl = allotmentDtl;
    }

    // Inner DTO for allotmentDtl
    public static class AllotmentDtl {
        private String SNAUniqueagencycode;
        private String mothersanctionno;
        private double Mothersanctiontotalamount;
        private double availableamount;
        private String cssschcd;
        private List<LimitForAgency> limitforagency;
        private int statecd;
        private String mothersanctiondate;
        private String controllercd;
        private int fin_year;

        public String getSNAUniqueagencycode() { return SNAUniqueagencycode; }
        public void setSNAUniqueagencycode(String SNAUniqueagencycode) { this.SNAUniqueagencycode = SNAUniqueagencycode; }

        public String getMothersanctionno() { return mothersanctionno; }
        public void setMothersanctionno(String mothersanctionno) { this.mothersanctionno = mothersanctionno; }

        public double getMothersanctiontotalamount() { return Mothersanctiontotalamount; }
        public void setMothersanctiontotalamount(double Mothersanctiontotalamount) { this.Mothersanctiontotalamount = Mothersanctiontotalamount; }

        public double getAvailableamount() { return availableamount; }
        public void setAvailableamount(double availableamount) { this.availableamount = availableamount; }

        public String getCssschcd() { return cssschcd; }
        public void setCssschcd(String cssschcd) { this.cssschcd = cssschcd; }

        public List<LimitForAgency> getLimitforagency() { return limitforagency; }
        public void setLimitforagency(List<LimitForAgency> limitforagency) { this.limitforagency = limitforagency; }

        public int getStatecd() { return statecd; }
        public void setStatecd(int statecd) { this.statecd = statecd; }

        public String getMothersanctiondate() { return mothersanctiondate; }
        public void setMothersanctiondate(String mothersanctiondate) { this.mothersanctiondate = mothersanctiondate; }

        public String getControllercd() { return controllercd; }
        public void setControllercd(String controllercd) { this.controllercd = controllercd; }

        public int getFin_year() { return fin_year; }
        public void setFin_year(int fin_year) { this.fin_year = fin_year; }
    }

    // Inner DTO for limitforagency[]
    public static class LimitForAgency {
        private double availableAmount;
        private int ddo_code;
        private String ddo_name;
        private String treas_code;
        private String agencycode;
        private String slscode;
        private String treas_name;

        public double getAvailableAmount() { return availableAmount; }
        public void setAvailableAmount(double availableAmount) { this.availableAmount = availableAmount; }

        public int getDdo_code() { return ddo_code; }
        public void setDdo_code(int ddo_code) { this.ddo_code = ddo_code; }

        public String getDdo_name() { return ddo_name; }
        public void setDdo_name(String ddo_name) { this.ddo_name = ddo_name; }

        public String getTreas_code() { return treas_code; }
        public void setTreas_code(String treas_code) { this.treas_code = treas_code; }

        public String getAgencycode() { return agencycode; }
        public void setAgencycode(String agencycode) { this.agencycode = agencycode; }

        public String getSlsCode() { return slscode; }
        public void setSlsCode(String slscode) { this.slscode = slscode; }

        public String getTreas_name() { return treas_name; }
        public void setTreas_name(String treas_name) { this.treas_name = treas_name; }
    }
}
