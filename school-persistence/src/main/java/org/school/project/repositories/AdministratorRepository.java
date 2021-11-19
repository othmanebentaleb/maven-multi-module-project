package org.school.project.repositories;

import org.school.project.entities.Administrator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdministratorRepository extends JpaRepository<Administrator, Long> {

    public Administrator getByUsernameAndPassword(String username, String password);
}
