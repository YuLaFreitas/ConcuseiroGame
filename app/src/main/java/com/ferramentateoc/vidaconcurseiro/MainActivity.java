package com.ferramentateoc.vidaconcurseiro;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import androidx.annotation.RequiresApi;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends Activity  {

    Cadernos cadernos = new Cadernos();
    RandomNum randomNum = new RandomNum();
    int n;


    //private GestureDetector detector = null;
   @Override
    public void onSaveInstanceState(Bundle saved) {
        saved.putInt("valor", randomNum.getValor());
        super.onSaveInstanceState(saved);
   }

    @Override
    protected void onCreate(final Bundle saved) {
        super.onCreate(saved);
        setContentView(R.layout.activity_texto);
    }
    //É chamado pelo onCliclk
    public  void comecar(){

        setContentView(R.layout.activity_main);

        final FloatingActionButton botaoGerar = findViewById(R.id.gerador);
        final FloatingActionButton fab = findViewById(R.id.fab);
        fab.hide();


        randomNum.gergadorNumerico();
        alterar(randomNum.getValor());
        cadernos.idecan2016("q");
        padraoOriginalObjetos();
        fab.show();

        botaoGerar.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                fab.hide();
                padraoOriginalObjetos();

                n = randomNum.gergadorNumerico();
                alterar(n);
                Context context = v.getContext();
                final AlertDialog.Builder alertDialog = new AlertDialog.Builder(context);

                String teste = cadernos.idecan2016("txt");
                if(!teste.equals("")){
                    fabTex();
                    fab.show();
                }

                alertDialog.setNegativeButton("FECHAR", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        closeContextMenu();
                    }
                });

            }
        });

        View.getDefaultSize(R.dimen.alternativas, R.color.alternativas);
    }

    //botão flutuante do texto da questão
    private void fabTex(){
        FloatingActionButton fab = findViewById(R.id.fab);

            fab.setOnClickListener(new View.OnClickListener() {
                @RequiresApi(api = Build.VERSION_CODES.O)
                @Override
                public void onClick(View view) {

                    Context context = view.getContext();
                    final AlertDialog.Builder alertDialog = new AlertDialog.Builder(context);

                    switch (cadernos.idecan2016("txt")){

                        case "txt13":
                            alertDialog.setMessage(cadernos.idecan2016("txt"));
                            alertDialog.setIcon(R.mipmap.idecan2016q13);
                            alertDialog.setNegativeButton("FECHAR", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) { closeContextMenu();}
                            });
                            alertDialog.show();
                            break;
                        case "txt14":
                            alertDialog.setMessage(cadernos.idecan2016("txt"));
                            alertDialog.setIcon(R.mipmap.idecan2016q14);
                            alertDialog.setNegativeButton("FECHAR", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) { closeContextMenu();}
                            });

                            alertDialog.show();
                            break;
                        case "txt30":
                            alertDialog.setMessage(cadernos.idecan2016("txt"));
                            alertDialog.setIcon(R.mipmap.idecan2016q30);
                            alertDialog.setNegativeButton("FECHAR", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) { closeContextMenu();}
                            });

                            alertDialog.show();
                            break;
                            default:
                                alertDialog.setMessage(cadernos.idecan2016("txt"));
                                alertDialog.setNegativeButton("FECHAR", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) { closeContextMenu();}
                                });
                                alertDialog.show();
                                break;

                    }
                }
            });
        }


   //vinculado no botãoGerar
    public void padraoOriginalObjetos(){
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
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


    public void  alterar(int n){
        final RadioButton letraA = findViewById(R.id.LetraA);
        final RadioButton letraB = findViewById(R.id.LetraB);
        final RadioButton letraC = findViewById(R.id.LetraC);
        final RadioButton letraD = findViewById(R.id.LetraD);
        final RadioButton letraE = findViewById(R.id.LetraE);

        final TextView text = findViewById(R.id.enuciado);
        final RadioGroup radioGroup = findViewById(R.id.quatro);

        cadernos.setNumero(n);

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
       if(v.getId()==R.id.button){
           comecar();
       }

        TextView resultado = findViewById(R.id.certo);
        resultado.setVisibility(View.VISIBLE);
        resultado.setTextSize(30);

        String[] gabaritoIdecan2016 = {

                "","B","C","D","B","C",
                "D","D","C","A","D","B",
                "C","C","B","A","A","C",
                "A","C","D","D","A","D",
                "C","D","C","B","A","A","A"

        };

        String[] gabaritoIdecan2009 = {

                "","C", "A", "A", "C", "E", "D", "C", "B", "D", "C", "C",
                "D", "D", "B", "B", "B", "E", "D", "D", "A", "A", "#",
                "D", "E", "C", "D", "B", "B", "E", "E", "E", "B", "D",
                "C", "C", "B", "E", "D", "C", "A"
        };
        n= randomNum.getValor();
        String certa=gabaritoIdecan2016[n];

        switch (v.getId()){

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
    public String conferir(String escolha, String correto, int id){

       String word="";
        if(escolha.equals(correto)) {
        TextView resultado = findViewById(id);

        resultado.setTextColor(R.color.RespostaCerta);
        resultado.setTextSize(20);
        word = "Resposta certa";}

        if(!escolha.equals(correto))word = "Gabarito é " + correto;
        return  word;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onStart() {
        super.onStart();

    }

    @Override
    protected void onStop() {
        super.onStop();
        n = randomNum.getValor();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        finish();
    }


}