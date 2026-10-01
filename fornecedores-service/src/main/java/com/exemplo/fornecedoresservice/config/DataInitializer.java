package com.exemplo.fornecedoresservice.config;

import com.exemplo.fornecedoresservice.model.Fornecedor;
import com.exemplo.fornecedoresservice.repository.FornecedorRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Popula o banco H2 em memoria com fornecedores de teste assim que a aplicacao sobe.
 */
@Component
public class DataInitializer implements CommandLineRunner {

    private final FornecedorRepository fornecedorRepository;

    public DataInitializer(FornecedorRepository fornecedorRepository) {
        this.fornecedorRepository = fornecedorRepository;
    }

    @Override
    public void run(String... args) {
        fornecedorRepository.save(new Fornecedor("Tech Solutions Ltda", "12.345.678/0001-01"));
        fornecedorRepository.save(new Fornecedor("Alpha Sistemas Ltda", "23.456.789/0001-02"));
        fornecedorRepository.save(new Fornecedor("Nova Era Tecnologia Ltda", "34.567.890/0001-03"));
        fornecedorRepository.save(new Fornecedor("Global Distribuidora Ltda", "45.678.901/0001-04"));
        fornecedorRepository.save(new Fornecedor("Prime Componentes Ltda", "56.789.012/0001-05"));
    }
}
