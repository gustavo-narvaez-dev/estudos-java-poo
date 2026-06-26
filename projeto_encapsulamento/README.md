# Payroll System - Demonstração de Encapsulamento em Java

Este repositório contém um sistema de folha de pagamento corporativa simplificado, desenvolvido em Java Puro, com o objetivo de aplicar conceitos fundamentais de Orientação a Objetos (POO) voltados para regras de negócio reais do mercado de trabalho.

## 🚀 Conceitos Aplicados

* **Encapsulamento Estrito:** Uso de modificadores de acesso `private` para proteger dados financeiros sensíveis contra modificações externas diretas.
* **Imutabilidade com `final`:** Atributos críticos que não devem ser alterados após o registro (como `id` e `name`) foram blindados utilizando a palavra-chave `final`.
* **Validação em Setters:** Implementação de regras de negócio diretamente na camada de atribuição (garantindo que nenhum salário seja inferior ao salário mínimo de R$ 1.412,00).
* **Fator de Multiplicação:** Otimização matemática limpa na aplicação de bônus percentuais.

## 🛠️ Estrutura do Projeto

* `Employee.java`: Entidade que centraliza o estado do funcionário, validações e cálculo de bônus.
* `Main.java`: Simulador responsável por instanciar os objetos e validar a aplicação das regras do sistema.
