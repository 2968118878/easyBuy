package User;

import cn.easybuy.dao.user.UserMapper;
import cn.easybuy.entity.user.User;
import cn.easybuy.utils.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

public class TestUser {
    Logger logger = Logger.getLogger(TestUser.class);
    @Test
    public void count(){
        SqlSession sqlSession = null;
        User user = new User();
        try{
            sqlSession = MyBatisUtil.createSqlSession();
            user = sqlSession.getMapper(UserMapper.class).getUserByLoginName("hpj");
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            MyBatisUtil.closeSqlSession(sqlSession);
        }
        if(user.getPassword().equals("123456")){
            logger.debug("登陆成功!欢迎您：来自:"+user.getAddressList().get(0).getAddress()+"的"+user.getUserName());
        }
    }

    @Test
    public void add(){
        SqlSession sqlSession = null;
        int result = 0;
        try{
            sqlSession = MyBatisUtil.createSqlSession();
            User user = new User();
            user.setUserName("叶笙");
            user.setLoginName("ys");
            user.setPassword("123456");
            user.setSex(1);
            user.setIdentityCode("123");
            user.setEmail("1654");
            user.setMobile("48569865");
            user.setType(1);
            result = sqlSession.getMapper(UserMapper.class).addUser(user);
            sqlSession.commit();
        }catch (Exception e){
            e.printStackTrace();
            sqlSession.rollback();
        }finally {
            MyBatisUtil.closeSqlSession(sqlSession);
        }
        if(result>0){
            logger.debug("添加成功！");
        }
    }

    @Test
    public void show(){
        System.out.println("aaa");
    }
}
