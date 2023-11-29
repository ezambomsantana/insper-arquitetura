1. Selecione as afirmações corretas sobre as anotações do framework Spring:

a) @Autowired serve para a injeção de dependências em classes gerenciadas pelo Spring.

b) As classes ou interfaces anotadas com @RestController, @Service e @Repository são gerenciadas pelo Spring, e não devem ser instanciadas diretamente no código.

c) Para configurar a conexão ao banco de dados, utilizamos a anotação @DbConfiguration.

d) Deve existir apenas um @RestController em uma aplicação Spring.

e) A anotação @RequestMapping é opcional.

f) A anotação @Query serve para criar consultas usando apenas SQL no banco de dados.

g) A anotação @ResponseStatus server para definir o código de resposta de uma rota REST, se essa anotação não for definada, o código de resposta padrão é 200.

h) A anotação @GetMapping define um método HTTP GET que deve receber um @RequestBody no corpo da requisição.

i) A anotação @PostMapping deve ser usada para rotas que criam dados no servidor.

j) As classes ou interfaces anotadas com @RestController, @Service e @Repository devem ser instanciadas diretamente no código.

----

2. Explique com as suas palavras o padrão de projeto Singleton, mostre um exemplo de como esse padrão pode ser implementado na linguagem Java (sem usar nenhum framework)

----

3. Considere uma aplicação que tenha as seguintes rotas:

GET /montadora (lista todas as montadoras cadastradas)

POST /montadora (cria uma nova montadora, a montadora deve ter o id, nome e país de origem)

PUT /montadora/{id} (edita uma montadora identificada pelo seu id)

DELETE /montadora/{id} (exclui uma montadora identificada pelo seu id, não podem ser excluídas montadoras que possuem carros cadastrados)


GET /carro (lista todos os carros cadastrados, deve existir um filtro opcional com o id de uma montadora)

POST /carro (cria um novo carro - o carro deve ter um id, nome, preço e a montadora)

PUT /carro/{id} (edita um carro identificada pelo seu id)

DELETE /carro/{id} (exclui um carro identificada pelo seu id)


Implemente um projeto Spring que contenha todas essas rotas. Itens que serão avaliados:
 - Modelagem do domínio,
 - Boas práticas de programação e divisão em camadas
 - Princípios SOLID
 - Arquitetura Limpa e Padrões de Projetos.
