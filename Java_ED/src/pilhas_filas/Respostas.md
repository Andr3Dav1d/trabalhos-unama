## Estrutura de Dados - Pilhas e filas
- Aluno: André David Tavares Rodrigues Mendes - 04182774

1) Um aplicativo de edição de texto permite que o usuário use a função "Desfazer" (Ctrl+Z). Cada ação realizada pelo usuário precisa ser desfeita na ordem inversa em que aconteceu.<br>Qual estrutura de dados é mais adequada para essa situação: fila ou pilha? Explique.

> _Resposta:_ **Pilha**, porque a pilha segue o princípio LIFO (Last In, First Out), permitindo desfazer as ações na ordem inversa em que foram realizadas, exatamente como funciona a função "Desfazer".

2) Um hospital precisa organizar os exames realizados em pacientes durante o dia. Cada exame é registrado em ordem cronológica. No fim do dia, o sistema deve imprimir esses exames na ordem inversa à que foram feitos (do último para o primeiro). <br>Que estrutura você usaria para guardar os exames: fila ou pilha? <br>Implementaria com array ou lista encadeada? Justifique.

> _Resposta:_ **Pilha**, pois ela permite acessar os exames na ordem inversa em que foram registrados (LIFO). Para implementar, uma **lista encadeada** é mais adequada, pois facilita a inserção e remoção de elementos sem a necessidade de realocação de memória, diferente do array.

3) Um sistema precisa controlar tarefas usando simultaneamente uma fila e uma pilha. As tarefas chegam e são inseridas na fila, mas algumas tarefas prioritárias precisam ser movidas imediatamente para a pilha, sendo resolvidas antes das demais.<br> Explique qual será a ordem final de execução das tarefas e justifique o porquê, considerando o funcionamento das duas estruturas.
> _Resposta:_ As tarefas prioritárias que forem movidas para a pilha serão executadas primeiro, seguindo a ordem inversa em que foram inseridas (LIFO). Após todas as tarefas da pilha serem resolvidas, as tarefas restantes na fila serão executadas na ordem em que chegaram (FIFO). Isso ocorre porque a pilha prioriza o último elemento inserido, enquanto a fila mantém a ordem de chegada.