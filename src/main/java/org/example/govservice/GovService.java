package org.example.govservice;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.2.4
 * 2018-11-27T12:03:25.758-05:00
 * Generated source version: 3.2.4
 *
 */
@WebServiceClient(name = "GovService",
                  wsdlLocation = "file:/Users/magostta/study-workspace/spring-boot-camel-soap/src/main/resources/GovService.wsdl",
                  targetNamespace = "http://www.example.org/GovService/")
public class GovService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.example.org/GovService/", "GovService");
    public final static QName GovServiceSOAP = new QName("http://www.example.org/GovService/", "GovServiceSOAP");
    static {
        URL url = null;
        try {
            url = new URL("file:/Users/magostta/study-workspace/spring-boot-camel-soap/src/main/resources/GovService.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(GovService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/Users/magostta/study-workspace/spring-boot-camel-soap/src/main/resources/GovService.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public GovService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public GovService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public GovService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public GovService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public GovService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public GovService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns GovServicePort
     */
    @WebEndpoint(name = "GovServiceSOAP")
    public GovServicePort getGovServiceSOAP() {
        return super.getPort(GovServiceSOAP, GovServicePort.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns GovServicePort
     */
    @WebEndpoint(name = "GovServiceSOAP")
    public GovServicePort getGovServiceSOAP(WebServiceFeature... features) {
        return super.getPort(GovServiceSOAP, GovServicePort.class, features);
    }

}
