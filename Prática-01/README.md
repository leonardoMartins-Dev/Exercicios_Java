# Prática 1 – Classes e objetos básicos

Primeira prática da disciplina **Programação Modular** (PUC Minas, Prof. Glender Brás): classes, construtores e encapsulamento com getters e setters em Java.

## Exercício 1 – IMC e classificação corporal (`IMC/`)

- [`pessoa.java`](IMC/pessoa.java): classe com nome, sobrenome, idade, altura, peso e IMC. Calcula o IMC (peso / altura²) e informa a faixa de massa corporal, de "Abaixo do peso" até "Obesidade grau 3".
- [`main.java`](IMC/main.java): lê os dados da pessoa e exibe o IMC e a classificação.

## Exercício 2 – Chapéu Seletor de Hogwarts (`chapeuSeletor/`)

- [`Aluno.java`](chapeuSeletor/Aluno.java): guarda os atributos do aluno, calcula a idade pela data de nascimento, gera o código de matrícula e escolhe a casa com a maior pontuação:

  | Casa | Pontuação |
  |------|-----------|
  | Grifinória | 2 × coragem + lealdade |
  | Sonserina | 2 × ambição + estratégia |
  | Corvinal | 2 × inteligência + criatividade |
  | Lufa-Lufa | (2 × lealdade + coragem) / 3 |

- [`main.java`](chapeuSeletor/main.java): cadastra alunos em loop (até 10) até o usuário pedir para parar. Depois lista todos os alunos, separa por casa e por maioridade, e busca pelo sobrenome.

## Como executar

Precisa do JDK instalado. Os exercícios são independentes. No terminal, dentro da pasta `Prática-01`:

```bash
cd IMC            # ou: cd chapeuSeletor
javac *.java
java main
```

No IMC, altura e peso seguem o idioma do sistema: em português, digite com vírgula (`1,75`).
