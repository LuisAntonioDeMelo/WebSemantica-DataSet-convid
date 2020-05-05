package br.com.web.semantica.dataset.repositorio;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.web.semantica.dataset.modelo.Covid19Data;


public interface DataCovidRepositorio extends MongoRepository<Covid19Data, String>{

}
