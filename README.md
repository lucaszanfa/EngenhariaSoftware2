# Sistema de Aluguel de Salas - Camada de Domínio

## Estrutura
Este projeto contém a **camada de domínio** do Sistema de Aluguel de Salas, responsável pelas entidades, atributos e regras de negócio.

### Classes

- **Usuario**
  - Representa um usuário do sistema (comum ou administrador).
  - Atributos: nome, email, telefone, senha, tipo.
  - Métodos: adicionarReserva, cancelarReserva.
  
- **Sala**
  - Representa uma sala disponível para reserva.
  - Atributos: nome, capacidade, localização, recursos, reservas, bloqueios.
  - Métodos: adicionarReserva, adicionarBloqueio, estaDisponivel.

- **Reserva**
  - Representa a reserva de uma sala por um usuário.
  - Atributos: id, usuário, sala, dataHora, duraçãoHoras.
  - Métodos: validarDuracao.

- **Bloqueio**
  - Representa bloqueios feitos por administradores.
  - Atributos: dataHora, motivo.

- **TipoUsuario (enum)**
  - Define se o usuário é `COMUM` ou `ADMINISTRADOR`.

## Regras de Negócio Implementadas
- Usuário comum só pode gerenciar suas próprias reservas.
- Cada sala pode ter apenas uma reserva por horário específico.
- Reservas têm duração mínima de 1 hora e máxima de 8 horas.
- Horários bloqueados não podem ser reservados.
- Identificação única de reservas via UUID.
