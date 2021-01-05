package org.lewis.management.system.common.servlet;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * @author : lewis[1005859278@qq.com]
 * @date : 2021/1/5
 * @desc :
 */
@WebFilter(filterName = "MyFilter",urlPatterns = "/first")
public class MyFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("初始化过滤器");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("进入Filter");
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("离开Filter");
        destroy();
    }

    @Override
    public void destroy() {
        System.out.println("销毁过滤器");
    }
}
