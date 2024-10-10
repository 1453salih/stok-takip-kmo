package salih_korkmaz.stok_takip_kmo.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "customers")
public class Customers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column()
    private String companyName;

    @Column(unique = true)
    private String customerCode;

    @Column(nullable = false,length = 10)
    private String firstName;

    @Column(length = 30)
    private String lastName;

    @Column(length = 50)
    private String email;

    @Column(length = 15)
    private String phone;

    private String address;

    @OneToMany(mappedBy = "customers")
    private Set<Sales> sales;

}
