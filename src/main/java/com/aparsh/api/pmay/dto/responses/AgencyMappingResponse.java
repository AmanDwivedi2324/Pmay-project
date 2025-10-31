package com.aparsh.api.pmay.dto.responses;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Setter
@Getter
public class AgencyMappingResponse {

    private List<AgencyDtl> agencyDtl;

    public AgencyMappingResponse() {}
    public AgencyMappingResponse(List<AgencyDtl> agencyDtl) { this.agencyDtl = agencyDtl; }

    @Setter
    @Getter
    public static class AgencyDtl {
        // getters & setters
        private String Status;
        private String SLSCODE;
        private String NREGAPanchayatCode;
        private Integer StateLGDCode;
        private String StateSchemeCode;
        private String AgencyType;
        private String ParentAgencyName;
        private String ChildAgencyName;
        private String NREGAImplAgencyCode;
        private String ParentAgencyCode;
        private String NREGABlockCode;
        private String NREGAStateCode;
        private Integer DDOCODE;
        @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
        private LocalDateTime EntryDate;
        private String TREASCODE;
        private String ChildAgencyCode;
        private String DistrictLGDCode;
        private String PanchayatLGDCode;
        private String CenterSchemeCode;
        private String NREGADistrictCode;
        private String TREAS_NAME;
        private String BlockLGDCode;
        private String DDO_NAME;
        private String RequestType;


        @JsonProperty("NREGAPanchayatCode")
        public String getNREGAPanchayatCode() { return NREGAPanchayatCode; }

        @JsonProperty("Status")
        public String getStatus() { return Status; }

        @JsonProperty("SLSCODE")
        public String getSLSCODE() { return SLSCODE; }

        @JsonProperty("StateLGDCode")
        public Integer getStateLGDCode() { return StateLGDCode; }

        @JsonProperty("StateSchemeCode")
        public String getStateSchemeCode() { return StateSchemeCode; }

        @JsonProperty("AgencyType")
        public String getAgencyType() { return AgencyType; }

        @JsonProperty("ParentAgencyName")
        public String getParentAgencyName() { return ParentAgencyName; }

        @JsonProperty("ChildAgencyName")
        public String getChildAgencyName() { return ChildAgencyName; }

        @JsonProperty("NREGAImplAgencyCode")
        public String getNREGAImplAgencyCode() { return NREGAImplAgencyCode; }

        @JsonProperty("ParentAgencyCode")
        public String getParentAgencyCode() { return ParentAgencyCode; }

        @JsonProperty("NREGABlockCode")
        public String getNREGABlockCode() { return NREGABlockCode; }

        @JsonProperty("NREGAStateCode")
        public String getNREGAStateCode() { return NREGAStateCode; }

        @JsonProperty("DDOCODE")
        public Integer getDDOCODE() { return DDOCODE; }

        @JsonProperty("EntryDate")
        public LocalDateTime getEntryDate() { return EntryDate; }

        @JsonProperty("TREASCODE")
        public String getTREASCODE() { return TREASCODE; }

        @JsonProperty("ChildAgencyCode")
        public String getChildAgencyCode() { return ChildAgencyCode; }

        @JsonProperty("DistrictLGDCode")
        public String getDistrictLGDCode() { return DistrictLGDCode; }

        @JsonProperty("PanchayatLGDCode")
        public String getPanchayatLGDCode() { return PanchayatLGDCode; }

        @JsonProperty("CenterSchemeCode")
        public String getCenterSchemeCode() { return CenterSchemeCode; }

        @JsonProperty("NREGADistrictCode")
        public String getNREGADistrictCode() { return NREGADistrictCode; }

        @JsonProperty("TREAS_NAME")
        public String getTREAS_NAME() { return TREAS_NAME; }

        @JsonProperty("BlockLGDCode")
        public String getBlockLGDCode() { return BlockLGDCode; }

        @JsonProperty("DDO_NAME")
        public String getDDO_NAME() { return DDO_NAME; }

        @JsonProperty("RequestType")
        public String getRequestType() { return RequestType; }




        public void setNREGAPanchayatCode(String NREGAPanchayatCode) {
            this.NREGAPanchayatCode = NREGAPanchayatCode;
        }


        public void setStatus(String status) {
            Status = status;
        }


        public void setSLSCODE(String SLSCODE) {
            this.SLSCODE = SLSCODE;
        }



        public void setStateLGDCode(Integer stateLGDCode) {
            StateLGDCode = stateLGDCode;
        }



        public void setStateSchemeCode(String stateSchemeCode) {
            StateSchemeCode = stateSchemeCode;
        }



        public void setAgencyType(String agencyType) {
            AgencyType = agencyType;
        }



        public void setParentAgencyName(String parentAgencyName) {
            ParentAgencyName = parentAgencyName;
        }


        public void setChildAgencyName(String childAgencyName) {
            ChildAgencyName = childAgencyName;
        }



        public void setNREGAImplAgencyCode(String NREGAImplAgencyCode) {
            this.NREGAImplAgencyCode = NREGAImplAgencyCode;
        }



        public void setParentAgencyCode(String parentAgencyCode) {
            ParentAgencyCode = parentAgencyCode;
        }



        public void setNREGABlockCode(String NREGABlockCode) {
            this.NREGABlockCode = NREGABlockCode;
        }



        public void setNREGAStateCode(String NREGAStateCode) {
            this.NREGAStateCode = NREGAStateCode;
        }



        public void setDDOCODE(Integer DDOCODE) {
            this.DDOCODE = DDOCODE;
        }



        public void setEntryDate(LocalDateTime entryDate) {
            EntryDate = entryDate;
        }


        public void setTREASCODE(String TREASCODE) {
            this.TREASCODE = TREASCODE;
        }


        public void setChildAgencyCode(String childAgencyCode) {
            ChildAgencyCode = childAgencyCode;
        }


        public void setDistrictLGDCode(String districtLGDCode) {
            DistrictLGDCode = districtLGDCode;
        }



        public void setPanchayatLGDCode(String panchayatLGDCode) {
            PanchayatLGDCode = panchayatLGDCode;
        }



        public void setCenterSchemeCode(String centerSchemeCode) {
            CenterSchemeCode = centerSchemeCode;
        }



        public void setNREGADistrictCode(String NREGADistrictCode) {
            this.NREGADistrictCode = NREGADistrictCode;
        }



        public void setTREAS_NAME(String TREAS_NAME) {
            this.TREAS_NAME = TREAS_NAME;
        }



        public void setBlockLGDCode(String blockLGDCode) {
            BlockLGDCode = blockLGDCode;
        }



        public void setDDO_NAME(String DDO_NAME) {
            this.DDO_NAME = DDO_NAME;
        }


        public void setRequestType(String requestType) {
            RequestType = requestType;
        }
    }
}
