package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author sjg
 * @version 1.0。0
 * @date 2024/1/10 10:58
 */
//创建主程序，必须放在自定义的包下，否则项目无法启动
//以后启动项目通过这个类来启动
@SpringBootApplication //此注解是用来标注该类是springboot的启动类或引导类或入口
public class SpringbootApplication {
    //main方法是JVM运行java程序的入口
    public static void main(String[] args) {
        //用来从java main方法运行一个springboot的启动类，参数是启动类的字节码文件
        SpringApplication.run(SpringbootApplication.class,args);
    }
}