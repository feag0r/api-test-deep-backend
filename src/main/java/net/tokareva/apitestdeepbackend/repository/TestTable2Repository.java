package net.tokareva.apitestdeepbackend.repository;

import net.tokareva.apitestdeepbackend.entity.TestTable2;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TestTable2Repository extends JpaRepository<TestTable2, UUID> {
}