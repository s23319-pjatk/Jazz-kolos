package pl.s23319.nbp.application;


import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

public class NbpApplication {
    @Bean
    public RestTemplate restTemplate() {return new RestTemplate(); }

    public static void main(String[] args) {}

}
