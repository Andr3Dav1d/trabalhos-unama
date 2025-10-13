# POO - Agregação e Composição

```js
const aluno = {
    name: "André David",
    matricula: 04182774
};
```

01) Cite quatro exemplos diferentes que podem ser considerados como agregação e composição (dois de cada)

**R:** Alguns exemplos são: 

- *[Agregação]* **Professor >> Turma**: O professor dá aula para várias turmas, mas a turma existe mesmo se o professor sair.
- *[Composição]* **Computador >> Componente:** O computador não funcionará sem os componentes necessários.
- *[Agregação]* **Time >> Jogador:** O jogador pode sair do time e ainda continuar sendo jogador (ou ir para outro time).
- *[Composição]* **Conta de usuário >> Senha:** Se o usuário esquecer a senha, ele não conseguirá acessar a conta.

02) O que acontece se uma classe for programada como final? E se um atributo for “setado” como final?

**R:** Se uma **classe** for definida como `final`, ela não poderá ser herdada por outra classe (é meio que o "oposto" do `abstract`). Se uma **variável** for definida como `final`, ela será tratada como uma constante. Ou seja, não poderá ter seu valor alterado após sua atribuição.

03) Qual a vantagem de programar um método estático?

**R:** Se eu programar um método como estático, eu não irei precisar instanciar a classe para poder usar esse método.

04) Pesquise e cite mais dois métodos que fazem parte da classe Object.

**R:** Alguns dos métodos que fazem parte da classe `Object` são:

- `equals(Object obj)`: Compara se dois objetos são iguais.
- `toString()`: Retorna uma representação em texto do objeto.

