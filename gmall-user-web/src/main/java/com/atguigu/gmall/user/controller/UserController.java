package com.atguigu.gmall.user.controller;


import bean.UmsMember;
import bean.UmsMemberReceiveAddress;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import service.UserService;

import java.util.List;

@Controller
public class UserController {

    @Reference
    private UserService userService;

    /**
     * 查询所有用户信息
     * @return
     */
    @RequestMapping("/getUserAll")
    @ResponseBody
    public List<UmsMember> getUserAll(){

        List<UmsMember> umsMemberList = userService.getUserAll();

        return umsMemberList;
    }

    /**
     * 根据memberId查询用户收货信息
     * @param memberId
     * @return
     */
    @RequestMapping("/getReceiveByMemberId")
    @ResponseBody
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId){
        List<UmsMemberReceiveAddress> umsMemberReceiveAddresses = userService.getReceiveAddressByMemberId(memberId);
        return umsMemberReceiveAddresses;
    }

}
