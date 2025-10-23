# Microsserviço Catálogo - E-commerce

## IMPORTANTE:

ESTE PROJETO NÃO ESTÁ FUNCIONANDO CORRETAMENTE E FAZ PARTE DE UM PROJETO A SER ENTREGUE PARA UM BOOTCAMP. NÃO RECOMENDO BAIXAR PARA USO REAL, NO MÁXIMO BAIXE PARA USO PESSOAL (ESTUDO).

##Descrição

Este projeto é um microsserviço simples para gerenciar produtos (catálogo) em um sistema de e-commerce, usando Spring Boot.

---

## Funcionalidades

- Listar todos os produtos
- Buscar produto por ID
- Criar novo produto
- Atualizar produto existente
- Deletar produto por ID

---

## Tecnologias

- Java 17
- Spring Boot 3.1
- Spring Data JPA
- Banco H2 em memória
- Maven

---

## Como rodar

### Pré-requisitos

- Java 17 instalado
- Maven 3.9.11 instalado

### Passos

1. Clone o repositório ou crie a estrutura de arquivos conforme exemplo.

```bash

```


2. No terminal, navegue até a pasta do projeto.

3. Execute o comando para baixar dependências e compilar:

```bash
mvn clean install
```

4. Execute a aplicação:
 
```bash
mvn spring-boot:run
```

5. EXTRA: 

Caso tenha mais de uma aplicação java instalada, você pode selecionar a versão alterando a variável de ambiente.
 
```bash
set JAVA_HOME=C:\Program Files\Java\jdk-17\
set PATH=%JAVA_HOME%\bin;%PATH%
mvn clean spring-boot:run

```
 