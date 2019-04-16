package com.wn.phoneinfo.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.wn.phoneinfo.dao.RepliesDao;
import com.wn.phoneinfo.pojo.Replies;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@Service
public class RepliesServiceImpl implements RepliesService {

    @Autowired
    private RepliesDao repliesDao;

    @Override
    public List<Replies> getReplies(Integer id) {

        return repliesDao.selectByForeignKey(id);
    }

    @Override
    public void insertReply(String content,Integer infoId) {
        Replies rep = new Replies();
        rep.setContent(content);
        rep.setInfoid(infoId);
        rep.setReplytime(new Timestamp(new Date().getTime()));
        repliesDao.insert(rep);
    }
}
