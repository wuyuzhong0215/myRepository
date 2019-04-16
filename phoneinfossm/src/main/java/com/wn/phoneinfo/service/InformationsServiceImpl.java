package com.wn.phoneinfo.service;

import com.wn.phoneinfo.dao.InformationsDao;
import com.wn.phoneinfo.pojo.Informations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class InformationsServiceImpl implements InformationsService{

    @Autowired
    private InformationsDao informationsDao;

    @Override
    public List<Informations> getInformations() {
        return informationsDao.selectInformations();
    }
}
