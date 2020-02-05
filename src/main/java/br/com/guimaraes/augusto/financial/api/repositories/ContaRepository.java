package br.com.guimaraes.augusto.financial.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.guimaraes.augusto.financial.api.domain.Conta;

@Repository
public interface ContaRepository extends JpaRepository<Conta, Integer> {

	public Conta findByBancoCarteiraLike(String bancoCarteira);
}
