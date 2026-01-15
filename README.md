## Desafios de Lógica de Programação — DIO + Blip

Este repositório reúne diversos desafios práticos de lógica de programação, desenvolvidos como parte das atividades da Digital Innovation One (DIO) em parceria com a Blip.

Os desafios têm como objetivo reforçar fundamentos essenciais da programação, como variáveis, operadores, estruturas condicionais, laços de repetição, funções, manipulação de strings, objetos e classes, aplicados em cenários práticos envolvendo heróis, bots e plataformas de inteligência conversacional.

📌 Desafios Implementados
 1. Classificador de Nível de Herói
Programa que recebe o nome de um herói e sua quantidade de experiência (XP) e classifica o herói em níveis que vão de Ferro até Radiante, de acordo com regras pré-definidas.

Conceitos aplicados:
- Variáveis
- Operadores relacionais
- Estruturas condicionais (if / else)
- Laços de repetição

 2. Bot Command Identifier
Implementação da lógica de decisão de um bot que identifica comandos básicos enviados pelo usuário (start, stop, pause) e responde de forma apropriada. Qualquer outro comando é tratado como desconhecido.

Conceitos aplicados:
- Comparação de strings
- Estruturas condicionais
- Entrada e saída de dados

 3. Corporate Chatbot Decision Engine
Núcleo de decisão de um chatbot corporativo desenvolvido com switch case, capaz de responder a comandos como:
horario; telefone; servicos; sair; Comandos não reconhecidos retornam uma mensagem padrão de erro.

Conceitos aplicados:
- Estrutura switch case
- Controle de fluxo
- Padronização de respostas

 4. Contador de Mensagens por Tipo
Programa que analisa um fluxo de conversa e conta quantas mensagens pertencem a um determinado tipo (BOT ou USER), processando todas as entradas até encontrar o marcador de fim da conversa.

Conceitos aplicados:
- Laços de repetição
- Condições
- Manipulação de strings

5. Padronização de Mensagens (Maiúsculas)
Função que recebe uma mensagem enviada pelo usuário e retorna o mesmo texto com todas as letras minúsculas convertidas para maiúsculas, mantendo números e pontuações inalterados.

Conceitos aplicados:
- Funções
- Métodos nativos de string
- Entrada e saída de dados

6. Saudação Personalizada por Canal
Função que recebe o nome do canal digital e o nome do cliente e retorna uma mensagem de saudação padronizada no formato:
Ola, [cliente]! Bem-vindo ao canal [canal].

Conceitos aplicados:
- Funções com parâmetros
- Concatenação / Template Strings

7. Bot de Saudação por Canal
Simulação do comportamento de um bot que retorna uma saudação diferente de acordo com o canal informado (whatsapp, telegram, webchat). Canais não reconhecidos retornam uma mensagem padrão.

Conceitos aplicados:
- Estruturas condicionais
- Funções com retorno

8. Estruturação de Mensagens com Objetos
Criação de objetos a partir de mensagens no formato cliente:mensagem, retornando uma resposta padronizada ou indicando formato inválido.

Conceitos aplicados:
- Objetos
- Manipulação de strings
- Estruturas condicionais

9. Extração de Canal a partir de JSON
Leitura de uma string JSON representando uma mensagem e extração da propriedade canal, garantindo retorno em letras minúsculas ou indefinido quando necessário.

Conceitos aplicados:
- JSON
- Manipulação de objetos
- Tratamento de exceções (try / catch)

10. Calculadora de Partidas Ranqueadas
Função que recebe a quantidade de vitórias e derrotas, calcula o saldo de vitórias e classifica o jogador em níveis que vão de Ferro até Imortal.

Conceitos aplicados:
- Funções
- Operadores
- Estruturas condicionais
- Raciocínio lógico

11. Escrevendo as Classes de um Jogo
Criação de uma classe genérica de herói com propriedades (nome, idade, tipo) e um método atacar(), que exibe mensagens personalizadas conforme o tipo do personagem.

Conceitos aplicados:
- Classes e objetos
- Métodos
- Estruturas de decisão
- Programação orientada a objetos

🛠️ Tecnologias Utilizadas

Java - Primeiro desafio
JavaScript - Demais desafios
Ambiente de execução da DIO (gets() e print())

🎯 Objetivo Educacional
Este repositório tem finalidade educacional, com foco no desenvolvimento do raciocínio lógico, na prática dos fundamentos da programação e na construção de um portfólio sólido no GitHub, conforme proposto nos bootcamps e desafios da DIO + Blip.

🚀 Organização
Cada desafio está implementado de forma independente, permitindo fácil leitura, execução, manutenção e evolução do código.
