package com.abis.project.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogginAspect {

	private static final Logger LOGGER = LoggerFactory.getLogger(LogginAspect.class);
	
	@Before("execution(public * com.abis.project.controller.PostController.getAllPost())")
	public void log()
	{
		LOGGER.info("getAllPost Method Called!");
	}
}
