package com.eventmgtsys.service;

import java.util.List;

import com.eventmgtsys.model.CompanyEntity;

public interface ICompanyService {
	List<CompanyEntity> getAllCompanyyDetails();
	CompanyEntity getCompanyDetailsById(int id);
    boolean addCompanyDetails(CompanyEntity company);
    void updateCompanyDetails(CompanyEntity company);
    void deleteCompanyDetails(int id);
}
