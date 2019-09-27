package com.ferramentateoc.vidaconcurseiro;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.transition.Slide;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toolbar;
import android.widget.ViewSwitcher;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.transition.Transition;

import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    RandomNum classRadom = new RandomNum();
    Cadernos cadernos = new Cadernos();
    int rN;
    @Override
    public void onSaveInstanceState(Bundle saved) {
        saved.getBundle(String.valueOf(saved));
        super.onSaveInstanceState(saved);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(final Bundle onSaveInstanceState) {
        super.onCreate(onSaveInstanceState);
        setContentView(R.layout.capa);

        /*Animation animation = new TranslateAnimation(0, 10, 0, 0);
        LayoutInflater.Factory fator = new LayoutInflater.Factory() {
            @Override
            public View onCreateView(String name, Context context, AttributeSet attrs) {
                return null;
            }
        };

        Slide slide = new Slide();
        slide.setSlideEdge(Gravity.getAbsoluteGravity(500,500));
        slide.setDuration(10);
        ValueAnimator valueAnimator = new ValueAnimator();
        TimeInterpolator timeInterpolator = valueAnimator.getInterpolator();
        slide.setInterpolator(timeInterpolator);

        slide.getTargetIds().add( R.mipmap.slide1);
        slide.getTargetIds().add( R.mipmap.slide2);
        slide.getTargetIds().add( R.mipmap.slide3);
        slide.getTargetIds().add( R.mipmap.slide4);
        slide.getTargetIds().add( R.mipmap.slide5);
*/
       ImageView img = findViewById(R.id.imagemMostrar);
       img.setImageResource(R.mipmap.slide1);
/*
       img.setImageURI();
        img.setImageResource(R.mipmap.slide2);
        img.setImageResource(R.mipmap.slide3);
        img.setImageResource(R.mipmap.slide4);
        img.setImageResource(R.mipmap.slide5);
        img.setInAnimation(animation);
        img.setInAnimation(animation);
        img.setFactory((ViewSwitcher.ViewFactory) fator);*/

    }

    //É chamado pelo onCliclk
    public void comecar() {
        setContentView(R.layout.activity_main);
        TextView tool = findViewById(R.id.textTool);
        tool.setText("IDECAN/2016");
        tool.setTextColor(getResources().getColor(R.color.design_default_color_primary_dark));

       botaoGerarNumero();
        ///////primeira tela após abertura
       // normalizarElementosLayout(geradorNumAleatorio());
       // cadernos.idecan2016("q");
       // limpaRadioButton();

    }

    //associado ao comecar()
    private int botaoGerarNumero() {
        FloatingActionButton btnGeradorNumerico = findViewById(R.id.gerador);

        //final int n=0;

            btnGeradorNumerico.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        limpaRadioButton();

                        botaoImagem(numero());

                    }

                    public int numero() {
                        int a;
                        do {
                            a = geradorNumAleatorio();
                        } while (cadernos.idecan2016("q").isEmpty());

                        return a;
                    }
                //}
                });

        ;

        return rN;
                //n[0];
        //a[0];
                 //1;
            //(int) a[0];
    }

    public int numeroCaderno() {
        Random random = new Random();
        int caderno;
        do {
        caderno = random.nextInt() / 1000000000;
        }   while (caderno==1||caderno==2);

        return caderno;
    }

    private int geradorNumAleatorio() {
       // vindulado a :onClick
            rN = classRadom.randomNum();
            int a=rN;
        normalizarElementosLayout(a);

            return a;
        }

    private void botaoImagem(final int rN){
        //associado ao geradorNumAleatio()
        FloatingActionButton botao = findViewById(R.id.fabImagens);
        final FloatingActionButton txt = findViewById(R.id.fabTexto);
        normalizarElementosLayout(rN);

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


    private void botaoTexto(final String txto) {
        //associado ao botaoImagem()
        FloatingActionButton botao = findViewById(R.id.fabImagens);
        FloatingActionButton txt = findViewById(R.id.fabTexto);
        if (!txto.isEmpty()) {

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
        }else{botao.hide(); txt.hide();}
    }


    public void limpaRadioButton() {
        //vinculado no botãoGerar
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

    //vinculado ao onClick()
    @SuppressLint("ResourceAsColor")
    public String conferir(String escolha, String correto, int id) {

        String word = "";
        if (escolha.equals(correto)) {
            TextView resultado = findViewById(id);

            resultado.setTextColor(R.color.RespostaCerta);
            resultado.setTextSize(20);
            word = "CERTO, MAIS...";
        }

        if (!escolha.equals(correto)) word = "No gabarito é " + correto;
        return word;

    }


    public void normalizarElementosLayout(final int n ){
        //vinculado no geradorNumAleatorio()

        final RadioButton letraA = findViewById(R.id.LetraA);
        final RadioButton letraB = findViewById(R.id.LetraB);
        final RadioButton letraC = findViewById(R.id.LetraC);
        final RadioButton letraD = findViewById(R.id.LetraD);
        final RadioButton letraE = findViewById(R.id.LetraE);

        final TextView text = findViewById(R.id.enuciado);
        final RadioGroup radioGroup = findViewById(R.id.quatro);

        TextView resultado = findViewById(R.id.certo);
        resultado.setTextSize(1);
        resultado.setVisibility(View.INVISIBLE);

        radioGroup.setVisibility(View.VISIBLE);
        radioGroup.clearCheck();



        //switch (numeroCaderno()) {
           //case 1:
                cadernos.setNumero(n);
                text.setText(cadernos.idecan2016("q"));
                letraA.setText(cadernos.idecan2016("A"));
                letraB.setText(cadernos.idecan2016("B"));
                letraC.setText(cadernos.idecan2016("C"));
                letraD.setText(cadernos.idecan2016("D"));
                letraE.setText(cadernos.idecan2016("E"));
             //   break;

         /*   case 2:
                cadernos.setNumero(n);
                text.setText(cadernos.idecan2009("q"));
                letraA.setText(cadernos.idecan2009("A"));
                letraB.setText(cadernos.idecan2009("B"));
                letraC.setText(cadernos.idecan2009("C"));
                letraD.setText(cadernos.idecan2009("D"));
                letraE.setText(cadernos.idecan2009("E"));
                break;
        }*/
    }

    public void onClick2(View v){
            comecar();
            onClick(v);
    }

        //GABARITO AQUI
    public void onClick(View v) {

        ContentValues idecan2019 = new ContentValues();

        idecan2019.put( "1","B");
        idecan2019.put( "2","C");
        idecan2019.put( "3","C");
        idecan2019.put( "4","D");
        idecan2019.put( "5","C");
        idecan2019.put( "6","D");
        idecan2019.put( "7","D");
        idecan2019.put( "8","C");
        idecan2019.put( "9","A");
        idecan2019.put( "10","D");
        idecan2019.put( "11","B");
        idecan2019.put( "12","C");
        idecan2019.put( "13","C");
        idecan2019.put( "14","B");
        idecan2019.put( "15","A");
        idecan2019.put( "16","A");
        idecan2019.put( "17","C");
        idecan2019.put( "18","A");
        idecan2019.put( "19","C");
        idecan2019.put( "20","D");
        idecan2019.put( "21","D");
        idecan2019.put( "22","A");
        idecan2019.put( "23","D");
        idecan2019.put( "24","C");
        idecan2019.put( "25","D");
        idecan2019.put( "26","C");
        idecan2019.put( "27","B");
        idecan2019.put( "28","A");
        idecan2019.put( "29","A");
        idecan2019.put( "30","A");

        ContentValues idecan2006 = new ContentValues();
        idecan2006.put( "1","C");
        idecan2006.put( "2"," A");
        idecan2006.put( "3"," A");
        idecan2006.put( "4"," C");
        idecan2006.put( "5"," E");
        idecan2006.put( "6"," D");
        idecan2006.put( "7"," C");
        idecan2006.put( "8"," B");
        idecan2006.put( "9"," D");
        idecan2006.put( "10"," C");
        idecan2006.put( "11"," C");
        idecan2006.put( "12","D");
        idecan2006.put( "13"," D");
        idecan2006.put( "14"," B");
        idecan2006.put( "15"," B");
        idecan2006.put( "16"," B");
        idecan2006.put( "17"," E");
        idecan2006.put( "18"," D");
        idecan2006.put( "19"," D");
        idecan2006.put( "20"," A");
        idecan2006.put( "21"," A");
        idecan2006.put( "22"," #");
        idecan2006.put( "23","D");
        idecan2006.put( "24"," E");
        idecan2006.put( "25"," C");
        idecan2006.put( "26"," D");
        idecan2006.put( "27"," B");
        idecan2006.put( "28"," B");
        idecan2006.put( "29"," E");
        idecan2006.put( "30"," E");
        idecan2006.put( "31"," E");
        idecan2006.put( "32"," B");
        idecan2006.put( "33"," D");
        idecan2006.put( "34","C");
        idecan2006.put( "35"," C");
        idecan2006.put( "36"," B");
        idecan2006.put( "37"," E");
        idecan2006.put( "38"," D");
        idecan2006.put( "39"," C");
        idecan2006.put( "40"," A");

        String certa = idecan2019.getAsString("" + rN);

        final TextView resultado = findViewById(R.id.certo);
        resultado.setVisibility(View.VISIBLE);
        resultado.setTextSize(30);
        switch (v.getId()) {

                case R.id.LetraA:
                    resultado.setText(conferir("A", certa, R.id.LetraA));
                             //"" +certa);
                    break;
                case R.id.LetraB:
                    resultado.setText(conferir("B", certa, R.id.LetraB));
                            //"" +certa);
                    break;
                case R.id.LetraC:
                    resultado.setText(conferir("C", certa, R.id.LetraC));
                           // "" +certa);
                    break;
                case R.id.LetraD:
                    resultado.setText(conferir("D", certa, R.id.LetraD));
                          //  "" +certa);
                    break;
                case R.id.LetraE:
                    resultado.setText(conferir("E", certa, R.id.LetraE));
                           // "" +certa);
                    break;
            }
             /*

            /* RadioButton lA = (RadioButton) this.findViewById(R.id.LetraA);
        RadioButton lB = (RadioButton) this.findViewById(R.id.LetraB);
        RadioButton lC = (RadioButton) this.findViewById(R.id.LetraC);
        RadioButton lD = (RadioButton) this.findViewById(R.id.LetraD);
        RadioButton lE = (RadioButton) this.findViewById(R.id.LetraE);


        lA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultado.setText(conferir("A", certa, R.id.LetraA));
            }
        });
        lB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultado.setText(conferir("B", certa, R.id.LetraA));
            }
        });
        lC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultado.setText(conferir("C", certa, R.id.LetraA));
            }
        });
        lD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultado.setText(conferir("D", certa, R.id.LetraA));
            }
        });
        lE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultado.setText(conferir("E", certa, R.id.LetraA));
            }
        });*/

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