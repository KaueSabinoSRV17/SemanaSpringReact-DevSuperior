class Personagem {

    constructor(
        nome, 
        vida, 
        ataque, 
        armadura
        )
        {
            this.nome = nome
            this.vida = vida
            this.ataque = ataque
            this.armadura = armadura
        }
        

        set setNome (setNome) {
            this.nome = setNome
        }

        set setVida (setVida) {
            this.vida = setVida
        }

        set setAtaque (setAtaque) {
            this.ataque = setAtaque
        }

        set setArmadura (setArmadura) {
            this.armadura = setArmadura
        }
    
}

function firstChar() {
    
    let primeiroChar = prompt('nome do novo personagem')
    let vida = prompt('quantidade de vida')
    let ataque = prompt('quantidade de ataque')
    let armadura = prompt('quantidade de armadura')

    primeiroChar = new Personagem(primeiroChar, vida, ataque, armadura)

    
    console.log(primeiroChar.nome)

}

function secondChar() {
    
    let segundoChar = prompt('nome do novo personagem')
    let vida = prompt('quantidade de vida')
    let ataque = prompt('quantidade de ataque')
    let armadura = prompt('quantidade de armadura')

    segundoChar = new Personagem(segundoChar, vida, ataque, armadura)

    
    console.log(segundoChar.nome)

}

function turno() {

    alert(primeiroChar.nome)
}