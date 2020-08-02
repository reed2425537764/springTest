package cn.case6;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

/**
 * @Author: 石禹钦
 * @Date: 2020/8/2 10:48
 */
@Configuration
@ComponentScan(basePackages = "cn.case6"
//        , excludeFilters = @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = {ExcludeConfig.class})
        , excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {MyAnnotation.class})
)
public class ScanConfig {
}
