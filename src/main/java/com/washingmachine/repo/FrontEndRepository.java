package com.washingmachine.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.washingmachine.FrontEndFeatures;

public interface FrontEndRepository extends JpaRepository<FrontEndFeatures, Long> {

}
