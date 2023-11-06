package com.withoutXml.Bean;

import com.Autowiring.needed;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

    @Bean
    public NeededBean neededBean(){

        return new NeededBean();
    }

    @Bean
    public DependedBean dependedBean(){
        DependedBean obj1 = new DependedBean(neededBean());
        return obj1;
    }


}
