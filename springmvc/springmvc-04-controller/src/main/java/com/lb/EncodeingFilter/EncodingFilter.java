//package com.lb.EncodeingFilter;
//
//import javax.servlet.*;
//import java.io.IOException;
//
///**
// * @author: lb
// * @Date: 2021/05/11/10:51
// */
//public class EncodingFilter implements Filter {
//    public void init(FilterConfig filterConfig) throws ServletException {
//
//    }
//
//    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
//        servletRequest.setCharacterEncoding("utf-8");
//        servletResponse.setCharacterEncoding("utf-8");
//        filterChain.doFilter(servletRequest, servletResponse);
//    }
//
//    public void destroy() {
//
//    }
//}
