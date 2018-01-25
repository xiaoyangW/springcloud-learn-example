package com.cloud.zuul;

import com.cloud.zuul.config.RequestLogFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.filters.discovery.PatternServiceRouteMapper;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableZuulProxy
public class ZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulApplication.class, args);
	}

	/**
	 * 使用正则表达式方式路由，
	 * 添加该方式后,在原有的服务中，appname-v1,
	 * 如 micoserice-zipkin-v1
	 * @return
	 */
	/*@Bean
	public PatternServiceRouteMapper serviceRouteMapper(){
		return new PatternServiceRouteMapper(
				"(?<name>^.+)-(?<version>v.+$)",
				"${version}/${name}");
	}*/

	/**
	 * 添加zuul过滤器Bean
	 * @return RequestLogFilter
	 */
	@Bean
	public RequestLogFilter getRequestLogFilter(){
		return new RequestLogFilter();
	}
}
