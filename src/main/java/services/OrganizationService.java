package services;


import models.Organization;
import org.springframework.stereotype.Service;
import services.UserService;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrganizationService {
    UserService userService = new UserService();
    private List<Organization> organizations = new ArrayList<>(){{
        new Organization(1L, "Apple", userService.getUserById(1L));
        new Organization(2L, "Microsoft", userService.getUserById(2L));
        new Organization(3L, "Meta", userService.getUserById(3L));
        new Organization(4L, "Amazon", userService.getUserById(4L));
    }};

    public List<Organization> getOrganizations(){
        return organizations;
    }

    Organization found;

    public Organization getOrganizationById(Long id){
        for(Organization organization: organizations){
            if(organization.getId().equals(id)){
                found = organization;
            }
        }
        return found;
    }
}
