<template>
  <div class="row justify-content-center">
    <div class="col-md-5 col-9">
      <div class="card">
        <div class="card-header" style="text-align: left">
          <!--          <span class="card-title">-->
          <i class="fa fa-sign-in"></i> Вход в Ваш личный кабинет
          <!--          </span>-->

        </div>
        <!--        <div class="row">-->
<!--        <div class="card-content" style="text-align: left"> Вы можете использовать Ваши UID или Email или Phone в-->
<!--          качестве логина-->
<!--        </div>-->
        <!--        </div>-->
        <article class="card-body">
          <div class="card-content" style="text-align: left"> Вы можете использовать Ваши UID или Email или Phone в
            качестве логина
          </div>
          <form>
            <div class="form-group">
              <div class="input-group">
                <div class="input-group-prepend">
                  <span class="input-group-text"> <i class="fa fa-user"></i> </span>
                </div>
                <input name="" class="form-control" placeholder="Email or login" type="email">
              </div> <!-- input-group.// -->
            </div> <!-- form-group// -->
            <div class="form-group">
              <div class="input-group">
                <div class="input-group-prepend">
                  <span class="input-group-text"> <i class="fa fa-lock"></i> </span>
                </div>
                <input class="form-control" placeholder="******" type="password">
              </div> <!-- input-group.// -->
            </div> <!-- form-group// -->
            <div class="form-group">
              <button type="submit" class="btn btn-primary btn-block"> Login</button>
            </div> <!-- form-group// -->
            <p class="text-center"><a href="#" class="btn">Forgot password?</a></p>
          </form>
        </article>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: "Auth"
}
</script>

<style lang="scss" scoped>
.card-header {
  background-color: #d9edf7;
}

//.text {
//  background: #ffffff;
//  border: 2px solid #8E8E8E;
//  font-family: 'TTWellingtons';
//  font-weight: 500;
//  height: 55px;
//  color: #8E8E8E;
//}
</style>