package cn.easybuy.web.pre;

import cn.easybuy.dao.user.UserMapper;
import cn.easybuy.service.user.UserService;
import cn.easybuy.service.user.UserServiceImpl;
import cn.easybuy.utils.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;

@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
        String opr = request.getParameter("opr");
        if(opr.equals("login"))
            login(request,response);
    }

    public void login(HttpServletRequest request, HttpServletResponse response) throws IOException {
        UserService service = new UserServiceImpl();
        Writer out = response.getWriter();
        String name = request.getParameter("userName");
        String pwd = request.getParameter("pwd");
        SqlSession sqlSession = MyBatisUtil.createSqlSession();
            int user = sqlSession.getMapper(UserMapper.class).count();
            if(0!=user){
                out.write("<script>alert('aaa')</script>");
            }else {
                out.write("<script>alert('bbb')</script>");
            }
    }
}
