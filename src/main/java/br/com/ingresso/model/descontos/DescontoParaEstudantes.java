package br.com.ingresso.model.descontos;

import java.math.BigDecimal;

public class DescontoParaEstudantes implements Desconto {
	@Override
	public BigDecimal aplicarDescontoSobre(BigDecimal precoOriginal) {
		return precoOriginal.divide(new BigDecimal("2.0"));
	}
}
