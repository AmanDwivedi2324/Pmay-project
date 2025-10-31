package com.aparsh.api.pmay.service.agency_service;

import com.aparsh.api.pmay.dto.responses.AgencyMappingResponse;

public interface AgencyService {
    AgencyMappingResponse getAgencyMapping(String slsCode);
}
