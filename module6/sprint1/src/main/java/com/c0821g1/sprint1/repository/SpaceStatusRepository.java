package com.c0821g1.sprint1.repository;

import com.c0821g1.sprint1.entity.space.SpacesStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpaceStatusRepository extends JpaRepository<SpacesStatus,Integer> {
}
