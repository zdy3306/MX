package com.mx.service;


import com.mx.mapper.enity.Paper;

import java.util.List;


public interface PaperService {
    //添加数据
    int addPaper(Paper paper);

    //根据ID删除一个
    int deletePaperById(Long id);

    //修改数据
    int updatePaper(Paper paper);

    //查找单个数据
    Paper queryById(Long id);

    //查找所有数据
    List<Paper> queryAllPaper();
}