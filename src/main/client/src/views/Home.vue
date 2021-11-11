<template>
<!--  <div class="home">-->
<!--    <img alt="Vue logo" src="../assets/logo.png">-->
<!--    <HelloWorld msg="Welcome to Your Vue.js + TypeScript App"/>-->
<!--    <Auth/>-->
<!--  <div id="app">-->
<!--    <component :is="layout">-->
<!--      <router-view/>-->
<!--    </component>-->

<!--  </div>-->
  <NavigationBar/>
<!--  <Profiles/>-->
  <Profile/>
<!--  </div>-->
</template>

<script lang="ts">
import { Options, Vue } from 'vue-class-component';
import HelloWorld from '@/components/HelloWorld.vue'; // @ is an alias to /src
import Auth from '@/components/Auth.vue';
import Profiles from '@/components/Profiles.vue';
import Profile from '@/components/Profile.vue';
import NavigationBar from '@/components/NavigationBar.vue';
import EmptyLayout from '@/layouts/EmptyLayout.vue';

@Options({
  components: {
    //Auth,
    Profiles,
    NavigationBar,
    Profile,
  },
})
export default class Home extends Vue {}
</script>
