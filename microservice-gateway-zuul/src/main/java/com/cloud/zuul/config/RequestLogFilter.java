package com.cloud.zuul.config;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.servlet.http.HttpServletRequest;
import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.PRE_TYPE;
import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.SIMPLE_HOST_ROUTING_FILTER_ORDER;

/**
 * @author wxy
 * zuul过滤器
 * zuul中定义了四种标准过滤类型，这些过滤类型对应请求的生命周期
 *
 * PRE:这种过滤类型在请求被路由之前调用。可利用这种过滤器实现身份验证，在集群中选择请求的微服务，记录调试信息等。
 *
 * ROUTING:这种过滤器将请求路由到微服务。这种过滤用于构建发送给微服务的请求，
 *             并可以使用Apache HttpClient,Fegin,Ribbon请求微服务。
 * POST:这种过滤器在路由到微服务以后执行。这种过滤器可用来微响应添加标准的http header,
 *      搜集统计信息和指标，将响应发送给客户端。
 * ERROR:在其他阶段发生错误时执行该过滤器。
 *
 * http://cloud.spring.io/spring-cloud-static/Finchley.M2/#_router_and_filter_zuul
 */
public class RequestLogFilter extends ZuulFilter {
    private static Logger logger = LoggerFactory.getLogger(RequestLogFilter.class);
    @Override
    public String filterType() {
        return PRE_TYPE;
    }

    @Override
    public int filterOrder() {
        return 1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        RequestContext requestContext =RequestContext.getCurrentContext();
        HttpServletRequest request = requestContext.getRequest();
        logger.info(String.format("send %s request to %s",request.getMethod(),request.getRequestURL().toString()));
        return null;
    }
}
