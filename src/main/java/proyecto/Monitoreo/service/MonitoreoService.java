package proyecto.Monitoreo.service;

import io.netty.handler.codec.http2.Http2Headers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import proyecto.Monitoreo.modelo.ModeloAlerta;
import proyecto.Monitoreo.repository.AlertaRepository;

import java.awt.*;
import org.springframework.http.HttpHeaders;

@Service
public class MonitoreoService {
    @Autowired
    private AlertaRepository repository;
    private final RestTemplate restTemplate =new RestTemplate();
    public ModeloAlerta guardarAlerta(ModeloAlerta alerta){
        String horarioURL  ="http://localhost:8082/pi/horarios/actualizar";
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<ModeloAlerta> request =new HttpEntity<>(alerta, headers);
        restTemplate.postForEntity(horarioURL,request,String.class );

        return alerta;
    }
}
