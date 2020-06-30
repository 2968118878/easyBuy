package cn.easybuy.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * Mybatis工具类
 */
public class MyBatisUtil {
    private static SqlSessionFactory factory;
    static {    //在静态代码块中，factory只会被创建一次
        InputStream is = null;
        try {
            is = Resources.getResourceAsStream("mybatis-config.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        factory = new SqlSessionFactoryBuilder().build(is);
    }

    //创建SQLSession对象
    public static SqlSession createSqlSession(){
        return factory.openSession(false);      //true为自动提交事务
    }

    //关闭SQLSession对象
    public static void closeSqlSession(SqlSession sqlSession){
        if(null != sqlSession){
            sqlSession.close();
        }
    }
}
