package com.withoutXml.ComponentScan;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration              // is used to tell that this class is configuration class
@ComponentScan(basePackages = "com.withoutXml")

public class JavaConfig {

}
