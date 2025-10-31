package com.aparsh.api.pmay.repository;

import com.aparsh.api.pmay.model.AgencyEntity;
import com.aparsh.api.pmay.model.SnaDetailEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;
public interface AgencyRepository extends JpaRepository<AgencyEntity, String> {
    // Derived query
    List<AgencyEntity> findBySlsCode(String slsCode);

    // Native fallback (avoid mapping/case issues)
    @Query(value = "SELECT * FROM PMAY_AGENCY_DTL WHERE SLSCODE = :slsCode", nativeQuery = true)
    List<AgencyEntity> findBySlsCodeNative(@Param("slsCode") String slsCode);
}
