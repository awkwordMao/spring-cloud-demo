package com.jl.demo.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.springframework.stereotype.Component;
import javax.servlet.http.HttpServletRequest;

@Component
public class HelloFilter extends ZuulFilter {
    @Override
    public String filterType() {
//		pre：路由之前
//		routing：路由之时
//		post： 路由之后
//		error：发送错误调用
        return "pre";
    }

    /**
     * 过滤顺序
     * @return
     */
    @Override
    public int filterOrder() {
        return 0;
    }

    /**
     * 可以写逻辑判断，是否要过滤，true为永远过滤
     * @return
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    /**
     * 过滤器的具体逻辑
     * @return
     */
    @Override
    public Object run() {
        RequestContext context = RequestContext.getCurrentContext();
        HttpServletRequest request = context.getRequest();
        System.out.println(request.getMethod() + "--" + request.getRequestURL());
        Object name = request.getParameter("name");
        System.out.println(name);
        if(name == null || !"lijie".equals(name)){
            context.setSendZuulResponse(false);
            context.setResponseStatusCode(401);
            try{
                context.getResponse().setContentType("text/html;charset=utf-8");
                context.getResponse().getWriter().write("用户名不对");
            }catch (Exception e){
                e.printStackTrace();
            }
            return null;
        }
        return null;
    }

}
