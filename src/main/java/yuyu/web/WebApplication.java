package yuyu.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import yuyu.web.entity.system.AjaxResult;

@SpringBootApplication
public class WebApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebApplication.class, args);

        AjaxResult r=AjaxResult.success();
    }

}
