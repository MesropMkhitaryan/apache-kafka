package apache.kafka.apachekafka.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "newTopic", groupId = "groupId")
    void listen(String data){
        System.out.println("Listener received "+data+"successfully");
    }
}
