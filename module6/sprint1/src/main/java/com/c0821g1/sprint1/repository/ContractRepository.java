package com.c0821g1.sprint1.repository;

import com.c0821g1.sprint1.entity.contract.Contract;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContractRepository  extends JpaRepository<Contract,Integer> {
}
