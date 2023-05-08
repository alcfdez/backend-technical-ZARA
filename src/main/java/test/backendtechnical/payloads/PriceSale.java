package test.backendtechnical.payloads;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter


public class PriceSale {
    private Long price;
    private Long brand;
    private Long product;
    private Date startDate;
    private Date endDate;
    private Float pvp;
    private String currency;

    
}
