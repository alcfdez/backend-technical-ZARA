package test.backendtechnical.models;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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

@Table(name = "brands")
public class Brand {
    @Id @GeneratedValue( strategy = GenerationType.IDENTITY) @Column(name = "id_brand")
    private Long id;
    private String name;
    

    @ManyToMany(mappedBy = "brands")
    Set<Price> prices;
}
