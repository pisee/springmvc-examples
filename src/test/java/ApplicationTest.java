import java.util.Map;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.mvc.method.RequestMappingInfo;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

@RunWith(SpringJUnit4ClassRunner.class) 
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring/servlet/servlet-context.xml"})
public class ApplicationTest {

	@Resource
	ApplicationContext context;
	
	@Autowired
	private RequestMappingHandlerMapping requestMappingHandlerMapping;

	
	@Test
	public void getHandlerMappingInfo() {
		Map<RequestMappingInfo, HandlerMethod> map = requestMappingHandlerMapping.getHandlerMethods();
		StringBuilder sb = new StringBuilder();
		for (RequestMappingInfo keys : map.keySet()) {
			sb.append(map.get(keys).getShortLogMessage()).append(" ").append(keys.getPatternsCondition()).append(" ")
					.append(keys.getMethodsCondition()).append("\n");
			
		}
		System.out.println(sb.toString());
	}

}
