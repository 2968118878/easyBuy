package cn.easybuy.utils;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class EncodeFilter implements Filter{
	public void destroy() {

	}
	
	//对所有页面设置字符集编码
	public void doFilter(ServletRequest request,ServletResponse response,FilterChain chain) throws IOException,ServletException{
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse resp = (HttpServletResponse) response;
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html; charset=UTF-8");
		resp.setCharacterEncoding("utf-8");
		chain.doFilter(req, resp);
	}
	
	public void init(FilterConfig filterConfig) throws ServletException{
	}
}
