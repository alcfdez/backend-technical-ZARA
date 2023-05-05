package test.backendtechnical.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import test.backendtechnical.models.Price;
import test.backendtechnical.services.PriceService;

@AllArgsConstructor
@RestController
@RequestMapping (path = "api/prices")
public class PriceController {

    private final PriceService priceService;

    @GetMapping("/{id}")
    public Price getfindById(@PathVariable Long id){
        return priceService.findById(id);
    }
}
