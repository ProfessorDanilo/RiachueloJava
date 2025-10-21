# 💰 Sistema Bancário em Java

Este é um projeto simples de um sistema bancário, desenvolvido em Java, com o objetivo de praticar os principais conceitos de **Programação Orientada a Objetos (POO)**: herança, encapsulamento, polimorfismo, abstração e reuso de código.

---

## Conceitos abordados

- Classes e Objetos
- Herança e Polimorfismo
- Encapsulamento com `private`, `protected`, `public`
- Classes abstratas
- Composição (classe `Banco` contém `Conta`)
- Interação via console (`Scanner`)
- Organização em pacotes (`com.danilo.banco`)

---

## Estrutura de pastas
src/

└── com/

    └── danilo/

        └── banco/

            ├── Main.java

            ├── Banco.java

            ├── Conta.java

            ├── ContaCorrente.java

            ├── Transacao.java

            └── Investimento.java

Você pode trocar o meu nome "danilo" para personalizar o programa.

---

## Como executar

### Pré-requisitos:
- Java 17 ou superior (recomendado Java 21+)
- IntelliJ IDEA (ou qualquer IDE Java)

### Passos:

1. Clone este repositório ou crie um novo projeto com os arquivos listados acima.
2. Certifique-se de que seu projeto está com um SDK Java configurado.
3. Crie a estrutura de pacotes `com.danilo.banco`.
4. Adicione os arquivos Java dentro do pacote.
5. Rode a classe `Main.java`.

---

## Funcionalidades implementadas

### Menu interativo no console com as seguintes opções:

- Criar nova conta
- Selecionar uma conta ativa
- Ver saldo
- Depositar dinheiro
- Sacar dinheiro
- Transferir dinheiro via PIX (entre contas do sistema)
- Ver histórico de transações
- Listar todas as contas existentes
- Sair do programa

---

## Exemplo de uso no console:

=== MENU PRINCIPAL ===

1. Criar nova conta

2. Selecionar conta

3. Ver saldo

4. Depositar

5. Sacar

6. Transferir PIX

7. Ver histórico

8. Listar todas as contas
   
0. Sair


---

## 🏦 Estrutura das Classes

| Classe            | Responsabilidade                                      |
|-------------------|--------------------------------------------------------|
| `Main`            | Interação com o usuário (menu via console)            |
| `Banco`           | Gerencia as contas (adicionar, buscar, listar)        |
| `Conta`           | Classe abstrata base com operações comuns             |
| `ContaCorrente`   | Implementação concreta de conta                       |
| `Transacao`       | Armazena dados de depósitos, saques, transferências   |
| `Investimento`    | Modelo simples de investimento (nome, valor, rentabilidade) |

---

## 📚 Possíveis melhorias

- Interface gráfica (GUI com JavaFX ou Swing)
- Sistema de autenticação (login com CPF/senha)
- Salvar dados em arquivo (persistência com arquivos ou banco de dados)
- Implementar tipos de conta (Poupança, Investimento)
- Aplicar testes automatizados com JUnit

---

## Autor

Criado por **Danilo** como projeto do bootcamp Riachuelo - Primeiros Passos com Java.  
Sinta-se livre para usar, modificar e expandir!

