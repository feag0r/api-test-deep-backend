package net.tokareva.apitestdeepbackend.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.Hibernate;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "subject")
@Getter
@Setter
@ToString
public class Subject extends BaseEntity {

    private String subjectName;

    @OneToMany(mappedBy = "subject", orphanRemoval = true)
    @ToString.Exclude
    private List<Account> subjectAccounts = new ArrayList<>();

    @OneToMany(mappedBy = "subject", orphanRemoval = true)
    @ToString.Exclude
    private List<Attribute> subjectAttributes = new ArrayList<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Subject subject = (Subject) o;
        return getId() != null && Objects.equals(getId(), subject.getId());
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
