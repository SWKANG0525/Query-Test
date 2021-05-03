package deu.cse.parkslab.querytest.util;

import com.datastax.oss.driver.api.core.addresstranslation.AddressTranslator;
import com.datastax.oss.driver.api.core.context.DriverContext;
import edu.umd.cs.findbugs.annotations.NonNull;

import java.net.InetSocketAddress;

public class CassandraK8sIngressAddressTranslator implements AddressTranslator {
  final private DriverContext driverContext;

  public CassandraK8sIngressAddressTranslator(DriverContext driverContext) {
    this.driverContext = driverContext;
  }

  @NonNull
  @Override
  public InetSocketAddress translate(@NonNull InetSocketAddress address) {
    String ingressAddress = driverContext.getConfig().getDefaultProfile().getString(Cassandrak8sOption.INGRESS_ADDRESS);
    int ingressPort = driverContext.getConfig().getDefaultProfile().getInt(Cassandrak8sOption.INGRESS_PORT);

    return new InetSocketAddress(ingressAddress, ingressPort);
  }

  @Override
  public void close() {
    // NOOP
  }
}
