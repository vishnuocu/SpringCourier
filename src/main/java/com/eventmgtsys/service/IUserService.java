package com.eventmgtsys.service;

import java.util.List;

import com.eventmgtsys.model.UserInfoEntity;

public interface IUserService {
	List<UserInfoEntity> getAllArticles();
	UserInfoEntity getArticleById(Long id);
    boolean addArticle(UserInfoEntity userInfo);
    void updateArticle(UserInfoEntity userInfo);
    void deleteArticle(Long id);
}
