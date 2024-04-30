# Comentários no Java

## Existem 3 tipos de comentários no Java

```bash
// comentário em uma única linha

/* Comentário de
   Multiplas linhas
*/

/**
* Comentário em JavaDoc, geralmente utilizado para explicar trechos sobre o código, sobre como funcionam as classes e etc
*/
```

## Nós devemos comentar nosso código?

Nem sempre pode ser uma boa prática, ah não ser que seja o javaDoc.Geralmente você escrever comentários no seu código, ou será um comentário inútil, que não precisava estar lá
Ou um comentário desnecessário, por exemplo, um comentário explicando a lógica do seu código, se o seu código está com uma lógica complexa a ponto de ter que colocar um comentário
Talvez seja melhor rever a lógica desse código.

Nossos códigos uma hora ou outra irá aparecer para outros desenvolvedores, então se sempre fizermos algo com a mais complexa lógica, poderá gerar diversos problemas futuros, como...

- Difícil manutenabilidade, resumidamente será um código difícil de dar manutenção, já que a lógica é extremamente difícil
- Difícil compreensão de outros desenvolvedores. Num ambiente de trabalho, constantemente nosso código será visto por outros devs, e se nós fizermos algo com uma lógica muita complexa, será difícil entender o que nosso código exatamente faz, por exemplo, imagina um dev sênior escrevendo códigos com uma lógica mega complexa? como um dev menos experiente conseguirá entender
