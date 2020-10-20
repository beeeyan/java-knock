# java-knock
Excercies of Spring Boot (Java)

Spring Boot (Java) の備忘録・練習問題  
  
※DBを利用する場合  
dockerのmysqlの起動  
  
```
$ cd knock/
$ docker-compose up -d
```
  
mysqlのアカウント名・パスワードの調整する場合  
以下docker-compose.ymlの「MYSQL_USER」「MYSQL_PASSWORD」を変更  
  
```docker-compose.yml
version: '3'

services:
    # MySQL
    db:
        # 2020/1/13リリースバージョン
        image: mysql:8.0.19
        command: mysqld --character-set-server=utf8 --collation-server=utf8_unicode_ci
        # ローカルからDBにアクセスする場合
        command: --default-authentication-plugin=mysql_native_password
        environment:
            MYSQL_DATABASE: java_knock_db
            MYSQL_ROOT_PASSWORD: root
            MYSQL_USER: beeeeyan
            MYSQL_PASSWORD: test
            TZ: 'Asia/Tokyo'
        volumes:
          # 永続化したい場合
          # - ./db/data:/var/lib/mysql
          - ./dockermysql/initdb:/docker-entrypoint-initdb.d
        ports:
          - 33306:3306
        container_name: java_knock_db⏎
```

アプリからアクセスできるように、以下のapplication.propertiesの  
「spring.datasource.username」「spring.datasource.password」調整  
  
```src/resources/application.properties 
spring.datasource.url = jdbc:mysql://127.0.0.1:33306/java_knock_db?serverTimezone=JST
spring.datasource.username=beeeeyan
spring.datasource.password=test
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
```