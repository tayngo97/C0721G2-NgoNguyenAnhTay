package com.c0821g1.sprint1.repository;

import com.c0821g1.sprint1.entity.space.SpacesType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpaceTypeRepository extends JpaRepository<SpacesType,Integer> {
}
