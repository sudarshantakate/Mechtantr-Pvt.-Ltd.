package com.mechtantr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mechtantr.entity.Mechtantr;

@Repository
public interface MechtantrRepo extends JpaRepository<Mechtantr, Integer> {

}
