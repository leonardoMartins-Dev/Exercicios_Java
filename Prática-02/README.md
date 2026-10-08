# Prática 2 – Arrays e Collections

Carrinho de compras de uma loja de suprimentos, feito para a disciplina **Programação Modular** (PUC Minas, Prof. Glender Brás). Os itens da fatura ficam num `ArrayList`.

## Estrutura

```
CarrinhoCompras/
├── application/
│   └── CarrinhoApplication.java   # main com o menu
└── models/
    ├── Produto.java               # código, nome e preço
    ├── Item.java                  # produto, quantidade e valor total do item
    └── Fatura.java                # lista de itens e valor total da fatura
```

## Funcionalidades

Os produtos são fixos no código (caneta, caderno, lápis, borracha e resma de papel A4). O menu tem:

1. **Comprar**: mostra os produtos e pede o código e a quantidade. Se o produto já está na fatura, soma a quantidade.
2. **Ver fatura**: itens comprados e valor total.
3. **Excluir item**: remove um item da fatura.
4. **Alterar item**: muda a quantidade de um item.
5. **Finalizar**: mostra a fatura e o valor final da compra e encerra.

Em todos os submenus, digitar `0` volta sem fazer nada.

## Como executar

Precisa do JDK instalado. No terminal, dentro da pasta `Prática-02`:

```bash
javac -d bin CarrinhoCompras/*/*.java
java -cp bin application.CarrinhoApplication
```

No VS Code, basta abrir a pasta `Prática-02`: o `.vscode/settings.json` já indica onde está o código.
