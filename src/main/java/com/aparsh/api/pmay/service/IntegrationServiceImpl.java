package com.aparsh.api.pmay.service;

import com.aparsh.api.pmay.dto.requests.*;
import com.aparsh.api.pmay.dto.responses.*;
import com.aparsh.api.pmay.dto.requests.*;
import com.aparsh.api.pmay.dto.responses.*;
import com.aparsh.api.pmay.xml.DscEnrollmentAck;
import com.aparsh.api.pmay.xml.DscEnrollmentRequest;
import com.aparsh.api.pmay.xml.FtoAck;
import com.aparsh.api.pmay.xml.FtoRequest;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;
import org.springframework.stereotype.Service;

import java.io.StringReader;
import java.io.StringWriter;
import java.util.List;

@Service
public class IntegrationServiceImpl implements IntegrationService {
    public IntegrationServiceImpl() {
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

//    @Override
//    public String processDscEnrollmentXml(String xml) {
//        try {
//            JAXBContext ctx = JAXBContext.newInstance(DscEnrollmentRequest.class);
//            Unmarshaller un = ctx.createUnmarshaller();
//            StringReader sr = new StringReader(xml);
//            DscEnrollmentRequest req = (DscEnrollmentRequest) un
//                    .unmarshal(sr);
//            // Build Acknowledge
//            DscEnrollmentAck ack = new DscEnrollmentAck();
//            ack.setStatus("SUCCESS");
//            ack.setMessage("Received DSC enrollment for " + req.getApplicantName());
//
//            JAXBContext outCtx = JAXBContext.newInstance(DscEnrollmentAck.class);
//            Marshaller m = outCtx.createMarshaller();
//            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
//            StringWriter sw = new StringWriter();
//            m.marshal(ack, sw);
//            return sw.toString();
//        } catch (Exception ex) {
//            ex.printStackTrace();
//            return "<error>Invalid XML</error>";
//        }
//    }
//
//    @Override
//    public String processFtoXml(String xml) {
//        try {
//            JAXBContext ctx = JAXBContext.newInstance(FtoRequest.class);
//            Unmarshaller un = ctx.createUnmarshaller();
//            StringReader sr = new StringReader(xml);
//            FtoRequest req = (FtoRequest) un.unmarshal(sr);
//            FtoAck ack = new FtoAck();
//            ack.setStatus("SUCCESS");
//            ack.setMessage("FTO Received: " + req.getFtoNumber());
//            JAXBContext outCtx = JAXBContext.newInstance(FtoAck.class);
//            Marshaller m = outCtx.createMarshaller();
//            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
//            StringWriter sw = new StringWriter();
//            m.marshal(ack, sw);
//            return sw.toString();
//        } catch (Exception ex) {
//            ex.printStackTrace();
//            return "<error>Invalid FTO XML</error>";
//        }
//    }
}
