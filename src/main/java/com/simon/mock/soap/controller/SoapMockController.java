package com.simon.mock.soap.controller;

import com.simon.mock.soap.model.ClienteRequest;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.MediaType;

@RestController
@RequestMapping("/ws")
public class SoapMockController {

    @PostMapping(value = "/clientes", 
                 consumes = MediaType.APPLICATION_XML_VALUE, 
                 produces = MediaType.APPLICATION_XML_VALUE)
    public String mockSoapResponse(@RequestBody ClienteRequest request) {
        // Simulamos una respuesta SOAP Envelope real
        return "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\">" +
               "  <soapenv:Body>" +
               "    <ClienteResponse>" +
               "      <id>" + request.getId() + "</id>" +
               "      <resultado>PROCESADO_EXITOSAMENTE</resultado>" +
               "      <mensaje>Servicio SOAP simulado para " + request.getNombre() + "</mensaje>" +
               "    </ClienteResponse>" +
               "  </soapenv:Body>" +
               "</soapenv:Envelope>";
    }
}
