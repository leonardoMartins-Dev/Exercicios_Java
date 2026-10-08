# Lista 0 – Revisão de Programação

Lista de nivelamento da disciplina **Programação Modular** (PUC Minas, Prof. Glender Brás): 10 exercícios de revisão em Java com laços, vetores e matrizes.

## Exercícios

| # | Classe | O que faz |
|---|--------|-----------|
| 1 | [`ex01.Fatorial`](src/ex01/Fatorial.java) | Calcula o fatorial de um inteiro |
| 2 | [`ex02.TresValores`](src/ex02/TresValores.java) | Maior e menor de 3 valores, se x está dentro ou fora de [y, z] e se x é divisível por y e por z |
| 3 | [`ex03.IntersecaoVetores`](src/ex03/IntersecaoVetores.java) | Matrículas que estão em Programação Modular e em Cálculo ao mesmo tempo |
| 4 | [`ex04.UniaoVetores`](src/ex04/UniaoVetores.java) | União de dois vetores, sem repetir elementos |
| 5 | [`ex05.PesquisaHabitantes`](src/ex05/PesquisaHabitantes.java) | Maior e menor idade, e quantas mulheres de 18 a 35 anos têm olhos verdes e cabelos louros (idade `-1` encerra) |
| 6 | [`ex06.CorrecaoProvas`](src/ex06/CorrecaoProvas.java) | Corrige provas de 8 questões de 10 alunos e mostra a porcentagem de aprovação (nota mínima 6) |
| 7 | [`ex07.Temperaturas`](src/ex07/Temperaturas.java) | Maior e menor temperatura média do ano, com o mês por extenso |
| 8 | [`ex08.LojaArtesanato`](src/ex08/LojaArtesanato.java) | Relatório de vendas de 10 objetos, comissão de 5% e objeto mais vendido |
| 9 | [`ex09.ParesImpares`](src/ex09/ParesImpares.java) | Relatório dos pares (com a soma) e dos ímpares (com a quantidade) entre 6 números |
| 10 | [`ex10.VendasAnuais`](src/ex10/VendasAnuais.java) | Matriz 12 × 4 de vendas: total por mês, por semana e no ano |

## Como executar

Precisa do JDK instalado. No terminal, dentro da pasta `Lista0`:

```bash
javac -d out src/ex*/*.java
java -cp out ex01.Fatorial
```

Para rodar outro exercício, troque `ex01.Fatorial` pela classe da tabela (por exemplo `java -cp out ex09.ParesImpares`).

Os exercícios que leem números decimais (7, 8 e 10) seguem o idioma do sistema: em português, digite com vírgula (`3,5`).
