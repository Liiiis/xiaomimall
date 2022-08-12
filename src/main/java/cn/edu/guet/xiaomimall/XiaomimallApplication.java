package cn.edu.guet.xiaomimall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("cn.edu.guet.xiaomimall.mapper")
@SpringBootApplication
public class XiaomimallApplication {

    public static void main(String[] args) {
        SpringApplication.run(XiaomimallApplication.class, args);
    }

}
