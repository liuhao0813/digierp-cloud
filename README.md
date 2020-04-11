### 搭建微服务开发框架，快速完成产品的迭代
### 使用spring技术栈对应的版本
>1、spring-boot 2.2.6.RELEASE  
2、spring-cloud Hoxton.SR3  
3、spring-cloud-alibaba 2.2.0.RELEASE

服务发现使用的是alibaba Nacas 1.2.1  
网关使用的是spring-cloud-starter-gateway  
认证使用的是spring-cloud-starter-oauth2  

key的生成  
keytool -genkeypair -alias oauth2-jwt -keyalg RSA -keysize 2048 -keystore oauth2-jwt.jks -keypass oauth2 -storepass oauth2

   
[有问题请提Issue](https://github.com/liuhao0813/digierp-cloud/issues)
