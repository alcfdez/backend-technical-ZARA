package test.backendtechnical.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import test.backendtechnical.models.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
    
}
