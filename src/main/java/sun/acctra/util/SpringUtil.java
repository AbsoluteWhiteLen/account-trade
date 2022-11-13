package sun.acctra.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

public class SpringUtil {
	// the context of spring-boot
	private static ApplicationContext ac;

	@Component
	public static class ContextHolder {

		@Autowired
		public ContextHolder(ApplicationContext ac) {
			SpringUtil.ac = ac;
		}
	}

	/**
	 * get a bean by the class
	 * 
	 * @param c
	 * @return bean
	 */
	public static <T> T getBean(Class<T> c) {
		return ac.getBean(c);
	}

	/**
	 * get a bean by the name
	 * 
	 * @param name
	 * @return bean
	 */
	public static Object getBean(String name) {
		return ac.getBean(name);
	}
}
