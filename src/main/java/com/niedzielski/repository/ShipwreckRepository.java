package com.niedzielski.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.niedzielski.model.Shipwreck;

public interface ShipwreckRepository extends JpaRepository<Shipwreck, Long>{

}
