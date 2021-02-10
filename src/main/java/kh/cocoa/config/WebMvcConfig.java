package kh.cocoa.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/messengerFile/**")
                .addResourceLocations("file:///C:/messengerRepository/"); //리눅스 root에서 시작하는 폴더 경로

        //지영
        registry.addResourceHandler("/boardRepository/**")
		.addResourceLocations("file:///D:/boardRepository/");

        registry.addResourceHandler("/profileFile/**")
                .addResourceLocations("file:///C:/profileRepository/"); //리눅스 root에서 시작하는 폴더 경로
    }
	
}
