package trung.example;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

public class Init extends SpringBootServletInitializer {
	
@Override
protected SpringApplicationBuilder configure(
		SpringApplicationBuilder application) {
	// TODO Auto-generated method stub
	application.sources(Application.class);
	return super.configure(application);
}
	
}
