# Challenge Odontoprev Sprint 1

## Projeto: Dental Insurance

Este projeto implementa um sistema de gestão de sinistros odontológicos para a empresa Odontoprev, utilizando dois backends distintos: um desenvolvido em Java e outro em C#. A aplicação é responsável por gerenciar cadastros de clientes, processamento de sinistros, validação de documentos, além de oferecer uma interface para seguradoras e administradores.

---

## 1. Definição do Escopo e Requisitos

### Sinistros:
- Implementar a definição, registro, processamento e resolução de sinistros odontológicos.

### Funcionalidades principais:
- Cadastro de clientes
- Registro e acompanhamento de sinistros
- Atualização do status do sinistro
- Histórico de sinistros
- Envio e validação de documentação
- Integração com seguradoras

### Divisão de funcionalidades entre os backends:
- **Backend Java**: Responsável pelo cadastro de clientes, gestão de contratos e consultas.
- **Backend C#**: Responsável pelo processamento e gestão de sinistros, emissão de relatórios e validação de documentos.

---

## 2. Arquitetura

- **Modelo adotado**: Arquitetura de microserviços, onde cada backend é um serviço isolado que se comunica via API RESTful.
- **APIs RESTful**: Endpoints expostos em ambos os backends para integração e comunicação com o frontend.

---

## 3. Comunicação entre os Backends

- **APIs HTTP/REST**: Estabelecer comunicação entre os backends Java e C# via chamadas HTTP.

---

## 4. Tecnologias Utilizadas

### Backend Java:
- Framework: Spring Boot
- ORM: Hibernate
- Banco de Dados: Oracle SQL Developer

### Backend C#:
- Framework: ASP.NET Core
- ORM: Entity Framework
- Banco de Dados: Oracle SQL Developer

### Frontend Android:
- Framework: Gradle
- Banco de Dados: Oracle SQL Developer

### Testes em Q&A:
- Framework: JUnit5

---

## 5. Integração com Bancos de Dados

- **Estratégia de banco de dados**: Banco de dados compartilhado para ambos os backends, com sincronização via API.
- **ORM**: Hibernate (Java) e Entity Framework (C#) para operações no banco de dados.

---

## 6. Autenticação e Autorização

- **OAuth2/JWT**: Implementar autenticação segura e autorização centralizada.
- **Controle de Acesso Baseado em Funções (RBAC)**: Permissões adequadas para dentistas, seguradoras e administradores.

---

## 7. Frontend

- **Desenvolvimento**: O frontend se comunica com ambos os backends via APIs REST.
- **Tecnologias sugeridas**: Gradle e Jetpack Compose para o desenvolvimento mobile.

---

## 8. Manutenção e Escalabilidade

- **Contêineres**: Docker para empacotamento e deploy dos backends.
- **Orquestração (opcional)**: Kubernetes para escalabilidade e disponibilidade dos serviços.

---

## 9. Testes

- **Testes Unitários e de Integração**:
  - Backend Java: JUnit
  - Backend C#: xUnit
- **Testes de API**: Postman para validar as interações entre as APIs.

---

## 10. Monitoramento e Logging

- **Monitoramento**: Prometheus para métricas e Grafana para dashboards.
- **Logging**: ELK Stack (Elasticsearch, Logstash, Kibana) ou Splunk para centralizar logs.

---

## Produtos Semelhantes no Mercado

1. **OdontoPrev**: Gestão de planos odontológicos, sinistros, integração com clínicas.
2. **TOTVS**: Módulos de gestão de sinistros e contratos.
3. **TISS**: Padrão de troca de informações na saúde suplementar.
4. **Guidewire Software**: Gestão de sinistros, emissão de relatórios, integração com seguradoras.
5. **SAP for Insurance**: Módulos de sinistros e integração com prestadores.
6. **Softplan – SAJ Saúde**: Gestão de sinistros e contratos para o setor público e de saúde.
7. **Startups**: Soluções personalizadas para seguradoras (e.g., Dr. Consulta, Conexa Saúde).

---

## Exemplo de Fluxo de um Sinistro:

1. O cliente registra um sinistro no frontend.
2. O backend Java salva os dados e encaminha ao backend C# via API.
3. O backend C# processa o sinistro, valida documentos e retorna o status ao backend Java.
4. O backend Java atualiza o status e notifica o cliente.

---

## Avaliação do Potencial de Mercado

- **Tamanho do Mercado Total (TAM)**: R$13,5 bilhões (mercado de sinistros odontológicos no Brasil).
- **Mercado Disponível (SAM)**: R$2,7 bilhões (seguradoras e administradores de médio e grande porte).
- **Fatia de Mercado Conquistável (SOM)**: R$135 milhões (5% de penetração).

---

## Conclusão

O projeto **Dental Insurance** oferece uma solução moderna e robusta para a gestão de sinistros odontológicos, alinhada às necessidades da Odontoprev e outras seguradoras. A divisão de responsabilidades entre os backends em Java e C# permite eficiência, segurança e escalabilidade, melhorando o desempenho e facilitando a manutenção. 

---

## Links

- Figma - Wireframes da solução mobile:  
[https://www.figma.com/proto/uNhAX2GxrdUcTTEWqlcRrb/Challenge-Odontoprev?node-id=0-1&t=0ataD37zdxRmms7i-1](https://www.figma.com/proto/uNhAX2GxrdUcTTEWqlcRrb/Challenge-Odontoprev?node-id=0-1&t=0ataD37zdxRmms7i-1)

- Vídeo - Solução

  [https://www.youtube.com/watch?v=OHVeFk5sXEg]

  ## Teste de Funcionamento do APP

  ![Teste](app/sampledata/testeTela.gif)
