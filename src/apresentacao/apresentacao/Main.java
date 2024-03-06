package apresentacao;

import personagens.Cavaleiro;
import personagens.Personagens;
import personagens.Rainha;
import personagens.Rei;
import armas.ArcoFlecha;
import armas.Espada;
import armas.Faca;
import armas.ComportamentoArma;


public class Main {
    public static void main(String[] args) {

        Personagem cavaleiro = new Cavaleiro();
        cavaleiro.setArma(new Espada());
        cavaleiro.lutar(); // Manejando a espada

        Personagem rainha = new Rainha();
        rainha.setArma(new ArcoFlecha());
        rainha.lutar(); // Atirando uma flecha

        Personagem rei = new Rei();
        rei.setArma(new Faca());
        rei.lutar(); // Manejando a faca


        

        
    }
}