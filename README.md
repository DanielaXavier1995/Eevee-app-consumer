![HACKATON](https://github.com/DanielaXavier1995/Grupo-Eeve_Asapcard-Hackathon/assets/147341840/48c8f780-bb70-4aaf-b085-0a7b844d0d5f)

## Visão do Projeto
Bem-vindo ao repositório do projeto Eevee-app desenvolvido durante o hackathon da Asapcard! 
Este projeto é composto por três aplicações distintas(microserviços), que trabalham juntas para melhorar a eficiência do processo de leitura de documentos, envio de mensagens e integração com o RabbitMQ para comunicação assíncrona.

Essas são as 3 aplicações desenvolvidas com suas respectivas funcionalidades:
**<br/>Eevee - App** -> Essa aplicação é o serviço responsável por persistir os dados no banco de dados.
**<br/>Eevee - Reader** -> Responsável por receber os dados e transformá-los em os dados passíveis de leitura pela Eevee - App.
**<br/>Eevee - Queue** -> Serviço de mensageria responsável pela comunicação entre essas aplicações e gerenciamento de filas.

<div align="middle">
  
 ![687474703a2f2f696d672e736869656c64732e696f2f7374617469632f76313f6c6162656c3d535441545553266d6573736167653d454d253230444553454e564f4c56494d454e544f26636f6c6f723d475245454e267374796c653d666f722d7468652d6261646765](https://github.com/DanielaXavier1995/Grupo-Eeve_Asapcard-Hackathon/assets/147341840/3903ee25-3aab-4dce-8700-56f1b11b2259)
 
</div>

## Tecnologias utilizadas 🛠️
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
![RabbitMQ](https://img.shields.io/badge/Rabbitmq-FF6600?style=for-the-badge&logo=rabbitmq&logoColor=white)
![Erlang](https://img.shields.io/badge/Erlang-white.svg?style=for-the-badge&logo=erlang&logoColor=a90533)
![MySQL](https://img.shields.io/badge/mysql-%2300f.svg?style=for-the-badge&logo=mysql&logoColor=white)

## Diagrama MER: 📂
![WhatsApp Image 2024-02-04 at 11 39 30](https://github.com/DanielaXavier1995/Grupo-Eeve_Asapcard-Hackathon/assets/147341840/58d2b011-892e-4da3-aba0-ebd8085c1011)

## Preparar Ambiente: 📚
Utilizamos a IDE STS, o framework Spring Boot para construir o código e o banco de dados MySQL. Para isso, é necessário:

📌 Instalar uma IDE de sua preferência

📌 Instalar o Spring Boot: https://docs.spring.io/spring-boot/docs/current/reference/html/getting-started.html#getting-started.introducing-spring-boot

📌 Instalar o MySQL: https://dev.mysql.com/downloads/

📌 Instalar o RabbitMQ: https://rabbitmq.com/download.html

## Executar o código localmente: 🛠️
OBS: Importante destacar que o RabbitMQ está configurado na aplicação para rodar localmente na máquina.

1. Executar o seguinte código: git clone https://github.com/DanielaXavier1995/Eevee-app-consumer.git
2. Abrir o código na IDE e executar localmente

## Contribuição 💭
Este projeto é de código aberto, e você é incentivado a contribuir. Sinta-se à vontade para abrir issues, enviar pull requests e melhorar a funcionalidade geral do sistema.

## Autores 👨‍💻 👩‍💻
- [Daniela Xavier](https://www.linkedin.com/in/dani-xavier/)
- [Gabriella Vieira](https://www.linkedin.com/in/gabriellavieirabruno/)
- [Johnnata Silva](https://www.linkedin.com/in/johnnata-silva/)
- [Leila Naomi](https://www.linkedin.com/in/leila-naomi-souza-sugiyama/)
- [Sara Albuquerque](https://www.linkedin.com/in/saraalbuquerque/)
