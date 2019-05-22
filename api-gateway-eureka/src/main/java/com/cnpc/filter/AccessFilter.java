package com.cnpc.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;

/**
 * @ClassName AccessFilter
 * @Description TODO
 * @Author magic_罗璋
 * @Date 2019/5/22 10:33
 * @Version 1.0
 **/
public class AccessFilter extends ZuulFilter {

    public static final Logger log = LoggerFactory.getLogger( AccessFilter.class );
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        RequestContext context = RequestContext.getCurrentContext();
        HttpServletRequest request = context.getRequest();

        log.info("send {} request to {}", request.getMethod(), request.getRequestURL().toString());
        Object accessToken = request.getParameter( "accessToken" );
        if(accessToken ==null){
            log.warn( "accessToken is NULL" );
            context.setSendZuulResponse( false );
            context.setResponseStatusCode( 401 );
            return null;
        }
        log.info( "accessToken OK" );
        return null;
    }
}
