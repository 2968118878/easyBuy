package cn.easybuy.utils;

import javax.servlet.*;
import java.io.IOException;

public class EncodeFilter implements Filter{
	private String encode = null;
	public void destroy() {
		encode = null;
	}
	
	//对所有页面设置字符集编码
	public void doFilter(ServletRequest request,ServletResponse response,FilterChain chain) throws IOException,ServletException{
		if(null==request.getCharacterEncoding()) {
			request.setCharacterEncoding(encode);
		}
		chain.doFilter(request, response);
	}
	
	public void init(FilterConfig filterConfig) throws ServletException{
		String encode = filterConfig.getInitParameter("encode");
		if(this.encode == null) {
			this.encode = encode;
		}
	}
}
