#language:pt
Funcionalidade: Teste login com data table

  @test
  Cenario: Teste com Data table
    Dado que esteja na pagina inicial: "http://localhost:3000/"
    E preencho o cadastro com os dados:
      | Email              | Nome        | Senha  | Confirmacao Senha |
      | teste@teste.com.br | Flavio Dias | 123456 | 123456            |
    Quando prencher email: "teste@teste.com.br" e senha: "123456"
    E clicar em fazer login
    Entao validar se a pagina de boas vindas foi carregada com sucesso
