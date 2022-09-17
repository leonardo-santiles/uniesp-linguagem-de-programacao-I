#### Centro Universitário UNIESP
#### Disciplina: Linguagem de Programação I
#### Lista de Exercícios - Estruturas de Controle

1. Faça um programa que receba o valor dos créditos galácticos de um Star trooper e 
   o percentual de aumento, calcule e mostre os créditos galácticos com o novo
   aumento.
2. Faça um programa que leia 10 números inteiros e exiba na tela a mensagem ‘Par’
   se ele for um número par, ou ‘Ímpar’ se ele for um número ímpar.
3. Uma empresa decidiu dar 20% de aumento aos funcionários cujos salários são
   inferiores a 500 reais. Escreva um programa que leia o salário de vários
   funcionários e, mostre o valor do salário reajustado ou uma mensagem caso o
   funcionário não tenha direito ao aumento. O programa será encerrado quando se
   digitar “fim” para o nome do funcionário.
4. Um motorista parou no posto de gasolina, comprou dois refrigerantes e abasteceu o
   seu carro com gasolina. Leia a quantidade de litros de gasolina foram necessários
   para abastecer o veículo e informe o valor total da conta desse cliente, sabendo-se
   que cada refrigerante custou R$3,00 e o litro de gasolina custou R$2,50.
5. A prefeitura de João Pessoa abriu uma linha de crédito para os funcionários
   municipais. O valor máximo da prestação não poderá ultrapassar 30% do salário
   bruto. Fazer um algoritmo que permita entrar com o salário bruto e o valor da
   prestação e informar se o empréstimo pode ou não ser concedido.
6. Faça um programa que receba duas notas de seis alunos, calcule e mostre:
   - A média aritmética das duas notas de cada aluno;
   - A mensagem que está na tabela a seguir:
   
   Média aritmética | Mensagem
   -----------------|----------
   Abaixo de 3.0    | Reprovado
   De 3.0 a 7.0     | Exame
   Acima de 7.0     | Aprovado
   
   - O total de alunos aprovados; 
   - O total de alunos de exame;
   - Total de alunos reprovados;
   - A média da classe.
7. Uma pousada estipulou o preço da diária em R$ 40,00 e mais uma taxa de serviços
   diários de:
   - R$ 15,00, se o número de dias for menor que 10;
   - R$ 8,00, se o número de dias for maior ou igual a 10.
   
   Criar um programa em Java que informe o nome, o valor da conta de cada cliente e ao
   final o total arrecadado pela pousada.
8. Leia uma relação de pacientes de uma clínica, cada um com o nome, o
   sexo, o peso, a idade e a altura. Para sinalizar o fim da lista será fornecido
   “fim” no nome do último paciente.
   
   Exiba um relatório contendo:
   - a quantidade de pacientes;
   - a média de idade dos homens;
   - a quantidade de mulheres com altura entre 1,60 e 1,70 e peso acima
   de 70kg;
   - a quantidade de pessoas com idade entre 18 e 25;
   - o nome do paciente mais velho;
   - o nome da mulher mais baixa.

#### Lista de Exercícios - Métodos

1. Uma grande empresa te contratou para desenvolver um programa de empréstimos.
   Para atender a demanda dessa empresa você deve incialmente desenvolver uma
   classe Java chamada Empréstimo que tenham os seguintes atributos:
   - nomeUsuario,
   - idade,
   - valorEmprestimo,
   - percentualJurosMes,
   - mesesParaPagar.
   
   A classe empréstimo deverá ter os seguintes métodos:
   1. **Imprimir**: Este método não retorna valor e deverá exibir na tela todos os atributos da
      classe empréstimo. 
   2. **calcularEmprestimo**: O valor do empréstimo é calculado seguindo a seguintes regras:
      - caso a idade seja maior ou igual a 18 e menor do que 23, use a fórmula
      ```
       valorEmprestimo += (valorEmprestimo / mesesParaPagar) * percentualJurosMes
      ```
      - quando for superior a 23 e menor ou igual a 33, use a fórmula
      ```
      valorEmprestimo += (valorEmprestimo * 10)/100
      ```
