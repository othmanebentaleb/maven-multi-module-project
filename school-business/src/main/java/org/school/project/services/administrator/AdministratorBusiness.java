package org.school.project.services.administrator;

import org.school.project.services.administrator.dto.AdministratorDto;

public interface AdministratorBusiness {

    public AdministratorDto findByUsernameAndPassword(String username, String password);
}
