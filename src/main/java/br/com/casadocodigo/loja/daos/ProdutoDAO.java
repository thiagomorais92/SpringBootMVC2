package br.com.casadocodigo.loja.daos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import br.com.casadocodigo.loja.model.Produto;

@Repository
public class ProdutoDAO {

	@PersistenceContext
	EntityManager manager;
	
	@Transactional
	public void gravar(Produto produto){
		manager.persist(produto);
	}
}
