package com.cursomc;

import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cursomc.dominio.Categoria;
import com.cursomc.dominio.Cidade;
import com.cursomc.dominio.Cliente;
import com.cursomc.dominio.Endereco;
import com.cursomc.dominio.Estado;
import com.cursomc.dominio.ItemPedido;
import com.cursomc.dominio.Pagamento;
import com.cursomc.dominio.PagamentoComBoleto;
import com.cursomc.dominio.PagamentoComCartao;
import com.cursomc.dominio.Pedido;
import com.cursomc.dominio.Produto;
import com.cursomc.dominio.enums.EstadoPagamento;
import com.cursomc.dominio.enums.TipoCliente;
import com.cursomc.repositories.CategoriaRepository;
import com.cursomc.repositories.CidadeRepository;
import com.cursomc.repositories.ClienteRepository;
import com.cursomc.repositories.EnderecoRepository;
import com.cursomc.repositories.EstadoRepository;
import com.cursomc.repositories.ItemPedidoRepository;
import com.cursomc.repositories.PagamentoRepository;
import com.cursomc.repositories.PedidoRepository;
import com.cursomc.repositories.ProdutoRepository;

@SpringBootApplication
public class Application implements CommandLineRunner{

	
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
			
		
	}
}
