# Operador Lógico && (AND)

## Como funciona o operador lógico &&?

Como ele funciona é bem simples, ele compara dois valores, e diz se ambos são True, no caso, verdadeiro

Por exemplo

```text
resultado = condição1 && condição2;
```

Se ambas as condições forem verdadeiras, o resultado será verdadeiro

Agora vamos aplicar isso num código pra ficar mais fácil de entender

O nosso código abaixo irá verificar se joão e felipe podem tirar a carteira de habilitação.

OBS: Para tirar CNH (Carteira de habilitação), é necessário ser maior de 18 anos, brasileiro e mais uns 
requisitos que não entram ao caso agora, vamos trabalhar apenas com ser maior de 18 e brasileiro
```java
int idadeJoao = 21;
boolean isJoaoBrasileiro = true;
int idadeFelipe = 16;
boolean isFelipeBrasileiro = true;

boolean isJoaoPermitidoTirarCNH = idadeJoao >= 18 && isJoaoBrasileiro;
boolean isFelipePermitidoTirarCNH = idadeFelipe >= 18 && isFelipeBrasileiro;

System.out.println("João é permitido tirar CNH? " + isJoaoPermitidoTirarCNH);
System.out.println("Felipe é permitido tirar CNH? " + isFelipePermitidoTirarCNH);
```

Ao rodarmos o código acima, o resultado será

```text
João é permitido tirar CNH? true
Felipe é permitido tirar CNH? false
```
Agora nós sabemos que João pode tirar CNH, por ser maior de 18 e Brasileiro, já o Felipe não pode, 
mesmo ele sendo brasileiro, ele não é maior de 18