package com.atguigu.springboot;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * 自动配置原理：
 *  分析源码：
 *      1.@SpringBootConfiguration（SpringBoot提供） 用于声明配置类。等价于 @Configuration(Spring提供)
 *      2.@EnableAutoConfiguration 自动配置注解。框架底层提供大量的配置类（一个配置类就相当于一个XML配置文件）。所以，我们无需去编写配置，直接用即可。
 *          通过跟踪源码，项目启动会从META-INF/spring.factories文件中加载配置类。
 *          spring.factories文件可以通过扫描jar包来获得。
 *          其中，spring-boot-autoconfigure-2.2.2.RELEASE.jar包是非常重要的。我们需要加载配置类是来自这个包。
 *          这些配置一般都是以XxxConfiguration结尾的（版本2.2.2.RELEASE 有124个配置类）。
 *          每一个配置类，都会用【条件注解】进行判断，如果，引入相关starters模块（jar包），这个模块对应的配置类就会生效。
 *          @ConditionalOnWebApplication
 *          @ConditionalOnClass
 *          @ConditionalOnProperty
 *      3.@ComponentScan用于设置扫描包。如果不设置这个注解，默认扫描main程序所在的包以及子包。
 *          可以自定义，但不推荐（遵守：约定>配置>编码   开发规则）。
 */
@MapperScan("com.atguigu.springboot.mapper")
@EnableTransactionManagement // 开启声明式事务
@SpringBootApplication //声明当前项目是一个SpringBoot项目 是一个SpringBoot引导类
public class MySpringBootApplication {

    public static void main(String[] args) {
        //启动Tomcat服务器。内置Tomcat。 run参数就是SpringBoot引导类的字节码对象
        //SpringApplication.run(MySpringBootApplication.class,args);
        ApplicationContext act = SpringApplication.run(MySpringBootApplication.class, args);
    }
}

