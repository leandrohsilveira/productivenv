package br.com.lhsoft.productivenv.gateway.repository;

import br.com.lhsoft.productivenv.gateway.domain.Authority;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the Authority entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {
}
