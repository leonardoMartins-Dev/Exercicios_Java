# Prática 3 – Herança e Polimorfismo

Dois sistemas em Java feitos para a disciplina **Programação Modular** (PUC Minas, Prof. Glender Brás), usando classes abstratas, herança e sobrescrita de métodos.

## 1. Agenda Telefônica (`AgendaTelefonica/`)

```
AgendaTelefonica/
├── application/
│   └── AgendaApplication.java     # main com o menu
└── models/
    ├── Contato.java               # abstrata: nome, email e telefone
    ├── ContatoPessoal.java        # + data de aniversário e parentesco
    ├── ContatoProfissional.java   # + empresa e cargo
    ├── ContatoEmergencia.java     # + grau de prioridade (1 a 5) e observação
    └── Agenda.java                # lista de contatos e quantidade cadastrada
```

O menu permite adicionar e remover contatos, buscar por nome, email ou telefone e consultar o tamanho da agenda. Quando um contato não é encontrado, o usuário é avisado.

## 2. Venda de Ingressos (`SistemaVendasIngressos/`)

```
SistemaVendasIngressos/
├── application/
│   └── BilheteriaApplication.java # main com o menu
└── models/
    ├── Ingresso.java              # abstrata: código, evento, setor e valor base
    ├── IngressoComum.java         # valor final = valor base, sem benefícios
    ├── IngressoEstudante.java     # 50% de desconto (meia-entrada) + instituição de ensino
    ├── IngressoVIP.java           # +80% sobre o valor base, lounge e acesso ao backstage
    └── Bilheteria.java            # lista de ingressos
```

`calcularValorFinal()` e `obterBeneficios()` são abstratos em `Ingresso`, e cada tipo de ingresso implementa do seu jeito. Assim a bilheteria lista ingressos, soma a arrecadação e mostra os benefícios sem precisar saber o tipo de cada um.

O menu permite cadastrar um ingresso (escolhendo o tipo), remover, buscar por código, listar todos, calcular a arrecadação total e listar os benefícios.

## Como executar

Precisa do JDK instalado. No terminal, dentro da pasta `Pratica-03`:

```bash
# Agenda Telefônica
javac -d bin AgendaTelefonica/*/*.java
java -cp bin application.AgendaApplication

# Venda de Ingressos
javac -d bin SistemaVendasIngressos/*/*.java
java -cp bin application.BilheteriaApplication
```

No VS Code, basta abrir a pasta `Pratica-03`: o `.vscode/settings.json` já indica onde está o código dos dois sistemas.
