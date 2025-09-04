## Respostas Revisão AV1

- Aluno: **André David Tavares Rodrigues Mendes** `(04182774)`

**Questão 1**
- Resposta: **B** *(Diferente da linguagem Pascal existe a máquina virtual que é uma camada extra entre o bytecode e o SO.)*
- Motivo: Na hora de executar um código, o Java compila o código fonte em um *bytecode* que é interpretado pela JVM (Java Virtual Machine), e a JVM pega esse bytecode e converte em um código de máquina que é interpretado pelo computador-cliente.

**Questão 2**
- Resposta: **A** *(Permite a independência do Sistema Operacional)*
- Motivo: Devido ao Java adotar o uso do JVM, não é necessário que o programador precise compilar um programa para cada Sistema Operacional, tanto que o Java adota a frase *"Write Once, Run Anywhere"* justamente devido à esse privilégio.

**Questão 3**
- Resposta: **D** *(I, II e III)*

**Questão 4**
- Resposta: Uma classe é um conjunto de entidades que possuem o mesmo tipo e mesmas características / comportamentos. Um objeto seria uma "variável" criada a partir dos atributos da classe, que possui um valor inicial que pode ser modificado dependendo de como o atributo é configurado.

**Questão 5**
- Resposta: O "Cammel Case" é uma boa prática usada não só no Java, mas em várias outras linguagens na hora de declarar uma variável/método, onde é começado com a letra minúscula, porém com o início das outras palavras em letra maiúscula.
```ini
[Variáveis, Métodos]
umaVariavel
umaFuncao
umMetodo
```
**OBS:** Em classes, o padrão usado para declaração é o *Pascal Case (upper camel case)*, onde a inicial começa com letra maiúscula.
```ini
[Classe]
UmaClasse
```
**Questão 6**
```java
// Código mostrado na questão
public class Pessoa {
    private String nome;
    private String cpf;

    public String getNome () {
        return this.nome;
    }
}
```

- Resposta: **C** *(A variável cpf só pode ser visível na própria classe)*
- Motivo: A variável `cpf` na classe está definida como `private`.

**Questão 7**
```java
// Código mostrado na questão
public class Exerc01_geometria {
    public static void main (String[] args) {
        TrianguloRetangulo x = new TrianguloRetangulo(5.0, 6.0, 6.2, 7.1);
    }
}
```
- Resposta: **B** *(TrianguloRetangulo possui um método construtor com atributos no valor real.)*
- Motivo: A parte onde mostra `new TrianguloRetangulo(5.0, 6.0, 6.2, 7.1)` mostra que essa classe é parametrizada. Ou seja, possui um construtor que permite que os valores sejam atribuídos diretamente na hora de instanciar a classe.

**Questão 8**
- Resposta: Na POO, o Encapsulamento é quando uma variável não pode ser acessada diretamente da classe por questões de segurança. Normalmente ela é acessada através de *getters* e *setters* aplicando qualquer lógica para acessar o conteúdo dessa variável.

**Questão 9**
```java
// Código mostrado na questão
public static void main(String[] args) {
    Livro obj1;
    obj1 = new Livro();
}
```
- Resposta: **D** *(Na terceira linha obj1 está sendo instanciado.)*
- Motivo: Na segunda linha (`Livro obj1`) a variável é declarada no código, já na terceira linha a variável é instanciada na classe.

