package com.ehrFrontEnd.repositories;

import com.ehrFrontEnd.models.Bb;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface BbRepository extends JpaRepository<Bb, Long> {

    @Query(value = "SELECT d FROM Deposits d WHERE d.account.id = ?1 ")
    Set<Bb> findDepositsByAccountId(Long BbId);
}
