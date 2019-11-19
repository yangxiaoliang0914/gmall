package com.atguigu.gmall.user.service;

import com.atguigu.gmall.user.bean.UmsMember;
import com.atguigu.gmall.user.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface UserService {

    //查询所有用户信息
    public List<UmsMember> getUserAll();
    //根据memberId查询用户地址
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);
}
