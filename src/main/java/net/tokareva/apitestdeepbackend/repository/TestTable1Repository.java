package net.tokareva.apitestdeepbackend.repository;

import net.tokareva.apitestdeepbackend.entity.TestTable1;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TestTable1Repository extends JpaRepository<TestTable1, UUID> {
}