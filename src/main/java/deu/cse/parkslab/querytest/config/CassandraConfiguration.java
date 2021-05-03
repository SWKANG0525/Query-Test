package deu.cse.parkslab.querytest.config;

import com.datastax.oss.driver.api.core.CqlSession;
import com.datastax.oss.driver.api.core.config.DriverConfigLoader;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.net.InetSocketAddress;


@Configuration
public class CassandraConfiguration {
    @Bean
    public CqlSession session() {
        return CqlSession.builder()
                .withConfigLoader(DriverConfigLoader.fromClasspath("CassandraIngress.conf"))
                .withLocalDatacenter("dc1")
                .build();
    }

}