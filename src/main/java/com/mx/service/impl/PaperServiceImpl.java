package com.mx.service.impl;

import com.mx.mapper.PaperDao;
import com.mx.mapper.enity.Paper;
import com.mx.service.PaperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaperServiceImpl implements PaperService {

    @Autowired
    private PaperDao paperDao;

    @Override
    public int addPaper(Paper paper) {
        return paperDao.addPaper(paper);
    }

    @Override
    public int deletePaperById(Long id) {
        return paperDao.deletePaperById(id);
    }

    @Override
    public int updatePaper(Paper paper) {
        return paperDao.updatePaper(paper);
    }

    @Override
    public Paper queryById(Long id) {
        return paperDao.queryById(id);
    }


    @Override
    public List<Paper> queryAllPaper() {
        return paperDao.queryAllPaper();
    }

}