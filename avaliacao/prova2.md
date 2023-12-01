Avaliação Final - Arquitetura de Objetos e Times Ágeis

---

1. Crie uma API REST que contenha as seguintes rotas:


- GET /hotel -> lista todos os filmes cadastrados. Esta rota deve ter dois query params, um que filtra os hoteis pelo número de estrelas, de 1 a 5, e outro que filtra pelo valor minímo da diária.

- GET /hotel/{idHotel} -> Recupera um hotel específico.

- POST /hotel -> Cria um hotel, podem definir os dados que serão salvos, mas no minímo deve ter o número de estrelas e o valor da diária.

- DELETE /hotel -> Deleta um hotel do banco de dados.

A API deve acessar um banco de dados H2 e deve ter a documetação usando o Swagger.

---

2. Implemente um Front-End usando REACT com três telas:

 - Um formulário para cadastrar um novo hotel
 - Uma lista que mostra todos os hoteis cadastrados e que permite a exclusão de um hotel da lista
 - Um formulário para edição de um hotel (pode ser usado o mesmo componente criado para o cadastro)
