
package br.ifirst.tissapi.ws;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "tissVerificaElegibilidade", targetNamespace = "http://www.ans.gov.br/tiss/ws/tipos/tissverificaelegibilidade/v30302", wsdlLocation = "tissVerificaElegibilidadeV3_03_02.wsdl")
public class TissVerificaElegibilidade
    extends Service
{

    private final static URL TISSVERIFICAELEGIBILIDADE_WSDL_LOCATION;
    private final static WebServiceException TISSVERIFICAELEGIBILIDADE_EXCEPTION;
    private final static QName TISSVERIFICAELEGIBILIDADE_QNAME = new QName("http://www.ans.gov.br/tiss/ws/tipos/tissverificaelegibilidade/v30302", "tissVerificaElegibilidade");

    static {
        TISSVERIFICAELEGIBILIDADE_WSDL_LOCATION = br.ifirst.tissapi.ws.TissVerificaElegibilidade.class.getResource("tissVerificaElegibilidadeV3_03_02.wsdl");
        WebServiceException e = null;
        if (TISSVERIFICAELEGIBILIDADE_WSDL_LOCATION == null) {
            e = new WebServiceException("Cannot find 'tissVerificaElegibilidadeV3_03_02.wsdl' wsdl. Place the resource correctly in the classpath.");
        }
        TISSVERIFICAELEGIBILIDADE_EXCEPTION = e;
    }

    public TissVerificaElegibilidade() {
        super(__getWsdlLocation(), TISSVERIFICAELEGIBILIDADE_QNAME);
    }

    public TissVerificaElegibilidade(WebServiceFeature... features) {
        super(__getWsdlLocation(), TISSVERIFICAELEGIBILIDADE_QNAME, features);
    }

    public TissVerificaElegibilidade(URL wsdlLocation) {
        super(wsdlLocation, TISSVERIFICAELEGIBILIDADE_QNAME);
    }

    public TissVerificaElegibilidade(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, TISSVERIFICAELEGIBILIDADE_QNAME, features);
    }

    public TissVerificaElegibilidade(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public TissVerificaElegibilidade(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns TissVerificaElegibilidadePortType
     */
    @WebEndpoint(name = "tissVerificaElegibilidade_Port")
    public TissVerificaElegibilidadePortType getTissVerificaElegibilidadePort() {
        return super.getPort(new QName("http://www.ans.gov.br/tiss/ws/tipos/tissverificaelegibilidade/v30302", "tissVerificaElegibilidade_Port"), TissVerificaElegibilidadePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns TissVerificaElegibilidadePortType
     */
    @WebEndpoint(name = "tissVerificaElegibilidade_Port")
    public TissVerificaElegibilidadePortType getTissVerificaElegibilidadePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.ans.gov.br/tiss/ws/tipos/tissverificaelegibilidade/v30302", "tissVerificaElegibilidade_Port"), TissVerificaElegibilidadePortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (TISSVERIFICAELEGIBILIDADE_EXCEPTION!= null) {
            throw TISSVERIFICAELEGIBILIDADE_EXCEPTION;
        }
        return TISSVERIFICAELEGIBILIDADE_WSDL_LOCATION;
    }

}
