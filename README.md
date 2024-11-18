# Projeto Back-end DSList

Este é o repositório do **back-end** de um projeto de lista de jogos, desenvolvido utilizando o framework **Spring Boot**. O objetivo deste projeto é criar uma API para gerenciar uma lista de jogos, com funcionalidades como exibição, criação, atualização e exclusão de itens.

## 🚀 Tecnologias utilizadas

- **Java 21**: Linguagem principal do projeto.
- **Spring Boot**: Framework para simplificar o desenvolvimento do back-end.
- **JPA/Hibernate**: Para mapeamento objeto-relacional (ORM).
- **H2 Database**: Banco de dados em memória utilizado durante o desenvolvimento.
- **PostgreSQL/MySQL** (opcional): Banco de dados para produção.
- **Spring Data JPA**: Para abstração da persistência de dados.
- **Spring Web**: Para criação e gerenciamento de endpoints REST.

## ⚙️ Funcionalidades

- [x] Listar todos os jogos.
- [x] Busca detalhes de um jogo pelo ID.
- [x] Lista todas as listas de jogos.
- [x] Lista os jogos de uma lista específica.
- [x] Move jogos dentro de uma lista.

## 🛠️ Pré-requisitos

- **Java 21** ou superior instalado.
- **Maven** para gerenciamento de dependências.
- Um banco de dados configurado (H2 para desenvolvimento, PostgreSQL/MySQL para produção, se necessário).

## 📦 Como executar o projeto

1. Clone o repositório:
   `git clone https://github.com/marioluka/Projeto-Back-end-DsList.git
   cd Projeto-Back-end-DsList`
   
2. Configure o arquivo application.properties ou application.yml:

   #### H2(desenvolvimento):
      ```
      spring.datasource.url=jdbc:h2:mem:dslist
      spring.datasource.driverClassName=org.h2.Driver
      spring.datasource.username=sa
      spring.datasource.password=
      spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
      ```
   #### PostgreSQL/SQL(produção):
      ```
      spring.datasource.url=jdbc:postgresql://localhost:5432/dslist
      spring.datasource.username=seu_usuario
      spring.datasource.password=sua_senha
      spring.jpa.database-platform=org.hibernate.dialect.PostgreSQLDialect
      ```
3. Execute o projeto com Maven:
   
   `mvn spring-boot:run`
   
4. Acesse no seu navegador:

   `http://localhost:8080`

## 🧪 Endpoints

| Método | Endpoint                   | Descrição                                |
|--------|-----------------------------|------------------------------------------|
| GET    | `/games`                   | Lista todos os jogos.                    |
| GET    | `/games/{id}`              | Busca detalhes de um jogo pelo ID.       |
| GET    | `/lists`                   | Lista todas as listas de jogos.          |
| GET    | `/lists/{id}/games`        | Lista os jogos de uma lista específica.  |
| POST   | `/lists/{id}/replacement`  | Move jogos dentro de uma lista.          |
