package com.abis.project.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogginAspect {

	@Before("execution(public * com.abis.project.controller.PostController.getAllPost())")
	public void log()
	{
		System.out.println("getAllPost Method Called!");
	}
}
