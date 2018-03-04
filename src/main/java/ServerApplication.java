import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;

@Slf4j
@EnableAutoConfiguration
@SpringBootConfiguration
@Configuration
public class ServerApplication {

    public static void main(String[] args) {
        log.info("Starting XML Converter,  at: {}", LocalDateTime.now());
        SpringApplication.run(ServerApplication.class, args);
        System.out.println("testing...");
    }

    //  git push --set-upstream https://github.com/dannysabag/XmlConverter master

}
