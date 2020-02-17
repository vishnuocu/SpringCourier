package com.eventmgtsys.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eventmgtsys.dao.ICompanyDao;
import com.eventmgtsys.dao.IUserInfoDao;
import com.eventmgtsys.model.CompanyEntity;
import com.eventmgtsys.model.UserInfoEntity;


@Service
@Transactional
public class CompanyService implements ICompanyService {
	@Autowired
	private ICompanyDao companyDao;
	@Override
	public boolean addCompanyDetails(CompanyEntity company) {
		companyDao.save(company);
		return true;
	}
	@Override
	public void updateCompanyDetails(CompanyEntity company) {
	}
	@Override
	public void deleteCompanyDetails(int id) {
		companyDao.delete((long) id);
	}
	@Override
	public List<CompanyEntity> getAllCompanyyDetails() {
		List<CompanyEntity> list=(List<CompanyEntity>) companyDao.findAll();
		return list;
	}
	@Override
	public CompanyEntity getCompanyDetailsById(int id) {
		CompanyEntity companyEntity=companyDao.findOne((long) id);
		return companyEntity;
	}
}
