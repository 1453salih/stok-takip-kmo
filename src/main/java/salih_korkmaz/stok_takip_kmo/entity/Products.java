package salih_korkmaz.stok_takip_kmo.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;


@Data
@Entity
public class Products {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 50)
    private Long code;

    @Column(nullable = false)
    private String name;

    @Column(precision = 10, scale = 2,nullable = false)//örn: 12345678.12
    private BigDecimal priceOne;

    @Column(precision = 10, scale = 2)
    private BigDecimal priceTwo;

    @Column(precision = 10, scale = 2)
    private BigDecimal priceThree;


    @ManyToOne
    private ProductCategories category;
}
