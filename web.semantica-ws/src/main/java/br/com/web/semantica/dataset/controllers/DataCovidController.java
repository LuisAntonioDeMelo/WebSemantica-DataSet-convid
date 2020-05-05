package br.com.web.semantica.dataset.controllers;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.web.semantica.dataset.modelo.Covid19Data;
import br.com.web.semantica.dataset.repositorio.DataCovidRepositorio;

@RestController
@RequestMapping("/dadosCovid")
public class DataCovidController {

	private DataCovidRepositorio dataCovidRepositorio;
	
	@GetMapping
	public List<Covid19Data> getItens(){
		return dataCovidRepositorio.findAll();
	}
	
	@GetMapping("{id}")
	public ResponseEntity<Covid19Data> obterId(@PathVariable("id") String id){
		Optional<Covid19Data> data = dataCovidRepositorio.findById(id);
		return data.isPresent() ? ResponseEntity.ok(data.get()) :ResponseEntity.badRequest().build();
	}
	
	@PostMapping
	public ResponseEntity<Covid19Data> criar(@RequestBody Covid19Data data){
		data.set_id(ObjectId.get());
		Covid19Data datasave = dataCovidRepositorio.save(data);
		return datasave != null? ResponseEntity.ok(datasave):ResponseEntity.badRequest().build();
	}
	
	@PutMapping("{id}")
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public ResponseEntity<Covid19Data> atualizar(@RequestBody Covid19Data data,@PathVariable("id") String id){
		
		Optional<Covid19Data> dataCovid = dataCovidRepositorio.findById(id);
		if(dataCovid.isPresent()) {
			BeanUtils.copyProperties(data,dataCovid.get());	
			dataCovidRepositorio.save(data);
		}
		return ResponseEntity.ok(data);
	}
	
	@DeleteMapping("{id}")
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public void deletar(@PathVariable("id") ObjectId id) {
		dataCovidRepositorio.deleteById(id.toHexString());
	}


	
}
