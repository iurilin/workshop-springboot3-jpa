# Web Services com Spring Boot, JPA e Hibernate

Este projeto foi desenvolvido como prática do curso de Java completo da [DevSuperior](https://devsuperior.com.br), com foco na criação de um sistema de web services utilizando o ecossistema Spring.

## 🎯 Objetivos

- Criar uma API RESTful com Spring Boot
- Modelar um domínio com entidades e relacionamentos
- Implementar operações básicas de CRUD
- Utilizar o Spring Data JPA para persistência de dados
- Trabalhar com banco de dados H2 (em memória) e PostgreSQL (desenvolvimento)
- Aplicar tratamento de exceções

## 🛠️ Tecnologias Utilizadas

- Java
- Spring Boot
- Spring Data JPA
- Hibernate
- H2 Database
- PostgreSQL
- Maven

## 🗂️ Estrutura do Projeto

O projeto segue uma arquitetura em camadas, com separação entre:

- **Camada de recursos (Resource)**: controladores REST
- **Camada de serviços (Service)**: lógica de negócio
- **Camada de repositórios (Repository)**: acesso ao banco de dados

As principais entidades do sistema incluem: `User`, `Order`, `Product`, `Category`, `OrderItem` e `Payment`.

## 👨‍🏫 Base do Projeto

Este projeto foi baseado nas aulas do professor [Nélio Alves](https://github.com/acenelio), disponíveis na plataforma da DevSuperior.

---

Projeto criado para fins de aprendizado e prática com as ferramentas do ecossistema Spring.
