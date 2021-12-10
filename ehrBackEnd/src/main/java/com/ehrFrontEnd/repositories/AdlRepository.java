package com.ehrFrontEnd.repositories;

import com.ehrFrontEnd.models.Adl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Set;

@Repository
public interface AdlRepository extends JpaRepository<Adl, Long> {
    @Query(value = "SELECT d FROM Adl d WHERE d.chart.id = ?1 ")
    Set<Adl> findAllByChartId(Long chartId);
}
