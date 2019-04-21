<%@page pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
        integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

    <title>Lista de Sedes</title>
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
        <h1>Lista de Sedes</h1>
    </div>
    <div class="container">
        <a href="sede-novo.html" class="btn btn-success">+</a>
    </div>
    <div class="container">
        <table class="table text-center">
            <thead class="thead-dark">
                <tr>
                    <th scope="col">#</th>
                    <th scope="col">Nome</th>
                    <th scope="col">Horas assistenciais</th>
                    <th scope="col">Horas executivas</th>
                    <th scope="col">Horas financeiras</th>
                    <th scope="col">Horas judiciais</th>
                    <th scope="col" colspan="2">Ação</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="sede" items="${sedes}">
                    <tr>
                        <th scope="row">${sede.id}</th>
                        <td>
                            <form action="sede-detalhes.html" method="GET">
                                <input type="hidden" name="id" value="${sede.id}">
                                <button type="submit" class="btn btn-link">${sede.nomeFantasia}</button>
                            </form>
                        </td>
                        <td>${sede.totalHorasAssistencial}</td>
                        <td>${sede.totalHorasExecutiva}</td>
                        <td>${sede.totalHorasFinanceira}</td>
                        <td>${sede.totalHorasJuridica}</td>
                        <td>
                            <form method="POST" action="sede-editar.html">
                                <input type="hidden" name="id" value="${sede.id}">
                                <button type="submit" class="btn btn-link">Editar</button>
                            </form>
                        </td>
                        <td>
                            <form method="POST" action="sede-excluir.html">
                                <input type="hidden" name="id" value="${sede.id}">
                                <button type="submit" class="btn btn-link">Excluir</button>
                            </form>
                        </td>
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