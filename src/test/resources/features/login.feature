#language:pt

  @test
  Funcionalidade: Teste login Bugbank
    Cenario: Login com sucesso
      Dado que esteja na pagina inicial: "http://localhost:3000/"
      E possua um cadastro
      Quando prencher email: "teste@teste.com.br" e senha: "123456"
      E clicar em fazer login
      Entao validar se a pagina de boas vindas foi carregada com sucesso
