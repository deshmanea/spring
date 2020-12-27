package com.honeycomb.springWebApp.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Distributor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String distributorName;

    public Distributor() {

    }

    public Distributor(Long id, String distributorName) {
        this.id = id;
        this.distributorName = distributorName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDistributorName() {
        return distributorName;
    }

    public void setDistributorName(String distributorName) {
        this.distributorName = distributorName;
    }

    @Override
    public String toString() {
        return "Distributor{" +
                "id=" + id +
                ", distributorName='" + distributorName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Distributor that = (Distributor) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
