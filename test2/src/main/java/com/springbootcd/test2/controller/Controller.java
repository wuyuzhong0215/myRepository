package com.springbootcd.test2.controller;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.springbootcd.test2.pojo.Information;
import com.springbootcd.test2.pojo.Replies;
import com.springbootcd.test2.service.InformationsService;
import com.springbootcd.test2.service.RepliesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Iterator;
import java.util.List;


@org.springframework.stereotype.Controller
public class Controller {

    private static Page<Replies> page = null;

    private static int pageNum = 1;

    private static final int PAGE_SIZE = 4;

    @Autowired
    private InformationsService informationsService;

    @Autowired
    private RepliesService repliesService;

    @RequestMapping("toIndex.html")
    public String toIndex(HttpServletRequest request){
        System.out.println("toIndex...");
        List<Information> informations = informationsService.getInformations();
        for (Information info:informations
             ) {
            System.out.println(info.getTitle());
        }
        request.getSession().setAttribute("informations",informations);
        return "index";
    }

    @RequestMapping("toMain.html")
    public String toMain(HttpServletRequest request, final String infoid) {
        //根据ID从session获取资讯对象
        Integer id = Integer.parseInt(infoid);
        List<Information> informations = (List<Information>) request.getSession().getAttribute("informations");
        Iterator<Information> iterator = informations.iterator();
        while (iterator.hasNext()){
            Information info = iterator.next();
            if (info.getId()==id){
                request.getSession().setAttribute("info",info);
            }
        }
        //根据ID从数据库获取关联的评论
        page = PageHelper.startPage(1, PAGE_SIZE).doSelectPage(()-> repliesService.getReplies(id));
        List<Replies> replies = page.getResult();
        request.getSession().setAttribute("replylist",replies);
        return "main";
    }

    //异步添加留言信息
    @RequestMapping(value="/insertReply.ajax",produces= {"application/json;charset=UTF-8"},method=RequestMethod.POST)
    @ResponseBody
    public String insertReply(@RequestParam("param") String param,String infoId,HttpServletRequest request) {
        repliesService.insertReply(param,Integer.parseInt(infoId));
        page = PageHelper.startPage(pageNum, PAGE_SIZE).doSelectPage(()-> repliesService.getReplies(Integer.parseInt(infoId)));
        List<Replies> replies = page.getResult();
        request.getSession().setAttribute("replylist",replies);
        return JSON.toJSONString(replies);
    }

    //异步翻页
    @RequestMapping(value="/changePage.ajax",produces= {"application/json;charset=UTF-8"},method=RequestMethod.POST)
    @ResponseBody
    public String changePage(@RequestParam("arg") Integer arg,String infoId,HttpServletRequest request) {
        if (pageNum+arg>0&&pageNum+arg<page.getPageSize()){
            pageNum+=arg;
        }
        page = PageHelper.startPage(pageNum, PAGE_SIZE).doSelectPage(()-> repliesService.getReplies(Integer.parseInt(infoId)));
        List<Replies> replies = page.getResult();
        for (Replies r:replies) {
            System.out.println(r);
        }
        request.getSession().setAttribute("replylist",replies);
        return JSON.toJSONString(replies);
    }
}
