package com.aparsh.api.pmay.service.agency_service;

import com.aparsh.api.pmay.dto.responses.AgencyMappingResponse;
import com.aparsh.api.pmay.model.AgencyEntity;
import com.aparsh.api.pmay.repository.AgencyRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AgencyServiceImpl implements AgencyService {

    private final AgencyRepository repo;

    public AgencyServiceImpl(AgencyRepository repo) {
        this.repo = repo;
    }

    @Override
    public AgencyMappingResponse getAgencyMapping(String slsCode) {
        if (slsCode == null || slsCode.isBlank()) {
            return new AgencyMappingResponse(List.of());
        }
        List<AgencyEntity> entities = repo.findBySlsCode(slsCode.trim());
        if (entities == null || entities.isEmpty()) {
            try { entities = repo.findBySlsCodeNative(slsCode.trim()); } catch (Exception ignored) {}
        }

        var dtls = entities.stream().map(e -> {
            AgencyMappingResponse.AgencyDtl d = new AgencyMappingResponse.AgencyDtl();
            d.setStatus(e.getStatus());
            d.setSLSCODE(e.getSlsCode());
            d.setNREGAPanchayatCode(e.getNregaPanchayatCode());
            d.setStateLGDCode(e.getStateLGDCode());
            d.setStateSchemeCode(e.getStateSchemeCode());
            d.setAgencyType(e.getAgencyType());
            d.setParentAgencyName(e.getParentAgencyName());
            d.setChildAgencyName(e.getChildAgencyName());
            d.setNREGAImplAgencyCode(e.getNregaImplAgencyCode());
            d.setParentAgencyCode(e.getParentAgencyCode());
            d.setNREGABlockCode(e.getNregaBlockCode());
            d.setNREGAStateCode(e.getNregaStateCode());
            d.setDDOCODE(e.getDdoCode());
            d.setEntryDate(e.getEntryDate());
            d.setTREASCODE(e.getTreasCode());
            d.setChildAgencyCode(e.getChildAgencyCode());
            d.setDistrictLGDCode(e.getDistrictLGDCode());
            d.setPanchayatLGDCode(e.getPanchayatLGDCode());
            d.setCenterSchemeCode(e.getCenterSchemeCode());
            d.setNREGADistrictCode(e.getNregaDistrictCode());
            d.setTREAS_NAME(e.getTreasName());
            d.setBlockLGDCode(e.getBlockLGDCode());
            d.setDDO_NAME(e.getDdoName());
            d.setRequestType(e.getRequestType());
            return d;
        }).collect(Collectors.toList());

        return new AgencyMappingResponse(dtls);
    }
}
//test