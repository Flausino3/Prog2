# Sistema de Controle de Estacionamento

Este é um sistema de controle de estacionamento simples implementado em Java, utilizando as classes `Horario` e `Parquimetro`.

## Classes

### Horario

A classe `Horario` representa um horário com horas e minutos. Possui métodos para adiar o horário e mostrar o horário formatado.

### Parquimetro

A classe `Parquimetro` modela um parquímetro fracionado, com funcionalidades como inserção de dinheiro, aumento de tempo de estacionamento, impressão de tickets e controle de troco.

## Funcionamento do Programa

1. **Horario:**
    - Cria um objeto `Horario`.
    - Adia o horário em 45 minutos.
    - Mostra o horário final.

2. **Parquimetro:**
    - Cria um objeto `Parquimetro` para uma área normal.
    - Insere dinheiro no parquímetro.
    - Aumenta o tempo de estacionamento em incrementos específicos.
    - Imprime um ticket de estacionamento.
    - Devolve troco, se houver.
    - Esvazia o parquímetro, exibindo o total acumulado.

