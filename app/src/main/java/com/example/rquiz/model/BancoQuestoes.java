package com.example.rquiz.model;

import java.util.ArrayList;
import java.util.List;

public class BancoQuestoes {


    private static List<Questoes>  questoesRQuiz(){

        final  List<Questoes> listaQuestoes = new ArrayList<>();

        // perguntas                                                                                                                                      // resposta correta
        final Questoes questoe1 = new Questoes("Quanto é 1 + 1 ?", "1", "2", "4", "7", "2", "");
        final Questoes questoe2 = new Questoes("Qual Seleção Jogou Ronaldinho Gaucho?", "França", "Brasil", "Estados Unidos", "Egito", "Brasil", "");
        final Questoes questoe3 = new Questoes("Em que ano foi descoberto o Brasil?", "1685.", "1688.", "1685.", "1500.", "1500.", "");
        final Questoes questoe4 = new Questoes("Quanto é 5 + 5", "5", "6", "10", "100", "10", "");
        final Questoes questoe5 = new Questoes("Onde Nasceu o jogador Cristiano Ronaldo",  "França", "Brasil", "Estados Unidos", "Portugal", "Portugal", "");

        // adicionar na lista
        listaQuestoes.add(questoe1);
        listaQuestoes.add(questoe2);
        listaQuestoes.add(questoe3);
        listaQuestoes.add(questoe4);
        listaQuestoes.add(questoe5);

        return  listaQuestoes;
    }

    public static List<Questoes>  getQuestoes(){
        return questoesRQuiz();
    }



}
