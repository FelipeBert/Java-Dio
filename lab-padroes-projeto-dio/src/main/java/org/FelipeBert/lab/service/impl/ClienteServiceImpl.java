package org.FelipeBert.lab.service.impl;

import org.FelipeBert.lab.model.Cliente;
import org.FelipeBert.lab.model.Endereco;
import org.FelipeBert.lab.repository.ClienteRepository;
import org.FelipeBert.lab.repository.EnderecoRepository;
import org.FelipeBert.lab.service.ClienteService;
import org.FelipeBert.lab.service.ViaCepService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteServiceImpl implements ClienteService {

    private ClienteRepository clienteRepository;
    private EnderecoRepository enderecoRepository;
    private ViaCepService cepService;

    public ClienteServiceImpl(ClienteRepository clienteRepository,
                              EnderecoRepository enderecoRepository,
                              ViaCepService viaCepService) {
        this.cepService = viaCepService;
        this.clienteRepository = clienteRepository;
        this.enderecoRepository = enderecoRepository;
    }

    @Override
    public Iterable<Cliente> buscarTodos() {
        return clienteRepository.findAll();
    }

    @Override
    public Cliente buscarPorId(Long id) {
        Optional<Cliente> cliente = clienteRepository.findById(id);
        return cliente.get();
    }

    @Override
    public void inserir(Cliente cliente) {
        salvarClienteComCep(cliente);
    }

    @Override
    public void atualizar(Long id, Cliente cliente) {
        Optional<Cliente> clienteBd = clienteRepository.findById(id);
        if (clienteBd.isPresent()) {
            salvarClienteComCep(cliente);
        }
    }

    @Override
    public void deletar(Long id) {
        clienteRepository.deleteById(id);
    }

    private void salvarClienteComCep(Cliente cliente) {
        String cep = cliente.getEndereco().getCep();
        Endereco endereco = enderecoRepository.findById(cep).orElseGet(() -> {
            Endereco novoEndereco = cepService.consultarCep(cep);
            enderecoRepository.save(novoEndereco);
            return novoEndereco;
        });
        cliente.setEndereco(endereco);
        clienteRepository.save(cliente);
    }

}
