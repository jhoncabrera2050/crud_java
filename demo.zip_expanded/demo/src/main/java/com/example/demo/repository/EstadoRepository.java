package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Estado;

public interface EstadoRepository extends JpaRepository<Estado, Long > {
	List<Estado> findByPaisId(Long paisId);
}
