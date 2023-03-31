package com.odata.olingo.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
//import com.github.olingo.example.entity.Father;

import com.odata.olingo.example.entity.Datasets;

public interface DatasetRepository extends JpaRepository<Datasets, Long> {

}
