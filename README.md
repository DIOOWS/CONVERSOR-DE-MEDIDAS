# Conversor de Medidas

Este é um projeto simples de **conversão de medidas** desenvolvido em Java. Ele permite ao usuário converter diferentes unidades de medida de forma interativa, exibindo os resultados de forma clara e organizada.

## Funcionalidades

O programa apresenta um menu com as seguintes opções de conversão:

1. **Quilograma para Libra**  
2. **Libra para Quilograma**  
3. **Metro para Quilômetro**  
4. **Quilômetro para Metro**  
5. **Celsius para Fahrenheit**  
6. **Fahrenheit para Celsius**  
7. **Km/h para Metros/Segundo**  
8. **Metros/Segundo para Km/h**  
9. **Metros Quadrados para Hectares**  
10. **Hectares para Metros Quadrados**  
0. **Sair** - Encerra o programa.

## Como Funciona

1. O programa exibe um menu para o usuário.  
2. O usuário seleciona uma opção digitando o número correspondente.  
3. Para opções de conversão, o programa solicita uma medida para ser convertida.  
4. O programa realiza a conversão e exibe o resultado na tela.  
5. O processo continua até o usuário escolher a opção **0** para sair.

## Tratamento de Erros

- O programa garante que a entrada de medidas seja válida.  
- Caso o usuário insira valores inválidos (ex.: letras ou vírgulas como separador decimal), ele será orientado a corrigir a entrada.  

## Estrutura do Projeto

- **Classe `Main`**  
  Gerencia o fluxo principal do programa e interage com o usuário.
  
- **Classe `MenuMedidas`**  
  Exibe o menu e permite ao usuário selecionar uma opção.

- **Classe `Medidas`**  
  Contém os métodos responsáveis por realizar as conversões.

## Exemplo de Uso

```plaintext
Bem-vindo ao Conversor de Medidas!
Selecione uma opção:
1. Quilograma para Libra
2. Libra para Quilograma
3. Metro para Quilômetro
4. Quilômetro para Metro
...

DIGITE A MEDIDA PARA A CONVERSÃO: 10
QUILOGRAMA PARA LIBRA: 22.0462
