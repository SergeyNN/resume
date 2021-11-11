<template>
  <nav class="navbar sticky-top navbar-expand-lg navbar-light bg-light">
<!--    <a class="navbar-brand" href="#">Панель навигации</a>-->
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Переключатель навигации">
      <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="navbarSupportedContent">
<!--      <ul class="navbar-nav mr-auto">-->
<!--        <li class="nav-item active">-->
<!--          <a class="nav-link" href="#">Главная <span class="sr-only">(текущая)</span></a>-->
<!--        </li>-->
<!--        <li class="nav-item">-->
<!--          <a class="nav-link" href="#">Ссылка</a>-->
<!--        </li>-->
<!--        <li class="nav-item dropdown">-->
<!--          <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">-->
<!--            Выпадающий список-->
<!--          </a>-->
<!--          <div class="dropdown-menu" aria-labelledby="navbarDropdown">-->
<!--            <a class="dropdown-item" href="#">Действие</a>-->
<!--            <a class="dropdown-item" href="#">Другое действие</a>-->
<!--            <div class="dropdown-divider"></div>-->
<!--            <a class="dropdown-item" href="#">Что-то еще здесь</a>-->
<!--          </div>-->
<!--        </li>-->
<!--        <li class="nav-item">-->
<!--          <a class="nav-link disabled" href="#" tabindex="-1" aria-disabled="true">Отключенный</a>-->
<!--        </li>-->
<!--      </ul>-->
      <a class="navbar-brand"></a>
      <form class="form-inline my-2 my-lg-0">

        <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
        <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
<!--        <ul class="navbar-nav mr-auto">-->
<!--          <li class="nav-item active">-->
<!--            <a class="nav-link" href="#">Войти <span class="sr-only">(текущая)</span></a>-->
<!--          </li>-->
<!--          <li class="nav-item active">-->
<!--            <a class="nav-link" href="#">Зарегистрироваться <span class="sr-only">(текущая)</span></a>-->
<!--          </li>-->
<!--        </ul>-->
      </form>
      <ul class="navbar-nav mr-auto">
        <li class="nav-item active">
          <a class="nav-link" href="#">Войти <span class="sr-only">(текущая)</span></a>
        </li>
        <li class="nav-item active">
          <a class="nav-link" href="#">Зарегистрироваться <span class="sr-only">(текущая)</span></a>
        </li>
      </ul>
    </div>
  </nav>
</template>

<script>
export default {
  name: "NavigationBar"
}
</script>

<style scoped>

</style>
