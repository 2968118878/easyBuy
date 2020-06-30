package cn.easybuy.service.user;

import cn.easybuy.dao.user.UserMapper;
import cn.easybuy.entity.User;
import cn.easybuy.utils.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

public class UserServiceImpl implements UserService{
    /**
     * 登录
     * @param userName
     * @param pwd
     * @return
     */
    @Override
    public User login(String userName,String pwd) {
        SqlSession sqlSession = null;
        User user = null;
        try{
            sqlSession = MyBatisUtil.createSqlSession();
            user = sqlSession.getMapper(UserMapper.class).getUserByLoginName(userName);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            MyBatisUtil.closeSqlSession(sqlSession);
        }
        if(null!=user){
            if(!user.getPassword().equals(pwd)){
                user = null;
            }
        }
        return user;
    }
}
