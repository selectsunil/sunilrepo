package com.sunil.java.ws.soap;


import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;

import javax.xml.soap.*;
import javax.xml.transform.*;
import javax.xml.transform.stream.*;

public class ClientSAAJ {

	/**
     * Starting point for the SAAJ - SOAP Client Testing
     */
	
	public static String postSoapMessage(String url, String xmlData) throws Exception {
		String response = "";
		HashMap htResponse = new HashMap();
		URL oURL = new URL(url);
		HttpURLConnection con = (HttpURLConnection) oURL.openConnection();
		con.setRequestMethod("POST");
		con.setRequestProperty("Content-type", "text/xml; charset=utf-8");
		con.setRequestProperty("SOAPAction", "");
		con.setDoOutput(true);
		OutputStream reqStream = con.getOutputStream();
		reqStream.write(xmlData.getBytes());
		InputStream resStream = con.getInputStream();
		if (con.getResponseCode() == HttpURLConnection.HTTP_OK) {
			byte[] byteBuf = new byte[resStream.available()];
			resStream.read(byteBuf);
			response = new String(byteBuf);
		}

		return response;

	}
	
	
    public static void main(String args[]) {
        try {
            // Create SOAP Connection
            SOAPConnectionFactory soapConnectionFactory = SOAPConnectionFactory.newInstance();
            SOAPConnection soapConnection = soapConnectionFactory.createConnection();

            // Send SOAP Message to SOAP Server
            String url = "http://10.54.8.134:61007/oraclediagent/OdiInvoke?wsdl";
            SOAPMessage soapResponse = soapConnection.call(createSOAPRequest(), url);

            // Process the SOAP Response
            printSOAPResponse(soapResponse);

            soapConnection.close();
        } catch (Exception e) {
            System.err.println("Error occurred while sending SOAP Request to Server");
            e.printStackTrace();
        }
    }

    private static SOAPMessage createSOAPRequest() throws Exception {
        MessageFactory messageFactory = MessageFactory.newInstance();
        SOAPMessage soapMessage = messageFactory.createMessage();
        SOAPPart soapPart = soapMessage.getSOAPPart();

        String serverURI = "xmlns.oracle.com/odi/OdiInvoke/";

        // SOAP Envelope
        SOAPEnvelope envelope = soapPart.getEnvelope();
        envelope.addNamespaceDeclaration("odi", serverURI);

        /*
        Constructed SOAP Request Message:
        <SOAP-ENV:Envelope xmlns:SOAP-ENV="http://schemas.xmlsoap.org/soap/envelope/" xmlns:example="http://ws.cdyne.com/">
            <SOAP-ENV:Header/>
            <SOAP-ENV:Body>
                <example:VerifyEmail>
                    <example:email>mutantninja@gmail.com</example:email>
                    <example:LicenseKey>123</example:LicenseKey>
                </example:VerifyEmail>
            </SOAP-ENV:Body>
        </SOAP-ENV:Envelope>
         */

        // SOAP Body
        SOAPBody soapBody = envelope.getBody();
        /*SOAPElement soapBodyElem = soapBody.addChildElement("VerifyEmail", "example");
        SOAPElement soapBodyElem1 = soapBodyElem.addChildElement("email", "example");
        soapBodyElem1.addTextNode("mutantninja@gmail.com");
        SOAPElement soapBodyElem2 = soapBodyElem.addChildElement("LicenseKey", "example");
        soapBodyElem2.addTextNode("123");*/
        
        SOAPElement soapBodyElem = soapBody.addChildElement("OdiStartScenRequest", "odi");
        
        SOAPElement soapBodyElem1 = soapBodyElem.addChildElement("Credentials");
        SOAPElement soapBodyElem1_1 = soapBodyElem1.addChildElement("OdiUser");
        soapBodyElem1_1.addTextNode("SUPERVISOR");
        SOAPElement soapBodyElem1_2 = soapBodyElem1.addChildElement("OdiPassword");
        soapBodyElem1_2.addTextNode("SUNOPSIS");
        SOAPElement soapBodyElem1_3 = soapBodyElem1.addChildElement("WorkRepository");
        soapBodyElem1_3.addTextNode("WORKREP");
        
        
        SOAPElement soapBodyElem2 = soapBodyElem.addChildElement("Request");
        SOAPElement soapBodyElem2_1 = soapBodyElem2.addChildElement("ScenarioName");
        soapBodyElem2_1.addTextNode("SCEN_HUP_PAYMENT_FILE_GENERATION");
        SOAPElement soapBodyElem2_2 = soapBodyElem2.addChildElement("ScenarioVersion");
        soapBodyElem2_2.addTextNode("001");
        SOAPElement soapBodyElem2_3 = soapBodyElem2.addChildElement("Context");
        soapBodyElem2_3.addTextNode("CTX_HUMPHREY");
        SOAPElement soapBodyElem2_4 = soapBodyElem2.addChildElement("Variables");
        SOAPElement soapBodyElem2_4_1 = soapBodyElem2_4.addChildElement("Name");
        soapBodyElem2_4_1.addTextNode("HUM_PAYMENT_FILE_GENERATION.v_InterfaceId");
        SOAPElement soapBodyElem2_4_2 = soapBodyElem2_4.addChildElement("Value");
        soapBodyElem2_4_2.addTextNode("HUM_PAYMENT");
        
        
        

        MimeHeaders headers = soapMessage.getMimeHeaders();
        headers.addHeader("SOAPAction", serverURI  + "VerifyEmail");

        soapMessage.saveChanges();

        /* Print the request message */
        System.out.print("Request SOAP Message = ");
        soapMessage.writeTo(System.out);
        System.out.println();

        return soapMessage;
    }

    /**
     * Method used to print the SOAP Response
     */
    private static void printSOAPResponse(SOAPMessage soapResponse) throws Exception {
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        Source sourceContent = soapResponse.getSOAPPart().getContent();
        System.out.print("\nResponse SOAP Message = ");
        StreamResult result = new StreamResult(System.out);
        transformer.transform(sourceContent, result);
    }

}
