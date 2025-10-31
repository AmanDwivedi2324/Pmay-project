package com.aparsh.api.pmay;

import com.aparsh.api.pmay.model.SnaDetailEntity;
import com.aparsh.api.pmay.repository.AgencyRepository;
import com.aparsh.api.pmay.repository.SnaDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.List;
import com.aparsh.api.pmay.model.AgencyEntity;
@SpringBootApplication
public class PmayApplication  implements CommandLineRunner {

    @Autowired
    private SnaDetailRepository repo;
    @Autowired
    AgencyRepository agRepo;
	public static void main(String[] args) {
		SpringApplication.run(PmayApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        List<SnaDetailEntity> list = repo.findByCssCode("9180");
        System.out.println("Fetched rows: " + list.size());
        List<AgencyEntity> list1 = agRepo.findBySlsCode("RJ89");
        System.out.println("Fetched rows: " + list1.size());
    }
}
