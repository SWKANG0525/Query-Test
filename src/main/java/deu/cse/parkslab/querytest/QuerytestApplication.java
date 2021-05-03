package deu.cse.parkslab.querytest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;

@SpringBootApplication

public class QuerytestApplication {

    public static void main(String[] args) {
        SpringApplication.run(QuerytestApplication.class, args);
    }

}
