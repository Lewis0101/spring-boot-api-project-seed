package com.company.project.service.impl;

import com.company.project.service.ManageService;

import org.apache.ibatis.exceptions.TooManyResultsException;
import org.springframework.stereotype.Service;

import java.util.List;

import tk.mybatis.mapper.entity.Condition;

/**
 * @author : LiuYang
 * @date : 2020/3/30
 */
@Service
public class ManageServiceImpl implements ManageService {
    @Override
    public String send() {
        return "hello";
    }

    @Override
    public void save(ManageService model) {

    }

    @Override
    public void save(List<ManageService> models) {

    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public void deleteByIds(String ids) {

    }

    @Override
    public void update(ManageService model) {

    }

    @Override
    public ManageService findById(Integer id) {
        return null;
    }

    @Override
    public ManageService findBy(String fieldName, Object value) throws TooManyResultsException {
        return null;
    }

    @Override
    public List<ManageService> findByIds(String ids) {
        return null;
    }

    @Override
    public List<ManageService> findByCondition(Condition condition) {
        return null;
    }

    @Override
    public List<ManageService> findAll() {
        return null;
    }
}
