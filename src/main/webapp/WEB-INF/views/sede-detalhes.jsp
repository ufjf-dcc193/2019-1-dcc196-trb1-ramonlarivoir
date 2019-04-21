<%@page pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
        integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

    <title>Detalhes da Sede</title>
</head>

<body>
    <header>
        <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <a class="navbar-brand" href="index.html">Sistema de Gestão</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavDropdown"
                aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNavDropdown">
                <ul class="navbar-nav">
                    <li class="nav-item active">
                        <a class="nav-link" href="index.html">Home <span class="sr-only">(current)</span></a>
                    </li>
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" role="button"
                            data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            Sedes
                        </a>
                        <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
                            <a class="dropdown-item" href="sede-novo.html">Criar</a>
                            <a class="dropdown-item" href="sede-listar.html">Listar</a>
                        </div>
                    </li>
                    </li>
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" role="button"
                            data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            Membros
                        </a>
                        <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
                            <a class="dropdown-item" href="membro-novo.html">Criar</a>
                            <a class="dropdown-item" href="membro-listar.html">Listar</a>
                        </div>
                    </li>
                    </li>
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" role="button"
                            data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            Atividades
                        </a>
                        <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
                            <a class="dropdown-item" href="atividade-novo.html">Criar</a>
                            <a class="dropdown-item" href="atividade-listar.html">Listar</a>
                        </div>
                    </li>
                </ul>
            </div>
        </nav>
    </header>
    <div class="container">
        <h1>Deatalhes de ${sede.nomeFantasia}</h1>
    </div>
    <div class="container">
        <input type="hidden" name="id" value="${sede.id}">
        <div class="form-group">
            <label for="nomeFantasia">Nome fantasia</label>
            <input type="text" readonly class="form-control" id="nomeFantasia" name="nomeFantasia"
                placeholder="Nome fantasia" value="${sede.nomeFantasia}">
        </div>
        <div class="form-row">
            <div class="form-group col-md-6">
                <label for="federacao">Estado da Federação</label>
                <input type="text" readonly class="form-control" id="federacao" name="federacao"
                    placeholder="Estado da Federação" value="${sede.federacao}">
            </div>
            <div class="form-group col-md-6">
                <label for="cidade">Cidade</label>
                <input type="text" readonly class="form-control" id="cidade" name="cidade" placeholder="Cidade"
                    value="${sede.cidade}">
            </div>
        </div>
        <div class="form-row">
            <div class="form-group col-md-6">
                <label for="bairro">Bairro</label>
                <input type="text" readonly class="form-control" id="bairro" name="bairro" placeholder="Bairro"
                    value="${sede.bairro}">
            </div>
            <div class="form-group col-md-6">
                <label for="telefone">Telefone</label>
                <input type="tel" readonly class="form-control" id="telefone" name="telefone" placeholder="Telefone"
                    value="${sede.telefone}">
            </div>
        </div>
        <div class="form-group">
            <label for="enderecoWeb">Endereço da WEB</label>
            <input type="text" readonly class="form-control" id="enderecoWeb" name="enderecoWeb"
                placeholder="Endereço da WEB" value="${sede.enderecoWeb}">
        </div>
    </div>
    <div class="container">
        <table class="table text-center">
            <thead class="thead-dark">
                <tr>
                    <th scope="col" colspan="4">Total de horas</th>
                </tr>
            </thead>
            <tbody>
                <tr class="table-active">
                    <td class="align-middle" scope="col">Horas assistenciais</td>
                    <td class="align-middle" scope="col">Horas executivas</td>
                    <td class="align-middle" scope="col">Horas financeiras</td>
                    <td class="align-middle" scope="col">Horas judiciais</td>
                </tr>
                <tr>
                    <td class="align-middle">${sede.totalHorasAssistencial}</td>
                    <td class="align-middle">${sede.totalHorasExecutiva}</td>
                    <td class="align-middle">${sede.totalHorasFinanceira}</td>
                    <td class="align-middle">${sede.totalHorasJuridica}</td>
                </tr>
            </tbody>
        </table>
    </div>
    <div class="container">
        <table class="table text-center">
            <thead class="thead-dark">
                <tr>
                    <th scope="col" colspan="9">Atividades</th>
                </tr>
            </thead>
            <tbody>
                <tr class="table-active">
                    <td class="align-middle" scope="col">Título</td>
                    <td class="align-middle" scope="col">Descrição</td>
                    <td class="align-middle" scope="col">Data início</td>
                    <td class="align-middle" scope="col">Data fim</td>
                    <td class="align-middle" scope="col">Horas assistenciais</td>
                    <td class="align-middle" scope="col">Horas executivas</td>
                    <td class="align-middle" scope="col">Horas financeiras</td>
                    <td class="align-middle" scope="col">Horas judiciais</td>
                </tr>
                <c:forEach var="atividade" items="${sede.atividades}">
                    <tr>
                        <td class="align-middle">${atividade.titulo}</td>
                        <td class="align-middle">${atividade.descricao}</td>
                        <td class="align-middle">${atividade.dataInicio}</td>
                        <td class="align-middle">${atividade.dataFim}</td>
                        <td class="align-middle">${atividade.horasAssistencial}</td>
                        <td class="align-middle">${atividade.horasExecutiva}</td>
                        <td class="align-middle">${atividade.horasFinanceira}</td>
                        <td class="align-middle">${atividade.horasJuridica}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>
    <div class="container">
        <table class="table text-center">
            <thead class="thead-dark">
                <tr>
                    <th scope="col" colspan="9">Membros</th>
                </tr>
            </thead>
            <tbody>
                <tr class="table-active">
                    <td class="align-middle" scope="col">Nome</td>
                    <td class="align-middle" scope="col">Email</td>
                    <td class="align-middle" scope="col">Função</td>
                    <td class="align-middle" scope="col">Data de entrada</td>
                    <td class="align-middle" scope="col">Data de saída</td>
                </tr>
                <c:forEach var="membro" items="${sede.membros}">
                    <tr>
                        <td class="align-middle">${membro.nome}</td>
                        <td class="align-middle">${membro.email}</td>
                        <td class="align-middle">${membro.funcao}</td>
                        <td class="align-middle">${membro.dataEntrada}</td>
                        <td class="align-middle">${membro.dataSaida}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>

    <!-- Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
        integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
        crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
        integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
        crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
        integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
        crossorigin="anonymous"></script>
</body>

</html>