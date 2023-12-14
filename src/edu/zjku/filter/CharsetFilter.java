package edu.zjku.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
@WebFilter("/*")
public class CharsetFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        //处理乱码
        servletResponse.setContentType("text/html;charset=UTF-8");
        //放行
        filterChain.doFilter(servletRequest, servletResponse);
    }
}
