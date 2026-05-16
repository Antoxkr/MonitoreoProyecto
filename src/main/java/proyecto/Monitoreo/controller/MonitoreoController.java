package proyecto.Monitoreo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import proyecto.Monitoreo.modelo.ModeloAlerta;
import proyecto.Monitoreo.service.MonitoreoService;

@RestController
@RequestMapping("/api/monitoreo")
public class MonitoreoController {
    @Autowired
    private MonitoreoService service;
    @PostMapping("/alerta")
    public ModeloAlerta recibirAlerta(@RequestBody ModeloAlerta alerta){
        return service.guardarAlerta(alerta);
    }
}
