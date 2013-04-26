package br.com.fikcChik.dao;

public interface DAO <T,K>{
	
	void inserir(T entity);
	
	void atualizar(T entity);
	
	void excluir(T entity);
	
	T buscarPorID(K id);

}
