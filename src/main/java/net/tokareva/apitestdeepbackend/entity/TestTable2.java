package net.tokareva.apitestdeepbackend.entity;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "test_table2")
@ToString
@RequiredArgsConstructor
public class TestTable2 {

    @Id
    @Column(name = "id", nullable = false)
    private UUID id;

    @ToString.Exclude
    @Basic(fetch = FetchType.LAZY)
    private String testValue2;

    @OneToMany(mappedBy = "testTable2", orphanRemoval = true)
    @ToString.Exclude
    private Set<TestTable1> testTable1s = new LinkedHashSet<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        TestTable2 testTable2 = (TestTable2) o;
        return id != null && Objects.equals(id, testTable2.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
