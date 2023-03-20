package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
        basePackages = "hello.core.member" ,
        basePackageClasses = AutoAppConfig.class,
        // AppConfig가 등록되면 안되니까 제외 처리해줌 -> 예제를 유지하기 위해서!
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
)
public class AutoAppConfig {
}


