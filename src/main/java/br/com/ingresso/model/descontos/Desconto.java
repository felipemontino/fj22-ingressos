package br.com.ingresso.model.descontos;

import java.math.BigDecimal;

public	interface	Desconto	{
	BigDecimal	aplicarDescontoSobre(BigDecimal	precoOriginal);
}
