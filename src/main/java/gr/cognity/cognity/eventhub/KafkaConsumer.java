/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gr.cognity.cognity.eventhub;

//import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
//import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Consumer;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

/**
 *
 * @author nmpellias
 */
@Service
public class KafkaConsumer extends Consumer{
    // private final Logger logger = LoggerFactory.getLogger(Producer.class);

    @KafkaListener(topics = "MYREPLTOPIC1", groupId = "1")
    public void consume(String message) throws IOException {
    }
}





