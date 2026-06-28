# 💵💲 Payment Gateway - Demonstração de Herança e Polimorfismo em Java

Este projeto simula o backend de um gateway de processamento de pagamentos, desenvolvido em Java Puro, aplicando conceitos avançados de Orientação a Objetos voltados para a arquitetura de sistemas financeiros de alta performance.

## 🏦 Estrutura e Conceitos Aplicados

* **Classes Abstratas:** A classe mãe `Transaction` foi definida como `abstract`, servindo puramente como um modelo arquitetural estável e impedindo instanciações genéricas inválidas no sistema.
* **Herança Avançada (`extends` & `super`):** As entidades específicas `PixTransaction` e `CreditCardTransaction` herdam o estado e comportamento da classe abstrata, reduzindo a duplicação de código.
* **Polimorfismo com `@Override`:** O método `displaySummary()` foi sobrescrito nas classes filhas para injetar comportamentos específicos de cada tipo de transação, utilizando o `super` para reaproveitar a lógica centralizada na classe mãe.
* **Imutabilidade de Dados:** Uso rigoroso de modificadores `private final` para garantir que transações financeiras permaneçam inalteradas após a criação.

## 🚀 Como Executar o Projeto

Este é um projeto desenvolvido em **Java Puro** (sem frameworks externos), o que significa que você pode rodá-lo facilmente em qualquer IDE (IntelliJ IDEA, Eclipse, VS Code) ou até mesmo via terminal.

### Passo 1: Clonar ou Copiar os Arquivos
Certifique-se de manter a estrutura de pacotes criando uma pasta/pacote chamada `Heritage_Project` no seu ambiente de desenvolvimento.

### Passo 2: Criar as Classes
Crie quatro arquivos distintos dentro do pacote `Heritage_Project` e copie os códigos correspondentes:

1. `Transaction.java` (Classe Abstrata Mãe)
2. `PixTransaction.java` (Classe Filha)
3. `CreditCardTransaction.java` (Classe Filha)
4. `Main.java` (Classe de Execução)

### Passo 3: Rodar a Aplicação
* **Pela IDE:** Abra o arquivo `Main.java` e clique no botão **Run** (ícone de *play* verde ao lado do método `main`).
* **Via Terminal:** Navegue até a pasta raiz do projeto (onde fica a pasta `Heritage_Project`) e execute os comandos:
  ```bash
  javac Heritage_Project/*.java
  java Heritage_Project.Main
