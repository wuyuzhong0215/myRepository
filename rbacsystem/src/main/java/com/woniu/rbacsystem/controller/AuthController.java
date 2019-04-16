package com.woniu.rbacsystem.controller;

import com.woniu.rbacsystem.common.TreeNode;
import com.woniu.rbacsystem.constant.SysConstant;
import com.woniu.rbacsystem.pojo.Auth;
import com.woniu.rbacsystem.pojo.User;
import com.woniu.rbacsystem.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    @RequestMapping("/loadTree")
    @ResponseBody
    public List loadTree(HttpSession session,@RequestParam(value = "id",required = false,defaultValue = "-1") Integer parentId){

        System.out.println("节点Id："+parentId);
        User user = (User) session.getAttribute(SysConstant.CURRENT_USER);
        List<Auth> list = authService.findAuthByParentId(parentId,user);
        List<TreeNode> nodeList = new ArrayList();
        for (Auth auth : list) {
            TreeNode node = new TreeNode();
            node.setId(auth.getAuthId());
            node.setText(auth.getAuthName());
            node.setState(auth.getState());
            node.setIconCls(auth.getIconCls());
            if(auth.getAuthPath() != null && !"".equals(auth.getAuthPath())){
                Map attr= new HashMap();
                attr.put("authPath",auth.getAuthPath());
                node.setAttributes(attr);
            }
            nodeList.add(node);
        }
        return nodeList;
    }
}
