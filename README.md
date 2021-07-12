## Observer (_Design Pattern_)
Exemplo de implementação básica do padrão de projeto _Observer_.

Linguagem: Kotlin

## Definição

Segundo Freeman e Freeman (2004):

"**O padrão Observer:** Define a dependência um-para-muitos entre objetos para que quando um objeto mude de estado todos os seus dependentes sejam avisados e atualizados automaticamente."

## O poder da ligação leve

Para Freeman e Freeman (2004), "o padrão Observer fornece um design de objeto onde os sujeitos e os observador são levemente ligados."

Por quê?

> "A única coisa que o sujeito sabe sobre um observador é que ele implementa uma certa interface"

> "Podemos adicionar novos observadores a qualquer momento"

> "Nunca precisamos modificar o sujeito para adicionar novos tipos de observadores"

> "Podemos reutilizar sujeitos ou observadores independentemente uns dos outros"

> "Alterações no sujeito ou num observador não irão afetar o outro"
