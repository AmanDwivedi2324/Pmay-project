package com.aparsh.api.pmay.dto.responses;

import java.util.List;

public class AgencyMappingResponse {

    private List<AgencyDtl> agencyDtl;

    public List<AgencyDtl> getAgencyDtl() {
        return agencyDtl;
    }

    public void setAgencyDtl(List<AgencyDtl> agencyDtl) {
        this.agencyDtl = agencyDtl;
    }

    public static class AgencyDtl {
        private String Status;
        private String SLSCODE;
        private String NREGAPanchayatCode;
        private String StateLGDCode;
        private String StateShortCode;
        private String AgencyType;
        private String ChildAgencyName;
        private String ParentAgencyName;
        private String NREGABankCode;
        private String DDOCODE;
        private String EntryDate;
        private String TreasuryCode;
        private String ChildAgencyCode;
        private String DistrictLGDCode;
        private String PanchayatLGDCode;
        private String CenterStateCode;
        private String NREGABankCode2;
        private String DEPT_NAME;
        private String BlockLGDCode;
        private String RequestType;

        // Getters and Setters
        public String getStatus() { return Status; }
        public void setStatus(String status) { Status = status; }

        public String getSLSCODE() { return SLSCODE; }
        public void setSLSCODE(String SLSCODE) { this.SLSCODE = SLSCODE; }

        public String getNREGAPanchayatCode() { return NREGAPanchayatCode; }
        public void setNREGAPanchayatCode(String NREGAPanchayatCode) { this.NREGAPanchayatCode = NREGAPanchayatCode; }

        public String getStateLGDCode() { return StateLGDCode; }
        public void setStateLGDCode(String stateLGDCode) { StateLGDCode = stateLGDCode; }

        public String getStateShortCode() { return StateShortCode; }
        public void setStateShortCode(String stateShortCode) { StateShortCode = stateShortCode; }

        public String getAgencyType() { return AgencyType; }
        public void setAgencyType(String agencyType) { AgencyType = agencyType; }

        public String getChildAgencyName() { return ChildAgencyName; }
        public void setChildAgencyName(String childAgencyName) { ChildAgencyName = childAgencyName; }

        public String getParentAgencyName() { return ParentAgencyName; }
        public void setParentAgencyName(String parentAgencyName) { ParentAgencyName = parentAgencyName; }

        public String getNREGABankCode() { return NREGABankCode; }
        public void setNREGABankCode(String NREGABankCode) { this.NREGABankCode = NREGABankCode; }

        public String getDDOCODE() { return DDOCODE; }
        public void setDDOCODE(String DDOCODE) { this.DDOCODE = DDOCODE; }

        public String getEntryDate() { return EntryDate; }
        public void setEntryDate(String entryDate) { EntryDate = entryDate; }

        public String getTreasuryCode() { return TreasuryCode; }
        public void setTreasuryCode(String treasuryCode) { TreasuryCode = treasuryCode; }

        public String getChildAgencyCode() { return ChildAgencyCode; }
        public void setChildAgencyCode(String childAgencyCode) { ChildAgencyCode = childAgencyCode; }

        public String getDistrictLGDCode() { return DistrictLGDCode; }
        public void setDistrictLGDCode(String districtLGDCode) { DistrictLGDCode = districtLGDCode; }

        public String getPanchayatLGDCode() { return PanchayatLGDCode; }
        public void setPanchayatLGDCode(String panchayatLGDCode) { PanchayatLGDCode = panchayatLGDCode; }

        public String getCenterStateCode() { return CenterStateCode; }
        public void setCenterStateCode(String centerStateCode) { CenterStateCode = centerStateCode; }

        public String getNREGABankCode2() { return NREGABankCode2; }
        public void setNREGABankCode2(String NREGABankCode2) { this.NREGABankCode2 = NREGABankCode2; }

        public String getDEPT_NAME() { return DEPT_NAME; }
        public void setDEPT_NAME(String DEPT_NAME) { this.DEPT_NAME = DEPT_NAME; }

        public String getBlockLGDCode() { return BlockLGDCode; }
        public void setBlockLGDCode(String blockLGDCode) { BlockLGDCode = blockLGDCode; }

        public String getRequestType() { return RequestType; }
        public void setRequestType(String requestType) { RequestType = requestType; }
    }
}
