# Sistema de Corretor ortográfico

Neste trabalho, foi feito um projeto em Java para servir como corretora
ortográca (spellchecker ) para alguma aplicação de texto (como um processador
de texto, p. ex.). Trabalho realizado seguindo os passos do pdf "TP_spellchecker"

## Classes

### SpellChecker

Responsável por verificar o dicionário de palavras. Realiza operações como contagem, verificação de existência e comparação de palavras.

## DictReader

Classe fornecida anteriormente que lê e manipula o arquivo do dicionário de palavras. Oferece métodos para carregar e salvar o dicionário.

### Main.java

- Contém o método `main` para testar as funcionalidades presentes no `SpellChecker`.

## Funcionalidades

1. **Número de Palavras**: `numberOfWords()` retorna o total de palavras no dicionário.
2. **isKnownWord**: Verifica se uma palavra está presente no dicionário.
3. **allKnown**: Verifica se todas as palavras em uma lista estão presentes no dicionário.
4. **wordsStartingWith**: Lista palavras que começam com um determinado prefixo.
5. **wordsContaining**: Lista palavras que contêm um texto específico.
6. **insert**: Insere uma nova palavra no dicionário, se não estiver presente.
7. **remove**: Remove uma palavra do dicionário, se estiver presente.
8. **isPalindrome**: Verifica se uma palavra é um palíndromo.
9. **anagrams**: Encontra anagramas de uma palavra.
10. **difference**: Identifica palavras fora da interseção entre dois dicionários.
11. **distance**: Calcula a distância entre duas palavras com base no algoritmo de Levenshtein.
