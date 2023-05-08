package test.backendtechnical.models;

import java.time.LocalDateTime;
import java.util.Set;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

@Entity

@Table(name = "prices")
public class Price {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_price")
    private Long id;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private Float pvp;
    private String currency;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "price_product", joinColumns = @JoinColumn(name = "price_id"), inverseJoinColumns = @JoinColumn(name = "product_id"))
    private Set<Product> products;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "price_brand", joinColumns = @JoinColumn(name = "price_id"), inverseJoinColumns = @JoinColumn(name = "brand_íd"))
    private Set<Brand> brands;
}