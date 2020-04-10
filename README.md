### 搭建微服务开发框架，快速完成产品的迭代
### 使用spring技术栈对应的版本
>1、spring-boot 2.2.6.RELEASE  
2、spring-cloud Hoxton.SR3  
3、spring-cloud-alibaba 2.2.0.RELEASE

服务发现使用的是alibaba Nacas 1.2.1  
网关使用的是spring-cloud-starter-gateway  
认证使用的是spring-cloud-starter-oauth2  


注意代码下载下来需要修改DigierpAuthorizationServerConfig这个文件中的证书配置
```
//我这里使用的阿里云的证书，所以密码我隐藏了，大家可以使用keytool生成
@Bean
public KeyPair keyPair() {
    KeyStoreKeyFactory keyStoreKeyFactory = new KeyStoreKeyFactory(new ClassPathResource("3097782_digierp.com.pfx"), "40g3zF3v".toCharArray());
    return keyStoreKeyFactory.getKeyPair("alias", "******".toCharArray());
}
```
  
   
[有问题请提Issue](https://github.com/liuhao0813/digierp-cloud/issues)
