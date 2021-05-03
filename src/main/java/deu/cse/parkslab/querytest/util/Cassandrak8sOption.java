package deu.cse.parkslab.querytest.util;

import com.datastax.oss.driver.api.core.config.DriverOption;
import edu.umd.cs.findbugs.annotations.NonNull;

public enum Cassandrak8sOption implements DriverOption {
  ENDPOINTS("advanced.k8s.endpoints"),
  INGRESS_ADDRESS("advanced.k8s.ingress.address"),
  INGRESS_PORT("advanced.k8s.ingress.port");

  private final String path;

  Cassandrak8sOption(String path) {
    this.path = path;
  }

  @Override
  @NonNull
  public String getPath() {
    return path;
  }
}
