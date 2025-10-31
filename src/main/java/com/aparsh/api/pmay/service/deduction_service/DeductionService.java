package com.aparsh.api.pmay.service.deduction_service;


import com.aparsh.api.pmay.dto.responses.DeductionResponse;

public interface DeductionService {
    DeductionResponse getDeductionsBySlsCode(String slsCode);
}
