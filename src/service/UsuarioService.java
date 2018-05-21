package service;

import java.util.ArrayList;

import model.Pais;
import dao.PaisDao;

public class UsuarioService {
	PaisDao dao;
	
	public UsuarioService(){
		dao = new PaisDao();
	}
	public ArrayList<Pais> listarPaises(){
		return dao.listarPaises();
	}
	public ArrayList<Pais> listarPaises(String chave){
		return dao.listarPaises(chave);
	}

}

