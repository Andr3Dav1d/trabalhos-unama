# Importando as bibliotecas necessárias para o projeto
import os
import platform

# Função para mostrar o título do menu
def titulo():
    print("""
█░█ █▄░█ ▄▀█ █▀▄▀█ ▄▀█   ▄▄   ▄▀█ █▀▄ █▀
█▄█ █░▀█ █▀█ █░▀░█ █▀█   ░░   █▀█ █▄▀ ▄█          
[Aluno: André David T.R. Mendes - 04182774]
""")
    
# Função para limpar o terminal.
# É necessário que o programa saiba qual sistema está executando ele para decidir qual comando usar. 
def limpar():
    sys = platform.system()
    if sys == "Windows":
        os.system('cls')
    else:
        os.system('clear')


# Função para aparecer o título das sub-funções presentes no menu.
def subtitulo(txt):
    limpar()
    linhas = '-'*len(txt)
    print(linhas)
    print(txt)
    print(linhas, '\n')
    
# Essa função pede para o usuário retornar ao menu após terminar de usar a sub-função.
def voltar_ao_menu():
    input('\nPressione ENTER para voltar ao menu.')
    limpar()
    main()

# Essa função seria o equivalente ao "int(input())", porém em uma versão mais otimizada, além de amenizar erros de TypeError.
def input_int(msg):
    try:
        return int(input(msg))
    except ValueError:
        print('Entrada inválida. Digite um número inteiro.')
        return input_int(msg)

# Mesma proposta da função anterior, porém com o "float(input())"
def input_float(msg):
    try:
        return float(input(msg))
    except ValueError:
        print('Entrada inválida. Digite um número inteiro ou decimal.')
        return input_float(msg)

# Sub-função que tem como entrada o nome do usuário e, como saída, uma mensagem de boas-vindas.
def pedir_nome_do_usuario():
    subtitulo('Pedir nome do usuário')
    nome = input('Insira seu nome: ')
    print(f'Olá, {nome}! Seja bem-vindo!')
    voltar_ao_menu()

# Sub-função que solicita dois números ao usuário e exibe a soma deles.
def somar_dois_numeros():
    subtitulo('Somar dois números')
    num1 = input_int('Número 1: ')
    num2 = input_int('Número 2: ')
    result = num1 + num2
    print(f'A soma dos números é: {result}')
    voltar_ao_menu()

# Sub-função que pede dois números ao usuário e calcula a média deles.
def calcular_media():
    subtitulo('Calcular média entre dois números')
    num1 = input_int('Número 1: ')
    num2 = input_int('Número 2: ')
    soma = num1 + num2
    media = soma / 2
    print(f'O resultado da média é: {media}')
    voltar_ao_menu()

# Sub-função que lê um número e exibe seu dobro e triplo.
def dobro_e_triplo():
    subtitulo('Exibir dobro e triplo de um número')
    num = input_int('Insira um número: ')
    dobro = num * 2; triplo = num * 3
    print(f'Seu dobro é {dobro} e seu triplo é {triplo}.')
    voltar_ao_menu()

# Sub-função que pede a idade do usuário e exibe quantos dias ele já viveu
def idade_usuario():
    subtitulo('Idade do usuário em dias')
    idade = input_int('Insira sua idade: ')
    idade_em_dias = idade * 365
    print(f'Sua idade em dias são {idade_em_dias} dias.')
    voltar_ao_menu()

# Sub-função que pede a base e altura de uma figura e calcula sua área, baseado no cálculo "base x altura"
def calcular_area():
    subtitulo('Calcular Área')
    base = input_int('Base: ')
    altura = input_int('Altura: ')
    result = base * altura
    print(f'A área da figura é: {result}')
    voltar_ao_menu()

# Sub-função que calcula o troco, baseado no preço do produto e do valor pago pelo cliente.
def calcular_troco():
    subtitulo('Calcular Troco')
    preco_produto = input_float('Insira o preço do produto: ')
    valor_pago = input_float('Insira quanto você pagou: ')
    troco = valor_pago - preco_produto
    print(f'Você receberá R${troco} de troco.')
    voltar_ao_menu()

# Sub-função que pede o salário mensal de um funcionário e exibe quanto ele ganha por dia.
def salario_em_dias():
    subtitulo('Salário Mensal em dias')
    salario = input_float('Insira o salário que você recebe no mês: ')
    salario_dias = salario / 30
    print(f'Você recebe R${salario_dias} por dia com seu salário.')
    voltar_ao_menu()

# Sub-função que pede uma temperatura em graus Celsius e converte para Farenheit.
def celsius_para_farenheit():
    subtitulo('Converter Graus Celsius para Farenheit')
    celsius = input_int('Insira a temperatura em Celsius (°C): ')
    farenheit = (celsius * 9 / 5) + 32
    print(f'A temperatura em Farenheit é de {farenheit}°F.')
    voltar_ao_menu()

# Sub-função que pede o valor do produto e um percentual de desconto e exibe o valor final do produto após o desconto.
def calcular_desconto():
    subtitulo('Calcular desconto de um produto')
    preco = input_float('Insira o preço do produto: ')
    porcentagem = input_int('Insira a porcentagem de desconto: ')
    desconto = preco * (porcentagem / 100)
    preco_com_desconto = preco - desconto
    print(f'O preço de R${preco} com {porcentagem}% de desconto passa a custar R${preco_com_desconto}.')
    voltar_ao_menu()

# Função principal que exibe o menu, usando como entrada do usuário um número correspondente à sua sub-função ou a letra 'S', caso o mesmo desejar sair do programa.
def main():
    limpar()
    titulo()
    print('- Lógica de Programação, Aula 3: Variáveis em Python')
    print('\n- Escolha uma opção:')
    print('1. Pedir nome do usuário\n2. Soma de dois números\n3. Calcular média entre dois números\n4. Exibir o dobro e o triplo de um número\n5. Idade do usuário em dias\n6. Calcular Área\n7. Calcular Troco\n8. Salário Mensal em dias\n9. Converter Graus Celsius para Farenheit\n10. Calcular desconto de um produto')
    print('- Escolha uma opção de 1 a 10 ou S para sair.')
    resposta = input('> ')
    if resposta == '1':
        pedir_nome_do_usuario()
    elif resposta == '2':
        somar_dois_numeros()
    elif resposta == '3':
        calcular_media()
    elif resposta == '4':
        dobro_e_triplo()
    elif resposta == '5':
        idade_usuario()
    elif resposta == '6':
        calcular_area()
    elif resposta == '7':
        calcular_troco()
    elif resposta == '8':
        salario_em_dias()
    elif resposta == '9':
        celsius_para_farenheit()
    elif resposta == '10':
        calcular_desconto()
    elif resposta.lower() == 's':
        limpar()
        print('Saindo...')
    else:
        print('Opção Inválida!')
        voltar_ao_menu()
    
# Verifica se o programa está sendo executado de forma independente.
if __name__ == "__main__":
    main()
