#language:pt
Funcionalidade: Teste login com data table

  @test
  Cenario: Teste com Data table
    Dado que esteja na pagina inicial: "http://localhost:3000/"
    E preencho o cadastro com os dados:
      | Email              | Nome        | Senha  | Confirmacao Senha |
      | teste@teste.com.br | Flavio Dias | 123456 | 123456            |

