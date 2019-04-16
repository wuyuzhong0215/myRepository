package com.springbootcd.test2.service;

import com.springbootcd.test2.dao.InformationDAO;
import com.springbootcd.test2.dao.InformationDAO;
import com.springbootcd.test2.pojo.Information;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class InformationsServiceImpl implements InformationsService{

    @Autowired
    private InformationDAO informationDAO;

    @Override
    public List<Information> getInformations() {
        return informationDAO.selectInformations();
    }
}
