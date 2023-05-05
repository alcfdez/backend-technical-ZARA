package test.backendtechnical.services;

import java.util.List;

import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import test.backendtechnical.models.Price;
import test.backendtechnical.repositories.PriceRepository;

@AllArgsConstructor
@Service
public class PriceService {
    
    private PriceRepository priceRepository;


    @Transactional
    public List<Price> findAll(){
        return priceRepository.findAll();
    }

    @Transactional
    public Price findById(Long id) {
        return priceRepository.findById(id);
    }

}
