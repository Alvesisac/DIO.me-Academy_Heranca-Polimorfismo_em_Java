# Estudos de Herança e Polimorfismo em Java

Este projeto contém exercícios de Java focados em herança e polimorfismo, implementados com classes que representam colaboradores em um sistema de folha de pagamento.

## Objetivo

Demonstrar conceitos de:

- Herança (`extends`)
- Polimorfismo de subtipo
- Métodos abstratos
- Classes seladas e hierarquias controladas (`sealed`, `non-sealed`)
- Sobrescrita de métodos
- Uso de `record` para classes de dados simples
- `switch` com correspondência de padrões em classes seladas

## Estrutura do projeto

- `Colaborador.java`
  - Classe abstrata selada que define propriedades e comportamentos comuns a todos os colaboradores.
  - Declara o método abstrato `obterSalarioIntegral()` que é implementado pelas subclasses.

- `Gerente.java`
  - Subclasse de `Colaborador` que representa um gerente.
  - Implementa cálculo de salário integral com comissão.
  - Usa `non-sealed` para permitir herança adicional, se desejado.

- `Vendedor.java`
  - Subclasse de `Colaborador` que representa um vendedor.
  - Calcula salário integral com uma porcentagem de vendas.

- `Desenvolvedor.java`
  - Classe `record` simples, mostrando como usar este recurso do Java para modelar dados imutáveis.

- `Main.java`
  - Classe de execução do programa.
  - Demonstra polimorfismo e pattern matching com `switch` sobre as subclasses de `Colaborador`.

## Conceitos aplicados

- `sealed abstract class`: limita as subclasses permitidas na hierarquia de herança.
- `non-sealed class`: permite que a subclasse seja estendida ainda mais.
- `abstract method`: obriga as subclasses a fornecerem uma implementação específica.
- `switch` com `case Gerente gerente ->` e `case Vendedor vendedor ->`: exemplo de pattern matching.
- `record`: uso de classe de dados imutável para `Desenvolvedor`.

## Como executar

1. Abra o terminal na pasta `Heranca_e_polimorfismo`.
2. Compile:

```bash
javac src/*.java
```

3. Execute:

```bash
java -cp src Main
```

## O que foi estudado

- Modelagem de uma hierarquia de profissionais com atributos comuns e comportamentos específicos.
- Como criar uma classe abstrata e implementar métodos em subclasses.
- Como usar polimorfismo para tratar objetos de diferentes subclasses como um tipo comum.
- Como organizar código utilizando herança e sobescrita para especialização.

## Observações

Este repositório é um estudo pessoal de Java que exemplifica a prática de POO com herança e polimorfismo. Você pode estender o projeto adicionando novos tipos de colaboradores, validando dados ou melhorando a interação na classe `Main`.
