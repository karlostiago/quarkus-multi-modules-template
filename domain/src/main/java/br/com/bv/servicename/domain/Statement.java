package br.com.bv.servicename.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Statement {
	
	@EqualsAndHashCode.Include
	private Long documentNumber;
}
