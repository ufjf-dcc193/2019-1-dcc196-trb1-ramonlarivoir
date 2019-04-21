<%@page pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
        integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

    <title>Nova Atividade</title>
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
        <h1>Nova Atividade</h1>
    </div>
    <div class="container">
        <form action="atividade-salvar.html" method="POST">
            <div class="form-group">
                <label for="titulo">Título</label>
                <input required type="text" class="form-control" id="titulo" name="titulo" value="${atividade.titulo}"
                    placeholder="Título">
            </div>
            <div class="form-group">
                <label for="descricao">Descrição</label>
                <textarea required rows="5" class="form-control" id="descricao" name="descricao"
                    placeholder="Descrição"></textarea>
            </div>
            <div class="form-row">
                <div class="form-group col-md-6">
                    <label for="ong">ONG</label>
                    <select id="ong" name="ongAtividade" class="form-control" required>
                        <c:forEach var="sede" items="${sedes}">
                            <option value="${sede.id}">${sede.nomeFantasia}</option>
                        </c:forEach>
                    </select>
                </div>
                <div class="form-group col-md-3">
                    <label for="dataInicio">Data de início</label>
                    <input required type="date" class="form-control" id="dataInicio" name="dataInicio"
                        placeholder="Data de início">
                </div>
                <div class="form-group col-md-3">
                    <label for="dataFim">Data de término</label>
                    <input required type="date" class="form-control" id="dataFim" name="dataFim" placeholder="Data de término">
                </div>
            </div>
            <div class="form-row">
                <div class="form-group col-md-3">
                    <label for="horasAssistencial">Carga horária assistencial</label>
                    <input required type="number" class="form-control" id="horasAssistencial" name="horasAssistencial"
                        placeholder="Carga horária">
                </div>
                <div class="form-group col-md-3">
                    <label for="horasExecutiva">Carga horária executiva</label>
                    <input required type="number" class="form-control" id="horasExecutiva" name="horasExecutiva"
                        placeholder="Carga horária">
                </div>
                <div class="form-group col-md-3">
                    <label for="horasFinanceira">Carga horária financeira</label>
                    <input required type="number" class="form-control" id="horasFinanceira" name="horasFinanceira"
                        placeholder="Carga horária">
                </div>
                <div class="form-group col-md-3">
                    <label for="horasJuridica">Carga horária jurídica</label>
                    <input required type="number" class="form-control" id="horasJuridica" name="horasJuridica"
                        placeholder="Carga horária">
                </div>
            </div>
            <button type="submit" class="btn btn-primary">Cadastrar</button>
            <a href="atividade-listar.html" class="btn btn-danger">Cancelar</a>
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