package com.eventmgtsys.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eventmgtsys.dao.IUserInfoDao;
import com.eventmgtsys.model.UserInfoEntity;


@Service
@Transactional
public class UserService implements IUserService {
	@Autowired
	private IUserInfoDao userInfoDAO;
	@Override
	public UserInfoEntity getArticleById(Long articleId) {
		//UserInfoModel obj = articleDAO.getArticleById(articleId);
		UserInfoEntity userInfoEntity=userInfoDAO.findOne(articleId);
		return userInfoEntity;
	}	
	@Override
	public List<UserInfoEntity> getAllArticles(){
		List<UserInfoEntity> list=(List<UserInfoEntity>) userInfoDAO.findAll();
		return list;
	}
	@Override
	public synchronized boolean addArticle(UserInfoEntity article){
              
		userInfoDAO.save(article);
		return true;
	}
	@Override
	public void updateArticle(UserInfoEntity article) {
	}
	@Override
	public void deleteArticle(Long articleId) {
		userInfoDAO.delete(articleId);
		
	}
}
