<h1>TODO List</h1>

 ![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
 ![Spring](https://img.shields.io/badge/Spring-6DB33F.svg?style=for-the-badge&logo=Spring&logoColor=white)
 ![MySQL](https://img.shields.io/badge/MySQL-4479A1.svg?style=for-the-badge&logo=MySQL&logoColor=white)
 [![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)

<p>API para gerenciar tarefas (CRUD), ela inclui ID único, nome, descrição, se você já realizou a tarefa e o nível de prioridade. A listagem das tarefas é organizada por prioridade</p>

<h2>Sumário</h2>
<ul>
  <li><a href="#tecnologia">Tecnologias</li>
  <li><a href="#praticas">Práticas adotadas</li>
    <li><a href="#instalacao">Instalação</li>
      <li><a href="#endpoints">API Endpoints</li>
</ul>

<h2 id="tecnologia">Tecnologias</h2>
<p>Spring Boot | Spring MVC | Spring Data JPA | Mysql</p>

<h2 id="praticas">Práticas adotadas</h2>
<ul>
<li>SOLID, DRY, YAGNI, KISS
<li>API REST
<li>Consultas com Spring Data JPA
<li>Injeção de Dependências
<li>Tratamento de respostas de erro
</ul>

<h2 id="instalacao">Instalação</h2>
<ol>
  <li>Clone repository</li>
  
      https://github.com/sthevenalves/rest-todo-list.git

  <li>Construir o projeto:</li>

    ./mvnw clean package

  <li>Executar a aplicação:</li>

    java -jar target/todolist-0.0.1-SNAPSHOT.jar
</ol>

<h2 id="endpoints">API Endpoints</h2>
<p>Para fazer as requisições HTTP abaixo, foi utilizada a ferramenta <a href="https://www.postman.com/">Postman</a></p>

   GET / todos - Listar Tarefas
   
    [
      {
      "id": 1,
      "name": "tarefa 1",
      "description": "teste description Todo 1",
      "priority": 1,
      "done": false
      }
    ]

  http POST :8080/todos - Criar Tarefa

    [
      {
        "id": 2,
        "name": "tarefa 2",
        "description": "teste description Todo 2",
        "priority": 2,
        "done": false
      }
    ]

   http PUT :8080/todos - Atualizar Tarefa

     [
          {
            "id": 2,
            "name": "tarefa 2",
            "description": "teste description Todo 2",
            "priority": 4,
            "done": true
          }
    ]

  http DELETE :8080/todos/1 - Remover Tarefa

    [ ]


