package br.com.ingresso.model.descontos;

import java.math.BigDecimal;

public class SemDesconto implements Desconto {
	@Override
	public BigDecimal aplicarDescontoSobre(BigDecimal precoOriginal) {
		return precoOriginal;
	}
}
