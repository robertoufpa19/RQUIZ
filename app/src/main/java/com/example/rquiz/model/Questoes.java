package com.example.rquiz.model;

public class Questoes {

    private String  questao, opcao1, opcao2, opcao3, opcao4, resposta;
    private String opSelecionada; // opção selecionada pelo usuario


    public Questoes(String questao, String opcao1, String opcao2, String opcao3, String opcao4, String resposta, String opSelecionada) {
        this.questao = questao;
        this.opcao1 = opcao1;
        this.opcao2 = opcao2;
        this.opcao3 = opcao3;
        this.opcao4 = opcao4;
        this.resposta = resposta;
        this.opSelecionada = opSelecionada;
    }

    public String getQuestao() {
        return questao;
    }

    public void setQuestao(String questao) {
        this.questao = questao;
    }

    public String getOpcao1() {
        return opcao1;
    }

    public void setOpcao1(String opcao1) {
        this.opcao1 = opcao1;
    }

    public String getOpcao2() {
        return opcao2;
    }

    public void setOpcao2(String opcao2) {
        this.opcao2 = opcao2;
    }

    public String getOpcao3() {
        return opcao3;
    }

    public void setOpcao3(String opcao3) {
        this.opcao3 = opcao3;
    }

    public String getOpcao4() {
        return opcao4;
    }

    public void setOpcao4(String opcao4) {
        this.opcao4 = opcao4;
    }

    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }

    public String getOpSelecionada() {
        return opSelecionada;
    }

    public void setOpSelecionada(String opSelecionada) {
        this.opSelecionada = opSelecionada;
    }
}
