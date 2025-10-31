package com.aparsh.api.pmay.controller;

import com.aparsh.api.pmay.dto.requests.*;
import com.aparsh.api.pmay.dto.responses.*;
import com.aparsh.api.pmay.service.IntegrationService;
import com.aparsh.api.pmay.service.agency_service.AgencyService;
import com.aparsh.api.pmay.service.deduction_service.DeductionService;
import com.aparsh.api.pmay.service.sna_service.SnaService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.aparsh.api.pmay.service.agency_service.AgencyService;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class IntegrationController {
    private final SnaService snaService;
    private final AgencyService agencyService;
    private final DeductionService deductionService;
    private final IntegrationService service;

    public IntegrationController(SnaService snaService, AgencyService agencyService, DeductionService deductionService, IntegrationService service) {
        this.snaService = snaService;
        this.agencyService = agencyService;
        this.deductionService = deductionService;
        this.service = service;
    }


    @PostMapping(value = "/getSNADetails",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<SnaDetailsResponse> getSNADetails(@RequestBody SnaDetailsRequest req) {
        SnaDetailsResponse resp = snaService.findByCssScheme(req.getCSSSCHEME());
        return ResponseEntity.ok(resp);
    }

    @PostMapping(value = "/AgencyMappingDetails",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<AgencyMappingResponse> agencyMappingDetails(@RequestBody AgencyMappingRequest request) {
        AgencyMappingResponse resp = agencyService.getAgencyMapping(request.getSLSCODE());
        return ResponseEntity.ok(resp);
    }


    @PostMapping(value = "/getDeduction",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<DeductionResponse> getDeduction(@RequestBody DeductionRequest req) {
        DeductionResponse resp = deductionService.getDeductionsBySlsCode(req.getSLSCODE());
        return ResponseEntity.ok(resp);
    }



    @PostMapping(value = "/getComponents", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ComponentResponse> getComponents(@RequestBody ComponentRequest req) {
        return ResponseEntity.ok(service.getComponents(req));
    }

    @PostMapping(value = "/ddoAllotmentDetails", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<DdoAllotmentResponse> ddoAllotmentDetails(@RequestBody DdoAllotmentRequest req) {
        return ResponseEntity.ok(service.getDdoAllotmentDetails(req));
    }

    @PostMapping(value = "/motherSanctionLimit", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<MotherSanctionResponse> motherSanctionLimit(@RequestBody MotherSanctionRequest req) {
        return ResponseEntity.ok(service.getMotherSanctionLimit(req));
    }

    @PostMapping(value = "/getErrorMaster", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ErrorMasterResponse> getErrorMaster(@RequestBody ErrorMasterRequest req) {
        return ResponseEntity.ok(service.getErrorMaster(req));
    }
}
