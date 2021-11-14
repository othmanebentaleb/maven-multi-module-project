package org.school.project.services.administrator;

import org.school.project.services.administrator.dto.AdministratorDto;

public interface AdministratorService {

    public AdministratorDto findByUsernameAndPassword(String username, String password);
}
