package com.aparsh.api.pmay.repository;


import com.aparsh.api.pmay.model.DeductionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface DeductionRepository extends JpaRepository<DeductionEntity, String> {

    // Derived query
    List<DeductionEntity> findBySlsCode(String slsCode);

    // Native fallback
    @Query(value = "SELECT * FROM PMAY_DEDUCTION_DTL WHERE SLSCODE = :slsCode", nativeQuery = true)
    List<DeductionEntity> findBySlsCodeNative(@Param("slsCode") String slsCode);
}

