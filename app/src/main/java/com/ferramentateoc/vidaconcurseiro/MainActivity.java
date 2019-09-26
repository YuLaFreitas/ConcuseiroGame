package com.ferramentateoc.vidaconcurseiro;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    Cadernos cadernos = new Cadernos();
   // int n;

    @Override
    public void onSaveInstanceState(Bundle saved) {
        saved.getBundle(String.valueOf(saved));
        super.onSaveInstanceState(saved);
    }

    @Override
    protected void onCreate(final Bundle onSaveInstanceState) {
        super.onCreate(onSaveInstanceState);
        setContentView(R.layout.activity_texto);  }

    //É chamado pelo onCliclk
    public void comecar() {
        setContentView(R.layout.activity_main);

        botaoGerarNumero();
        ///////primeira tela após abertura
        alterarElementosLayout(geradorNumAleatorio());
        cadernos.idecan2016("q");
        limpaRadioButton();

    }
    //associado ao comecar()
    private void botaoGerarNumero(){

        FloatingActionButton btnGeradorNumerico = findViewById(R.id.gerador);

        btnGeradorNumerico.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {

                limpaRadioButton();

                do {

                    int n = geradorNumAleatorio();
                    botaoImagem(n);

                }while (cadernos.idecan2016("q").isEmpty());


            }
        });
    }


    private int geradorNumAleatorio() {
            RandomNum classRadom = new RandomNum();
            int rN = classRadom.randomNum();
        alterarElementosLayout(rN);
            return rN;
        }

    //associado ao geradorNumAleatio()
    private void botaoImagem(final int rN){
        FloatingActionButton botao = findViewById(R.id.fabImagens);
        final FloatingActionButton txt = findViewById(R.id.fabTexto);
        alterarElementosLayout(rN);

        final String redacao = cadernos.idecan2016("txt");

        if ((rN == 13) || (rN == 14) || (rN == 30)) {
            botao.show();
            txt.hide();

            botao.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    LinearLayout questao = findViewById(R.id.questao);
                    questao.setVisibility(View.INVISIBLE);
                    AppBarLayout tool = findViewById(R.id.tool);
                    tool.setVisibility(View.INVISIBLE);
                    tool.setExpanded(false, true);

                    FloatingActionButton voltarMAN = findViewById(R.id.btnFechar);

                    FrameLayout frameLayout = findViewById(R.id.frameLayout);
                    frameLayout.setVisibility(View.VISIBLE);
                    frameLayout.setRight(View.LAYER_TYPE_HARDWARE);
                    frameLayout.setLeft(View.LAYER_TYPE_HARDWARE);




                        int image = 0;

                        switch (rN) {
                            case 13:image = R.mipmap.idecan2016q13;break;
                            case 14:image=R.mipmap.idecan2016q14;break;
                            case 30:image=R.mipmap.idecan2016q30;break;
                        }

                    final TextView texto1 = findViewById(R.id.texto1);
                    final ImageView imagem = findViewById(R.id.image);

                    texto1.setText(redacao);
                    imagem.setImageResource(image);

                    voltarMAN.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            FrameLayout frameLayout = findViewById(R.id.frameLayout);
                            frameLayout.setVisibility(View.INVISIBLE);
                            LinearLayout questao = findViewById(R.id.questao);
                            questao.setVisibility(View.VISIBLE);
                            AppBarLayout tool = findViewById(R.id.tool);
                            tool.setVisibility(View.VISIBLE);
                            tool.setExpanded(true, true);

                        }
                    });
                    }
        });
        }else{botaoTexto(redacao);}
    }

    //associado ao botaoImagem()
    private void botaoTexto(final String txto) {
        FloatingActionButton botao = findViewById(R.id.fabImagens);
        FloatingActionButton txt = findViewById(R.id.fabTexto);
        botao.hide();
        txt.show();

        final AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
        txt.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(final View v) {

                                       alertDialog.setMessage(txto);
                                       alertDialog.setNegativeButton("FECHAR", new DialogInterface.OnClickListener() {
                                           @Override
                                           public void onClick(DialogInterface dialog, int which) {
                                               closeContextMenu();
                                           }
                                       });
                                       alertDialog.show();
                                   }
                               });
    }

    //vinculado no botãoGerar
    public void limpaRadioButton() {
        final TextView textView = findViewById(R.id.certo);
        final RadioButton letraA = findViewById(R.id.LetraA);
        final RadioButton letraB = findViewById(R.id.LetraB);
        final RadioButton letraC = findViewById(R.id.LetraC);
        final RadioButton letraD = findViewById(R.id.LetraD);
        final RadioButton letraE = findViewById(R.id.LetraE);

        textView.setVisibility(View.INVISIBLE);
        letraA.setTextColor(getResources().getColor(R.color.alternativas));
        letraA.setTextSize(getResources().getDimension(R.dimen.alternativas));
        letraB.setTextColor(getResources().getColor(R.color.alternativas));
        letraB.setTextSize(getResources().getDimension(R.dimen.alternativas));
        letraC.setTextColor(getResources().getColor(R.color.alternativas));
        letraC.setTextSize(getResources().getDimension(R.dimen.alternativas));
        letraD.setTextColor(getResources().getColor(R.color.alternativas));
        letraD.setTextSize(getResources().getDimension(R.dimen.alternativas));
        letraE.setTextColor(getResources().getColor(R.color.alternativas));
        letraE.setTextSize(getResources().getDimension(R.dimen.alternativas));


        View.getDefaultSize(R.dimen.alternativas, R.color.alternativas);
    }

    //vinculado no botãoGerar()
    public void alterarElementosLayout(final int n ){

        cadernos.setNumero(n);

        final RadioButton letraA = findViewById(R.id.LetraA);
        final RadioButton letraB = findViewById(R.id.LetraB);
        final RadioButton letraC = findViewById(R.id.LetraC);
        final RadioButton letraD = findViewById(R.id.LetraD);
        final RadioButton letraE = findViewById(R.id.LetraE);

        final TextView text = findViewById(R.id.enuciado);
        final RadioGroup radioGroup = findViewById(R.id.quatro);

        TextView resultado = findViewById(R.id.certo);
        resultado.setVisibility(View.INVISIBLE);

        radioGroup.setVisibility(View.VISIBLE);
        radioGroup.clearCheck();

        text.setText(cadernos.idecan2016("q"));
        letraA.setText(cadernos.idecan2016("A"));
        letraB.setText(cadernos.idecan2016("B"));
        letraC.setText(cadernos.idecan2016("C"));
        letraD.setText(cadernos.idecan2016("D"));
        letraE.setText(cadernos.idecan2016("E"));
    }

    public void onClick(View v) {
        if (v.getId() == R.id.button) {
            comecar();
        }

        TextView resultado = findViewById(R.id.certo);
        resultado.setVisibility(View.VISIBLE);
        resultado.setTextSize(30);

        String[] gabaritoIdecan2016 = {

                "", "B", "C", "D", "B", "C",
                "D", "D", "C", "A", "D", "B",
                "C", "C", "B", "A", "A", "C",
                "A", "C", "D", "D", "A", "D",
                "C", "D", "C", "B", "A", "A", "A"

        };

        String[] gabaritoIdecan2009 = {

                "", "C", "A", "A", "C", "E", "D", "C", "B", "D", "C", "C",
                "D", "D", "B", "B", "B", "E", "D", "D", "A", "A", "#",
                "D", "E", "C", "D", "B", "B", "E", "E", "E", "B", "D",
                "C", "C", "B", "E", "D", "C", "A"
        };
       int n =1;// randomNum.getValor();
        String certa = gabaritoIdecan2016[n];

        switch (v.getId()) {

            case R.id.LetraA:
                resultado.setText(conferir("A", certa, R.id.LetraA));
                break;
            case R.id.LetraB:
                resultado.setText(conferir("B", certa, R.id.LetraB));
                break;
            case R.id.LetraC:
                resultado.setText(conferir("C", certa, R.id.LetraC));
                break;
            case R.id.LetraD:
                resultado.setText(conferir("D", certa, R.id.LetraD));
                break;
            case R.id.LetraE:
                resultado.setText(conferir("E", certa, R.id.LetraE));
                break;
        }
    }

    //vinculado ao onClick()
    @SuppressLint("ResourceAsColor")
    public String conferir(String escolha, String correto, int id) {

        String word = "";
        if (escolha.equals(correto)) {
            TextView resultado = findViewById(id);

            resultado.setTextColor(R.color.RespostaCerta);
            resultado.setTextSize(20);
            word = "Resposta certa";
        }

        if (!escolha.equals(correto)) word = "Gabarito é " + correto;
        return word;

    }

    @Override
    protected void onStart() {
        super.onStart();

    }

    @Override
    protected void onStop() {
        super.onStop();
        //int n = randomNum.getValor();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        finish();
    }
}