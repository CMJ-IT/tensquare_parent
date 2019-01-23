package com.tensquare.base.service;

import com.tensquare.base.dao.LabelDao;
import com.tensquare.base.pojo.Label;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import util.IdWorker;
import java.util.List;
import java.util.Map;

/**标签的service*/
@Service
public class LabelService {
    @Autowired
    private LabelDao labelDao;
    @Autowired
    private IdWorker idWorker;

    /*查询所有*/
    public List<Label> findAll(){
        return labelDao.findAll();
    }

    /*根据id 查询*/
    public Label findById(String id){
        return labelDao.findById(id).get();
    }

    /*添加*/
    public void add(Label label){
        //设置id
        label.setId(idWorker.nextId()+"");
        labelDao.save(label);
    }

    /*修改*/
    /*修改*/
    public void update(Label label){
        labelDao.save(label);
    }

    /*根据id 删除*/
    public void deleteById(String id){
        labelDao.deleteById(id);
    }

    /*创建查询条件*/
    public Object findSearch(Map searchMap) {
        /*123*/
        return null;
    }
}