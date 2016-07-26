package br.com.casadocodigo.loja.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.casadocodigo.loja.daos.ProdutoDAO;
import br.com.casadocodigo.loja.enums.TipoPrecoEnum;
import br.com.casadocodigo.loja.model.Produto;

@Controller
public class ProdutosController {

	@Autowired
	private ProdutoDAO produtoDao;
	
	
	@RequestMapping("/produtos/form")
	public ModelAndView produtosForm(){
		ModelAndView mdv = new ModelAndView("produtos/form");
		mdv.addObject("tipos", TipoPrecoEnum.values());
		return mdv;
	}
	@RequestMapping("/produtos")
	public String cadastar(Produto produto){
		produtoDao.gravar(produto);
		return "produtos/ok";
	}
}
