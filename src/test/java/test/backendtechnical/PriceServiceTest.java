package test.backendtechnical;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.sql.Date;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import test.backendtechnical.models.Price;
import test.backendtechnical.payloads.PriceSale;
import test.backendtechnical.repositories.PriceRepository;
import test.backendtechnical.services.PriceService;

@ExtendWith(MockitoExtension.class)
public class PriceServiceTest {

    @InjectMocks
    PriceService service;

    @Mock
    PriceRepository repository;
    
    private PriceSale priceSale1;
   
    

    @BeforeEach
    void setup(){
        priceSale1= new PriceSale(1L, 1L, 35455L, 2023-05-01-00:00:00 , 2023-05-31, 30.30, "EUR");
    }
    
    @Test
    public void findById_ShouldReturnPriceSale_WhenPriceSaleExists(){
        when(repository.findById(1L)).thenReturn(Optional.of(priceSale1);
        PriceSale currentPriceSale = service.findById(1L, 35455L, 2023-05-14-00:);

        assertEquals(1L,currentPriceSale.getId());
        
      }

}
