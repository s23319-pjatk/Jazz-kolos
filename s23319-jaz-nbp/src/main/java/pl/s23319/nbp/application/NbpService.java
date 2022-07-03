package pl.s23319.nbp.application;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class NbpService {

    final Repository repository;
    final RestTemplate restTemplate;
    NbpService(Repository repository, RestTemplate restTemplate){
        this.repository=repository;
        this.restTemplate=restTemplate;
    }

    public NbpEntity getWaluta( String code,String waluta, String startDate, String endDate) {
        NbpEntity exchange = restTemplate.getForEntity("http://api.nbp.pl/api/exchangerates/rates/" + code
                +"/"+waluta+"/"+startDate+"/"+endDate+"/", NbpEntity.class).getBody();
        return repository.save(exchange);

    }
    public NbpEntity getID(Long id){


        return repository.findById(id).get();
    }

}

