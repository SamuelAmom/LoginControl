# 🔐 Sistema de Login com Autenticação - Spring Boot

Este projeto é uma API de autenticação com Spring Boot e Spring Security, que permite o login de usuários com diferentes papéis: `CLIENT` e `ADMIN`.

## 🧰 Tecnologias utilizadas

- Java 17+
- Spring Boot
- Spring Security
- Spring Data JPA
- MySQL
- Maven
- BCrypt (para senhas)
- Git

## ✅ Funcionalidades

- Autenticação de usuários
- Atribuição de roles (`CLIENT` e `ADMIN`)
- Proteção de endpoints por role
- Inserção automática de dois usuários (admin e cliente) ao iniciar o app
- Testes de login via navegador ou Postman

## 🚀 Como rodar o projeto localmente
 - 1.Configure o banco de dados: 
    Certifique-se de ter o MySQL rodando. Crie um banco chamado login_db
    
 - 2.Atualize o arquivo application.properties: 
    spring.datasource.url=jdbc:mysql://localhost:3306/login_db
    spring.datasource.username=root
    spring.datasource.password=sua_senha
    spring.jpa.hibernate.ddl-auto=update
 - 3.Rode o projeto: 
    Use sua IDE ou no promp ./mvnw spring-boot:run
   
## 👤 Usuários de teste
  - O sistema cria dois usuários automaticamente ao iniciar: 
  
| Username | Senha  | Role   |
| -------- | ------ | ------ |
| admin    | 123456 | ADMIN  |
| cliente  | 123456 | CLIENT |


## 🔗 Endpoints de teste
   
| Método | URL                | Acesso |
| ------ | ------------------ | ------ |
| GET    | `/api/test/admin`  | ADMIN  |
| GET    | `/api/test/client` | CLIENT |

##🛠️ Melhorias futuras
 - JWT para autenticação stateless
 - Cadastro de novos usuários
 - Integração com frontend (Angular ou React)
 - Deploy com Docker
  
