package service;

import bean.UmsMember;
import bean.UmsMemberReceiveAddress;

import java.util.List;

public interface UserService {

    //查询所有用户信息
    public List<UmsMember> getUserAll();
    //根据memberId查询用户地址
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);
}
