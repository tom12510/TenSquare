package com.tom.base.dao;

import com.tom.base.pojo.Label;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @CLASSNAME LabelDao
 * @Description
 * @Author miaomiaole
 * @Date 2019/08/08/17:51
 * Version 1.0
 **/
public interface LabelDao extends JpaRepository<Label, String>, JpaSpecificationExecutor<Label> {
}
