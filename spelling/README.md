# Sistema de Corretor ortográfico

Neste trabalho, foi feito um projeto em Java para servir como corretora
ortográca (spellchecker ) para alguma aplicação de texto (como um processador
de texto, p. ex.). Trabalho realizado seguindo os passos do pdf "TP_spellchecker"

## Classes

## SpellChecker

Responsável por verificar o dicionário de palavras. Realiza operações como contagem, verificação de existência e comparação de palavras.

### Métodos

- `numberOfWords()`: Retorna o número total de palavras no dicionário.
- `isKnownWord(String word)`: Verifica se uma palavra está no dicionário.
- `allKnown(ArrayList<String> words)`: Verifica se todas as palavras da lista estão no dicionário.

## DictReader

Classe fornecida anteriormente que lê e manipula o arquivo do dicionário de palavras. Oferece métodos para carregar e salvar o dicionário.

### Métodos

- `DictReader(String filename)`: Carrega o dicionário de um arquivo.
- `getDictionary()`: Retorna o dicionário como uma lista de palavras.
- `save(ArrayList<String> dictionary)`: Salva o dic
