package com.exemplo.fornecedoresservice.service;

import com.exemplo.fornecedoresservice.dto.ProdutoDTO;
import com.exemplo.fornecedoresservice.interfaces.ProdutoInterface;
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
    private final ProdutoInterface produtoInterface;

    public FornecedorService(ForneRepository forneRepository, ProdutoInterface produtoInterface) {
        this.forneRepository = forneRepository;
        this.produtoInterface = produtoInterface;
    }

    public Fornecedor salvar(Fornecedor fornecedor) {
        return forneRepository.save(fornecedor);
    }

    public List<Fornecedor> listarTodos() {
        return forneRepository.findAll();
    }

    public List<ProdutoDTO> listarProdutos() {
        return this.produtoInterface.listarProdutos();
    }

    public Optional<Fornecedor> buscarPorId(Long id) {
        return forneRepository.findById(id);
    }
}
