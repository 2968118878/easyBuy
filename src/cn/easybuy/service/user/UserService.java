package cn.easybuy.service.user;

import cn.easybuy.entity.user.User;

public interface UserService {
    public User login(String userName, String pwd);
}
