# Event Project API
Está API foi criada para um trabalho da faculdade da disciplina "PROGRAMAÇÃO DE SOLUÇÕES COMPUTACIONAIS". Este trabalho consiste em criar um API Rest utilizando o padrão de projeto MVC.

## Problema a ser resolvido

- A solução deve ser desenvolvida dentro do paradigma orientado a objetos:
- Deve implementar um sistema de cadastro e notificação de eventos que estejam ocorrendo na cidade em que o estudante reside;
- O sistema deve prover um espaço para cadastro do usuário. Você deve definir os atributos do usuário, que devem ser no mínimo 3 (quanto mais completo, melhor);
- Deve ser possível cadastrar eventos, definindo um horário (dentre outros atributos). Estes eventos devem ter, obrigatoriamente, os atributos: nome, endereço, categoria, horário e descrição;
- Você deve delimitar as categorias para criação de eventos (festas, eventos esportivos, shows, entre outros exemplos);
- Deve ser possível consultar os eventos cadastrados e decidir participar de qualquer um que esteja listado;
- Da mesma forma, deve ser possível visualizar os eventos em que a presença do usuário foi confirmada e que seja possível cancelar a participação;
- Através do horário, o programa deve ordenar os eventos mais próximos e informar se um evento está ocorrendo no momento (é desejável utilizar a estrutura DateTime para o controle de horários);
- O sistema também deve informar os eventos que já ocorreram;
- As informações dos eventos e usuarios devem ser salvas em um banco de dados.
## Solução 
A solução será construida com as seguintes tecnologias:

- Java 17
- Spring Boot 2.7.3
- Spring Security
- Spring Data
- Gradle
- Swagger
- Docker
- MySQL