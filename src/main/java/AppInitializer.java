import static org.springframework.core.Ordered.HIGHEST_PRECEDENCE;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.apache.catalina.Container;
import org.apache.catalina.Context;
import org.apache.catalina.Wrapper;
/*import org.lightadmin.api.config.LightAdmin;
import org.lightadmin.core.config.LightAdminWebApplicationInitializer;*/
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.context.embedded.tomcat.TomcatContextCustomizer;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.annotation.Order;


@SpringBootApplication
@ComponentScan({ "com.boot.configuration" })
@Order(HIGHEST_PRECEDENCE)
public class AppInitializer/* extends SpringBootServletInitializer*/ {

	/*@Bean
	public ServletContextInitializer servletContextInitializer() {
		return new ServletContextInitializer() {
			@Override
			public void onStartup(ServletContext servletContext) throws ServletException {
				LightAdmin.configure(servletContext).basePackage("com.boot.admin").baseUrl("/admin")
						.security(true).backToSiteUrl("http://lightadmin.org");

				new LightAdminWebApplicationInitializer().onStartup(servletContext);
			}
		};
	}*/

	
	/*@Bean
    public EmbeddedServletContainerCustomizer servletContainerCustomizer() {
        return new EmbeddedServletContainerCustomizer() {

            @Override
            public void customize(ConfigurableEmbeddedServletContainer container) {
                if (container instanceof TomcatEmbeddedServletContainerFactory) {
                    customizeTomcat((TomcatEmbeddedServletContainerFactory)container); 
                }
            }

            private void customizeTomcat(TomcatEmbeddedServletContainerFactory tomcatFactory) {
                tomcatFactory.addContextCustomizers(new TomcatContextCustomizer() {

                    @Override
                    public void customize(Context context) {
                        Container jsp = context.findChild("jsp");
                        if (jsp instanceof Wrapper) {
                            ((Wrapper)jsp).addInitParameter("development", "false");
                        }

                    }

                });
            }

        };
}*/
	
	
	
	public static void main(String[] args) throws Exception{
		ApplicationContext ctx = SpringApplication.run(AppInitializer.class, args);

		System.out.println("Let's inspect the beans provided by Spring Boot:");

		/*
		 * String[] beanNames = ctx.getBeanDefinitionNames();
		 * Arrays.sort(beanNames); for (String beanName : beanNames) {
		 * System.out.println(beanName); }
		 */
	}

	/*@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(AppInitializer.class);
	}*/
}