package com.springbootcd.test2.service;

import com.springbootcd.test2.pojo.Replies;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RepliesService {
    List<Replies> getReplies(Integer id);

    void insertReply(String content,Integer infoId);
}
