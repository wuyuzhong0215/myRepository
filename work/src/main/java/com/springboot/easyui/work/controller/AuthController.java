package com.springboot.easyui.work.controller;

import com.springboot.easyui.work.common.TreeNode;
import com.springboot.easyui.work.constans.SysConstant;
import com.springboot.easyui.work.pojo.Auth;
import com.springboot.easyui.work.pojo.User;
import com.springboot.easyui.work.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
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
    public List loadTree(HttpServletRequest request, @RequestParam(value = "id",required = false,defaultValue = "-1")Integer parentId){
        System.out.println("节点Id:"+parentId);
        User user = (User) request.getSession().getAttribute(String.valueOf(SysConstant.currentUser));
        List<Auth> list = authService.findAuthByParentId(parentId, user);
        List<TreeNode> nodeList = new ArrayList();
        for (Auth auth:list
             ) {
            TreeNode treeNode = new TreeNode();
            treeNode.setId(auth.getAuthId());
            treeNode.setText(auth.getAuthName());
            treeNode.setState(auth.getState());
            treeNode.setIconCls(auth.getIconCls());
            if (auth.getAuthPath() != null && !"".equals(auth.getAuthPath())) {
                Map attr = new HashMap();
                attr.put("authPath",auth.getAuthPath());
                treeNode.setAttributes(attr);
            }
            nodeList.add(treeNode);
        }
        return nodeList;
    }
}
