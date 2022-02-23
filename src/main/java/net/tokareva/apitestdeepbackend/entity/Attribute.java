package net.tokareva.apitestdeepbackend.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.Hibernate;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "attribute")
@Getter
@Setter
@ToString
public class Attribute extends BaseEntity {

    private String attributeName;

    @ManyToOne
    @JoinColumn(name = "subject_id")
    private Subject subject;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Attribute attribute = (Attribute) o;
        return getId() != null && Objects.equals(getId(), attribute.getId());
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
