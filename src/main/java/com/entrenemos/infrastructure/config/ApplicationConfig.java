package com.entrenemos.infrastructure.config;

import com.entrenemos.application.service.CrearMovimientoService;
import com.entrenemos.domain.port.in.CrearMovimientoUseCase;
import com.entrenemos.domain.port.out.MovimientoRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean
    public CrearMovimientoUseCase crearMovimientoUseCase(MovimientoRepository repository){
        return new CrearMovimientoService(repository);
    }
}
