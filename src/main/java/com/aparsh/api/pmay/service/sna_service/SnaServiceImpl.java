package com.aparsh.api.pmay.service.sna_service;

import com.aparsh.api.pmay.dto.responses.SnaDetailsResponse;
import com.aparsh.api.pmay.model.SnaDetailEntity;
import com.aparsh.api.pmay.repository.SnaDetailRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SnaServiceImpl implements SnaService {

    private final SnaDetailRepository repo;

    public SnaServiceImpl(SnaDetailRepository repo) {
        this.repo = repo;
    }

    @Override
    public SnaDetailsResponse findByCssScheme(String cssScheme) {
        if (cssScheme == null || cssScheme.isBlank()) {
            return new SnaDetailsResponse(List.of());
        }
        List<SnaDetailEntity> entities = repo.findByCssCode(cssScheme.trim());
        if (entities == null || entities.isEmpty()) {
            try { entities = repo.findByCssCodeNative(cssScheme.trim()); } catch (Exception ignored) {}
        }

        var results = entities.stream().map(e -> {
            SnaDetailsResponse.SnaDtl d = new SnaDetailsResponse.SnaDtl();
            d.setSLSCODE(e.getSlsCode());
            d.setCSSCODE(e.getCssCode());
            d.setDEPT_NAME(e.getDeptName());
            d.setSTATESHARE(e.getStateShare());
            d.setSNA(e.getSna());
            d.setSNAUNIQUEAGENCYCODE(e.getSnaUniqueAgencyCode());
            d.setSTATE(e.getState());
            d.setSNAAGENCYNAME(e.getSnaAgencyName());
            d.setCONTROLLERCODE(e.getControllerCode());
            d.setSNAACCOUNTNUMBER(e.getSnaAccountNumber());
            d.setCENTERSHARE(e.getCenterShare());
            d.setDEPT_CODE(e.getDeptCode());
            d.setBANKNAME(e.getBankName());
            d.setSLSNAME(e.getSlsName());
            d.setCSSNAME(e.getCssName());
            return d;
        }).collect(Collectors.toList());

        return new SnaDetailsResponse(results);
    }
}
