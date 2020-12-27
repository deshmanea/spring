package com.honeycomb.springWebApp.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
public class Distributor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String distributorName;

    @ManyToMany
    private Set<Publisher> publishers = new HashSet<>();

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

    public Set<Publisher> getPublishers() {
        return publishers;
    }

    public void setPublishers(Set<Publisher> publishers) {
        this.publishers = publishers;
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
