package Exercicio04;

import java.time.LocalDate;

import Cliente.Cliente;
import Cliente.PerfilCliente;
import ContaBanco.Conta;
import ContaBanco.ContaCorrente;
import ContaBanco.ContaEmpresarial;
import ContaBanco.ContaPoupanca;

public class Exercicio04 {

	public static Conta[] arrayConta = new Conta[15];

	public static void main(String[] args) {

		Cliente cliente1 = new Cliente("Josafa", 203280, 0101, 012, PerfilCliente.FUNCIONARIO_BANCO);
		Cliente cliente2 = new Cliente("Bartolomeu", 800110, 02, 802.0, PerfilCliente.PESSOA_FISICA);
		Cliente cliente3 = new Cliente("Jurema", 0050011, 03, 10034.1, PerfilCliente.PESSOA_JURIDICA);
		Cliente cliente4 = new Cliente("Josafa1", 108009, 04, 2002.7, PerfilCliente.FUNCIONARIO_BANCO);
		Cliente cliente5 = new Cliente("Bartolomeu1", 7800110, 05, 502.0, PerfilCliente.PESSOA_FISICA);
		Cliente cliente6 = new Cliente("jurema1", 3050011, 06, 9034.1, PerfilCliente.PESSOA_JURIDICA);
		Cliente cliente7 = new Cliente("Josafa2", 8009801, 07, 7702.7, PerfilCliente.FUNCIONARIO_BANCO);
		Cliente cliente8 = new Cliente("Bartolomeu2", 2800999, 18, 902.0, PerfilCliente.PESSOA_FISICA);
		Cliente cliente9 = new Cliente("Jurema2", 90050011, 89, 6034.1, PerfilCliente.PESSOA_JURIDICA);
		Cliente cliente10 = new Cliente("Josafa3", 559899, 10, 802.7, PerfilCliente.FUNCIONARIO_BANCO);
		Cliente cliente11 = new Cliente("Bartolomeu3", 18001100, 11, 892.0, PerfilCliente.PESSOA_FISICA);
		Cliente cliente12 = new Cliente("Jurema3", 30999911, 12, 8034.5, PerfilCliente.PESSOA_JURIDICA);
		Cliente cliente13 = new Cliente("Josafa4", 503333, 13, 1112.7, PerfilCliente.FUNCIONARIO_BANCO);
		Cliente cliente14 = new Cliente("Bartolomeu11", 2000032, 14, 502.0, PerfilCliente.PESSOA_FISICA);
		Cliente cliente15 = new Cliente("Jurema12", 30059988, 15, 8034.1, PerfilCliente.PESSOA_JURIDICA);
		Cliente cliente16 = new Cliente("Josafa13", 18009800, 16, 902.7, PerfilCliente.FUNCIONARIO_BANCO);
		Cliente cliente17 = new Cliente("Bartolomeu14", 9000110, 17, 555.0, PerfilCliente.PESSOA_FISICA);
		Cliente cliente18 = new Cliente("Jurema15", 90050011, 18, 888.1, PerfilCliente.PESSOA_JURIDICA);
		Cliente cliente19 = new Cliente("Bartolomeu16", 2800119, 19, 101.0, PerfilCliente.PESSOA_FISICA);
		Cliente cliente20 = new Cliente("Jurema17", 30055511, 20, 134.1, PerfilCliente.PESSOA_JURIDICA);

		ContaPoupanca contaPoupanca = new ContaPoupanca("BancoBrasil", 87, 29, 67, 900.0, LocalDate.parse("2003-04-11"),
				LocalDate.parse("2013-04-29"), "Aluguel", 9, cliente1);
		ContaCorrente contaCorrente = new ContaCorrente("NuBank", 37, 8080, 17, 7000.0, LocalDate.parse("2011-09-09"),
				LocalDate.parse("2019-01-09"), "Falecimento", 50, cliente2, 5, 8);
		ContaEmpresarial contaEmpresarial = new ContaEmpresarial("Bradesco", 44, 543, 54, 9800.0,
				LocalDate.parse("1999-04-10"), LocalDate.parse("2009-07-10"), "Divida", 10, cliente3, "Perreira Top");
		ContaPoupanca contaPoupanca1 = new ContaPoupanca("Santander", 57, 19, 67, 900.0, LocalDate.parse("2003-11-11"),
				LocalDate.parse("2013-04-29"), "Null", 7, cliente4);
		ContaCorrente contaCorrente1 = new ContaCorrente("Itau", 27, 2080, 27, 7000.0, LocalDate.parse("2009-09-09"),
				LocalDate.parse("2019-01-09"), "Null", 50, cliente5, 5, 8);
		ContaEmpresarial contaEmpresarial1 = new ContaEmpresarial("Nubank", 64, 643, 64, 9800.0,
				LocalDate.parse("1999-04-10"), LocalDate.parse("2006-07-10"), "Divida", 10, cliente6, "Premium");
		ContaPoupanca contaPoupanca2 = new ContaPoupanca("Flex", 37, 19, 97, 900.0, LocalDate.parse("2007-07-11"),
				LocalDate.parse("2015-04-29"), "Aluguel", 9, cliente7);
		ContaCorrente contaCorrente2 = new ContaCorrente("Bradesco", 57, 8180, 17, 7000.0,
				LocalDate.parse("2012-08-09"), LocalDate.parse("2020-01-09"), "Falecimento", 50, cliente8, 5, 8);
		ContaEmpresarial contaEmpresarial2 = new ContaEmpresarial("SuperDigital", 14, 8743, 59, 9800.0,
				LocalDate.parse("1996-08-10"), LocalDate.parse("2009-07-10"), "Null", 10, cliente9, "Premium Top");
		ContaPoupanca contaPoupanca3 = new ContaPoupanca("Nubank", 97, 79, 27, 900.0, LocalDate.parse("2001-01-11"),
				LocalDate.parse("2013-04-29"), "Aluguel", 9, cliente10);
		ContaCorrente contaCorrente3 = new ContaCorrente("Banco Brasil", 57, 8380, 57, 7000.0,
				LocalDate.parse("2011-11-01"), LocalDate.parse("2019-01-09"), "Null", 50, cliente11, 5, 8);
		ContaEmpresarial contaEmpresarial3 = new ContaEmpresarial("Itau", 54, 1543, 94, 9800.0,
				LocalDate.parse("1998-09-20"), LocalDate.parse("2009-07-10"), "Divida", 10, cliente12, "Top Derm");
		ContaPoupanca contaPoupanca4 = new ContaPoupanca("Santander", 91, 991, 17, 900.0, LocalDate.parse("2009-09-11"),
				LocalDate.parse("2013-04-29"), "Aluguel", 9, cliente13);
		ContaCorrente contaCorrente4 = new ContaCorrente("SuperDigital", 55, 1180, 12, 7000.0,
				LocalDate.parse("2014-01-09"), LocalDate.parse("2019-01-09"), "Null", 50, cliente14, 5, 8);
		ContaEmpresarial contaEmpresarial4 = new ContaEmpresarial("Bradesco", 74, 1543, 26, 9800.0,
				LocalDate.parse("1997-04-10"), LocalDate.parse("2009-07-10"), "Divida", 10, cliente15, "Lua Lua");
		ContaPoupanca contaPoupanca5 = new ContaPoupanca("Nubank", 77, 229, 97, 900.0, LocalDate.parse("2003-09-11"),
				LocalDate.parse("2019-04-29"), "Null", 9, cliente16);
		ContaCorrente contaCorrente5 = new ContaCorrente("Bradesco", 57, 2280, 93, 7000.0,
				LocalDate.parse("2016-09-24"), LocalDate.parse("2020-01-09"), "Null", 50, cliente17, 5, 8);
		ContaEmpresarial contaEmpresarial5 = new ContaEmpresarial("Nubank", 36, 9943, 34, 9800.0,
				LocalDate.parse("2001-07-10"), LocalDate.parse("2009-07-10"), "Null", 10, cliente18, "Midia Center");
		ContaCorrente contaCorrente6 = new ContaCorrente("Flex", 19, 8900, 23, 7000.0, LocalDate.parse("2013-01-09"),
				LocalDate.parse("2019-01-09"), "Falecimento", 50, cliente19, 5, 8);
		ContaEmpresarial contaEmpresarial6 = new ContaEmpresarial("Flex", 34, 2543, 24, 9800.0,
				LocalDate.parse("2019-10-10"), LocalDate.parse("2009-07-10"), "Divida", 10, cliente20, "Clube");

		adicionaArrayConta(contaPoupanca);
		adicionaArrayConta(contaPoupanca1);
		adicionaArrayConta(contaPoupanca2);
		adicionaArrayConta(contaPoupanca3);
		adicionaArrayConta(contaPoupanca4);
		adicionaArrayConta(contaPoupanca5);

		adicionaArrayConta(contaCorrente);
		adicionaArrayConta(contaCorrente1);
		adicionaArrayConta(contaCorrente2);
		adicionaArrayConta(contaCorrente3);
		adicionaArrayConta(contaCorrente4);
		adicionaArrayConta(contaCorrente5);

		adicionaArrayConta(contaEmpresarial);
		adicionaArrayConta(contaEmpresarial1);
		adicionaArrayConta(contaEmpresarial2);
		adicionaArrayConta(contaEmpresarial3);
		adicionaArrayConta(contaEmpresarial4);
		adicionaArrayConta(contaEmpresarial5);

		System.out.println(primeiroElementoArrayConta());
		System.out.println(ultimoElementoArrayConta());
		System.out.println(tamanhoArrayConta());

	}

	public static String adicionaArrayConta(Conta conta) {
		if (arrayConta[arrayConta.length - 1] == null) {
			int contador = 0;
			while (arrayConta[contador] != null) {
				contador++;
			}
			arrayConta[contador] = conta;
			return "Foi adicionado na posi��o " + contador + "\n";
		}
		return "Array est� cheio\n";
	}

	public static String primeiroElementoArrayConta() {
		return "O primeiro array �:\n" + arrayConta[0];
	}

	public static String ultimoElementoArrayConta() {
		Conta conta = null;
		if (arrayConta[0] != null) {
			for (int i = 0; i < arrayConta.length; i++) {
				if (arrayConta[i] != null) {
					conta = arrayConta[i];
				}
			}
			return "Ultimo adicionado foi:\n" + conta;
		}
		return "Array v�zio";
	}

	public static String tamanhoArrayConta() {
		int contador = 0;
		for (int i = 0; i < arrayConta.length; i++) {
			if (arrayConta[i] != null) {
				contador++;
			}
		}

		return "Seu array tem " + contador + " posi��es ocupadas de um total de " + arrayConta.length;
	}

}