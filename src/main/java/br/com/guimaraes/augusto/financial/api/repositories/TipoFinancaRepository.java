package br.com.guimaraes.augusto.financial.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.guimaraes.augusto.financial.api.domain.TipoFinanca;

@Repository
public interface TipoFinancaRepository extends JpaRepository<TipoFinanca, Integer> {

}
