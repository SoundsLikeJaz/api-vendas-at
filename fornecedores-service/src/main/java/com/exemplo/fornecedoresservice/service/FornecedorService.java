package com.exemplo.fornecedoresservice.service;

import com.exemplo.fornecedoresservice.model.Fornecedor;
import com.exemplo.fornecedoresservice.repository.ForneRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Regra de negocio de Cliente. O controller nao fala direto com o repository,
 * fala com este service.
 */
@Service
public class FornecedorService {

    private final ForneRepository forneRepository;

    public FornecedorService(ForneRepository forneRepository) {
        this.forneRepository = forneRepository;
    }

    public List<Fornecedor> listarTodos() {
        return forneRepository.findAll();
    }

    public Optional<Fornecedor> buscarPorId(Long id) {
        return forneRepository.findById(id);
    }
}
