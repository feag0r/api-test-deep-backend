package net.tokareva.apitestdeepbackend.entity;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.Objects;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "test_table1")
@ToString
@RequiredArgsConstructor
public class TestTable1 {

    @Id
    @Column(name = "id", nullable = false)
    private UUID id;

    @ToString.Exclude
    @Basic(fetch = FetchType.LAZY)
    private String testValue1;

    @ManyToOne
    @JoinColumn(name = "test_table2_id")
    private TestTable2 testTable2;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        TestTable1 testTable1 = (TestTable1) o;
        return id != null && Objects.equals(id, testTable1.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
