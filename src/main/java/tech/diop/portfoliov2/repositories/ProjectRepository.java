package tech.diop.portfoliov2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.diop.portfoliov2.model.Project;

public interface ProjectRepository extends JpaRepository<Project, Integer> {
}