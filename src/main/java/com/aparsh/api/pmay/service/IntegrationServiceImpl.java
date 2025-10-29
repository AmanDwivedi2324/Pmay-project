package com.aparsh.api.pmay.service;

import com.aparsh.api.pmay.dto.requests.*;
import com.aparsh.api.pmay.dto.responses.*;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;
import org.springframework.stereotype.Service;

import java.io.StringReader;
import java.io.StringWriter;
import java.util.List;

@Service
public class IntegrationServiceImpl implements IntegrationService {

    private final String DEFAULT_SLSCODE = "UP23";
    private final String DEFAULT_CSSCODE = "9180";

    public IntegrationServiceImpl() {

    }

    @Override
    public StateResponse getState(StateRequest req) {
        StateResponse resp = new StateResponse();
        StateResponse.StateResult st = new StateResponse.StateResult();
        st.setState_Code("UP");
        st.setState_Name("Uttar Pradesh");
        st.setShort_Name("UP");
        st.setLGD_State_Code("09");
        st.setSt_local_name("उत्तर प्रदेश");
        resp.setStatus(true);
        resp.setResult(List.of(st));
        return resp;
    }

    @Override
    public SnaDetailsResponse getSnaDetails(SnaDetailsRequest req) {
        SnaDetailsResponse response = new SnaDetailsResponse();
        SnaDetailsResponse.SnaDtl detail = new SnaDetailsResponse.SnaDtl();

        // Example data (you can later replace with DB calls)
        detail.setSLSCODE("RJ89");
        detail.setVILLAGECODE(null);
        detail.setCITYNAME(null);
        detail.setDEPT_NAME("Rural Development and Panchayati Raj Department, Jaipur");
        detail.setSTATEBASR("40");
        detail.setACCOUNT_TYPE(null);
        detail.setCSSCODE(req.getCSSSCHEME());
        detail.setBLOCKCODE(null);
        detail.setIPSCODE(null);
        detail.setSNA("Y");

        detail.setSNAUNIQUEAGENCYCODE("RAJJAY");
        detail.setSTATE("RAJASTHAN");
        detail.setDISTRICTNAME(null);
        detail.setPROJECT("Pradhan Mantri Awas Yojana Gramin");
        detail.setSCHEMENAME("Pradhan Mantri Awas Yojana Gramin");
        detail.setSNACODE("001");
        detail.setSNAACCOUNTCODE("156620123");
        detail.setCENTERSHARE("60");
        detail.setSNATYPE("SNA");
        detail.setSCHEMETYPE("Gramin");
        detail.setDISTRICTCODE(null);
        detail.setCENTERBUDGETHEAD(null);

        response.setSnaDtl(List.of(detail));
        return response;
    }

    @Override
    public AgencyMappingResponse getAgencyMapping(AgencyMappingRequest req) {
        AgencyMappingResponse response = new AgencyMappingResponse();
        AgencyMappingResponse.AgencyDtl detail = new AgencyMappingResponse.AgencyDtl();

        detail.setStatus("Active");
        detail.setSLSCODE(req.getSLSCODE());
        detail.setNREGAPanchayatCode("NA");
        detail.setStateLGDCode("8");
        detail.setStateShortCode(req.getSLSCODE());
        detail.setAgencyType("SNA");
        detail.setChildAgencyName("Rural Development & Panchayati Raj Department");
        detail.setParentAgencyName(null);
        detail.setNREGABankCode("NA");
        detail.setDDOCODE("312789");
        detail.setEntryDate("2025-03-10T11:18:09");
        detail.setTreasuryCode("57000");
        detail.setChildAgencyCode("RAJJAY");
        detail.setDistrictLGDCode(null);
        detail.setPanchayatLGDCode(null);
        detail.setCenterStateCode("9180");
        detail.setNREGABankCode2("NA");
        detail.setDEPT_NAME("SUPERINTENDING ENGINEER RURAL DEVELOPMENT (" + req.getSLSCODE() + ")");
        detail.setBlockLGDCode("NA");
        detail.setRequestType("R");

        response.setAgencyDtl(List.of(detail));
        return response;
    }

    @Override
    public DeductionResponse getDeduction(DeductionRequest req) {
        DeductionResponse response = new DeductionResponse();
        DeductionResponse.Result result = new DeductionResponse.Result();

        List<DeductionResponse.DedDtl> list = List.of(
                new DeductionResponse.DedDtl("PATRAKAR KALYAN KOSH", "OTH/BT", "OTH", "BT", 8),
                new DeductionResponse.DedDtl("IncomeTax", "IT/BT", "IT", "BT", 8),
                new DeductionResponse.DedDtl("State GST", "SGST/BT", "SGST", "BT", 8));

        result.setDedDtl(list);
        response.setResult(result);

        return response;
    }

    @Override
    public ComponentResponse getComponents(ComponentRequest req) {
        ComponentResponse response = new ComponentResponse();
        response.setStatus(true);

        response.setComponentDtl(List.of(
                new ComponentResponse.ComponentDtl(
                        "01",
                        "Pradhan Mantri Awas yojana Gramin",
                        "Y",
                        "Assistance for Construction of New House",
                        req.getCSSCODE(),
                        null)));
        return response;
    }

    @Override
    public DdoAllotmentResponse getDdoAllotmentDetails(DdoAllotmentRequest req) {
        DdoAllotmentResponse response = new DdoAllotmentResponse();
        response.setStatus(true);

        response.setResult(List.of(
                new DdoAllotmentResponse.Result(
                        "SALARY",
                        "003",
                        10000.0,
                        "A10001",
                        "2025-04-02",
                        "RJ89",
                        "Pradhan Mantri Awas Yojana",
                        "2025-2026",
                        req.getDDOCode(),
                        "LOC001",
                        "Dept of Rural Development (RAJ)")));
        return response;
    }

    @Override
    public MotherSanctionResponse getMotherSanctionLimit(MotherSanctionRequest req) {
        MotherSanctionResponse response = new MotherSanctionResponse();
        response.setStatus(true);

        MotherSanctionResponse.LimitForAgency limit = new MotherSanctionResponse.LimitForAgency();
        limit.setAvailableAmount(8000);
        limit.setDdo_code(312798);
        limit.setDdo_name("SUPDT ENGINEER RURAL DEVELOPMENT (RJ89)");
        limit.setTreas_code("5700");
        limit.setAgencycode("RAJIAY");
        limit.setSlsCode(req.getSLSCODE());
        limit.setTreas_name("Cyber Treasury");

        MotherSanctionResponse.AllotmentDtl allot = new MotherSanctionResponse.AllotmentDtl();
        allot.setSNAUniqueagencycode("RAJIAY");
        allot.setMothersanctionno("Dummy");
        allot.setMothersanctiontotalamount(10000);
        allot.setAvailableamount(6000);
        allot.setCssschcd("9180");
        allot.setLimitforagency(List.of(limit));
        allot.setStatecd(8);
        allot.setMothersanctiondate("2025-02-10T19:27:00");
        allot.setControllercd("001");
        allot.setFin_year(2024);

        response.setAllotmentDtl(allot);
        return response;
    }

    @Override
    public ErrorMasterResponse getErrorMaster(ErrorMasterRequest req) {
        ErrorMasterResponse response = new ErrorMasterResponse();
        response.setStatus(true);

        List<ErrorMasterResponse.ErrorDtl> errorList = List.of(
                createError("EXP0002", "No Data Found!"),
                createError("EXP0003", "No Scheme Mapped to API User!!!"),
                createError("EXP0000", "Unexpected Error occurred. Please contact IFMS support team!"),
                createError("EXP0004", "Logged in user and Scheme Code provided does not match!!!"),
                createError("EXP0005", "State Log Code is not correct!!!"),
                createError("EXP0001", "Invalid Combination of Scheme Details and Agency Code"));

        response.setErrorDtl(errorList);
        return response;
    }

    private ErrorMasterResponse.ErrorDtl createError(String code, String desc) {
        ErrorMasterResponse.ErrorDtl e = new ErrorMasterResponse.ErrorDtl();
        e.setERRORCODE(code);
        e.setERRORDESC(desc);
        e.setSTATELOGCODE(8);
        e.setFLAG("ACTIVE");
        return e;
    }

    @Override
    public String processDscEnrollmentXml(String xml) {
        try {
            JAXBContext ctx = JAXBContext.newInstance(com.aparsh.api.pmay.xml.DscEnrollmentRequest.class);
            Unmarshaller un = ctx.createUnmarshaller();
            StringReader sr = new StringReader(xml);
            com.aparsh.api.pmay.xml.DscEnrollmentRequest req = (com.aparsh.api.pmay.xml.DscEnrollmentRequest) un
                    .unmarshal(sr);

            // Build ack
            com.aparsh.api.pmay.xml.DscEnrollmentAck ack = new com.aparsh.api.pmay.xml.DscEnrollmentAck();
            ack.setStatus("SUCCESS");
            ack.setMessage("Received DSC enrollment for " + req.getApplicantName());

            JAXBContext outCtx = JAXBContext.newInstance(com.aparsh.api.pmay.xml.DscEnrollmentAck.class);
            Marshaller m = outCtx.createMarshaller();
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            StringWriter sw = new StringWriter();
            m.marshal(ack, sw);
            return sw.toString();
        } catch (Exception ex) {
            ex.printStackTrace();
            return "<error>Invalid XML</error>";
        }
    }

    @Override
    public String processFtoXml(String xml) {
        try {
            JAXBContext ctx = JAXBContext.newInstance(com.aparsh.api.pmay.xml.FtoRequest.class);
            Unmarshaller un = ctx.createUnmarshaller();
            StringReader sr = new StringReader(xml);
            com.aparsh.api.pmay.xml.FtoRequest req = (com.aparsh.api.pmay.xml.FtoRequest) un.unmarshal(sr);

            com.aparsh.api.pmay.xml.FtoAck ack = new com.aparsh.api.pmay.xml.FtoAck();
            ack.setStatus("SUCCESS");
            ack.setMessage("FTO Received: " + req.getFtoNumber());

            JAXBContext outCtx = JAXBContext.newInstance(com.aparsh.api.pmay.xml.FtoAck.class);
            Marshaller m = outCtx.createMarshaller();
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            StringWriter sw = new StringWriter();
            m.marshal(ack, sw);
            return sw.toString();
        } catch (Exception ex) {
            ex.printStackTrace();
            return "<error>Invalid FTO XML</error>";
        }
    }
}
