# Tomcat开启https访问支持


## 1.生成https数字签名证书 
使用jdk自动工具生成自签名数字证书，windows命令如下：
```
>keytool -genkey -alias tomcat-https -keyalg RSA -keysize 2048 -keystore xc.p12 -validity 365 -dname "CN=hdsam, OU=test-group, O=test, L=HuBei, ST=Wuhan, C=CN"
```
生成的这个文件包含了公私钥等信息。

## 2. 拷贝JKS文件至项目中
这里可以放在classpath中，也可以放在其他目录下,如果放在其他目录下，可以去掉配置路径中加`classpath:`部分，仓库代码没有提交该文件。

## 3. yml中配置ssl相关配置
配置jks文件路径等和生成签名的相关参数。

## 4. 启动项目并开启浏览器访问 
测试https 443端口`https://localhost/api` , 测试http 8080端口时，可重定向到443端口:`http://localhost:8080/api`



