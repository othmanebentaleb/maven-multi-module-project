package org.school.project.services.administrator;

import org.school.project.entities.Administrator;
import org.school.project.repositories.AdministratorRepository;
import org.school.project.services.administrator.dto.AdministratorDto;
import org.school.project.services.administrator.mapper.AdministratorAssembler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdministratorBusinessImpl implements AdministratorBusiness {

    @Autowired
    private AdministratorRepository repository;

    @Autowired
    private AdministratorAssembler assembler;

    @Override
    public AdministratorDto findByUsernameAndPassword(String username, String password) {
        Administrator administrator = this.repository.getByUsernameAndPassword(username, password);
        return this.assembler.toDto(administrator);
    }
}
