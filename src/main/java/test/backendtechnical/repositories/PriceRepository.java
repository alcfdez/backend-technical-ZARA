package test.backendtechnical.repositories;

import java.sql.Date;

import org.springframework.data.jpa.repository.JpaRepository;

import test.backendtechnical.models.Price;

public interface PriceRepository extends JpaRepository<Price, Long>{

}
