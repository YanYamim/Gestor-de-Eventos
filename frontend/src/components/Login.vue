<template>
    <div class="tela-login">
        <div v-if="exibirUsuarioExistenteForm" class="usuario-existente">
            <form @submit.prevent="validadorUsuarioExistente">    
                <input 
                class="campo-nome-usuario"
                type="email"
                v-model="perfilExist.email"
                placeholder="email de usuário"/>

                <input
                class="campo-senha-usuario"
                type="password"
                v-model="perfilExist.senha"
                placeholder="senha do usário"
                />
                <div>
                    <button class="botao-entrar" type="submit">Entrar</button>
                    <button class="botao-criar-conta" type="submit">Criar Conta</button>
                </div>
            </form>

        </div>

    </div>
</template>

<script>
export default {
    data() {
        return {
            perfis: [],
            perfilExist: {nomePerfil: '', email: '', senha: ''},
            exibirUsuarioExistenteForm: false
        }
    },
    methods: {
        formPerfilExistente() {
            this.exibirUsuarioExistenteForm = !this.exibirUsuarioExistenteForm
        }
    }
}

</script>

<style>

</style>