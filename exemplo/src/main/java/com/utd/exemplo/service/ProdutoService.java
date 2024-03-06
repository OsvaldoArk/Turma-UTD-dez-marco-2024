package com.utd.exemplo.service;

import java.beans.Beans;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.utd.exemplo.model.Produto;
import com.utd.exemplo.repository.ProdutoRepository;

@Service
public class ProdutoService {

	@Autowired
	ProdutoRepository repositorio;
	
	public List<Produto> listarProdutos(){
		return repositorio.findAll();
	}
	
	public Optional<Produto> encontrarProduto(Long id) {
		return repositorio.findById(id);
	}
	
	public Produto salvarProduto(Produto produto) {
		return repositorio.save(produto);
	}
	
	public Produto editarProduto(Long id, Produto produto) {
		
		Produto produtoBanco = encontrarProduto(id).orElse(null);
		
		if(produtoBanco == null) {
			System.err.println("Produto não encontrado");
			
			return null;
		}else {
			BeanUtils.copyProperties(produto, produtoBanco,"id");
			produtoBanco.setId(id);
			
			return repositorio.save(produtoBanco);
		}
	}
	
	public void excluirProduto(Long id) {
		
		Produto produto = encontrarProduto(id).orElse(null);
		
		if(produto == null) {
			System.out.println("Produto não encontrado");
		}else {
			repositorio.delete(produto);
		}
	}
}
