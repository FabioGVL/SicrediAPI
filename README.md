# Relatório de Testes

---

## Escopo do Projeto

Os testes abaixo visam garantir a funcionalidade correta e a integridade dos dados fornecidos pela API. Todos os testes foram realizados na linguagem JAVA, utilizando a ferramenta de automação INTELLIJ, os resultados dos testes serão documentados e relatados utilizando o Maven Surefire Report para gerar relatórios HTML automatizados. Os relatórios serão utilizados para análise e melhoria contínua do sistema.

---

## Testes e Validações

### Buscar o status da aplicação
Dado que efetuo um request do método GET para o domíno dummyjson.com/test  
Quando a API retornar o Status Code e o método  
Então deverá conter as informações: status: ok & method: GET

---

### Buscar usuário para autenticação
Dado que efetuo um request do método GET para o domíno dummyjson.com/users  
Quando a API retornar o request solicitado  
Então deverá conter o status code 200 e as informações corretas do usuário

#### Passos para reproduzir

---

### Criação de token para Autenticação
Dado que efetuo um request do método POST para o domíno dummyjson.com/auth/login contendo username e password do usuário  
Quando a API retornar o request solicitado  
Então deverá retornar o status code 201, conténdo informações corretas do usuário e um token de autenticação funcional deve ter sido gerado.

---

### Buscar produtos com autenticação

#### Cenário #1
Dado que efetuo um request do método GET para o domíno dummyjson.com/auth/products contendo o token de autenticação correto  
Quando a API retornar o request solicitado  
Então deverá retornar o status code 200, conténdo a lista de produtos e as informações corretas de cada um dos protudos listados.

#### Cenário #2
Dado que efetuo um request do método GET para o domíno dummyjson.com/auth/products sem informar um token de autenticação  
Quando a API retornar o request solicitado  
Então deverá retornar o status code 403 Forbidden, informando a mensagem "Authentication problem"

#### Cenário #3
Dado que efetuo um request do método GET para o domíno dummyjson.com/auth/products contendo um token de autenticação inválido ou expirado  
Quando a API retornar o request solicitado  
Então deverá retornar o status code 401 Unauthorized, conténdo a mensagem "Invalid/Expired Token!"

---

### Criação de produto
Dado que efetuo um request do método POST para o domíno dummyjson.com/products/add contendo as informações do produto que desejo adicionar  
Quando a API retornar o request solicitado  
Então deverá retornar o status code 201 e as informações corretas do produto inseridas no request

#### Passos para reproduzir

---

### Buscar todos os produtos
Dado que efetuo um request do método GET para o domíno dummyjson.com/products  
Quando a API retornar o request solicitado  
Então deverá retornar o status code 200 e a lista de produtos contendo as informações corretas de cada produto listado

---

### Buscar apenas um produto por id

#### Caso #1
Dado que efetuo um request do método GET para o domíno dummyjson.com/products/{ID}  
Quando a API retornar o request solicitado  
Então deverá retornar o status code 200 e apenas o produto de ID informado no request, contendo suas informações corretas na listagem

#### Caso #2
Dado que efetuo um request do método GET para o domíno dummyjson.com/products/{ID}  
E informo o ID 0 ou um ID inexistente  
Quando a API retornar o request solicitado  
Então deverá retornar o status code 404 Not found seguido da mensagem "Product with id '{id}' not found"

---

# Bugs/Erros & Reports

### Buscar o status da aplicação

Não foram encontrados bugs durante os testes:

O response esperado na documentação está em total acordo com o retornado na API.

#### Passos para reproduzir


1. Crie uma pasta no seu desktop, abra e execute o powershell dentro da mesma

2. Obtenha o código da automação através do comando "git clone https://github.com/FabioGVL/SicrediAPI.git" no PowerShell

3. Abra o IntelliJ, clique em nos 4 risquinhos no canto superior esquerdo e selecione "Open"

5. Selecione a pasta do projeto que você fez o download no Step 2

6. No IntelliJ, faça o caminho: SRC - TEST - JAVA - SERVICES.SicrediAPITest - GET

7. Clique com o botão direito no arquivo ApplicationStatusTest

8. Clique em "Run ApplicationStatusTest"

9. No rodapé da IDE será exibida a execução do teste

10. Aguarde a conclusão do teste

12. Após a conclusão, as informações do teste serão exibidas no rodapé da IDE

13. Execute o POSTMAN

14. Embaixo de "My Workspace", localize o + e clique no mesmo

15. Selecione a opção Blank Collection

16. Após criada a aba "New Collection" clique em Add a request

17. No arquivo criado, selecione o método GET

18. Na barra de URL ao lado de GET, cole a URL dummyjson.com/test e clique em SEND

19. No campo BODY será exibido o response para comparativo com as informações base (documentação) utilizadas na automação.

---

### Buscar usuário para autenticação


Foram encontrados alguns bugs durante os testes:

O reponse esperado na documentação está em desacordo com o retornado na API.


* Link da imagem esperada na documentação
  https://robohash.org/hicveldicta.png

* Link da imagem retornada na API  
  https://robohash.org/Terry.png?set=set4

* Tipo sanguineo esperado na documentação
  A−

* Tipo sanguine retornado na API    
  A-

#### Passos para reproduzir

1. Crie uma pasta no seu desktop, abra e execute o powershell dentro da mesma

2. Obtenha o código da automação através do comando "git clone https://github.com/FabioGVL/SicrediAPI.git" no PowerShell

3. Abra o IntelliJ, clique em nos 4 risquinhos no canto superior esquerto e selecione "Open"

5. Selecione a pasta do projeto que você fez o download no Step 2

6. No IntelliJ, faça o caminho: SRC - TEST - JAVA - SERVICES.SicrediAPITest - GET

7. Clique com o botão direito no arquivo UserSearchTest

8. Clique em "Run UserSearchTest"

9. No rodapé da IDE será exibida a execução do teste

10. Aguarde a conclusão do teste

12. Após a conclusão, as informações do teste serão exibidas no rodapé da IDE

13. Execute o POSTMAN

14. Embaixo de "My Workspace", localize o + e clique no mesmo

15. Selecione a opção Blank Collection

16. Após criada a aba "New Collection" clique em Add a request

17. No arquivo criado, selecione o método GET

18. Na barra de URL ao lado de GET, cole a URL dummyjson.com/users e clique em SEND

19. No campo BODY será exibido o response para comparativo com as informações base (documentação) utilizadas na automação

---

### Criação de token para Autenticação

Foram encontrados alguns bugs durante os testes:

O reponse esperado na documentação está em desacordo com o retornado na API.

* Status code esperado - 201
* Status code obtido - 200

O Link da imagem esperada na documentação está em desacordo com o retornado na API.

* Esperado (documentação): https://robohash.org/autquiaut.png
* Obtido (API): https://robohash.org/Jeanne.png?set=set4

O token do usuário esperado na documentação está em desacordo com o retornado na API.

* Esperado (documentação): eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MTUsInVzZXJuYW1lIjoia21pbmNoZWxsZSIsImVtYWlsIjoia21pbmNoZWxsZUBxcS5jb20iLCJmaXJzdE5hbWUiOiJKZWFubmUiLCJsYXN0TmFtZSI6IkhhbHZvcnNvbiIsImdlbmRlciI6ImZlbWFsZSIsImltYWdlIjoiaHR0cHM6Ly9yb2JvaGFzaC5vcmcvYXV0cXVpYXV0LnBuZyIsImlhdCI6MTY4MjY5MTgwMSwiZXhwIjoxNjgyNjk1NDAxfQ.npaLt2FFWCh6PAR9cUrufmmI6uLebd2Q6SFMHy8EZ1M

* Obtido (API): É gerado um novo token toda vez que o POST é realizado, tendo o antigo sendo inativado por expiração, portanto, toda vez que o teste for iniciado será gerado um novo token que não estará de acordo com o sugerido na documentação.

#### Passos para reproduzir

1. Crie uma pasta no seu desktop, abra e execute o powershell dentro da mesma

2. Obtenha o código da automação através do comando "git clone https://github.com/FabioGVL/SicrediAPI.git" no PowerShell

3. Abra o IntelliJ, clique em nos 4 risquinhos no canto superior esquerto e selecione "Open"

5. Selecione a pasta do projeto que você fez o download no Step 2

6. No IntelliJ, faça o caminho: SRC - TEST - JAVA - SERVICES.SicrediAPITest - POST

7. Clique com o botão direito no arquivo AuthTokenCreationTest

8. Clique em "Run AuthTokenCreationTest"

9. No rodapé da IDE será exibida a execução do teste

10. Aguarde a conclusão do teste

12. Após a conclusão, as informações do teste serão exibidas no rodapé da IDE

13. Execute o POSTMAN

14. Embaixo de "My Workspace", localize o + e clique no mesmo

15. Selecione a opção Blank Collection

16. Após criada a aba "New Collection" clique em Add a request

17. No arquivo criado, selecione o método POST

18. Na barra de URL ao lado de POST, cole a URL https://dummyjson.com/auth/login

19. Em Headers, no campo _Key_ insira a chave "Content-Type" e em _Value_ insira a chave "application/json"

20. Em Body, selecione o campo "raw" e no menu flutuante a direita selecione "JSON"

21. no campo abaixo insira o código   
    {
    "username": "kminchelle",
    "password": "0lelplR"
    }

22. Clique em SEND e no campo BODY será exibido o response para comparativo com as informações base (documentação) utilizadas na automação.

---

### Buscar produtos com autenticação

Foram encontrados alguns bugs durante os testes:

O response obtido ao utilizar o Token esperado na documentação está em desacordo com o retornado na API.

* Token esperado (documentação)- Status Code: 500 "Invalid signature"
* Token obtido (API) - Status Code: 200

#### Sugestão de correção:
* É possível rodar um POST antes do teste principal para obter um valor de token atualizado e a partir daí realizar o teste principal do GET.

#### Outros problemas encontrados:
As informaçoes retornadas pela API estão em desacordo com a documentação.
* O número total de itens esperados na documentação é de um total de 3
* O número total de itens retornados na API é de um total de 30
* O domínio dos links esperados na documentação está em desacordo com o domínio retornado na API, tendo apenas os links retornados na API redirecionando corretamente para a a imagem do produto.

#### Os seguintes testes foram aprovados:

* Ao fazer uma solicitaçao sem informar qualquer token, a API retorna o status code 403 Forbidden com a mensagem "message": "Authentication Problem", está de acordo com a documentação.

* Ao fazer uma solicitação informando um token invalido/expirado a API retorna o status code 401 com a mensagem "message": "Invalid/Expired Token!", está de acordo com a documentação.

#### Passos para reproduzir

1. Crie uma pasta no seu desktop, abra e execute o powershell dentro da mesma

2. Obtenha o código da automação através do comando "git clone https://github.com/FabioGVL/SicrediAPI.git" no PowerShell

3. Abra o IntelliJ, clique em nos 4 risquinhos no canto superior esquerto e selecione "Open"

5. Selecione a pasta do projeto que você fez o download no Step 2

6. No IntelliJ, faça o caminho: SRC - TEST - JAVA - SERVICES.SicrediAPITest - GET

7. Clique com o botão direito no arquivo AuthProductSearchTest

8. Clique em "Run AuthProductSearchTest"

9. No rodapé da IDE será exibida a execução do teste

10. Aguarde a conclusão do teste

12. Após a conclusão, as informações do teste serão exibidas no rodapé da IDE

13. Execute o POSTMAN

14. Embaixo de "My Workspace", localize o + e clique no mesmo

15. Selecione a opção Blank Collection

16. Após criada a aba "New Collection" clique em Add a request

17. No arquivo criado, selecione o método GET

18. Na barra de URL ao lado de GET, cole a URL dummyjson.com/auth/products

19. Para verificação do teste 1, em Headers adicione Authorization no campo _Key_ e no campo Value adicione o _Token_ gerado no POST do teste anterior e clique em SEND

20. No campo BODY será exibido o response para comparativo com as informações base (documentação) utilizadas na automação

21. Para verificação do teste 2, em Headers desmarque a caixinha do campo Authorization e clique em SEND

22. No campo BODY será exibido o response para comparativo com as informações base (documentação) utilizadas na automação

23. Para verificação do teste 3, reative a caixinha do campo Authorization e no campo _Value_ adicione _invalid_token_ e clique em SEND

24. No campo BODY será exibido o response para comparativo com as informações base (documentação) utilizadas na automação

---

### Criação de produto

Foram encontrados alguns bugs durante os testes:

O reponse esperado na documentação está em desacordo com o retornado na API:

* Status code esperado na documentação: 201
* Status code retornado na API: 200

Os demais tópicos, como a criação do POST e o retorno das demais informações do produto estão corretas e de acordo com a documentação.

#### Passos para reproduzir

1. Crie uma pasta no seu desktop, abra e execute o powershell dentro da mesma

2. Obtenha o código da automação através do comando "git clone https://github.com/FabioGVL/SicrediAPI.git" no PowerShell

3. Abra o IntelliJ, clique em nos 4 risquinhos no canto superior esquerto e selecione "Open"

5. Selecione a pasta do projeto que você fez o download no Step 2

6. No IntelliJ, faça o caminho: SRC - TEST - JAVA - SERVICES.SicrediAPITest - POST

7. Clique com o botão direito no arquivo ProductCreationTest

8. Clique em "Run ProductCreationTest"

9. No rodapé da IDE será exibida a execução do teste

10. Aguarde a conclusão do teste

12. Após a conclusão, as informações do teste serão exibidas no rodapé da IDE

13. Execute o POSTMAN

14. Embaixo de "My Workspace", localize o + e clique no mesmo

15. Selecione a opção Blank Collection

16. Após criada a aba "New Collection" clique em Add a request

17. No arquivo criado, selecione o método POST

18. Na barra de URL ao lado de POST, cole a URL https://dummyjson.com/products/add

19. Em Headers, no campo _Key_ insira a chave "Content-Type" e em _Value_ insira a chave "application/json"

20. Em Body, selecione o campo "raw" e no menu flutuante a direita selecione "JSON"

21. no campo abaixo insira o código   
    {
    "title": "Perfume Oil",
    "description": "Mega Discount, Impression of A...",
    "price": 13,
    "discountPercentage": 8.4,
    "rating": 4.26,
    "stock": 65,
    "brand": "Impression of Acqua Di Gio",
    "category": "fragrances",
    "thumbnail": "https://i.dummyjson.com/data/products/11/thumnail.jpg"
    }

22. Clique em SEND e no campo BODY será exibido o response para comparativo com as informações base (documentação) utilizadas na automação.

---

### Buscar todos os produtos

Foram encontrados alguns bugs durante os testes:


* Os links das imagens fornecidos na documentação estão em desacordo com o retornado na API. Apenas os links obtidos diretamente na API estão redirecionando corretamente para as respectivas imagens.

O retorno das demais informações estão corretas e de acordo com a documentação.

#### Passos para reproduzir

1. Crie uma pasta no seu desktop, abra e execute o powershell dentro da mesma

2. Obtenha o código da automação através do comando "git clone https://github.com/FabioGVL/SicrediAPI.git" no PowerShell

3. Abra o IntelliJ, clique em nos 4 risquinhos no canto superior esquerto e selecione "Open"

5. Selecione a pasta do projeto que você fez o download no Step 2

6. No IntelliJ, faça o caminho: SRC - TEST - JAVA - SERVICES.SicrediAPITest - GET

7. Clique com o botão direito no arquivo AllProductsSearch

8. Clique em "Run AllProductsSearch"

9. No rodapé da IDE será exibida a execução do teste

10. Aguarde a conclusão do teste

12. Após a conclusão, as informações do teste serão exibidas no rodapé da IDE

13. Execute o POSTMAN

14. Embaixo de "My Workspace", localize o + e clique no mesmo

15. Selecione a opção Blank Collection

16. Após criada a aba "New Collection" clique em Add a request

17. No arquivo criado, selecione o método GET

18. Na barra de URL ao lado de GET, cole a URL dummyjson.com/products e clique em SEND

19. No campo BODY será exibido o response para comparativo com as informações base (documentação) utilizadas na automação.

---

### Buscar apenas um produto por id

Foram encontrados alguns bugs durante os testes:

* Os links das imagens fornecidos na documentação estão em desacordo com o retornado na API. Apenas os links obtidos diretamente na API estão redirecionando corretamente para as respectivas imagens.

#### Passos para reproduzir

1. Crie uma pasta no seu desktop, abra e execute o powershell dentro da mesma

2. Obtenha o código da automação através do comando "git clone https://github.com/FabioGVL/SicrediAPI.git" no PowerShell

3. Abra o IntelliJ, clique em nos 4 risquinhos no canto superior esquerto e selecione "Open"

5. Selecione a pasta do projeto que você fez o download no Step 2

6. No IntelliJ, faça o caminho: SRC - TEST - JAVA - SERVICES.SicrediAPITest - GET

7. Clique com o botão direito no arquivo SingleProductSearchTest

8. Clique em "Run SingleProductSearchTest"

9. No rodapé da IDE será exibida a execução do teste

10. Aguarde a conclusão do teste

12. Após a conclusão, as informações do teste serão exibidas no rodapé da IDE

13. Execute o POSTMAN

14. Embaixo de "My Workspace", localize o + e clique no mesmo

15. Selecione a opção Blank Collection

16. Após criada a aba "New Collection" clique em Add a request

17. No arquivo criado, selecione o método GET

18. Para realizar o primeiro teste, na barra de URL ao lado de GET, cole a URL dummyjson.com/products/{ID} (insira ids de produtos existentes de 1 a 100) e clique em SEND

19. No campo BODY será exibido o response para comparativo com as informações base (documentação) utilizadas na automação.

20. Para realizar o segundo teste, Na barra de URL ao lado de GET, cole a URL dummyjson.com/products/{ID} (insira ids de produtos inexistentes ex: 0,101,999) e clique em SEND

21. No campo BODY será exibido o response para comparativo com as informações base (documentação) utilizadas na automação.

---

### Gerando relatório completo dos testes

* Abra o terminal da IDE (localizado no canto inferior esquerdo)
* Digite o comando **MVN Test**
* Todos os testes serão executados automáticamente
* O relatório HTML dos testes ficará salvo dentro de target/site/surefire-report

---

### Requisitos necessários para execução do projeto

* Java JDK 17+
* GIT
* Maven
* Maven Surefire Report 3.2.5
* Junit 5.10.1
* Rest Assured 5.3.0
* IDE (Sugestão IntelliJ)
