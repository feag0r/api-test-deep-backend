package net.tokareva.apitestdeepbackend.repository;

import net.tokareva.apitestdeepbackend.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SubjectRepository extends JpaRepository<Subject, UUID> {
}