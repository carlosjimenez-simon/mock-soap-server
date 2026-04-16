package com.simon.mock.soap.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.MediaType;

@RestController
@RequestMapping("/SOATMundial.asmx")
public class MundialMockController {

    @PostMapping(consumes = MediaType.APPLICATION_XML_VALUE, produces = MediaType.APPLICATION_XML_VALUE)
    public String consultaVehiculo(@RequestBody String request) {
        // En el futuro aquí podríamos parsear la placa para devolver datos distintos
        
        return "<?xml version=\"1.0\" encoding=\"utf-8\"?>" +
        "<soap:Envelope xmlns:soap=\"http://www.w3.org/2003/05/soap-envelope\" " +
        "xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\">" +
        " <soap:Body>" +
        "  <ConsultaVehiculoRCEHomologadoResponse xmlns=\"http://www.mundialseguros.com.co/\">" +
        "   <ConsultaVehiculoRCEHomologadoResult>" +
        "    <infoVehiculo>" +
        "     <idConsulta>bf314c49-e61e-4b65-9b1c-5955ca6fd1ee</idConsulta>" +
        "     <snConsultaRuntExitosa>True</snConsultaRuntExitosa>" +
        "     <observacionesServicio>Consulta Exitosa</observacionesServicio>" +
        "     <marca>MAZDA</marca>" +
        "     <linea>CX-5</linea>" +
        "     <aaaa_modelo>2020</aaaa_modelo>" +
        "    </infoVehiculo>" +
        "    <validaParaEmitir>true</validaParaEmitir>" +
        "    <tarifasRce>" +
        "     <procesadoExitoso>true</procesadoExitoso>" +
        "     <planes>" +
        "      <PlanDto>" +
        "       <id>203</id>" +
        "       <descripcion>Opción Livianos 1</descripcion>" +
        "      </PlanDto>" +
        "     </planes>" +
        "    </tarifasRce>" +
        "   </ConsultaVehiculoRCEHomologadoResult>" +
        "  </ConsultaVehiculoRCEHomologadoResponse>" +
        " </soap:Body>" +
        "</soap:Envelope>";
    }
}