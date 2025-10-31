package com.aparsh.api.pmay.service.deduction_service;


import com.aparsh.api.pmay.dto.responses.DeductionResponse;
import com.aparsh.api.pmay.model.DeductionEntity;
import com.aparsh.api.pmay.repository.DeductionRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DeductionServiceImpl implements DeductionService {

    private final DeductionRepository repo;

    public DeductionServiceImpl(DeductionRepository repo) {
        this.repo = repo;
    }

    @Override
    public DeductionResponse getDeductionsBySlsCode(String slsCode) {
        if (slsCode == null || slsCode.trim().isEmpty()) {
            return new DeductionResponse(List.of());
        }

        List<DeductionEntity> entities = repo.findBySlsCode(slsCode.trim());
        if (entities == null || entities.isEmpty()) {
            entities = repo.findBySlsCodeNative(slsCode.trim());
        }

        List<DeductionResponse.DedDtl> dtls = entities.stream().map(e -> {
            DeductionResponse.DedDtl d = new DeductionResponse.DedDtl();
            d.setDED_NAME(e.getDedName());
            d.setSHORT_ID(e.getShortId());
            d.setPFMS_DED_CODE(e.getPfmsDedCode());
            d.setTRANS_TYPE(e.getTransType());
            d.setSTATE_CODE(e.getStateCode());
            return d;
        }).collect(Collectors.toList());

        return new DeductionResponse(dtls);
    }
}
