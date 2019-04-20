<%@page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
        integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

    <title>Sistema de Gestão</title>
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
                            <a class="dropdown-item" href="sede-editar.html">Editar</a>
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
                            <a class="dropdown-item" href="membro-editar.html">Editar</a>
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
                            <a class="dropdown-item" href="atividade-editar.html">Editar</a>
                        </div>
                    </li>
                </ul>
            </div>
        </nav>
    </header>
    <div class="container">
        <div class="row align-items-center">
            <div class="col">
                <ul class="list-group text-center">
                    <li class="list-group-item list-group-item-primary">Sedes</li>
                    <li class="list-group-item"><a href="sede-novo.html"
                            class="list-group-item list-group-item-action">Criar</a></li>
                    <li class="list-group-item"><a href="sede-listar.html"
                            class="list-group-item list-group-item-action">Listar</a></li>
                    <li class="list-group-item"><a href="sede-editar.html"
                            class="list-group-item list-group-item-action">Editar</a></li>
                </ul>
            </div>
            <div class="col">
                <ul class="list-group text-center">
                    <li class="list-group-item list-group-item-primary">Membros</li>
                    <li class="list-group-item"><a href="membro-novo.html"
                            class="list-group-item list-group-item-action">Criar</a></li>
                    <li class="list-group-item"><a href="membro-listar.html"
                            class="list-group-item list-group-item-action">Listar</a></li>
                    <li class="list-group-item"><a href="membro-editar.html"
                            class="list-group-item list-group-item-action">Editar</a></li>
                </ul>
            </div>
            <div class="col">
                <ul class="list-group text-center">
                    <li class="list-group-item list-group-item-primary">Atividades</li>
                    <li class="list-group-item"><a href="atividade-novo.html"
                            class="list-group-item list-group-item-action">Criar</a></li>
                    <li class="list-group-item"><a href="atividade-listar.html"
                            class="list-group-item list-group-item-action">Listar</a></li>
                    <li class="list-group-item"><a href="atividade-editar.html"
                            class="list-group-item list-group-item-action">Editar</a></li>
                </ul>
            </div>
        </div>
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