<template>
<!--  <div id="nav">-->
<!--&lt;!&ndash;    <router-link to="/">Home</router-link> |&ndash;&gt;-->
<!--&lt;!&ndash;    <router-link to="/about">About</router-link>&ndash;&gt;-->
<!--  </div>-->

  <div id="app">
<!--  <component :is="layout">-->
    <router-view/>
<!--  </component>-->

  </div>
<!--  <router-view/>-->
</template>

<script lang="ts">
import { Options, Vue } from 'vue-class-component';
import HelloWorld from '@/components/HelloWorld.vue'; // @ is an alias to /src
import Auth from '@/components/Auth.vue';
import Profiles from '@/components/Profiles.vue';
import NavigationBar from '@/components/NavigationBar.vue';
import EmptyLayout from '@/layouts/EmptyLayout.vue';
import Profile from '@/components/Profile.vue';

@Options({
  components: {
    //Auth,
    Profiles,
    NavigationBar,
    EmptyLayout,
    Profile,
  },
})
export default class App extends Vue {
  layout() {
    console.log(this.$route.meta.layout);
    return (this.$route.meta.layout || 'empty') + '-layout';
  }
}
</script>

<style lang="scss">
@import 'assets/index.css';
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}

#nav {
  padding: 30px;

  a {
    font-weight: bold;
    color: #2c3e50;

    &.router-link-exact-active {
      color: #42b983;
    }
  }
}
</style>
