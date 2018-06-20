package com.pectera.spring;

import com.pectera.spring.pojo.Quote;
import com.pectera.spring.util.Receiver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.listener.PatternTopic;
import org.springframework.data.redis.listener.RedisMessageListenerContainer;
import org.springframework.data.redis.listener.adapter.MessageListenerAdapter;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.CountDownLatch;

@RestController
@SpringBootApplication
@EnableScheduling
public class Application {

    private static final Logger log = LoggerFactory.getLogger(Application.class);

	@RequestMapping("/index")
	public String index(){
		return "hello world !";
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
//        RestTemplate restTemplate = new RestTemplate();
//        Quote quote = restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random", Quote.class);
//        log.info(quote.toString());
	}

//    @Bean
//    public RestTemplate restTemplate(RestTemplateBuilder builder) {
//        return builder.build();
//    }
//
//    @Bean
//    public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
//        return args -> {
//            Quote quote = restTemplate.getForObject(
//                    "http://gturnquist-quoters.cfapps.io/api/random", Quote.class);
//            log.info(quote.toString());
//        };
//    }
//
//    @Bean
//    RedisMessageListenerContainer container(RedisConnectionFactory connectionFactory,
//                                            MessageListenerAdapter listenerAdapter) {
//
//        RedisMessageListenerContainer container = new RedisMessageListenerContainer();
//        container.setConnectionFactory(connectionFactory);
//        container.addMessageListener(listenerAdapter, new PatternTopic("chat"));
//
//        return container;
//    }
//
//    @Bean
//    MessageListenerAdapter listenerAdapter(Receiver receiver) {
//        return new MessageListenerAdapter(receiver, "receiveMessage");
//    }
//
//    @Bean
//    Receiver receiver(CountDownLatch latch) {
//        return new Receiver(latch);
//    }
//
//    @Bean
//    CountDownLatch latch() {
//        return new CountDownLatch(1);
//    }
//
//    @Bean
//    StringRedisTemplate template(RedisConnectionFactory connectionFactory) {
//        return new StringRedisTemplate(connectionFactory);
//    }
//
//    public static void main(String[] args) throws InterruptedException {
//
//        ApplicationContext ctx = SpringApplication.run(Application.class, args);
//
//        StringRedisTemplate template = ctx.getBean(StringRedisTemplate.class);
//        CountDownLatch latch = ctx.getBean(CountDownLatch.class);
//
//        log.info("Sending message...");
//        template.convertAndSend("chat", "Hello from Redis!");
//
//        latch.await();
//
//        System.exit(0);
//    }
}
