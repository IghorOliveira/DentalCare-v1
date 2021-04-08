# DentalCare-v1 (Ainda em construção)
Este projeto foi pensado como um treino para aperfeiçoar meus conhecimentos na arquitetura MVC, tanto na parte de codificação quanto na parte de planejamento, o software foi pensado primeiro pelo banco de dados, criando os campos e entidades, pois o Model parte do desenho do banco, assim agilizando o processo, depois foram definidas quais as funcionalidades seriam implementadas e como seria a navegação do sistema. Depois de criar as telas eu comecei a construir o resto das classes essenciais do MVC, os Controllers (junto de classes Helpers) e as classes DAO, assim completando a arquitetura. O fluxo do sistema funciona bem, as Views assim que instanciadas cedem controle aos Controllers que captam qualquer ação do usuário e respondem com um método apropriado, assim mantendo os componentes do sistema desacoplados, quando o usuário pede algo do banco o Controller usa o Helper para pegar as informações de um formulário e retornar um objeto da Model, depois cria uma variável Connection e instancia uma classe DAO, passando a Connection para o DAO logo no construtor, o DAO acessa o banco, faz as operações necessárias e retorna as informações para o Controller.


## Minha Visão
 A parte de planejamento é com certeza a parte mais importante do projeto, durante a codificação houve vários momentos onde eu percebi que não havia pensado em uma certa situação e tive que fazer mudanças, estas mudanças foram consequência da minha inexperiência criando diagramas e isso é com certeza algo a se melhorar, a base para um bom projeto é um bom planejamento. Outra coisa a se corrigir seria começar a utilizar interfaces nas classes, parar de criar métodos para uma implementação e tentar padronizar mais a estrutura do código, tanto nas classes Controllers quanto nas DAO senti que interfaces seriam bem uteis, algo a se melhorar numa atualização. A parte de interface do usuário também deixou a desejar, mesmo não sendo o foco fundamental do projeto. Mesmo não sendo um projeto perfeito ele serviu seu proposito e me fez pensar bastante, assim como também me deu uma boa experiencia de projeto.

