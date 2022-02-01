package com.nttdata.springboot.backend.apirest.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.nttdata.springboot.backend.apirest.models.entity.Cliente;
import com.nttdata.springboot.backend.apirest.models.entity.Region;

@Repository
/**
 * Interfaz IClienteDAO
 * @author jramlope
 *
 */
public interface IClienteDao extends JpaRepository<Cliente, Long>{

	/**
	 * Método para  encontrar todas las regiones
	 * @return
	 */
	@Query("from Region")
	public List<Region> findAllRegiones();
	
}
