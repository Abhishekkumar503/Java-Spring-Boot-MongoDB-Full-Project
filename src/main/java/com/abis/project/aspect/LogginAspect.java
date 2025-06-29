package com.abis.project.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
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
	public void logBefore()
	{
		LOGGER.info("getAllPost Method Called!");
	}
	
	@AfterReturning("execution(public * com.abis.project.controller.PostController.getAllPost())")
	public void logAfterReturn()
	{
		LOGGER.info("getAllPost Method Executed Successfully!");
	}
	
	@AfterThrowing("execution(public * com.abis.project.controller.PostController.getAllPost())")
	public void logAfterExceptionn()
	{
		LOGGER.info("Exception occurd");
	}
	
	@After("execution(public * com.abis.project.controller.PostController.getAllPost())")
	public void logAfterFinally()
	{
		LOGGER.info("call definatly!");
	}
}
