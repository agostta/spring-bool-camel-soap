package org.example.govservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.2.4
 * 2018-11-27T12:03:25.715-05:00
 * Generated source version: 3.2.4
 *
 */
@WebService(targetNamespace = "http://www.example.org/GovService/", name = "GovServicePort")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface GovServicePort {

    @WebMethod(action = "http://www.example.org/GovService/getGovdetailsByname")
    @WebResult(name = "GovResponse", targetNamespace = "http://www.example.org/GovService/", partName = "parameters")
    public GovResponse getGovdetailsByname(
        @WebParam(partName = "parameters", name = "GovRequest", targetNamespace = "http://www.example.org/GovService/")
        GovRequest parameters
    );
}