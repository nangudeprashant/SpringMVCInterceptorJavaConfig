package interceptors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
public class LoggingInterceptor implements HandlerInterceptor  {
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
		throws Exception {
		System.out.println("In the logging interceptor which is common to all URLs.");
		System.out.println("---Before Method Execution. i.e. in the preHandle() method of LoggingInterceptor---");
		return true;
	}
	public void postHandle(	HttpServletRequest request, HttpServletResponse response,
			Object handler, ModelAndView modelAndView) throws Exception {
		System.out.println("---method executed i.e. in the postHandle() method of LoggingInterceptor---");
	}
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response,
			Object handler, Exception ex) throws Exception {
		System.out.println("---Request Completed i.e. in the afterCompletion() method of LoggingInterceptor---");
	}
} 