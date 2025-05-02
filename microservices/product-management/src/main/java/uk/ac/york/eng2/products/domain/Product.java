package uk.ac.york.eng2.products.domain;

import io.micronaut.serde.annotation.Serdeable;
import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Serdeable
@Entity
public class Product {

    public Product() {}

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String name;

    @Column
    private float unit_price;

    @OneToMany(mappedBy = "product")
    private Set<OrdersByDay> ordersByDay = new HashSet<OrdersByDay>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getUnit_price() {
        return unit_price;
    }

    public void setUnit_price(float unit_price) {
        this.unit_price = unit_price;
    }
}
