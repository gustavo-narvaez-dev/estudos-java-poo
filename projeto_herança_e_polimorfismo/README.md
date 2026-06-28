# Payment Gateway - Demonstração de Herança e Polimorfismo em Java

Este projeto simula o backend de um gateway de processamento de pagamentos, desenvolvido em Java Puro, aplicando conceitos avançados de Orientação a Objetos voltados para a arquitetura de sistemas financeiros de alta performance.

## Estrutura e Conceitos Aplicados

* **Classes Abstratas:** A classe mãe `Transaction` foi definida como `abstract`, servindo puramente como um modelo arquitetural estável e impedindo instanciações genéricas inválidas no sistema.
* **Herança Avançada (`extends` & `super`):** As entidades específicas `PixTransaction` e `CreditCardTransaction` herdam o estado e comportamento da classe abstrata, reduzindo a duplicação de código.
* **Polimorfismo com `@Override`:** O método `displaySummary()` foi sobrescrito nas classes filhas para injetar comportamentos específicos de cada tipo de transação, utilizando o `super` para reaproveitar a lógica centralizada na classe mãe.
* **Imutabilidade de Dados:** Uso rigoroso de modificadores `private final` para garantir que transações financeiras permaneçam inalteradas após a criação.
