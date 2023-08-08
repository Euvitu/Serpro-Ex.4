Vamos lá então para lista 4.

1- Desenvolva um programa que receba um inteiro n e retorne a soma dos primeiros n primos. obs: O programa deve acessar uma função separada para verificar se um número é primo.

2 -Desenvolva um programa para calcular e exibir o fatorial de um número n digitado pelo usuário.

3 -Escreva um programa que leia um arquivo CSV contendo uma lista de produtos e seus preços e retorne o produto mais caro.

4 - Refatore o seguinte código para torná-lo mais limpo e manutenível, sem alterar sua funcionalidade.

public boolean isPrime(int n) {

if (n < 2) return false;

for (int i = 2; i < n; i++) {

if (n % i == 0) return false;

}

return true;

}

5 -Escreva testes unitários para a função isPrime refatorada na questão 4.

6 - Questão Bonus.

Programação com Banco de Dados utilizando o JDBC. Selecione todos os produtos de uma tabela "Produtos" cujo preço seja maior que 100. Apresente os resultados na saída padrão.

Para facilitar segue o código;

 import java.sql.Connection;
 import java.sql.DriverManager;
 import java.sql.ResultSet;
 import java.sql.Statement;                                                                                                                     
 public class ProdutoQuery {


 public static void main(String[] args) { 

     try { 

         // 1. Estabelecer uma conexão 

         Connection conn = DriverManager.getConnection("jdbc:URL_DO_SEU_BANCO_DE_DADOS", "username", "password"); 

         
        // 2. Criar uma declaração
        Statement stmt = conn.createStatement();
        
        // 3. Executar uma consulta
        String sql = "SELECIONE SUA CONSULTA SQL AQUI";
        ResultSet rs = stmt.executeQuery(sql);
        
        // 4. Processar o conjunto de resultados
        while (rs.next()) {
            // Seus códigos para processar os resultados
        }
        
        // 5. Fechar recursos
        rs.close();
        stmt.close();
        conn.close();
    } catch (Exception e) {
        e.printStackTrace();
    }
} }
dados para criação do banco sql.

CREATE TABLE Produtos (

 id INT PRIMARY KEY,

 nome VARCHAR(255),

 preco DECIMAL(10, 2)
);
INSERT INTO Produtos (id, nome, preco) VALUES (1, 'Computador', 800.50);

INSERT INTO Produtos (id, nome, preco) VALUES (1, 'abajur', 50.50);

INSERT INTO Produtos (id, nome, preco) VALUES (1, 'Computador2', 3000.50);

INSERT INTO Produtos (id, nome, preco) VALUES (1, 'mouse', 15.50);

INSERT INTO Produtos (id, nome, preco) VALUES (1, 'teclado', 80.50);