package br.edu.infnet.appconfeitaria;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appconfeitaria.model.domain.Cliente;
import br.edu.infnet.appconfeitaria.model.service.ClienteService;

@Component
public class ClienteLoader implements ApplicationRunner{
    @Autowired
    private ClienteService clienteService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Cliente cliente = new Cliente("Luan", "001.001.001-00", 1234567);
        cliente.setId(1);

        clienteService.incluir(cliente);
    }
}
