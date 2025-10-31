package com.aparsh.api.pmay.repository;

import com.aparsh.api.pmay.model.SnaDetailEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface SnaDetailRepository extends JpaRepository<SnaDetailEntity, Long> {

    List<SnaDetailEntity> findByCssCode(String cssCode);

    @Query(value = "SELECT * FROM PMAY_SNA_DTL WHERE CSSCODE = :cssCode", nativeQuery = true)
    List<SnaDetailEntity> findByCssCodeNative(String cssCode);
}
