# Processar Palíndromos - Backend

<br />

<div align="center">
   <img src="https://i.imgur.com/w8tTOuT.png" title="Logo do Spring" /> 
</div>

<br /><br />

## 1. Descrição

Este projeto em **Java** tem como objetivo verificar se uma palavra, número ou frase é um **palíndromo**.  
Um palíndromo é uma sequência de caracteres que pode ser lida da mesma forma de frente para trás, ignorando espaços, acentos, pontuações e diferenças entre maiúsculas e minúsculas.  

O sistema foi desenvolvido para lidar com casos extremos, como:  
- Strings vazias (solicita nova entrada).  
- Apenas um caractere.  
- Mistura de maiúsculas e minúsculas.  
- Frases com espaços e pontuação.  
- Palavras com acentos.  
- Números como 121, 12321 e 1234.  

------

## 2. Sobre esta aplicação

Este projeto não é uma API, mas sim uma aplicação de **console em Java** que processa entradas do usuário e retorna se são palíndromos ou não.  

### 2.1. Principais Funcionalidades

- Receber uma palavra, número ou frase via entrada do usuário.  
- Normalizar o texto (remover acentos, espaços, pontuações e converter para minúsculas).  
- Inverter a string e comparar com a versão normalizada.  
- Exibir se a entrada é ou não um palíndromo.  
- Tratar casos extremos de forma robusta.  

------

## 3. Tecnologias utilizadas

- Servidor: Console (CLI)  
- Linguagem de programação: Java  
- Framework: Nenhum  
- Biblioteca: java.text.Normalizer  
- Banco de dados: Não utilizado  

------

## 4. Configuração e Execução

1. Clone o repositório:  
   `git clone https://github.com/bianca-msilva/desafio_palindromos.git`  

2. Entre na pasta do projeto:  
   `cd processar_palindromos`  

3. Compile o código:  
   `javac ProcessarPalindromos.java`  

4. Execute a aplicação:  
   `java ProcessarPalindromos`  

------

## 5. Exemplos de uso

Entrada: `ana` → Saída: É um Palíndromo!  
Entrada: `radar` → Saída: É um Palíndromo!  
Entrada: `casa` → Saída: Não é um Palíndromo!  
Entrada: `12321` → Saída: É um Palíndromo!  
Entrada: `A man a plan a canal Panama` → Saída: É um Palíndromo!  

------

## 6. Contribuição

Para contribuir com este projeto:  
- Faça um fork do repositório.  
- Crie uma branch para sua feature: `git checkout -b minha-feature`.  
- Commit suas alterações: `git commit -m 'Adicionando nova feature'`.  
- Envie para a branch: `git push origin minha-feature`.  
- Abra um Pull Request.  

------

## 7. Objetivo

Este projeto é ideal para estudos de manipulação de strings em Java, exercícios de lógica de programação e demonstração de tratamento de entradas e casos extremos.  