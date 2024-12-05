package com.example.rquiz;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.rquiz.model.BancoQuestoes;
import com.example.rquiz.model.Questoes;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TextView qtdQuestao, pergunta;

    private Button resposta1, resposta2, resposta3, resposta4, botaoProximo;

    private List<Questoes> listaQuestoes ;

    private int posicaoDaPerguntaAtual = 0;

    private String opcaoSelecionadaPeloUsuario = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        inicializarComponentes();



        listaQuestoes = BancoQuestoes.getQuestoes();

        qtdQuestao.setText((posicaoDaPerguntaAtual + 1)+"/"+listaQuestoes.size()); // 1/N

        pergunta.setText(listaQuestoes.get(0).getQuestao());
        resposta1.setText(listaQuestoes.get(0).getOpcao1());
        resposta2.setText(listaQuestoes.get(0).getOpcao2());
        resposta3.setText(listaQuestoes.get(0).getOpcao3());
        resposta4.setText(listaQuestoes.get(0).getOpcao4());




        resposta1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // resposta1.setBackgroundColor(getColor(R.color.teal_700));

                if(opcaoSelecionadaPeloUsuario.isEmpty()){

                    opcaoSelecionadaPeloUsuario = resposta1.getText().toString();

                    // resposta1.setBackgroundResource(R.drawable.fundo_redondo_vermelho);

                    resposta1.setTextColor(Color.RED);


                    listaQuestoes.get(posicaoDaPerguntaAtual).setOpSelecionada(opcaoSelecionadaPeloUsuario);

                    revelarResposta();

                }

            }
        });

        resposta2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(opcaoSelecionadaPeloUsuario.isEmpty()){

                    opcaoSelecionadaPeloUsuario = resposta2.getText().toString();

                    //  resposta2.setBackgroundResource(R.drawable.fundo_redondo_vermelho);

                    resposta2.setTextColor(Color.RED);



                    listaQuestoes.get(posicaoDaPerguntaAtual).setOpSelecionada(opcaoSelecionadaPeloUsuario);

                    revelarResposta();

                }

            }
        });

        resposta3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(opcaoSelecionadaPeloUsuario.isEmpty()){

                    opcaoSelecionadaPeloUsuario = resposta3.getText().toString();

                    // resposta3.setBackgroundResource(R.drawable.fundo_redondo_vermelho);

                    resposta3.setTextColor(Color.RED);


                    listaQuestoes.get(posicaoDaPerguntaAtual).setOpSelecionada(opcaoSelecionadaPeloUsuario);

                    revelarResposta();

                }

            }
        });

        resposta4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(opcaoSelecionadaPeloUsuario.isEmpty()){

                    opcaoSelecionadaPeloUsuario = resposta4.getText().toString();

                    // resposta4.setBackgroundResource(R.drawable.fundo_redondo_vermelho);

                    resposta4.setTextColor(Color.RED);



                    listaQuestoes.get(posicaoDaPerguntaAtual).setOpSelecionada(opcaoSelecionadaPeloUsuario);

                    revelarResposta();

                }
            }
        });

        botaoProximo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(opcaoSelecionadaPeloUsuario.isEmpty()){
                    exibirMensagem("Selecione uma opção!");
                }else{
                    mudarProximaQuestao();

                }

            }
        });

    }

    private void mudarProximaQuestao(){

        posicaoDaPerguntaAtual++;

        if((posicaoDaPerguntaAtual ) == listaQuestoes.size()){

           exibirMensagem("RQuiz Finalizado!");
            posicaoDaPerguntaAtual = 0; // iniciar novamente

        }

        else if((posicaoDaPerguntaAtual + 1 ) <= listaQuestoes.size()){

            opcaoSelecionadaPeloUsuario = "";

            resposta1.setBackgroundResource(R.drawable.bg_balao);
            resposta1.setTextColor(Color.BLACK);

            resposta2.setBackgroundResource(R.drawable.bg_balao);
            resposta2.setTextColor(Color.BLACK);

            resposta3.setBackgroundResource(R.drawable.bg_balao);
            resposta3.setTextColor(Color.BLACK);

            resposta4.setBackgroundResource(R.drawable.bg_balao);
            resposta4.setTextColor(Color.BLACK);


            qtdQuestao.setText((posicaoDaPerguntaAtual + 1)+"/"+listaQuestoes.size());
            pergunta.setText(listaQuestoes.get(posicaoDaPerguntaAtual).getQuestao());
            resposta1.setText(listaQuestoes.get(posicaoDaPerguntaAtual).getOpcao1());
            resposta2.setText(listaQuestoes.get(posicaoDaPerguntaAtual).getOpcao2());
            resposta3.setText(listaQuestoes.get(posicaoDaPerguntaAtual).getOpcao3());
            resposta4.setText(listaQuestoes.get(posicaoDaPerguntaAtual).getOpcao4());

        }else{

            // abrirResultado();
        }

    }


    private void revelarResposta(){


        final String buscarResposta = listaQuestoes.get(posicaoDaPerguntaAtual).getResposta();

        if(resposta1.getText().toString().equals(buscarResposta)){
            // resposta1.setBackgroundResource(R.drawable.fundo_redondo_verde);
            resposta1.setBackgroundColor(R.drawable.ic_launcher_background);
            resposta1.setTextColor(Color.GREEN);
        }
        else if(resposta2.getText().toString().equals(buscarResposta)){
            // resposta2.setBackgroundResource(R.drawable.fundo_redondo_verde);
            resposta2.setBackgroundColor(R.drawable.ic_launcher_background);
            resposta2.setTextColor(Color.GREEN);
        }
        else if(resposta3.getText().toString().equals(buscarResposta)){
            // resposta3.setBackgroundResource(R.drawable.fundo_redondo_verde);
            resposta3.setBackgroundColor(R.drawable.ic_launcher_background);
            resposta3.setTextColor(Color.GREEN);
        }
        else if(resposta4.getText().toString().equals(buscarResposta)){
            // resposta4.setBackgroundResource(R.drawable.fundo_redondo_verde);
            resposta4.setBackgroundColor(R.drawable.ic_launcher_background);
            resposta4.setTextColor(Color.GREEN);
        }
    }


    private void inicializarComponentes(){

        qtdQuestao = findViewById(R.id.textQtdPerguntas);
        pergunta   = findViewById(R.id.textPerguntas);

        resposta1  = findViewById(R.id.buttonResposta1);
        resposta2  = findViewById(R.id.buttonResposta2);
        resposta3  = findViewById(R.id.buttonResposta3);
        resposta4  = findViewById(R.id.buttonResposta4);

        botaoProximo = findViewById(R.id.buttonProximo);
    }

    private void exibirMensagem(String texto){
        Toast.makeText(this, texto, Toast.LENGTH_SHORT).show();
    }
}