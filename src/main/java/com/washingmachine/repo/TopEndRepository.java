package com.washingmachine.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.washingmachine.TopEndFeatures;

public interface TopEndRepository extends JpaRepository<TopEndFeatures, Long> {

}
