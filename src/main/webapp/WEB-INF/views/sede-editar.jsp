<%@page pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
        integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

    <title>Editar Sede</title>
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
        <h1>Editar Sede</h1>
    </div>
    <div class="container">
        <form action="sede-salvar.html" method="POST">
            <input type="hidden" name="id" value="${sede.id}">
            <div class="form-group">
                <label for="nomeFantasia">Nome fantasia</label>
                <input type="text" class="form-control" id="nomeFantasia" name="nomeFantasia"
                    placeholder="Nome fantasia" value="${sede.nomeFantasia}">
            </div>
            <div class="form-row">
                <div class="form-group col-md-6">
                    <label for="federacao">Estado da Federação</label>
                    <input type="text" class="form-control" id="federacao" name="federacao"
                        placeholder="Estado da Federação" value="${sede.federacao}">
                </div>
                <div class="form-group col-md-6">
                    <label for="cidade">Cidade</label>
                    <input type="text" class="form-control" id="cidade" name="cidade" placeholder="Cidade"
                        value="${sede.cidade}">
                </div>
            </div>
            <div class="form-row">
                <div class="form-group col-md-6">
                    <label for="bairro">Bairro</label>
                    <input type="text" class="form-control" id="bairro" name="bairro" placeholder="Bairro"
                        value="${sede.bairro}">
                </div>
                <div class="form-group col-md-6">
                    <label for="telefone">Telefone</label>
                    <input type="tel" class="form-control" id="telefone" name="telefone" placeholder="Telefone"
                        value="${sede.telefone}">
                </div>
            </div>
            <div class="form-group">
                <label for="enderecoWeb">Endereço da WEB</label>
                <input type="text" class="form-control" id="enderecoWeb" name="enderecoWeb"
                    placeholder="Endereço da WEB" value="${sede.enderecoWeb}">
            </div>
            <button type="submit" class="btn btn-primary">Salvar</button>
            <a href="sede-listar.html" class="btn btn-danger">Cancelar</a>
        </form>
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