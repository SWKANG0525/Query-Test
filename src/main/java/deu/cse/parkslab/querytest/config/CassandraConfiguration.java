package deu.cse.parkslab.querytest.config;

import com.datastax.oss.driver.api.core.CqlSession;
import com.datastax.oss.driver.api.core.config.DriverConfigLoader;
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
                .withAuthCredentials("cluster1-superuser","pZPOBL_Z4KAzerbBM5exczCN5NtsQCGs0Trm-ta34XPuah7mwzVu3Q")
//                .withAuthCredentials("cluster1-superuser","Gip-H--zWA8IUWAFL_oSwQJDACbOITgcKvpy3WmHbA6QaIiA0FFovw")
                .withKeyspace("cycling")
                .build();
    }

}