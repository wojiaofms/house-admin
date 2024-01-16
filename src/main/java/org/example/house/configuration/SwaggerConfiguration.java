///**
// * Copyright 2016-2030 this code originate from mgicode framework, using it under the below License
// * <p>
// * Licensed under the Apache License, Version 2.0 (the "License");
// * you may not use this file except in compliance with the License.
// * You may obtain a copy of the License at
// * <p>
// * http://www.apache.org/licenses/LICENSE-2.0
// * <p>
// * Unless required by applicable law or agreed to in writing, software
// * distributed under the License is distributed on an "AS IS" BASIS,
// * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// * See the License for the specific language governing permissions and
// * limitations under the License.
// */
//package org.example.house.configuration;
//
//import io.swagger.annotations.ApiOperation;
//import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
//import springfox.documentation.builders.ApiInfoBuilder;
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.service.ApiInfo;
//import springfox.documentation.service.Contact;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//
//@Configuration
////@EnableKnife4j
//public class SwaggerConfiguration extends WebMvcConfigurerAdapter {
//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        super.addResourceHandlers(registry);
//        registry.addResourceHandler("/filesave/**").addResourceLocations("file:./filesave/");
//    }
//    //Knife4j的UI
//    @Bean
//    @ConditionalOnProperty(name = "swagger.show", havingValue = "true")
//    public Docket createRestApi() {
//        return new Docket(DocumentationType.SWAGGER_2)
//                .pathMapping("/")
//                .apiInfo(apiInfo())
//                .select()
//                .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
//                .paths(PathSelectors.any())
//                .build();
//    }
//
//    private ApiInfo apiInfo() {
//        //http://localhost:8080/chain-main/doc.html
//        return new ApiInfoBuilder()
//                .title("swagger-bootstrap-ui RESTful APIs")
//                .description("swagger-bootstrap-ui")
//                .termsOfServiceUrl("http://localhost:8080/")
//                .contact(new Contact("彭仁夔", "mgicode.com", "sjkjs155@126.com"))
//                .version("1.0")
//                .build();
//    }
//
///*    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        super.addResourceHandlers(registry);
//        registry.addResourceHandler("/upload/**").addResourceLocations("file:///C:/chain/upload/");
//    }*/
//
////    @Override
////    public void addResourceHandlers(ResourceHandlerRegistry registry) {
////        if (this.swaggerShow) {
////            registry.addResourceHandler("swagger-ui.html")
////                    .addResourceLocations("classpath:/META-INF/resources/");
////
////            registry.addResourceHandler("/webjars/**")
////                    .addResourceLocations("classpath:/META-INF/resources/webjars/");
////        }
////    }
//
//
////    @Value("${swagger.show:true}")
////    private boolean swaggerShow;
//    //swagger-ui原始的UI
////    @Override
////    public void addResourceHandlers(ResourceHandlerRegistry registry) {
////        super.addResourceHandlers(registry);
////        registry.addResourceHandler("swagger-ui.html").addResourceLocations("classpath:/META-INF/resources/");
////        registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
////        registry.addResourceHandler("/swagger/**").addResourceLocations("classpath:/swagger/");
////    }
////
////    @Bean
////    public Docket docket() {
////        List<ResponseMessage> responseMessages = new ArrayList<ResponseMessage>();
////        responseMessages.add(new ResponseMessageBuilder().code(HttpServletResponse.SC_OK).message("操作成功").build());
////        responseMessages.add(new ResponseMessageBuilder().code(HttpServletResponse.SC_NOT_FOUND).message("资源不存在").build());
////        responseMessages.add(new ResponseMessageBuilder().code(HttpServletResponse.SC_INTERNAL_SERVER_ERROR).message("服务器异常").build());
////
////        return new Docket(DocumentationType.SWAGGER_2)
////                .apiInfo(apiInfo())
////                .useDefaultResponseMessages(false)
////                .globalResponseMessage(RequestMethod.GET, responseMessages)
////                .globalResponseMessage(RequestMethod.POST, responseMessages)
////                .globalResponseMessage(RequestMethod.DELETE, responseMessages)
////                .select()
////                .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
////                .paths(PathSelectors.any())
////                .build();
////    }
////
////    private ApiInfo apiInfo() {
////        return new ApiInfoBuilder()
////                .title("测试项目")
////                .version("1.0.0")
////                .description("这是项目描述")
////                .contact(new Contact("彭仁夔", "mgicode.com", "sjkjs155@126.com"))
////                .build();
////    }
//
//}