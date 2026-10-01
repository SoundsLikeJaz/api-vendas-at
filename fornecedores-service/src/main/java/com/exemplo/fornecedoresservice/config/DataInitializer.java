package com.exemplo.fornecedoresservice.config;

import com.exemplo.fornecedoresservice.model.Fornecedor;
import com.exemplo.fornecedoresservice.repository.ForneRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Popula o banco H2 em memoria com fornecedores de teste assim que a aplicacao sobe.
 */
@Component
public class DataInitializer implements CommandLineRunner {

    private final ForneRepository forneRepository;

    public DataInitializer(ForneRepository forneRepository) {
        this.forneRepository = forneRepository;
    }

    @Override
    public void run(String... args) {
        forneRepository.save(new Fornecedor("Tech Solutions Ltda", "12.345.678/0001-01"));
        forneRepository.save(new Fornecedor("Alpha Sistemas Ltda", "23.456.789/0001-02"));
        forneRepository.save(new Fornecedor("Nova Era Tecnologia Ltda", "34.567.890/0001-03"));
        forneRepository.save(new Fornecedor("Global Distribuidora Ltda", "45.678.901/0001-04"));
        forneRepository.save(new Fornecedor("Prime Componentes Ltda", "56.789.012/0001-05"));
    }
}
