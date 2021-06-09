package br.com.bv.servicename.application.statements;

import javax.enterprise.context.ApplicationScoped;

import br.com.bv.servicename.domain.StatementService;

@ApplicationScoped
public class StatementsServiceImpl implements StatementService {

	@Override
	public Long account() {
		return 12344L;
	}

}
