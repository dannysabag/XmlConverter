import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.time.LocalDate;


@Slf4j
@Component
public class XmlHandler {
    private void handleData(){
        log.info("handling XML data from: {}", LocalDate.now());
        Parser parser = new Parser();
        parser.getName();
    }
}
