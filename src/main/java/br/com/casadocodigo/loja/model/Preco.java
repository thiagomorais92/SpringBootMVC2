package br.com.casadocodigo.loja.model;

import java.math.BigDecimal;

import javax.persistence.Embeddable;

import br.com.casadocodigo.loja.enums.TipoPrecoEnum;

@Embeddable
public class Preco {

	private BigDecimal valor;
	private TipoPrecoEnum tipo;
	public BigDecimal getVavalor() {
		return valor;
	}
	public void setVavalor(BigDecimal valor) {
		this.valor = valor;
	}
	public TipoPrecoEnum getTipo() {
		return tipo;
	}
	public void setTipo(TipoPrecoEnum tipo) {
		this.tipo = tipo;
	}
	
	
}
