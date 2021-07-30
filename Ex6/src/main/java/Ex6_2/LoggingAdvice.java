package Ex6_2;

import org.aopalliance.intercept.*;
import org.springframework.util.StopWatch;

public class LoggingAdvice implements MethodInterceptor {
	public Object invoke(MethodInvocation invocation) throws Throwable {
		String methodName = invocation.getMethod().getName();
		StopWatch sw = new StopWatch();

		sw.start(methodName);
		System.out.println("[LOG] METHOD: " + methodName + " is calling.");

		Object rtnObj = invocation.proceed();
		// sayHello 실행

		sw.stop();
		System.out.println("[LOG] METHOD: " + methodName + " was called.");
		System.out.println("[LOG] 처리시간: " + (sw.getTotalTimeMillis() / 1000.0) + "초");

		return rtnObj;
	}
}
