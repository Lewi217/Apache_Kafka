package DevLewi.kafka.consumer;

import DevLewi.kafka.payload.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import javax.swing.*;

import static java.lang.String.format;

@Service
@Slf4j
public class KafkaConsumer {

    //@KafkaListener(topics = "wanjohi", groupId = "myGroup")
    public void consumeMsg(String msg){
        log.info(format("Consuming the message from wanjohi Topic:: %s", msg));
    }

    @KafkaListener(topics = "wanjohi", groupId = "myGroup")
    public void consumeJsonMsg(Student student){
        log.info(format("Consuming the message from wanjohi Topic:: %s", student.toString()));
    }
}
