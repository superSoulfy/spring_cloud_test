package com.example.zuul.zuuldemo.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.http.ZuulServlet;

/**
 * Created by soulfy on 2018/2/27.
 */
public class SerRouteFilter extends ZuulFilter {//实现一些策略，比如服务选择（可以做一些其他的控制）

    @Override
    public boolean shouldFilter() {
        //ZuulServlet
        return false;
    }

    @Override
    public Object run() {
        return null;
    }

    @Override
    public String filterType() {
        return null;
    }

    @Override
    public int filterOrder() {
        return 0;
    }
}
