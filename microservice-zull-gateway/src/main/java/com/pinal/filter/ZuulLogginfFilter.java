package com.pinal.filter;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

@Component
public class ZuulLogginfFilter extends ZuulFilter{

	private Logger logger=LoggerFactory.getLogger(this.getClass().getName());
	
	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public Object run() throws ZuulException {
		HttpServletRequest requestContext=RequestContext.getCurrentContext().getRequest();
		logger.info("request :::::::::::::::::::>>> {}  request uri :::::::::::::::::::>>> {}",requestContext,requestContext.getRequestURI());
		return null;
	}

	@Override
	public String filterType() {
		return "pre";
	}

	@Override
	public int filterOrder() {
		return 1;
	}

}
