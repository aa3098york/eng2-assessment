package uk.ac.york.eng2.products.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.micronaut.serde.annotation.Serdeable;
import jakarta.persistence.*;

import java.math.BigDecimal;
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


    @Column(precision = 12, scale = 2)
    private BigDecimal unitPrice = BigDecimal.ZERO;

    @JsonIgnore
    @OneToMany(mappedBy = "product")
    private Set<OrdersByDay> ordersByDay = new HashSet<OrdersByDay>();

    @JsonIgnore
    @ManyToMany
    private Set<Tag> tags = new HashSet<>();

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

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Set<OrdersByDay> getOrdersByDay() {
        return ordersByDay;
    }

    public void setOrdersByDay(Set<OrdersByDay> ordersByDay) {
        this.ordersByDay = ordersByDay;
    }

    public Set<Tag> getTags() {
        return tags;
    }

    public void setTags(Set<Tag> tags) {
        this.tags = tags;
    }
}
