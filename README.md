# consumerorder
Projeto consumer de RabbitMQ usando MongoDB e GraphQL

#Executando aplicação
- Java 17
- Docker
- MongoDB

  
Aplicação é um consumer dos eventos enviados pela publisorder(https://github.com/Thilin/publisorder) então é aconselhado a publisorder e o rabbitMQ estarem up inicialmente
para que esta aplicação possa consumir as mensasgens recebidas, salvá-las no banco e mostrá-las via graphQL
