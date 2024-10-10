package salih_korkmaz.stok_takip_kmo.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "sales")
public class Sales {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long listNo;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Products products;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Customers customers;

    @Column(nullable = false)
    private int quantity;

    @Column(nullable = false, precision = 10 , scale = 2)
    private BigDecimal price;

    @Column(nullable = false, precision = 5, scale =2)
    private BigDecimal discount;

    @Column(nullable = false, precision = 5 , scale = 2)
    private BigDecimal vat;

    @Column(precision = 10 , scale = 2)
    private BigDecimal totalPrice;
}
