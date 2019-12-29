package br.com.guimaraes.augusto.financial.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.guimaraes.augusto.financial.api.domain.Financas;

@Repository
public interface FinancasRepository extends JpaRepository<Financas, Integer> {

}
