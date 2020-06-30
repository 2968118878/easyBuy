package cn.easybuy.dao.user;

import cn.easybuy.entity.user.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    public User getUserByLoginName(@Param("loginName") String name);

    public int addUser(User user);
}
