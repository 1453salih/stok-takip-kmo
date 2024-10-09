package salih_korkmaz.stok_takip_kmo.entity;


import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Table(name = "products")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Products {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 50)
    private Long code;

    @Column(nullable = false,length = 50)
    private String name;

    @Column(precision = 10, scale = 2,nullable = false)//* örn: 12345678.12
    private BigDecimal priceOne;

    @Column(precision = 10, scale = 2)
    private BigDecimal priceTwo;

    @Column(precision = 10, scale = 2)
    private BigDecimal priceThree;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private ProductCategories category;

    @OneToOne(mappedBy = "product",cascade = CascadeType.ALL)
    private ProductTransactionHistory productTransactionHistory;
}
