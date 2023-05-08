package test.backendtechnical.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import test.backendtechnical.models.Brand;

public interface BrandRepository extends JpaRepository <Brand, Long>{
    
}
