
package com.list;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ListService", targetNamespace = "http://www.list.com", wsdlLocation = "http://127.0.0.1:8001/webservice/todoList?wsdl")
public class ListService
    extends Service
{

    private final static URL LISTSERVICE_WSDL_LOCATION;
    private final static WebServiceException LISTSERVICE_EXCEPTION;
    private final static QName LISTSERVICE_QNAME = new QName("http://www.list.com", "ListService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://127.0.0.1:8001/webservice/todoList?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        LISTSERVICE_WSDL_LOCATION = url;
        LISTSERVICE_EXCEPTION = e;
    }

    public ListService() {
        super(__getWsdlLocation(), LISTSERVICE_QNAME);
    }

    public ListService(WebServiceFeature... features) {
        super(__getWsdlLocation(), LISTSERVICE_QNAME, features);
    }

    public ListService(URL wsdlLocation) {
        super(wsdlLocation, LISTSERVICE_QNAME);
    }

    public ListService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, LISTSERVICE_QNAME, features);
    }

    public ListService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ListService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns List
     */
    @WebEndpoint(name = "ListPort")
    public List getListPort() {
        return super.getPort(new QName("http://www.list.com", "ListPort"), List.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns List
     */
    @WebEndpoint(name = "ListPort")
    public List getListPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.list.com", "ListPort"), List.class, features);
    }

    private static URL __getWsdlLocation() {
        if (LISTSERVICE_EXCEPTION!= null) {
            throw LISTSERVICE_EXCEPTION;
        }
        return LISTSERVICE_WSDL_LOCATION;
    }

}
