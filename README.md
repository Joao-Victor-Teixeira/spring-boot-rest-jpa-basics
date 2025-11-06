# Projeto 1: API REST com Spring Boot e JPA/Hibernate

Este é o meu primeiro projeto web com Spring Boot, focado na construção de uma API RESTful. O objetivo é aplicar os fundamentos do Spring, incluindo injeção de dependência, arquitetura em camadas e persistência de dados com Spring Data JPA.

Este projeto é baseado no "Aulão #005 - Seu primeiro projeto Java web no Spring Boot" e no workshop "Web Services com Spring Boot e JPA" do Dr. Nélio Alves (DevSuperior).

## 🎯 Objetivos de Aprendizado

* **Spring Boot:** Criar e configurar um projeto Java web usando o Spring Initializr e Maven.
* **API REST:** Construir controladores REST (`@RestController`) para expor endpoints HTTP (GET, POST, PUT, DELETE).
* **Injeção de Dependência:** Entender e aplicar a Injeção de Dependência (`@Autowired`) do Spring para gerenciar componentes.
* **Arquitetura em Camadas:** Estruturar a aplicação em camadas lógicas (Resource/Controller, Service, Repository).
* **Spring Data JPA:** Usar o Spring Data JPA (`JpaRepository`) para abstrair e simplificar a persistência de dados (ORM), evoluindo do JDBC/DAO manual.
* **Banco de Dados (H2):** Configurar e usar um banco de dados em memória (H2) para um ambiente de desenvolvimento e testes rápido.
* **Mapeamento Objeto-Relacional (JPA):** Mapear entidades de domínio (como `Category` e `Product`) para tabelas do banco usando anotações JPA (`@Entity`, `@Id`, `@ManyToOne`, etc.).

## 🛠️ Tecnologias Utilizadas

* **Back-end:** Java (JDK 17/21)
* **Framework:** Spring Boot
* **Persistência:** Spring Data JPA, Hibernate
* **Banco de Dados:** H2 Database (em memória)
* **Build/Dependências:** Maven
* **Testes de API:** Postman (para testar os endpoints REST)

## 📖 Modelo de Domínio (Simplificado)

Este projeto gerencia duas entidades principais:

* **`Category` (Categoria):** `id` (Long), `name` (String)
* **`Product` (Produto):** `id` (Long), `name` (String), `price` (Double)
* **Relacionamento:** Um `Product` tem uma `Category` (`@ManyToOne`).

## 🔌 API Endpoints (Exemplos)

A API expõe os seguintes endpoints REST para interagir com os dados:

* `GET /categories` - Lista todas as categorias.
* `GET /categories/{id}` - Busca uma categoria por ID.
* *... (endpoints de `Product` serão adicionados conforme o projeto)*

## ▶️ Como Executar

1.  **Pré-requisitos:**
    * Java JDK (versão 17 ou 21) instalado.
    * Maven instalado e configurado no PATH.

2.  **Clone o Repositório:**
    ```bash
    git clone [https://github.com/Joao-Victor-Teixeira/NOME-DO-SEU-REPOSITORIO.git](https://github.com/Joao-Victor-Teixeira/spring-boot-rest-jpa-basics.git)
    cd spring-boot-basic
    ```

3.  **Execute a Aplicação:**
    * Você pode executar diretamente pela sua IDE (VS Code) clicando "Run" na classe principal que contém o `@SpringBootApplication`.
    * Ou, via terminal Maven:
    ```bash
    mvn spring-boot:run
    ```

4.  **Acesse o Banco H2:**
    * Com a aplicação rodando, abra seu navegador e acesse: `http://localhost:8080/h2-console`
    * Verifique o `JDBC URL` no seu arquivo `application.properties` (deve ser `jdbc:h2:mem:testdb`) e insira-o no campo "JDBC URL" do H2.
    * Usuário: `sa`
    * Senha: (em branco)
    * Clique em "Connect" para ver e consultar as tabelas (`Category`, `Product`) que o JPA/Hibernate criou automaticamente.
