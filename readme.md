# Projeto da disciplina Tecnologia Java e Orientação a Objetos do curso de pós graduação em Engenharia de Software com Java

## Aluno Thiago 

### [Repositório](https://github.com/thiagomneves/tjoo)

#### Observações:

##### entrada.txt
Na raiz do projeto existe um txt de entrada com dados separados por ponto e vírgula com o seguinte formato: 

```
P;Pedido de Aniversário;2023-08-19T10:30:00;true
```

Se o primeiro dado é igual a P, a classe responsável pela leitura identificará que é um pedido, e os demais dados são os atributos da classe pedido, com exceção de Solicitantes e Produtos, que estarão em outras linhas, caso existam  

```
S;João da Silva;123.456.789-01;joao@gmail.com
```

Se o primeiro dado é igual a S, a classe responsável pela leitura identificará que é um solicitante, e os demais dados serão os atributos da classe solicitante. Após criar o objeto solicitante, este será incluído no último pedido criado.

```
Cerveja;5.0;101;true;0.33;Skol;B
Sobremesa de Chocolate;8.5;102;false;2.0;Deliciosa sobremesa de chocolate;S
Hamburguer;15.0;103;250.0;false;Pão, carne, alface, tomate, queijo;C
```
Se o primeiro dado não for nem um P nem um S, a classe responsável pela leitura identificará que é um produto, e aí buscará no último dado qual é o tipo:

 - S para sobremesa
 - B para bebida
 - C para comida

Os 3 atributos iniciais são iguais para todos os produtos, por serem os atributos da classe mãe, Produto, enquanto os demais podem variar

##### saida.json
Na raiz do projeto existe um arquivo no formato json com os dados que foram lidos no arquivo de entrada. Deixei o arquivo no repositório para que possa ser verificado mesmo sem a execução do projeto. Este arquivo pode ser excluído pois, caso o programa seja executado com um arquivo de entrada no formado correto, o arquivo de saída será criado novamente.

Optei pelo json pois o enunciado diz que posso definir os formatos e json não deixa de ser um arquivo de texto