package test.backendtechnical.controllers;

import java.sql.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import test.backendtechnical.payloads.PriceSale;
import test.backendtechnical.services.PriceService;

@AllArgsConstructor
@RestController
@RequestMapping (path = "api/prices")
public class PriceController {

    private final PriceService priceService;

    @GetMapping("/{idBrand}/{idProduct}/{entryDate}")
    public PriceSale getfindById(@PathVariable Long idBrand, @PathVariable Long idProduct, @PathVariable Date entryDate){
        return priceService.findById(idBrand, idProduct, entryDate);
    }
}
