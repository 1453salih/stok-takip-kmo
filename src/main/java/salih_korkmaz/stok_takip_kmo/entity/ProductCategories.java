package salih_korkmaz.stok_takip_kmo.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Data
@Entity
public class ProductCategories {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    //? Set kullılmasındaki sebep tekrar eden elemanlara izin vermez ve hızlı sıralama işim yok
    private Set<Products> products;
}
