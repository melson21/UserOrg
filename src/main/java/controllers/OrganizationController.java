package controllers;


import models.Organization;
import services.OrganizationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v2")
public class OrganizationController {
    private final OrganizationService organizationService;

    public OrganizationController(OrganizationService organizationService) {
        this.organizationService = organizationService;
    }

    @GetMapping("/organizations")
    public ResponseEntity<List<Organization>> getOrganizations(){
        return ResponseEntity.ok(organizationService.getOrganizations());
    }

    @GetMapping("/getOrganizationsById/{id}")
    public ResponseEntity<Organization> getOrganizationById(@PathVariable(name = "id") Long id){
        return ResponseEntity.ok(organizationService.getOrganizationById(id));
    }
}
