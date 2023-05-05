package test.backendtechnical.models;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
    @Id @GeneratedValue( strategy = GenerationType.IDENTITY) @Column(name = "id_price")
    private Long id;
    
    @Column( name = "star_date")
    private Date star;

    @Column( name = "end_date")
    private Date end;

    @Column( name = "pvp")
    private Float pvp;

    @Column ( name = "currency")
    private String currency;


    


    
}
