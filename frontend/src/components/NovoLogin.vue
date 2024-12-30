<template>
    <div class="tela-novo-login">
        <div v-if="exibirUsuarioNovoForm" class="usuario-novo">
            <form @submit.prevent="validadorUsuarioNovo">    
                <input 
                class="campo-nome-usuario"
                type="email"
                v-model="perfilNovo.email"
                placeholder="email de usuário"/>

                <input
                class="campo-senha-usuario"
                type="password"
                v-model="perfilNovo.senha"
                placeholder="senha do usário"
                />
                <div>
                    <button class="botao-criar-perfil" type="submit">Criar</button>
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
            perfilNovo: {nomePerfil: '', email: '', senha: ''},
            exibirUsuarioNovoForm: false
        }
    },
    methods: {
        formPerfilNovo() {
            this.exibirUsuarioNovoForm = !this.exibirUsuarioNovoForm
        }
    },

    salvarPerfil() {
        const requestOptions = {
            method: "POST",
            headers: {'Content-Type': 'application/json'},
            body: JSON.stringify(this.perfilNovo)
        }
        fetch('http://localhost:8080/perfil/cadastrar', requestOptions).then((response) => 
            response.json()
        )
    },

    validadorUsuarioNovo() {
        if(this.perfilNovo.email && this.perfilNovo.senha) {
            this.salvarPerfil()
        }
    },

    cancelarCadastro() {
        this.nomePerfil = {nomePerfil: '', email: '', senha: ''},
        this.exibirUsuarioNovoForm = false
    }
}

</script>

<style>

</style>