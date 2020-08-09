package annotationConfig;

import beanFactoryPostProcessor.MyBeanDefinitionRegistryPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author ltx
 * @Date 18:46 2020/8/9
 */
@Configuration
public class MyConfig {

	@Bean
	public MyBeanDefinitionRegistryPostProcessor getBeanDefinitionRegistryPostProcessor(){
		return new MyBeanDefinitionRegistryPostProcessor();
	}
}
