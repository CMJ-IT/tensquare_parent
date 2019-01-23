package com.tensquare.base.dao;

import com.tensquare.base.pojo.Label;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**标签的dao*/
/*JpaRepository 提供了基本的增删改查
JpaSpecificationExecutor 用于做复杂的条件查询*/
public interface LabelDao extends JpaRepository<Label,String>, JpaSpecificationExecutor<Label> {

}
