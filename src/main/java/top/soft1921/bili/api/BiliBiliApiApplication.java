package top.soft1921.bili.api;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.oas.annotations.EnableOpenApi;

/**
 * @author Flobby
 */


@EnableOpenApi
@SpringBootApplication
@MapperScan("top.soft1921.bili.api.mapper")
public class BiliBiliApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(BiliBiliApiApplication.class, args);
    }
}
