package com.aparsh.api.pmay.service;

import com.aparsh.api.pmay.dto.requests.*;
import com.aparsh.api.pmay.dto.responses.*;
import com.aparsh.api.pmay.dto.responses.*;
import com.aparsh.api.pmay.dto.requests.*;

public interface IntegrationService {
    ComponentResponse getComponents(ComponentRequest req);
    DdoAllotmentResponse getDdoAllotmentDetails(DdoAllotmentRequest req);
    MotherSanctionResponse getMotherSanctionLimit(MotherSanctionRequest req);
    ErrorMasterResponse getErrorMaster(ErrorMasterRequest req);

//    String processDscEnrollmentXml(String xml);
//    String processFtoXml(String xml);
}
