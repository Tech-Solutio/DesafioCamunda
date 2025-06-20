# DesafioCamunda
## Desafio técnico para Candidatos Camunda

Primeiramente, obrigado pelo seu interesse em trabalhar conosco. 

Abaixo você encontrará todos as informações necessárias para iniciar o seu teste.

## Avisos antes de começar
Leia com atenção este documento todo e tente seguir ao máximo as instruções.  

Crie um repositório no seu GitHub sem citar nada relacionado a TechSolutio. 

Faça seus commits no seu repositório. 

Envie o link do seu repositório para o email do recrutador responsável. 

Você poderá consultar o Google, Stackoverflow, ChatGPT ou algum projeto particular na sua máquina; Dê uma olhada nos Materiais úteis. 

Dê uma olhada em como será a entrevista. 

Fique à vontade para perguntar qualquer dúvida aos recrutadores.

Fique tranquilo, respire, assim como você, também já passamos por essa etapa ;).

Boa sorte! :)

## Corpo do Email com o link do repositório do desafio
• Seu Nome  
• Nome do recrutador  
• Link do repositório  
• Link do Linkedin

## Sobre o ambiente da aplicação:
Obedeça os requisitos informados, siga-os criteriosamente.

Se optar por um framework tente evitar usar muito métodos mágicos ou atalhos já prontos. Sabemos que essas facilidades aumentam a produtividade no dia-a-dia mas aqui queremos ver o seu código e a sua forma de resolver problemas;

Valorizamos uma boa estrutura de containeres criada por você.

## No dia da entrevista técnica
Na data marcada pelo recrutador tenha sua aplicação rodando na sua máquina local para execução dos testes e para nos mostrar os pontos desenvolvidos e possíveis questionamentos. 

Faremos um code review junto contigo como se você já fosse do nosso time ❤️, você poderá explicar o que você pensou, como arquitetou e como pode evoluir o projeto. 

Não esqueça de enviar o seu projeto para o repositório informado no email ao recrutador.

## Objetivo do Desafio

**1) Desafio de BPMN + Camunda Cenário:**

Crie um processo BPMN para requisição e aprovação de reembolso de despesas. 

Requisitos: 
• O processo começa com um usuário preenchendo um formulário de reembolso.
• Depois, um gerente aprova ou rejeita. 
• Se aprovado, o sistema deve acionar uma API de pagamento. 
• Se rejeitado, o solicitante deve ser notificado. 
• O processo deve terminar com status "Pago" ou "Rejeitado". 

Critérios de Avaliação: 
• Correta modelagem dos eventos, gateways e tarefas. 
• Uso de Service Tasks com delegações JavaScript ou Java. 
• Boa separação entre tarefas humanas e automáticas.

**2) Back-end Java / Spring Boot Tarefa:**  

Implementar uma API REST que interaja com o processo Camunda. 

Requisitos: 
• Um endpoint POST /reembolsos para iniciar a instância do processo com dados (JSON). 
• Um endpoint GET /status/{id} para retornar o status atual do processo. 
• Implementação de um JavaDelegate ou External Task Worker que simule a chamada a um sistema externo de pagamentos. 

Critérios de Avaliação: 
• Clareza e organização do código. 
• Uso correto de variáveis de processo. 
• Tratamento de erros. 
• Boas práticas com Spring.

**3) Frontend Angular Tarefa:**

Criar uma interface simples (em Angular 15+ ou 20) para submeter e consultar o processo.

Requisitos: 
• Formulário para enviar nova solicitação de reembolso.  
• Lista ou painel para visualizar status dos reembolsos enviados.  
• Consumo da API REST fornecida no item 2.  

Critérios de Avaliação:  
• Boas práticas com componentes e serviços.  
• Uso de HttpClient corretamente.  
• UX básica aceitável (responsividade, mensagens de erro). 

**4) Bônus (Opcional)**

• Utilização de Docker ou Docker Compose para empacotar a solução.  
• Incluir testes unitários ou de integração.  
• Deploy funcional no Camunda 8 (se dominar). 

## 🎯 Entrega Esperada
• Projeto dividido em 3 pastas (bpmn/, backend/, frontend/).  
• README com instruções claras de setup e execução.  
• Tempo estimado: 6 a 8 horas, podendo ser entregue em até 3 dias úteis.  

## Avaliação
Apresente sua solução utilizando o framework que você desejar, justificando a escolha.   

Atente-se a cumprir a maioria dos requisitos, pois você pode cumprir-los parcialmente e durante a avaliação vamos bater um papo a respeito do que faltou.  

## O que será avaliado e valorizamos ❤️
• Habilidades básicas de criação de projetos backend.  
• Conhecimentos sobre REST Uso do Git.  
• Capacidade analítica.   
• Apresentação de código limpo e organizado Conhecimentos intermediários de construção de projetos manuteníveis.  
• Aplicação e conhecimentos de SOLID.  
• Identificação e aplicação de Design Patterns.  
• Noções de funcionamento e uso de Cache.  
• Conhecimentos sobre conceitos de containers (Docker, Podman etc).  
• Documentação e descrição de funcionalidades e manuseio do projeto.  
• Implementação e conhecimentos sobre testes de unidade e integração.  
• Identificar e propor melhorias.  
• Boas noções de bancos de dados relacionais.  
• Aptidões para criar e manter aplicações de alta qualidade.
• Aplicação de conhecimentos de observabilidade.  
• Utlização de CI para rodar testes e análises estáticas.  
• Conhecimentos sobre bancos de dados não-relacionais.
• Aplicação de arquiteturas (CQRS, Event-sourcing, Microsserviços, Monolito modular).  
• Uso e implementação de mensageria.  
• Noções de escalabilidade.  
• Boas habilidades na aplicação do conhecimento do negócio no software.  
• Boas práticas de software dentro do framework escolhido.  

## O que não será avaliado
• UX/UI.  
• Uso de Bibliotecas CSS.  

## O que será um Diferencial
• Uso de Docker.  
• Uma cobertura de testes consistente.  
• Uso de Design Patterns.  
• Documentação.  
• Proposta de melhoria na arquitetura.  
• Ser consistente e saber argumentar suas escolhas.  
• Apresentar soluções que domina.  
• Modelagem de Dados.  
• Manutenibilidade do Código.  
• Tratamento de erros.  
• Cuidado com itens de segurança.  
• Arquitetura (estruturar o pensamento antes de escrever).  
• Carinho em desacoplar componentes (outras camadas, service, repository).  


# Materiais Úteis
• https://www.techsolutio.com  
• https://www.devmedia.com.br/rest-tutorial/28912  
• https://martinfowler.com/articles/microservices.html  
• https://www.atlassian.com/continuous-delivery/software-testing/types-of-software-testing  
• https://refactoring.guru/  
• https://camunda.com/  
