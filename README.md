# Trabalho
- **Instituição:** IFBA - Instituto Federal da Bahia
- **Curso:** Análise e Desenvolvimento de Sistemas (ADS)
- **Disciplina:** Padrões de Projetos
- **Projeto:** Da Arquitetura Mal Projetada à Reestruturação com IoC/Service Locator
- **Professor:** Felipe de Souza Silva
- **Semestre:** 5
- **Ano:** 2025.1

# Pet Shop

> Inicialmente tem que ser sem padrões de projeto, apresentando:
> - Forte acoplamento,
> - Falta de interfaces,
> - Responsabilidades misturadas,
> - Código repetitivo ou confuso.
>
> O importante é que a primeira versão seja propositalmente mal projetada.
>
> Depois, deverão diagnosticar e refatorar esse código, aplicando os conceitos de SOLID, refatoração e padrões arquiteturais modernos. 


[A7 - Da Arquitetura Mal Projetada à Reestruturação com IoC Service Locator.pdf](https://github.com/user-attachments/files/21975960/A7.-.SAJ-ADS08.-.Da.Arquitetura.Mal.Projetada.a.Reestruturacao.com.IoC.Service.Locator.pdf)


## Integrantes do Projeto

<table>
  <tr>
    <td align="center">
      <img src="https://avatars.githubusercontent.com/u/111200453?v=4" width="100px;" alt="Foto do Integrante Amanda"/><br />
      <sub><b><a href="https://github.com/Amandalopes28">Amanda Lopes</a></b></sub>
    </td>
    <td align="center">
      <img src="https://avatars.githubusercontent.com/u/80362674?v=4" width="100px;" alt="Foto do Integrante Janderson"/><br />
      <sub><b><a href="https://github.com/JandersonMota">Janderson Mota</a></b></sub>
    </td>
    <td align="center">
      <img src="https://avatars.githubusercontent.com/u/110790276?v=4" width="100px;" alt="Foto da Integrante Sarah"/><br />
      <sub><b><a href="https://github.com/SarahPithon/">Sarah Pithon</a></b></sub>
    </td>
  </tr>
</table>

## Tecnologias
- **Linguagem:** Java 21

## Estrutura do Projeto

### Mal Estruturado
```
ifba-sistema-lista7/
├── versao_inicial/
|   ├── Pet.java
|   └── PetShop.java
|
└── README.md
```

### Bem Estruturado
```
ifba-sistema-lista7/
├── versao_refatorada/
|   ├── model/
|   |   └── Pet.java
|   |
|   ├── repository/
|   |   ├── PetRepository.java
|   |   └── PetInMemoryRepository.java
|   |
|   ├── service/
|   |   └── PetService.java
|   |
|   ├── ui/
|   |   └── ConsoleUI.java
|   |
|   └── PetShopApp.java
|
└── README.md
```

## Diagrama UML

Antes:
<img width="2500" height="2950" alt="teste 1" src="https://github.com/user-attachments/assets/dad4648b-81e4-483b-a4a0-f9decbf10844" />



Depois: 
<img width="3840" height="3495" alt="Untitled diagram _ Mermaid Chart-2025-08-29-123453" src="https://github.com/user-attachments/assets/3c8b243b-0650-4dde-b2e6-9b2483c29a67" />


## Documentação Técnica
[Relatório Atv 7 Padrões.pdf](https://github.com/user-attachments/files/22051472/Relatorio.Atv.7.Padroes.pdf)


