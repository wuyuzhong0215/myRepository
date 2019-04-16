package com.springbootcd.test2.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.springbootcd.test2.dao.RepliesDAO;
import com.springbootcd.test2.pojo.Replies;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@Service
public class RepliesServiceImpl implements RepliesService {

    @Autowired
    private RepliesDAO repliesDAO;

    @Override
    public List<Replies> getReplies(Integer id) {

        return repliesDAO.selectByForeignKey(id);

    }

    @Override
    public void insertReply(String content,Integer infoId) {
        Replies rep = new Replies();
        rep.setContent(content);
        rep.setInfoid(infoId);
        rep.setReplytime(new Timestamp(new Date().getTime()));
        repliesDAO.insert(rep);
    }
}
