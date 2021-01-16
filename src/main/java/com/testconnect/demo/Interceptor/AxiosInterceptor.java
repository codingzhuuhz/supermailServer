package com.testconnect.demo.Interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 登录检查
 */
public class AxiosInterceptor implements HandlerInterceptor {
    //到达拦截器 进行拦截
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
       // String token = request.getHeader("token") ;
        //System.out.print("接收客户端的Tocken"+token) ;;
//        if(token == null){
//            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);//设置未授权的状态吗
//            response.getWriter().println(String.format("{'code':%s,'message':%s}",HttpServletResponse.SC_UNAUTHORIZED,"Invalidate Request Tocken")) ;
//            return false ;
//        }
        return true;
    }
}
