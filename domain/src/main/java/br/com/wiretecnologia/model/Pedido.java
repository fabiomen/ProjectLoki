package br.com.wiretecnologia.model;


import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "PEDIDO")
public class Pedido implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    @Column(name = "idpedido", updatable = false, nullable = false)
    int id;

    @Column(name = "FORMA_PAGAMENTO")
    String formaPagamento;

    @Column(name = "DATA_PEDIDO")
    Date dataPedido;

    @Column(name = "DESCONTO")
    int desconto;

    @Column(name = "VALOR_PARCELA")
    int valorParcela;

    @Column(name = "NUMERO_PARCELA")
    int numeroParcela;

    @ManyToMany
    @JoinTable(name = "PEDIDO_PRODUTO", joinColumns =
            {@JoinColumn(name = "IDPEDIDO")}, inverseJoinColumns =
            {@JoinColumn(name = "IDPRODUTO")})
    public List<Produto> listaProduto = new ArrayList<Produto>();


    public int getDesconto() {
        return desconto;
    }

    public void setDesconto(int desconto) {
        this.desconto = desconto;
    }

    public int getValorParcela() {
        return valorParcela;
    }

    public void setValorParcela(int valorParcela) {
        this.valorParcela = valorParcela;
    }

    public int getNumeroParcela() {
        return numeroParcela;
    }

    public void setNumeroParcela(int numeroParcela) {
        this.numeroParcela = numeroParcela;
    }

    public List<Produto> getListaProduto() {
        return this.listaProduto;
    }

    public void setListaProduto(List<Produto> listaProduto) {
        this.listaProduto = listaProduto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public Date getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(Date dataPedido) {
        this.dataPedido = dataPedido;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pedido)) return false;
        Pedido pedido = (Pedido) o;
        return getId() == pedido.getId() &&
                Objects.equals(getFormaPagamento(), pedido.getFormaPagamento()) &&
                Objects.equals(getDataPedido(), pedido.getDataPedido()) &&
                Objects.equals(getListaProduto(), pedido.getListaProduto());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getFormaPagamento(), getDataPedido(), getListaProduto());
    }
}
