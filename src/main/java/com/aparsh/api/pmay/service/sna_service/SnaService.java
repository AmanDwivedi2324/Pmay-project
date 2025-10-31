package com.aparsh.api.pmay.service.sna_service;

import com.aparsh.api.pmay.dto.responses.SnaDetailsResponse;

public interface SnaService {
    SnaDetailsResponse findByCssScheme(String cssScheme);
}
