package br.edu.infnet.appconfeitaria.model.domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import br.edu.infnet.appconfeitaria.model.exceptions.PedidoSemClienteException;
import br.edu.infnet.appconfeitaria.model.exceptions.PedidoSemDoceException;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "TablePedido")
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String descricao;
    private boolean web = false;
    private LocalDateTime data;
    @OneToOne(cascade = CascadeType.DETACH)
    @JoinColumn(name = "idCliente")
    private Cliente cliente;
    @ManyToMany(cascade = CascadeType.DETACH)
    private List<Doce> doces;
    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;

    public Pedido(){

    }

    public Pedido(Cliente cliente, List<Doce> doces) throws PedidoSemClienteException, PedidoSemDoceException{
        this();

        if (cliente == null){
            throw new PedidoSemClienteException("[ERRO] Cliente não está associado ao pedido!");
        }

        if (doces == null){
            throw new PedidoSemDoceException("[ERRO] Pedido inválido, não há doces!");
        }

        this.cliente = cliente;
        this.doces = doces;

        data = LocalDateTime.now();
    }

    public void imprimir(){
        System.out.println("Pedido: " + toString());
        System.out.println("Cliente: " + cliente);
        System.out.println("Quantidade: " + doces.size());
        System.out.println("Doces: ");
        for (Doce doce : doces) {
            System.out.println("- " + doce.getNome());
        }
    }

    public String obterLinha() {
        return this.getDescricao()+";"+this.getCliente()+";"+this.getDoces().size()+"\r\n";
    }

    @Override
    public String toString() {

        DateTimeFormatter formatoDataHora = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        
        return String.format("%s;%s;%s",
                    descricao,
                    web ? "web" : "loja",
                    data.format(formatoDataHora));
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isWeb() {
        return web;
    }
    public void setWeb(boolean web) {
        this.web = web;
    }

    public LocalDateTime getData() {
        return data;
    }
    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Doce> getDoces() {
        return doces;
    }
    public void setDoces(List<Doce> doces) {
        this.doces = doces;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
