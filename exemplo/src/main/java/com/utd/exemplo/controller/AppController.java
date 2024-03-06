package com.utd.exemplo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.utd.exemplo.model.Produto;
import com.utd.exemplo.service.ProdutoService;

@Controller
public class AppController {

	@Autowired
	ProdutoService servico;
	
	@RequestMapping("/produtos")
	public String paginaProdutos(Model model) {
		
		List<Produto> produtos = servico.listarProdutos();
		
		model.addAttribute("produtos",produtos);
		
		produtos.stream().forEach(System.out::println);
		
		return "produtos";
	}
	
	@RequestMapping("/add")
	public String addProduto(Model model) {
		Produto p = new Produto();
		
		model.addAttribute("produto",p);
		
		return "addproduto";
	}
	
	@RequestMapping(value="/salvar", method=RequestMethod.POST)
	public String salvarProduto(@ModelAttribute("produto") Produto produto) {
		
		servico.salvarProduto(produto);
		
		return "redirect:/produtos";
	}
}
