package test.backendtechnical.services;

import java.sql.Date;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import test.backendtechnical.models.Brand;
import test.backendtechnical.models.Price;
import test.backendtechnical.models.Product;
import test.backendtechnical.payloads.PriceSale;
import test.backendtechnical.repositories.BrandRepository;
import test.backendtechnical.repositories.PriceRepository;
import test.backendtechnical.repositories.ProductRepository;

@AllArgsConstructor
@Service
public class PriceService {
    
    private PriceRepository priceRepository;
    private BrandRepository brandRepository;
    private ProductRepository productRepository;


    @Transactional
    public List<Price> findAll(){
        return priceRepository.findAll();
    }

    @Transactional
    public PriceSale findById(Long idBrand,Long idProduct, LocalDateTime entryDate) {
        List<Price> allPrices = priceRepository.findAll();
        Product dbProduct = productRepository.findById(idProduct).orElseThrow();
        Brand dbBrand = brandRepository.findById(idBrand).orElseThrow();
        Price dbPrice = findPrice(allPrices, entryDate);
    
        
        return new PriceSale(dbPrice.getId(), dbBrand.getId(), dbProduct.getId(),
         dbPrice.getStartDate(), dbPrice.getEndDate(), dbPrice.getPvp(), dbPrice.getCurrency());
    }
    private Price findPrice(List<Price> allPrices, LocalDateTime entryDate){
        Price priceToReturn = new Price();
        for (Price price : allPrices) {
            if(entryDate.isAfter(price.getStartDate())  && entryDate.isBefore(price.getEndDate())) priceToReturn = price;
        }
        return priceToReturn;
    }

}
