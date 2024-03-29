package com.atguigu.gmall.user.impl;


import bean.UmsMember;
import bean.UmsMemberReceiveAddress;
import com.alibaba.dubbo.config.annotation.Service;
import com.atguigu.gmall.user.mapper.UmsMemberReceiveAddressMapper;
import com.atguigu.gmall.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import service.UserService;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;

    /**
     * 查询所有用户信息
     * @return
     */
    public List<UmsMember> getUserAll() {

        List<UmsMember> userMembers = userMapper.selectAll();

        return userMembers;

    }

    /**
     * 根据memberId查询用户收货地址
     * @param memberId
     * @return
     */
    @Override
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId) {

       /* Example example = new Example(UmsMemberReceiveAddress.class);
        example.createCriteria().andEqualTo("memberId",memberId);*/
       UmsMemberReceiveAddress umsMemberReceiveAddress = new UmsMemberReceiveAddress();
       umsMemberReceiveAddress.setMemberId(memberId);

        List<UmsMemberReceiveAddress> listReceiveAddress = umsMemberReceiveAddressMapper.select(umsMemberReceiveAddress);

        return listReceiveAddress;
    }

}
