# CRUD de Clientes — Spring Boot REST API

Projeto Spring Boot com um CRUD completo para gerenciar clientes.

## Funcionalidades
- **GET /clients** — Busca paginada de clientes
- **GET /clients/{id}** — Busca cliente por ID
- **POST /clients** — Insere novo cliente
- **PUT /clients/{id}** — Atualiza cliente existente
- **DELETE /clients/{id}** — Remove cliente

## Tecnologias
- Java 17+
- Spring Boot 3+
- Spring Data JPA
- Banco H2 (teste)
- Maven

## Regras de Validação
- Nome: não pode ser vazio
- Data de nascimento: não pode ser futura (`@PastOrPresent`)

## Tratamento de Erros
- **404**: ID não encontrado
- **422**: Erro de validação com mensagens personalizadas

## Modelo de Dados
- `id`: Long
- `name`: String
- `cpf`: String
- `income`: BigDecimal
- `birthDate`: LocalDate
- `children`: Integer

## Seed de Dados
Pelo menos 10 clientes com nomes e dados reais (em `data.sql` ou via código).

## Como Rodar
```bash
git clone <URL>
cd <pasta>
mvn spring-boot:run
