package com.ferramentateoc.vidaconcurseiro;


import android.text.Html;


public class Cadernos {

    public int a;
 //int a,
 public void setNumero(int numero){a=numero;}

 public int getNumero(){
  return a;
 }
/*
 public String idecan2009(String tipo) {

  wordKeyEnt = tipo + getNumero();
  String wordKeySai = null;
      switch (wordKeyEnt) {

 case "txt1":
 wordKeySai= "<p> <a href=www.jw.org>TEXTO:  Aborto – A realidade dos consultórios </a></p>"
 +"<p>Em um mundo ideal, o aumento da eficiência, a diminuição do custo e a facilidade de acesso aos métodos <br> anticoncepcionais femininos e masculinos poderiam ter reduzido o aborto no Brasil a sua dimensão puramente médica. <br>  O aborto continua sendo um dilema social, humano, jurídico e um risco para a saúde de quase 1 milhão de mulheres <br> brasileiras todos os anos. Essa questão, sem solução unânime no campo religioso (quando o feto passa a ter alma?), e no científico (quando a vida começa?) vem sendo encarada no dia-a-dia dos consultórios. Tem crescido o número de <br> médicos que, diante da irredutibilidade das pacientes em abortar, consideram seu dever profissional ajudá-las a enfrentar <br> da melhor maneira possível as consequências da decisão. <br>  O Brasil tem cerca de 18.000 ginecologistas. São pouco confiáveis as estatísticas de quantos se tornaram adeptos da filosofia de redução de danos para pacientes dispostas a desafiar a lei brasileira e se submeter a um aborto. <br>  Sem muita precisão, os especialistas acreditam que chegue a 1 milhão o número de abortos realizados anualmente no <br> Brasil de modo clandestino. <br> No Poder Judiciário, a questão começa aos poucos a ser discutida com mais desassombro. Nos últimos cinco anos, foram concedidos 3.000 alvarás judiciários para suspensão da gravidez em casos de má-formação fetal, especialmente anencefalia. <br> É o dobro das liberações no mesmo período no início da década de 90 e representa 80% de todas as gestações de fetos anencéfalos. <br>  Por mais que os médicos se rendam às demandas de suas pacientes e por mais que a legislação avance, a interrupção <br> do processo de criação de uma vida humana nunca será de fácil compreensão intelectual ou emocionalmente simples. <br>A discussão de quando se inicia a vida é interminável. Mesmo que a ciência consiga um dia definir esse momento <br> com precisão, os debates não cessarão. Parece óbvio e natural que, a partir do momento em que um óvulo é fecundado <br> por um espermatozoide, uma vida em potencial começa a se desenvolver. Mas que potencial existe caso esse óvulo <br> fertilizado não venha sequer a se fixar no útero? <br>  Ser simples, acessível, seguro e legal não torna o aborto mais aceitável para as pessoas que o rejeitam. Ao contrário, <br> torna-o ainda mais monstruoso ao juízo delas. Prova disso é o fato de que as discussões nos países onde a prática foi <br> liberada nunca serenam – a cada dia elas são mais violentas. Coloque-se na pele de uma pessoa que acha o aborto, em <br> qualquer fase da gestação e por qualquer motivo, igual a matar alguém, e uma visão do abismo que separa as convicções <br> opostas nesse assunto começará a se abrir sob seus pés.  (Revista Veja 28/01/09 – Edição 2097 / fragmento) </p>";

 break;

 case "q1":
 wordKeySai= "<p> 01) De acordo com o texto apresentado," +
 " assinale a alternativa INCORRETA:</p>";
 break;

 case "A1": wordKeySai="<p>A) Há muitos médicos que, diante da irredutibilidade das pacientes em abortar, consideram seu dever profissional ajudá-las a enfrentar as consequências da decisão. </p>" ; break;
 case "B1": wordKeySai="<p>B) O número de abortos realizados anualmente no Brasil de modo clandestino é grandioso. </p>" ; break;
 case "C1": wordKeySai="<p>C) O aborto continua sendo apenas um dilema social. </p>" ; break;
 case "D1": wordKeySai="<p>D) A interrupção do processo de criação de uma vida humana nunca será emocionalmente simples. </p>" ; break;
 case "E1": wordKeySai="<p>E) É interminável a discussão de quando se inicia a vida. </p>" ; break;
 case "q2": wordKeySai="<p> 02) Infere-se, de acordo com o 1º parágrafo do texto, que: </p>" ; break;
 case "A2": wordKeySai="<p>A) A facilidade de acesso aos métodos anticoncepcionais femininos e masculinos também poderiam ter reduzido o aborto no Brasil. </p>" ; break;
 case "B2": wordKeySai="<p>B) O aborto é um risco para a saúde da mulher. </p>" ; break;
 case "C2": wordKeySai="<p>C) O aborto somente é praticado para salvar vida da mãe ou na condição de que o feto que ela carrega no útero é gerado por estupro ou é inviável, devido a um defeito grave de formação. </p>" ; break;
 case "D2": wordKeySai="<p>D) A questão do aborto é esquecida nos campos religioso e científico, porém, é encarada nos consultórios. </p>" ; break;
 case "E2": wordKeySai="<p>E) É dever profissional dos médicos tornar a prática do aborto mais acessível. </p>" ; break;
 case "q3": wordKeySai="<p> 03) Identifique a alternativa abaixo, em que o significado entre parênteses está corretamente relacionado aos verbos em destaque: </p>" ; break;
 case "A3": wordKeySai="<p>A) Os debates sobre esse assunto não cessarão. (parar) </p>" ; break;
 case "B3": wordKeySai="<p>B) O aborto não é aceitável para as pessoas que o rejeitam. (reclamar) </p>" ; break;
 case "C3": wordKeySai="<p>C) Cresce o número de médicos que ajudam a paciente a enfrentar as consequências da decisão. (inchar) </p>" ; break;
 case "D3": wordKeySai="<p>D) Os médicos se rendem às demandas de suas pacientes. (substituir) </p>" ; break;
 case "E3": wordKeySai="<p>E) Os alvarás judiciários suspenderam a gravidez com má-formação fetal. (fixar) </p>" ; break;
 case "q4": wordKeySai="<p> 04) “<b>Mas que potencial existe caso esse óvulo fertilizado não venha sequer a se fixar no útero?</b>” O trecho destacado <br>poderia ser reescrito, sem prejuízo do sentido, de acordo com a norma culta, da seguinte forma: </p>" ; break;
 case "A4": wordKeySai="<p>A) Mas ainda que potencial existe caso esse óvulo fertilizado não venha sequer a se fixar no útero? </p>" ; break;
 case "B4": wordKeySai="<p>B) Visto que potencial existe caso esse óvulo fertilizado não venha sequer a se fixar no útero? </p>" ; break;
 case "C4": wordKeySai="<p>C) Entretanto que potencial existe caso esse óvulo fertilizado não venha sequer a se fixar no útero? </p>" ; break;
 case "D4": wordKeySai="<p>D) Embora que potencial existe caso esse óvulo fertilizado não venha sequer a se fixar no útero? </p>" ; break;
 case "E4": wordKeySai="<p>E) Segundo que potencial existe caso esse óvulo fertilizado não venha sequer a se fixar no útero? </p>" ; break;
 case "q5": wordKeySai="<p> 05) De acordo com a norma culta da língua, assinale a frase INCORRETA quanto à concordância: </p>" ; break;
 case "A5": wordKeySai="<p> A) O aborto causa debates e discussões monstruosos. </p>" ; break;
 case "B5": wordKeySai="<p> B) O aborto causa monstruosos debates e discussões. </p>" ; break;
 case "C5": wordKeySai="<p> C) O aborto causa debates e discussões monstruosas. </p>" ; break;
 case "D5": wordKeySai="<p> D) O aborto causa discussões e debates monstruosos. </p>" ; break;
 case "E5": wordKeySai="<p> E) O aborto causa monstruosos discussões e debates. </p>" ; break;
 case "q6": wordKeySai="<p> 06) De acordo a norma culta da língua, assinale a frase INCORRETA quanto à concordância: </p>" ; break;
 case "A6": wordKeySai="<p> A) Exigem-se referências sobre esses consultórios. </p>" ; break;
 case "B6": wordKeySai="<p> B) Menos de dois médicos realizaram a prática do aborto. </p>" ; break;
 case "C6": wordKeySai="<p> C) Bastam essas discussões para que o processo de criação de uma vida humana seja valorizado. </p>" ; break;
 case "D6": wordKeySai="<p> D) Morreu algumas mulheres e o bebê. </p>" ; break;
 case "E6": wordKeySai="<p> E) Uma e outra paciente falou a verdade. </p>" ; break;
 case "q7": wordKeySai="<p> 07) No trecho “Ser simples, acessível, seguro e leal não torna o aborto mais aceitável para as pessoas que o rejeitam.”  as vírgulas foram utilizadas para: </p>" ; break;
 case "A7": wordKeySai="<p> A) Separar o vocativo. </p>" ; break;
 case "B7": wordKeySai="<p> B) Separar expressões explicativas.</p>" ; break;
 case "C7": wordKeySai="<p> C) Separar palavras da mesma classe. </p>" ; break;
 case "D7": wordKeySai="<p> D) Isolar orações coordenadas assindéticas. </p>" ; break;
 case "E7": wordKeySai= "<p>E) Separar o aposto. </p>" ; break;
 case "q8": wordKeySai="<p> 08) Encontram-se corretamente justificadas a acentuação das palavras a seguir, EXCETO: </p>" ; break;
 case "A8": wordKeySai="<p> A) Eficiência: paroxítona terminada em ditongo. </p>" ; break;
 case "B8": wordKeySai="<p> B) Útero : paroxítona terminada em “o”. </p>" ; break;
 case "C8": wordKeySai="<p> C) Jurídico: proparoxítona. </p>" ; break;
 case "D8": wordKeySai="<p>D) Alvará: oxítona terminada em “a”. </p>" ; break;
 case "E8": wordKeySai="<p> E) Má: monossílabo tônico. </p>" ; break;
 case "q9": wordKeySai="<p> 09) “Quando o feto passa a ter alma, é um dilema questionado por muitos brasileiros.” O trecho destacado <br/>anteriormente exprime circunstância de: </p>" ; break;
 case "A9": wordKeySai="<p>A) Proporção.</p>" ; break;
 case "B9": wordKeySai="<p>B) Comparação. </p>" ; break;
 case "C9": wordKeySai="<p> C) Condição. </p>" ; break;
 case "D9": wordKeySai="<p>D) Tempo.</p>" ; break;
 case "E9": wordKeySai="<p>E) Finalidade. </p>" ; break;
 case "q10": wordKeySai="<p> 10) Assinale a alternativa que apresenta erro no emprego do artigo: </p>" ; break;
 case "A10": wordKeySai="<p> A) O aborto seria praticado para salvar a vida da mãe. </p>" ; break;
 case "B10": wordKeySai="<p> B) Há pacientes dispostas a se submeterem a um aborto. </p>" ; break;
 case "C10": wordKeySai="<p> C) Feliz o médico cujo os pacientes são sensatos. </p>" ; break;
 case "D10": wordKeySai="<p> D) A mãe tinha muito amor a ambos os filhos. </p>" ; break;
 case "E10": wordKeySai="<p> E) A paciente não quis responder a ambas as perguntas. </p>" ; break;
 case "q11": wordKeySai="<p> 11) Dadas as funções f(x) = 5x + m e g(x) = – 2x + 3n, tais que f(3) = 11 e g(6) = 0, marque a alternativa correta: </p>" ; break;
 case "A11": wordKeySai="<p>A) m = n </p>" ; break;
 case "B11": wordKeySai="<p> B) m = 2n </p>" ; break;
 case "C11": wordKeySai="<p>C) m = – n </p>" ; break;
 case "D11": wordKeySai="<p> D) m =  2 </p>" ; break;
 case "E11": wordKeySai="<p> E) m = n + 2 </p>" ; break;
 case "q12": wordKeySai="<p> 12) Qual o valor de k para que a equação 2x + 8x + k – 2 = 0 tenha duas raízes reais e iguais? </p>" ; break;
 case "A12": wordKeySai="<p>A) 2</p>" ; break;
 case "B12": wordKeySai="<p>B) 6</p>" ; break;
 case "C12": wordKeySai="<p>C) 8</p>" ; break;
 case "D12": wordKeySai="<p>D) 10  </p>" ; break;
 case "E12": wordKeySai="<p>E) 12 </p>" ; break;
 case "q13": wordKeySai="<p> 13) Sabe-se que a função f(x) = n – mx é decrescente. Assinale abaixo, a afirmativa verdadeira: </p>" ; break;
 case "A13": wordKeySai="<p>A) m < 0 </p>" ; break;
 case "B13": wordKeySai="<p>B) m < n </p>" ; break;
 case "C13": wordKeySai="<p> C) m > n</p>" ; break;
 case "D13": wordKeySai="<p>D) m > 0</p>" ; break;
 case "E13": wordKeySai="<p>E) m = 0 </p>" ; break;
 case "q14": wordKeySai="<p> 14) Sejam os conjuntos A= {1, 2, 3, 4} e B = {5, 6, 7}. Qual das relações abaixo é uma função em B x A? </p>" ; break;
 case "A14": wordKeySai="<p> A) R = {(5,1), (5,2), (5,3), (5,4), (6,1), (6,2), (6,3), (6,4)} </p>" ; break;
 case "B14": wordKeySai="<p> B) R = {(5,1), (6,1), (7,1)} </p>" ; break;
 case "C14": wordKeySai="<p> C) R = {(5,1), (5,2), (6,1), (6,2), (7,1), (7,2)} </p>" ; break;
 case "D14": wordKeySai="<p> D) R = {(1,5), (2,6), (3,7)} </p>" ; break;
 case "E14": wordKeySai="<p> E) R = {(1,5), (1,6), (1,7)} </p>" ; break;
 case "q15": wordKeySai="<p> 15) Dadas as funções reais definidas por f(x) = 2x + 5x – 1 e g(x) = 3x – 9. Assinale o valor da função g(f(f(g(3)))): </p>" ; break;
 case "A15": wordKeySai="<p> A) 17</p>" ; break;
 case "B15": wordKeySai="<p>B) – 21 </p>" ; break;
 case "C15": wordKeySai="<p>C) 23</p>" ; break;
 case "D15": wordKeySai="<p>D) – 19 </p>" ; break;
 case "E15": wordKeySai="<p> E) 16</p>" ; break;
 case "q16": wordKeySai="<p> 16) Qual das alternativas abaixo representa um número irracional? </p>" ; break;
 case "A16": wordKeySai="<p>a)r(2log2 16).r(2^5)</p>" ; break;
 case "B16": wordKeySai="<p> B) r(3^2+log4 16)</p>" ; break;
 case "C16": wordKeySai="<p>C)r(5log8 2 + 7log3 2/log3 8(</p>" ; break;
 case "D16": wordKeySai="<p>D) log0,2 1/25</p>" ; break;
 case "E16": wordKeySai="<p>e) log9 27 + log9 3</p>" ; break;
 case "q17": wordKeySai="<p>17) Para log a 4 +1/logb 8 = 1 , assinale o valor de a – b, considerando que logb a = 3 e que a + b > 10: </p>" ; break;
 case "A17": wordKeySai="<p>A) 20" ; break;
 case "B17": wordKeySai="<p>B) 30" ; break;
 case "C17": wordKeySai="<p>C) 40 " ; break;
 case "D17": wordKeySai="<p>D) 50" ; break;
 case "E17": wordKeySai="<p>E) 60 </p>" ; break;
 case "q18": wordKeySai="<p>18) Uma função do 2º grau apresenta como discriminante um número negativo, e como coeficiente do termo de maior grau, um número positivo. Em relação ao vértice da parábola que representa essa função, pode-se afirmar que: </p>" ; break;
 case "A18": wordKeySai="<p> A) A abscissa do vértice não pode ser negativa. </p>" ; break;
 case "B18": wordKeySai="<p> B) A ordenada do vértice não pode ser positiva. </p>" ; break;
 case "C18": wordKeySai="<p> C) A abscissa do vértice não pode ser positiva. </p>" ; break;
 case "D18": wordKeySai="<p> D) A ordenada do vértice não pode ser negativa. </p>" ; break;
 case "E18": wordKeySai="<p> E) A ordenada e a abscissa do vértice não podem ter o mesmo sinal. </p>" ; break;
 case "q19": wordKeySai="<p>19) Considerando que todos os entrevistados declararam consumir pelo menos um dos três produtos, qual o número de pessoas que consomem pelo menos dois tipos de carne? </p>" ; break;
 case "txt19": wordKeySai="<p>A tabela abaixo indica o resultado de uma pesquisa realizada com um grupo de pessoas em relação ao consumo de carne de boi, porco e frango. Observe: Tipos de carne Consumidores </p><p>boi 162 </p><p>porco135 </p><p>frango 147 </p><p>boi e porco72</p><p>boi e frango 65 </p><p>porco e frango 53</p><p>boi, porco e frango 41  </p> "; break;
 case "A19": wordKeySai="<p> A) 67 </p>" ; break;
 case "B19": wordKeySai="<p>B) 231</p>" ; break;
 case "C19": wordKeySai="<p>C) 198 </p>" ; break;
 case "D19": wordKeySai="<p> D) 108 </p>" ; break;
 case "E19": wordKeySai="<p>E) 193</p>" ; break;
 case "q20": wordKeySai="<p>20) Uma progressão geométrica decrescente infinita, cuja soma dos termos é 5/9 apresenta razão igual a 0,1. ssinale abaixo, a soma dos dois primeiros termos dessa progressão: </p>" ; break;
 case "A20": wordKeySai="<p> A) 11/20</p>" ; break;
 case "B20": wordKeySai="<p> B) 13/15 </p>" ; break;
 case "C20": wordKeySai="<p>C) 15/19 </p>" ; break;
 case "D20": wordKeySai="<p>D) 7/16</p>" ; break;
 case "E20": wordKeySai="<p>E) 9/13</p>" ; break;
 case "q21": wordKeySai="<p>21)  A  entrevista  de  seleção  é  uma  técnica  seletiva  mais  utilizada.  Entretanto,  pode  apresentar  algumas vantagens como, EXCETO: </p>" ; break;
 case "A21": wordKeySai="<p> A) Permite avaliar como o candidato se comporta e suas reações. </p>" ; break;
 case "B21": wordKeySai="<p> B) Nem sempre o candidato se sai bem na entrevista. </p>" ; break;
 case "C21": wordKeySai="<p> C) Exige treinamento do entrevistador. </p>" ; break;
 case "D21": wordKeySai="<p> D) Exige conhecimento a respeito do cargo e suas características básicas. </p>" ; break;
 case "E21": wordKeySai="<p> E) Técnica altamente subjetiva e forte margem de erro e variação. </p>" ; break;
 case "q22": wordKeySai="<p>22) As técnicas de seleção permitem um rastreamento das características pessoais do candidato através de amostras de seu comportamento. São consideradas como técnicas de seleção: </p>" ; break;
 case "A22": wordKeySai="<p> A) Entrevista de seleção. </p>" ; break;
 case "B22": wordKeySai="<p> B) Provas de conhecimentos ou de capacidade. </p>" ; break;
 case "C22": wordKeySai="<p> C) Testes psicológicos. </p>" ; break;
 case "D22": wordKeySai="<p> D) Desenvolvimento de habilidades para o cargo a ser preenchido. </p>" ; break;
 case "E22": wordKeySai="<p> E) Técnicas de simulação. </p>" ; break;
 case "txt23": wordKeySai="<p>O Princípio Orçamentário da ______________é o que estabelece que os  orçamentos de todos os órgãos autônomos  que  constituem  o  setor  público  devem  fundamentar-se  em  uma  única  política  orçamentária estruturada  uniformemente  e  que  se  ajuste  a  um  método  único.</p>";break ;
 case "q23": wordKeySai="<p>23) (Ver texto) Assinale  a  alternativa  que  completa corretamente a afirmativa anterior: </p>" ; break;
 case "A23": wordKeySai="<p> A) Universalidade </p>" ; break;
 case "B23": wordKeySai="<p> B) Programação </p>" ; break;
 case "C23": wordKeySai="<p> C) Anualidade </p>" ; break;
 case "D23": wordKeySai="<p>D) Unidade  </p>" ; break;
 case "E23": wordKeySai="<p>E) Exclusividade </p>" ; break;
 case "q24": wordKeySai="<p>24) O Sistema de Planejamento Integrado, no Brasil, também conhecido como Processo de Planejamento-Orçamento, consubstancia-se no(s) seguinte(s) instrumento(s): </p>" ; break;
 case "A24": wordKeySai="<p> A) Plano Plurianual. </p>" ; break;
 case "B24": wordKeySai="<p> B) Plano Plurianual e Lei das Diretrizes Orçamentárias. </p>" ; break;
 case "C24": wordKeySai="<p> C) Lei das Diretrizes Orçamentárias e Lei de Orçamentos Anuais. </p>" ; break;
 case "D24": wordKeySai="<p> D) Lei de Orçamentos Anuais e Plano Plurianual. </p>" ; break;
 case "E24": wordKeySai="<p> E) Plano Plurianual, Lei de Diretrizes Orçamentárias e Lei de Orçamentos Anuais. </p>" ; break;
 case "q25": wordKeySai="<p>25) O processo de recrutamento interno apresenta algumas vantagens, EXCETO: </p>" ; break;
 case "A25": wordKeySai="<p>A) Aproveita melhor o potencial humano da organização. </p>" ; break;
 case "B25": wordKeySai="<p>B) Motiva e encoraja o desenvolvimento profissional dos atuais funcionários. </p>" ; break;
 case "C25": wordKeySai="<p>C) Pode bloquear a entrada de novas ideias, experiências e expectativas. </p>" ; break;
 case "D25": wordKeySai="<p>D) Incentiva a permanência e a fidelidade dos funcionários da organização. </p>" ; break;
 case "E25": wordKeySai="<p>E) Ideal para situações de estabilidade e pouca mudança ambiental. </p>" ; break;
 case "q26": wordKeySai="<p>26) Fatores de qualidade do serviço são os atributos do serviço sobre os quais os clientes podem ter expectativas e que precisam ser atendidas com algum nível de especificação. São considerados como fatores críticos, EXCETO: </p>" ; break;
 case "A26": wordKeySai="<p>A) Comunicação. </p>" ; break;
 case "B26": wordKeySai="<p>B) Competência dos funcionários. </p>" ; break;
 case "C26": wordKeySai="<p>C) Funcionalidade, confiabilidade e disponibilidade. </p>" ; break;
 case "D26": wordKeySai="<p> D) Composição do produto. </p>" ; break;
 case "E26": wordKeySai="<p>E) Responsividade. </p>" ; break;
 case "txt27":wordKeySai="<p>É um dos ramos mais complexos da ciência contábil e tem por objetivo captar, registrar, acumular, resumir e interpretar os fenômenos que afetam as situações orçamentárias, financeiras e patrimoniais das entidades de direito público interno, ou seja, União, Estados, Distrito Federal e Municípios e respectivas autarquias, através de metodologia especialmente concebida para tal.</p>";break;
 case "q27": wordKeySai="<p>27) (ver texto) A afirmativa anterior refere-se à Contabilidade: </p>" ; break;
 case "A27": wordKeySai="<p>A) Patrimonial.</p>" ; break;
 case "B27": wordKeySai="<p>B) Pública.</p>" ; break;
 case "C27": wordKeySai="<p> C) Financeira. </p>" ; break;
 case "D27": wordKeySai="<p> D) Gerencial.</p>" ; break;
 case "E27": wordKeySai="<p>E) Geral. </p>" ; break;
 case "q28": wordKeySai="<p>28) Com relação ao conceito de treinamento é INCORRETO afirmar que: </p>" ; break;
 case "A28": wordKeySai="<p>A) É o processo de desenvolver qualidades nos recursos humanos para habilitá-los a serem mais produtivos e contribuir melhor para o alcance dos objetivos organizacionais. </p>" ; break;
 case "B28": wordKeySai="<p>B) O treinamento funciona como uma espécie de filtro, permitindo que apenas algumas pessoas possam ingressar na organização: as que apresentam características desejadas pela organização. </p>" ; break;
 case "C28": wordKeySai="<p>C) É o processo de ensinar aos novos empregados as habilidades básicas que pessoas necessitam para desempenhar seus cargos. </p>" ; break;
 case "D28": wordKeySai="<p>D) É o processo sistemático de alterarElementosLayout o comportamento dos empregados na direção do alcance dos objetivos <br>organizacionais. O treinamento está relacionado com as atuais habilidades e capacidades exigidas pelo cargo. </p>" ; break;
 case "E28": wordKeySai="<p>E) É o processo educacional de curto prazo e aplicado de maneira sistemática e organizada, por meio do qual as pessoas aprendem conhecimentos, atitudes e habilidades em função de objetivos definidos. </p>" ; break;
 case "q29": wordKeySai="<p>29) A despesa extraorçamentária é aquela que: </p>" ; break;
 case "A29": wordKeySai="<p>A) Depende de autorização legislativa. </p>" ; break;
 case "B29": wordKeySai="<p>B) Depende da integração do orçamento.</p>" ; break;
 case "C29": wordKeySai="<p>C) Independe das despesas com pessoal. </p>" ; break;
 case "D29": wordKeySai="<p>D) Depende do desdobramento da despesa. </p>" ; break;
 case "E29": wordKeySai="<p>E) Independe de autorização legislativa. </p>" ; break;
 case "q30": wordKeySai="<p>30) Regimes contábeis de escrituração podem ser conceituados como premissas básicas acerca dos fenômenos econômicos, refletidos pela contabilidade e que são a cristalização de análises e observações. Com relação aos regimes contábeis de escrituração é correto afirmar que: </p>" ; break;
 case "A30": wordKeySai="<p>A) O regime de caixa é aquele em que as receitas e as despesas são atribuídas aos exercícios de acordo com a real incorrência. </p>" ; break;
 case "B30": wordKeySai="<p>B) O regime de competência é aquele que, como norma geral, a receita é reconhecida no período em que é arrecadada, e a despesa paga nesse mesmo período. </p>" ; break;
 case "C30": wordKeySai="<p>C) Pelo regime de caixa, toda receita e toda despesa do exercício pertencem ao próprio exercício, embora já enhadas. </p>" ; break;
 case "D30": wordKeySai="<p>D) No regime de competência tanto as receitas por arrecadar, ainda que lançadas, quanto as despesas empenhadas e liquidadas, porém não pagas devem ser transferidas para o orçamento do exercício financeiro seguinte, fazendo  parte integrante dele, sem deixar resíduos ativos ou passivos. </p>" ; break;
 case "E30": wordKeySai="<p>E) Pelo regime de competência, toda receita e toda despesa do exercício pertencem ao próprio exercício, embora já <br> empenhadas. </p>" ; break;
 case "q31": wordKeySai="<p>31) “O Presidente da República Luiz Inácio Lula da Silva assinou ontem (29/09/2008) o decreto com o cronograma de implantação do Acordo Ortográfico da Língua Portuguesa no Brasil. O evento aconteceu na sede da Academia Brasileira de Letras (ABL), no Rio de Janeiro, entidade que também organizou simultaneamente uma sessão solene em homenagem ao centenário da morte do escritor Machado de Assis.” <br> (http://antigo.revistaescola.abril.com.br) Os países do acordo são: </p>" ; break;
 case "A31": wordKeySai="<p>A) Moçambique, Cabo Verde, Guiné-Bissau, São Tomé e Príncipe, Timor-Leste, Brasil, EUA e Portugal. </p>" ; break;
 case "B31": wordKeySai="<p>B) Angola, Moçambique, África do Sul, Guiné-Bissau, São Tomé e Príncipe, Timor-Leste, Brasil e Portugal. </p>" ; break;
 case "C31": wordKeySai="<p>C) Angola, Guiana Francesa, Cabo Verde, Guiné-Bissau, São Tomé e Príncipe, Timor-Leste, Argentina, Brasil e Portugal. </p>" ; break;
 case "D31": wordKeySai="<p>D) Angola, Moçambique, Cabo Verde, Guatemala, Honduras e Príncipe, Timor-Leste, Brasil e Portugal. </p>" ; break;
 case "E31": wordKeySai="<p>E) Angola, Moçambique, Cabo Verde, Guiné-Bissau, São Tomé e Príncipe, Timor-Leste, Brasil e Portugal. </p>" ; break;
 case "txt32": wordKeySai="<p>Superávit de junho foi de US$4,6 bilhões; no acumulado do ano, resultado é 24% maior que o de 2008. A balança comercial brasileira registrou superávit de US$4,625 bilhões em junho, o maior valor mensal desde dezembro de 2006, mostraram números do Ministério do Desenvolvimento, Indústria e Comércio nesta quarta-feira (1). Com isso, o superávit acumulado no ano chegou a US$13,987 bilhões. O dado acumulado é 23,8% superior ao superávit comercial de US$11,301 bilhões registrado no mesmo período de 2008.” <br> (http://www1.folha.uol.com.br/folha/dinheiro/ult91u578129.shtml) </p> <p>“A Bovespa (Bolsa de Valores de São Paulo) acumulou seu quarto dia de perdas numa sessão bastante esvaziada. E pelo terceiro pregão a Bolsa ficou abaixo do patamar dos 52 mil pontos, o que parece confirmar o sentimento de uma parcela do mercado de que a valorização registrada em maio foi ‘exagerada’. A taxa de câmbio alcançou R$1,97.” <br> (http://www1.folha.uol.com.br/folha/dinheiro/ult91u583038.shtml)</p>";break;
 case "q32": wordKeySai="<p>32)O assunto tratado nas reportagens apresentadas anteriormente é pauta cotidiana na maioria dos meios midiáticos. A Balança Comercial Favorável é um dos indicadores econômicos que demonstra: </p>" ; break;
 case "A32": wordKeySai="<p>A) Que a taxa de distribuição de renda do país é equitativa. </p>" ; break;
 case "B32": wordKeySai="<p>B) A preponderância das exportações sobre as importações. </p>" ; break;
 case "C32": wordKeySai="<p>C) Que a economia do país funciona sob a rígida intervenção governamental. </p>" ; break;
 case "D32": wordKeySai="<p>D) Uma ordem socioeconômica vigente no país, denominada capitalismo comercial. </p>" ; break;
 case "E32": wordKeySai="<p>E) Estabilidade política, social e econômica de um país capitalista. </p>" ; break;
 case "txt33": wordKeySai= "<p>A telemedicina é uma alternativa para resolver o problema da falta de especialistas em pequenas cidades ou em regiões remotas”, afirma entusiasmado o professor Renato Sabbatini, coordenador do Núcleo de Informática Biomédica da Universidade Estadual de Campinas. Segundo Sabbatini, apesar de estar apenas engatinhando no Brasil, a telemedicina já é muito usada em diversos países, como Canadá, Itália, França e, principalmente, Estados Unidos, onde surgiu, na década de 60, como uma solução criada pela Nasa, a Agência Espacial Americana, para acompanhar, da Terra, a saúde dos astronautas.  <br>(http://www.sabbatini.com/renato/EpocaOnLine-Telemedicina.htm) </p>";break;
 case "q33": wordKeySai="<p>33) “(Ver texto) A evolução tecnológica, pode e muito, ajudar na difusão da saúde e de melhores condições de vida no Brasil. sinale abaixo, um dos maiores entraves para o desenvolvimento dessa técnica no país: </p>" ; break;
 case "A33": wordKeySai="<p>A) É a concorrência com a Internet, que já abarca 90% dessa prática, em todos os estados brasileiros. </p>" ; break;
 case "B33": wordKeySai="<p>B) É a cultura popular, que impede que a população letrada dê importância a uma consulta não-tradicional. </p>" ; break;
 case "C33": wordKeySai="<p>C) É a questão da legalização e da parceria com as redes televisivas e midiáticas do país, que não têm esponsabilidade social obrigatória para participar de programas ligados à saúde. </p>" ; break;
 case "D33": wordKeySai="<p>D)  São  as  linhas  telefônicas.  As  consultas  médicas  ultrarrápidas  dependem  de  um  eficiente  sistema  de  telecomunicações. </p>" ; break;
 case "E33": wordKeySai="<p>E) É a falta de profissionais da área médica com experiência em telemarketing e outras habilidades de operar apare-  lhos eletrônicos. </p>" ; break;
    case "txt34": wordKeySai="<p>O melhor modo de controlar os excessos da TV é ter um público que seja crítico. E o único modo de tê-lo é <br> fazendo que ele conheça os vários meios – que seja alfabetiz ado em livros, em jornais, em rádios, em computação, <br>em artes. A própria TV, a TV boa, como a cultural, ou os nichos de inteligência que há nos canais comerciais, <br> podem ajudar nisso. Não precisa dar aulas. Mas pode aprofundar questões, mostrar dois lados de uma mesma <br>situação, dar a seu público um pouco do grande patrimônio mundial. Pode também vencer seu próprio complexo <br>de inferioridade e parar de falar mal da “velha” mídia, dos livros e das bibliotecas. Há lugar pra tudo na cultura, <br>e só ganha quem aposta em tudo.”<br>(Ribeiro, Renato Janine. O afeto autoritário: televisão, ética e democracia)</p>";break;
    case "q34": wordKeySai="<p>34) Sobre a influência da TV e outros meios midiáticos presentes no cotidiano atual é correto afirmar que: </p>" ; break;
 case "A34": wordKeySai="<p>A) A partir da influência positiva das ideias televisivas na vida dos telespectadores pode-se deduzir que a TV é um instrumento de democratização e cidadania. </p>" ; break;
 case "B34": wordKeySai="<p>B) É incontestável a capacidade da mídia de promover ações e reações da sociedade civil, embora apenas a nível local. </p>" ; break;
 case "C34": wordKeySai="<p>C) Os meios de comunicação são considerados como os principais focos de poder na atualidade, influenciando hábitos e até ditando normas sociais. </p>" ; break;
 case "D34": wordKeySai="<p>D) Os MCM’s (Meios de Comunicação de Massa) são considerados formadores de opinião, apesar de só tratarem de temas fictícios, distantes da realidade social. </p>" ; break;
 case "E34": wordKeySai="<p>E) Os meios de comunicação social, apesar de difundidos globalmente, não adquiriram ainda o poder de interferir nas dinâmicas sociais, principalmente nos meios rurais. </p>" ; break;
    case "txt35": wordKeySai="<p>Um dia depois de sua fracassada tentativa de voltar a Honduras, o Presidente deposto do país, Manuel Zelaya, confirmou na capital da Nicarágua que viaja nesta segunda-feira para Washington e que amanhã se reunirá com a Secretária de Estado americana, Hillary Clinton. O Departamento de Estado americano informou que haverá uma reunião com Zelaya nesta terça-feira, mas apenas funcionários que falaram sob condição de anonimato confirmaram o encontro com a chefe da diplomacia americana.” <br></p>";break;
    case "q35": wordKeySai="<p>35) A partir do golpe político ocorrido em Honduras, no último mês de junho deste ano, é correto afirmar que: </p>" ; break;
 case "A35": wordKeySai="<p>A) O país reafirma sua participação na OEA (Organização dos Estados Americanos), apesar de infringir a cláusula democrática de seu estatuto. </p>" ; break;
 case "B35": wordKeySai="<p>B) A maioria dos países reconhece o governo interino de Roberto Micheletti, que foi eleito pelo voto popular. </p>" ; break;
 case "C35": wordKeySai="<p>C) Zelaya tentava realizar uma consulta popular, declarada ilegal pela Justiça, para mudar a Constituição. </p>" ; break;
 case "D35": wordKeySai="<p>D) O encontro de Hillary Clinton com o presidente deposto vai solucionar a democracia e a segurança considerada tão importantes para os Estados Unidos e Honduras. </p>" ; break;
 case "E35": wordKeySai="<p>E) As Forças Armadas hondurenhas não precisaram agir, mantendo um clima de paz e tranquilidade, em âmbito geral. </p>" ; break;
 case "q36": wordKeySai="<p>36) No Microsoft Excel (versão XP – configuração padrão), a função utilizada para calcular o número de células não vazias em um intervalo que corresponde a uma determinada condição é: </p>" ; break;
 case "A36": wordKeySai="<p>A) CONTAR.SE </p>" ; break;
 case "B36": wordKeySai="<p>B) CONT.SE</p>" ; break;
 case "C36": wordKeySai="<p>C) SE.CONTAR </p>" ; break;
 case "D36": wordKeySai="<p> D) SE.CONT </p>" ; break;
 case "E36": wordKeySai="<p>E) CONTA.SE </p>" ; break;
 case "q37": wordKeySai="<p>37) No Microsoft Word (versão XP – configuração padrão) são tipos de índices, EXCETO: </p>" ; break;
 case "A37": wordKeySai="<p>A) Índice remissivo. </p>" ; break;
 case "B37": wordKeySai="<p>B) Índice analítico. </p>" ; break;
 case "C37": wordKeySai="<p>C) Índice de figuras. </p>" ; break;
 case "D37": wordKeySai="<p>D) Índice de autoridades. </p>" ; break;
 case "E37": wordKeySai="<p>E) Índice progressivo. </p>" ; break;
  case "txt38": wordKeySai="<p>Sobre a estrutura de Hardware e Software dos computadores (padrão IBM PC), analise: <br>I. Um driver é um software que permite que o computador se comunique com hardware ou dispositivos. Sem um software de driver, o hardware conectado, por exemplo, uma placa de vídeo ou impressora não funcionarão corretamente. <br> II. O microprocessador é um componente de software indispensável para o funcionamento dos computadores. <br> III. Periféricos são dispositivos, como uma unidade de disco, uma impressora, um modem ou um joystick , que estão conectados a um computador e são controlados pelo microprocessador do computador. <br>IV. Disco rígido é um dispositivo, também denominado unidade de disco rígido, que contém uma ou mais lâminas inflexíveis, revestidas de um material em que os dados podem ser gravados magneticamente com cabeçotes de leitura/gravação. </p>";break;
 case "q38": wordKeySai="<p>38) <br>Estão corretas apenas as afirmativas: </p>" ; break;
 case "A38": wordKeySai="<p>A) I, II, III, IV</p>" ; break;
 case "B38": wordKeySai="<p>B) I, II </p>" ; break;
 case "C38": wordKeySai="<p>C) I, II, III</p>" ; break;
 case "D38": wordKeySai="<p>D) I, III, IV</p>" ; break;
 case "E38": wordKeySai="<p>E) I, II, IV </p>" ; break;
 case "q39": wordKeySai="<p>39) Em relação à utilização do Windows Explorer (Windows XP Professional SP2 – configuração padrão) para operação e gerenciamento de arquivos, assinale abaixo o procedimento correto para mostrar pastas e arquivos ocultos: </p>" ; break;
 case "A39": wordKeySai="<p>A) Clicar no menu Arquivo – Escolher Opções de Arquivos – clicar na Guia Modo de exibição – Pastas e arquivos ocultos – marcar: Mostrar pastas e arquivos ocultos. </p>" ; break;
 case "B39": wordKeySai="<p>B) Clicar no menu Exibir – Escolher Opções de Exibição – clicar na Guia Modo de exibição – Pastas e arquivos ocultos – marcar: Mostrar pastas e arquivos ocultos. </p>" ; break;
 case "C39": wordKeySai="<p>C) Clicar no menu Ferramentas – Escolher Opções de Pasta – clicar na Guia Modo de exibição – Pastas e arquivos ocultos – marcar: Mostrar pastas e arquivos ocultos. </p>" ; break;
 case "D39": wordKeySai="<p>D) Clicar no menu Favoritos – Escolher Opções de Favoritos – clicar na Guia Modo de exibição – Pastas e arquivos ocultos – marcar: Mostrar pastas e arquivos ocultos. </p>" ; break;
 case "E39": wordKeySai="<p>E) Clicar no menu Editar – Escolher Opções de Editar – clicar na Guia Modo de exibição – Pastas e arquivos ocultos– marcar: Mostrar pastas e arquivos ocultos. </p>" ; break;
 case "q40": wordKeySai="<p>40)  Num  aplicativo  para  gerenciamento  de  contas  de  correios  eletrônicos,  os  protocolos  que  devem  ser configurados para gerenciar o envio e o recebimento de mensagens são, respectivamente: </p>" ; break;
 case "A40": wordKeySai="<p>A) SMTP e POP3</p>" ; break;
 case "B40": wordKeySai="<p>B) TCP/IP e FTP</p>" ; break;
 case "C40": wordKeySai="<p>C) FTP e TCP </p>" ; break;
 case "D40": wordKeySai="<p>D) HTTP e FTP </p>" ; break;
 case "E40": wordKeySai="<p>E) SMTP e FTP </p>" ; break;
  
}

if(wordKeySai==""){
    wordKeySai="";
}
    return Html.fromHtml(wordKeySai).toString();
 }*/

    public String idecan2016(String tipo){
        String wordKeyEnt = tipo + getNumero();
            String wordKeySai="";

  switch (wordKeyEnt){
      case "txt1" : wordKeySai= "<p><storge>O faraó da intolerância</storge></p><br/>"+
              "<p><i>Individualmente, quase todos temos nossos faraós. Pode ser um chefe abusivo, um trabalho"+
              "massacrante, uma relação mal resolvida ou uma dívida impagável.</p></i>"+
              "<p>Até hoje, os judeus estão celebrando a festa de Pessach e relembrando os épicos acontecimentos que resultaram"+
              "no Êxodo do Egito. Apesar de terem ocorrido há mais de 3.500 anos, manda a tradição judaica que devemos nos"+
              "lembrar dos tempos de escravidão como se nós mesmos tivéssemos sido libertados.</p>"+
              "<p>Um costume nesta época é cada um perguntar-se: qual é o meu faraó? Ao fazermos esta reflexão, buscamos"+
              "identificar quem ou o que está nos mantendo presos e estagnados e nos impedindo de avançar e progredir.</p>"+
              "<p>Individualmente, quase todos temos nossos faraós. Pode ser um chefe abusivo, um trabalho massacrante, uma"+
              "relação mal resolvida ou uma dívida impagável. A dependência de drogas e do álcool e o medo do sucesso e do fracasso"+
              "também nos mantêm cativos. Coletivamente, empresas, comunidades e sociedades inteiras podem igualmente estar"+
              "sob jugo de faraós que não os deixam alcançar seu potencial.</p>"+
              "<p>Atualmente, os brasileiros são vítimas de um déspota mais cruel que o próprio Ramsés, o faraó da intolerância."+
              "Éramos livres e, aos poucos, tornamo-nos seus escravos. Deixamos que ele ditasse a forma como nos relacionamos com"+
              "pessoas de diferentes etnias, religiões, orientações e posições políticas.</p>"+
              "<p>Nós, judeus, sabemos bem aonde a intolerância pode levar uma sociedade. Fomos e continuamos a ser uma de"+
              "suas maiores vítimas e estaremos sempre engajados no seu combate. É perturbador notar como ela passa a dominar as"+
              "emoções, palavras e ações de pessoas à nossa volta. É triste ver como ela impede a união de que o Brasil tanto precisa"+
              "para vencer seus imensos desafios.</p>"+
              "<p>Estamos vivendo no cativeiro da intolerância. Precisamos nos libertar. Assim como fez Moisés em Êxodo 9-1,"+
              "chegou a hora de encararmos esse faraó de frente e exigir: “Deixe meu povo ir!”</p>"+
              "<p>Esta não será uma luta fácil, nem rápida. O faraó da intolerância fará de tudo para nos manter sob seu domínio."+
              "Como os hebreus no Egito, temos de perseverar. Uma, duas, dez vezes se necessário, vamos mostrar a ele nossa"+
              "determinação de voltar a ser o que sempre fomos: um povo gentil, cordial e, acima de tudo, tolerante.</p>"+
              "<p><i><b><s>(Paulo Maltz. Disponível em: http://oglobo.globo.com/opiniao/o-farao-da-intolerancia-19200936#ixzz47PW1LYXI.)</s></b></i></p>"; break;
      case "q1" : wordKeySai= "<p><b>1) De acordo com o texto, é INCORRETO afirmar que</b></p>"; break;
      case "A1" : wordKeySai= "<p>A) a intolerância é o nosso faraó em comum.</p>"; break;
      case "B1" : wordKeySai= "<p>B) somente o povo judeu foi e ainda é vítima da intolerância.</p>"; break;
      case "C1" : wordKeySai= "<p>C) aquilo que nos impede ou nos atrapalha a nos desenvolvermos pode ser o nosso faraó.</p>"; break;
      case "D1" : wordKeySai= "<p>D) até hoje o povo judeu, em determinada época do ano, relembra o período em que foi escravo de faraó.</p>"; break;
      case "q2" : wordKeySai= "<p><b>2)O principal assunto do texto é:</b></p>"; break;
      case "A2" : wordKeySai= "<p>A) O sofrimento vivido pelos judeus.</p>"; break;
      case "B2" : wordKeySai= "<p>B) A festa de Pessach do povo judeu.</p>"; break;
      case "C2" : wordKeySai= "<p>C) A intolerância que sofremos e cometemos hoje.</p>"; break;
      case "D2" : wordKeySai= "<p>D) Nos mostrar que tudo o que nos impede de avançar e de alcançar o sucesso pode ser o nosso faraó</p>"; break;
      case "q3" : wordKeySai= "<p><b>3)Assinale a alternativa em que o termo sublinhado apresenta significado INCOERENTE quanto ao contexto empregado</b></p>"; break;
      case "A3" : wordKeySai= "<p>A) “... os <B>épicos</B> acontecimentos que resultaram no Êxodo do Egito.” – (1º§) homéricos</p>"; break;
      case "B3" : wordKeySai= "<p>B) “... medo do sucesso e do fracasso também nos mantêm <B>cativos</B>.” – (3º§) enclausurados</p>"; break;
      case "C3" : wordKeySai= "<p>C) “... os brasileiros são vítimas de um <b>déspota</b> mais cruel que o próprio Ramsés” – (4º§) tirano</p>"; break;
      case "D3" : wordKeySai= "<p>D) “Ao fazermos esta <b>reflexão/b>, buscamos identificar quem ou o que está nos mantendo presos...” – (2º§) imponderação</p>"; break;
      case "q4" : wordKeySai= "<p><b>4)"+"\"Atualmente, os brasileiros são vítimas de um déspota mais cruel que o próprio Ramsés,  <b>o faraó daintolerância.</b>”(4º§) O trecho sublinhado exprime a ideia de:</b></p>"+"\""; break;
      case "A4" : wordKeySai= "<p>A) conclusão.</p>"; break;
      case "B4" : wordKeySai= "<p>B) explicação</p>"; break;
      case "C4" : wordKeySai= "<p>C) retomada</p>"; break;
      case "D4" : wordKeySai= "<p>D) comparação.</p>"; break;
      case "q5" : wordKeySai= "<p><b>5)Quanto à análise sintática, assinale a alternativa em que o termo sublinhado está INCORRETAMENTE relacionado.</b></p>"; break;
      case "A5" : wordKeySai= "<p>A) “... os brasileiros são vítimas de um déspota...” (4º§) predicativo complemento nominal</p>"; break;
      case "B5" : wordKeySai= "<p>B) “... os judeus estão celebrando a festa de Pessach...” (1º§) sujeito</p>"; break;
      case "C5" : wordKeySai= "<p>C) “Nós, judeus, sabemos bem aonde a intolerância pode levar uma sociedade.” (5º§) vocativo</p>"; break;
      case "D5" : wordKeySai= "<p>D) “A dependência de drogas e do álcool e o medo do sucesso e do fracasso também nos mantêm cativos.” (3º§)</p>"; break;
      case "q6" : wordKeySai= "<p><b>6)Assinale a alternativa em que o termo ou trecho sublinhado retoma INCORRETAMENTE o que está sugerido.</b></p>"; break;
      case "A6" : wordKeySai= "<p>A) “... os épicos acontecimentos <b>que</b> resultaram no Êxodo do Egito.” (1º§) Épicos acontecimentos</p>"; break;
      case "B6" : wordKeySai= "<p>B) “... podem igualmente estar sob jugo de faraós <b>que</b> não os deixam alcançar seu potencial.” (3º§)Jugo de faraós</p>"; break;
      case "C6" : wordKeySai= "<p>C) “É perturbador notar como <b>ela</b> passa a dominar as emoções, palavras e ações de pessoas à nossa volta.” (5º§)  Intolerância</p>"; break;
      case "D6" : wordKeySai= "<p>D) “Ao fazermos esta <b>reflexão</b>, buscamos identificar quem ou o que está nos mantendo presos...” (2º§) Nos lembrar dos tempos de escravidão</p>"; break;
      case "q7" : wordKeySai= "<p><b>7)“É perturbador notar como ela passa a dominar as emoções, palavras e ações de pessoas à nossa volta.” (5º§) Quanto ao uso da crase em “à nossa volta”, é correto afirmar que</b></p>"; break;
      case "A7" : wordKeySai= "<p>A) é obrigatório por tratar-se de um pronome possessivo feminino.</p>"; break;
      case "B7" : wordKeySai= "<p>B) é obrigatório por tratar-se da junção do artigo a com a preposição a.</p>"; break;
      case "C7" : wordKeySai= "<p>C) está incorreto, pois não se usa crase diante de pronomes possessivos femininos.</p>"; break;
      case "D7" : wordKeySai= "<p>D) é facultativo porque é facultativo o uso do artigo feminino diante dos pronomes possessivos femininos.</p>"; break;
      case "q8" : wordKeySai= "<p><b>"+"8) \"Assim como fez Moisés em Êxodo 9-1, chegou a hora de encararmos esse faraó de frente e exigir: ‘Deixe meu povo ir!’.” (6º§) A expressão sublinhada exprime ao trecho uma ideia de</b></p>"; break;
      case "A8" : wordKeySai= "<p>A) conclusão.</p>"; break;
      case "B8" : wordKeySai= "<p>B) explicação.</p>"; break;
      case "C8" : wordKeySai= "<p>C) comparação.</p>"; break;
      case "D8" : wordKeySai= "<p>D) consequência.</p>"; break;
      case "q9" : wordKeySai= "<p><b>"+"9)"+"\"Nós, judeus, sabemos bem aonde a intolerância pode levar uma sociedade. Fomos e continuamos a ser uma de suas  maiores vítimas e estaremos sempre engajados no seu combate.” (5º§) Em se tratando da classe gramatical e de acordo com o contexto empregado, assinale a alternativa que apresenta a sequência correta dos termos sublinhados.</b></p>"; break;
      case "A9" : wordKeySai= "<p>A) Advérbio, adjetivo e advérbio.</p>"; break;
      case "B9" : wordKeySai= "<p>B) Advérbio, substantivo e advérbio.</p>"; break;
      case "C9" : wordKeySai= "<p>C) Conjunção, substantivo e conjunção.</p>"; break;
      case "D9" : wordKeySai= "<p>D) Preposição, substantivo e conjunção.</p>"; break;
      case "q10" : wordKeySai= "<p><b>"+"10)"+"\"Fomos e continuamos a ser uma de suas maiores vítimas e estaremos sempre engajados no seu combate.” (5º§) Sobre o trecho em evidência, assinale a afirmativa correta.</b></p>"; break;
      case "A10" : wordKeySai= "<p>A) O autor recorre ao passado para se remeter ao futuro.</p>"; break;
      case "B10" : wordKeySai= "<p>B) O fato de que fomos e continuamos a ser vítimas da intolerância terá fim se no futuro estivermos engajados no seu combate.</p>"; break;
      case "C10" : wordKeySai= "<p>C) Ao utilizar os três verbos em tempos diferentes, o autor nos afirma que o fato de sermos as “maiores vítimas” é um fato contínuo</p>"; break;
      case "D10" : wordKeySai= "<p>D) “Ser uma de suas maiores vítimas” é um fato passado que continua no presente e “engajados no seu combate” trata-se de uma ação contínua marcada por estaremos sempre.</p>"; break;
      case "q11" : wordKeySai= "<p><b>11)Numa escola de idiomas trabalham 13 professores e cada um deles leciona apenas um idioma sendo que 2 lecionam francês, 4 lecionam espanhol e 7 lecionam inglês. De quantas maneiras pode-se selecionar 2 professores que lecionam idiomas diferentes?</b></p>"; break;
      case "A11" : wordKeySai= "<p>A)42</p>"; break;
      case "B11" : wordKeySai= "<p>B)50</p>"; break;
      case "C11" : wordKeySai= "<p>C)54</p>"; break;
      case "D11" : wordKeySai= "<p>D)66</p>"; break;
      case "q12" : wordKeySai= "<p><b>12)Ao realizar uma viagem partindo da cidade em que reside até a cidade em que trabalha, um professor gastou 55 minutos e seu veículo desenvolveu uma velocidade média de 90 km/h. Qual deve ser a velocidade média desenvolvida numa viagem de volta de forma que sejam economizados 10 minutos em relação ao tempo gasto na primeira viagem?</b></p>"; break;
      case "A12" : wordKeySai= "<p>A)100 km/h.</p>"; break;
      case "B12" : wordKeySai= "<p>B)105 km/h.</p>"; break;
      case "C12" : wordKeySai= "<p>C)110 km/h.</p>"; break;
      case "D12" : wordKeySai= "<p>D)120 km/h.</p>"; break;
      case "txt13" : wordKeySai= "<p>Cada quadradinho em branco no quadro a seguir corresponde a um algarismo.</p>"; break;
      case "q13" : wordKeySai= "<p><b>13)A soma de todos os algarismos que devem ser colocados nos quadrinhos em branco de forma que as operações indicadas fiquem corretas é igual a:</b></p>"; break;
      case "A13" : wordKeySai= "<p>A)53</p>"; break;
      case "B13" : wordKeySai= "<p>B)54</p>"; break;
      case "C13" : wordKeySai= "<p>C)55</p>"; break;
      case "D13" : wordKeySai= "<p>D)56</p>"; break;
      case "txt14" : wordKeySai = "<input type='file:\\\\idecan2016q14.png'/><p>A figura a seguir representa uma peca de ceramica quadrada.</p>";

      break;
      case "q14" : wordKeySai= "<p><b>14) Se a área em negrito no interior dessa peça tem 150 cm^2, então a área de toda peça é igual a:</b></p>"; break;
      case "A14" : wordKeySai= "<p>A)375 cm^2.</p>"; break;
      case "B14" : wordKeySai= "<p>B)400 cm^2.</p>"; break;
      case "C14" : wordKeySai= "<p>C)425 cm^2.</p>"; break;
      case "D14" : wordKeySai= "<p>D)450 cm^2.</p>"; break;
      case "txt15" : wordKeySai= "<p>Uma fábrica de iogurtes pretende lançar dois novos sabores: </p><p>goiaba e maracujá, e ofereceu os iogurtes a um grupo de 80 pessoas. </p><p>Desse grupo observou-se que 18 pessoas gostaram dos dois produtos, 51 gostaram do iogurte de goiaba e 43 gostaram do iogurte de maracujá. </p>"; break;
      case "q15" : wordKeySai= "<p><b>15) O número de pessoas que não gostaram de nenhum dos dois sabores de iogurte foi igual a:</b></p>"; break;
      case "A15" : wordKeySai= "<p>A)4</p>"; break;
      case "B15" : wordKeySai= "<p>B)5</p>"; break;
      case "C15" : wordKeySai= "<p>C)6</p>"; break;
      case "D15" : wordKeySai= "<p>D)7</p>"; break;
      case "txt16" : wordKeySai= "<p>“Na região do Triângulo Mineiro, especificamente na cidade de Araxá, estão localizadas jazidas de um importante mineral do qual o Brasil é um dos maiores produtores mundiais. Esse mineral é fundamental para indústria de alta tecnologia e empregado em automóveis, turbinas de avião, gasodutos, em tomógrafos de ressonância magnética, na indústria aeroespacial, bélica e nuclear, além de outras inúmeras aplicações como lentes óticas, lâmpadas de alta intensidade, bens eletrônicos e até piercings.”</p>"; break;
      case "q16" : wordKeySai= "<p><b>16)Trata-se do mineral:</b></p>"; break;
      case "A16" : wordKeySai= "<p>A)Nióbio</p>"; break;
      case "B16" : wordKeySai= "<p>B)Urânio</p>"; break;
      case "C16" : wordKeySai= "<p>C) Bauxita.</p>"; break;
      case "D16" : wordKeySai= "<p>D) Minério de ferro.</p>"; break;
      case "q17" : wordKeySai= "<p><b>17) Na África os processos de integração regional são prejudicados pelo grave quadro de desagregação do continente; dependência econômica, carência de infraestrutura básica, baixo nível de industrialização, pobreza, fomes, epidemias e guerras civis. Os blocos econômicos africanos são muito frágeis, contudo, o mais importante acordo regional de comércio do continente é:</b></p>"; break;
      case "A17" : wordKeySai= "<p>A) CEI</p>"; break;
      case "B17" : wordKeySai= "<p>B) APEC</p>"; break;
      case "C17" : wordKeySai= "<p>C) SADEC.</p>"; break;
      case "D17" : wordKeySai= "<p>D) NAFTA.</p>"; break;
      case "q18" : wordKeySai= "<p><b>18)Na década de 1960, intelectuais, escritores, cantores, compositores, cineastas e artistas plásticos articipavam ativamente da política e muitos se engajaram em projetos revolucionários. Em 1967 ocorreu uma verdadeira revolução artística no Brasil, Caetano Veloso, Gilberto Gil e Gal Costa, entre outros, inauguraram um movimento musical conhecido como:</b></p>"; break;
      case "A18" : wordKeySai= "<p>A) Tropicália.</p>"; break;
      case "B18" : wordKeySai= "<p>B) Bossa Nova</p>"; break;
      case "C18" : wordKeySai= "<p>C) Jovem Guarda.</p>"; break;
      case "D18" : wordKeySai= "<p>D) Samba de roda</p>"; break;
      case "q19" : wordKeySai= "<p><b>18) Na década de 1960, intelectuais, escritores, cantores, compositores, cineastas e artistas plásticos participavam ativamente da política e muitos se engajaram em projetos revolucionários. Em 1967 ocorreu uma verdadeira revolução artística no Brasil, Caetano Veloso, Gilberto Gil e Gal Costa, entre outros, inauguraram um movimento musical conhecido como:</b></p>"; break;
      case "A19" : wordKeySai= "<p>A) Tropicália.</p>"; break;
      case "B19" : wordKeySai= "<p>B) Bossa Nova.</p>"; break;
      case "C19" : wordKeySai= "<p>C) Jovem Guarda.</p>"; break;
      case "D19" : wordKeySai= "<p>D) Samba de roda</p>"; break;
      case "q20" : wordKeySai= "<p><b>19)São características da organização espacial da região Sudeste, EXCETO:</b></p>"; break;
      case "A20" : wordKeySai= "<p>A) Foi a pioneira no desenvolvimento do setor industrial no Brasil.</p>"; break;
      case "B20" : wordKeySai= "<p>B) Possui grande concentração econômica e abriga os mais importantes centros financeiros do país.</p>"; break;
      case "C20" : wordKeySai= "<p>C) Atualmente, é a região de maior concentração populacional, detendo cerca de 40% da população brasileira.</p>"; break;
      case "D20" : wordKeySai= "<p>D) As atividades agrícolas são pouco modernizadas, apresentando baixo emprego de tecnologia e pouca diversificação da produção agrícola.</p>"; break;
      case "q21" : wordKeySai= "<p><b>21)De acordo com o §4º, Art. 17, Cap. IV da Lei nº 8.159, de 8 de janeiro de 1991, que dispõe sobre a política nacional de arquivos públicos e privados e dá outras</b></p>"; break;
      case "A21" : wordKeySai= "<p>A) O arquivo do Poder Judiciário, somente.</p>"; break;
      case "B21" : wordKeySai= "<p>B) O arquivo do Poder Executivo, somente.</p>"; break;
      case "C21" : wordKeySai= "<p>C) O arquivo do Poder Legislativo e o arquivo do Poder Judiciário.</p>"; break;
      case "D21" : wordKeySai= "<p>D) O arquivo do Poder Executivo e o arquivo do Poder Legislativo</p>"; break;
      case "q22" : wordKeySai= "<p><b>22) De acordo com o Manual de Redação da Presidência da República (Brasília, 2002), não se concebe que um ato normativo de qualquer natureza seja redigido de forma obscura, que dificulte ou impossibilite sua compreensão. Dessa forma, é correto afirmar que</b></p>"; break;
      case "A22" : wordKeySai= "<p>A) a sua publicidade implica, necessariamente, clareza e concisão.</p>"; break;
      case "B22" : wordKeySai= "<p>B) o estilo da redação deve ser o mais coloquial possível, em detrimento do uso do padrão culto da língua.</p>"; break;
      case "C22" : wordKeySai= "<p>C) a opacidade do sentido dos atos normativos, bem como sua ininteligibilidade são requisitos do próprio Estado de Direito.</p>"; break;
      case "D22" : wordKeySai= "<p>D) é aceitável que um texto legal não seja entendido pelos cidadãos, em vista do baixo nível educacional de parcela da população.</p>"; break;
      case "q23" : wordKeySai= "<p><b>23) Quanto ao papel de liderança nas organizações e na escola das relações humanas, é INCORRETO afirmar que:</b></p>"; break;
      case "A23" : wordKeySai= "<p>A) Tanto o autocrático quanto o paternalista são modelos de liderança.</p>"; break;
      case "B23" : wordKeySai= "<p>B) O bom líder é o indivíduo que conquista a cooperação dos membros da organização que dirige.</p>"; break;
      case "C23" : wordKeySai= "<p>C) Cabe ao papel do líder a criação e manutenção de um bom ambiente de trabalho entre os liderados.</p>"; break;
      case "D23" : wordKeySai= "<p>D) A liderança é algo natural do indivíduo, o que torna desnecessário seu aprimoramento via treinamento.</p>"; break;
      case "q24" : wordKeySai= "<p><b>24) “Circulares são ordens escritas, de caráter uniforme, expedidas a determinados funcionários ou agentes administrativos incumbidos de certo serviço, ou do desempenho de certas atribuições em circunstâncias especiais. São atos de menor generalidade que as instruções, embora colimem o mesmo objetivo.” A que objetivo a citação se refere?</b></p>"; break;
      case "A24" : wordKeySai= "<p>A) Ato negocial do serviço.</p>"; break;
      case "B24" : wordKeySai= "<p>B) Homologação do serviço</p>"; break;
      case "C24" : wordKeySai= "<p>C) Ordenamento do serviço.</p>"; break;
      case "D24" : wordKeySai= "<p>D) Teor classificatório do serviço.</p>"; break;
      case "q25" : wordKeySai= "<p><b>25) O abaixo-assinado é uma ferramenta muita conhecida que permite o exercício da cidadania. Qualquer pessoa, organização ou empresa, desde que devidamente identificada, pode se valer dele para defender seus interesses. Ele serve para solicitar ou pleitear algo a uma autoridade do serviço público. O abaixo-assinado também pode ser definido como:</b></p>"; break;
      case "A25" : wordKeySai= "<p>A) Um parecer de caráter coletivo.</p>"; break;
      case "B25" : wordKeySai= "<p>B) Um relatório de caráter coletivo.</p>"; break;
      case "C25" : wordKeySai= "<p>C) Uma portaria de caráter coletivo</p>"; break;
      case "D25" : wordKeySai= "<p>D) Um requerimento de caráter coletivo.</p>"; break;
      case "q26" : wordKeySai= "<p><b>26) “O ______________ representa as posições na empresa e como estão organizadas. Fornece ainda um quadro da estrutura de autoridade e da divisão de trabalho.” Assinale a alternativa que completa corretamente a afirmativa anterior.</b></p>"; break;
      case "A26" : wordKeySai= "<p>A) fluxograma</p>"; break;
      case "B26" : wordKeySai= "<p>B) downsizing</p>"; break;
      case "C26" : wordKeySai= "<p>C) organograma</p>"; break;
      case "D26" : wordKeySai= "<p>D) brainstorming</p>"; break;
      case "txt27" : wordKeySai= "<p>“Para redigir um comunicado aos colaboradores de uma empresa, foi determinado que a secretária utilize a ferramenta Microsoft Office Word 2007 (configuração padrão). Para que a ela adicione um cabeçalho padrão em todas as páginas do documento, pode ser utilizado o recurso Cabeçalho.”</p>"; break;
      case "q27" : wordKeySai= "<p><b>27) Este recurso está localizado na guia:</b></p>"; break;
      case "A27" : wordKeySai= "<p>A) Início</p>"; break;
      case "B27" : wordKeySai= "<p>B) Inserir.</p>"; break;
      case "C27" : wordKeySai= "<p>C) Exibição.</p>"; break;
      case "D27" : wordKeySai= "<p>D) Layout da Página</p>"; break;
      case "q28" : wordKeySai= "<p><b>28) Na ferramenta Microsoft Office Word 2007 (configuração padrão), sobre opções de impressão, é INCORRETO afirmar que a opção</b></p>"; break;
      case "A28" : wordKeySai= "<p>A) Intervalo indica quais páginas do documento serão impressas.</p>"; break;
      case "B28" : wordKeySai= "<p>B) Todos indica que todas as páginas do documento serão impressas.</p>"; break;
      case "C28" : wordKeySai= "<p>C) Página Atual indica que apenas a página que tiver com o cursor nela será impressa.</p>"; break;
      case "D28" : wordKeySai= "<p>D) Número de Cópias indica a quantidade de cópias do documento que deverá ser impressa.</p>"; break;
      case "q29" : wordKeySai= "<p><b>29) Na ferramenta Microsoft Office Excel 2007 (configuração padrão), o recurso para excluir linhas ou colunas de uma tabela, está localizado no grupo:</b></p>"; break;
      case "A29" : wordKeySai= "<p>A) Células da guia Início.</p>"; break;
      case "B29" : wordKeySai= "<p>B) Edição da guia Dados.</p>"; break;
      case "C29" : wordKeySai= "<p>C) Planilha da guia Exibição.</p>"; break;
      case "D29" : wordKeySai= "<p>D) Opções da planilha da guia Layout da Página.</p>"; break;
      case "txt30" : wordKeySai= "<p>Considere a planilha produzida com a ferramenta Microsoft Office Excel 2007 (configuração padrão):</p>"; break;
      case "q30" : wordKeySai= "<p><b>30)Para arredondar o valor da célula A2 um número para baixo até o inteiro mais próximo, pode-se utilizar a função:</b></p>"; break;
      case "A30" : wordKeySai= "<p>A) =INT(A2)</p>"; break;
      case "B30" : wordKeySai= "<p>B) =RND(A2)</p>"; break;
      case "C30" : wordKeySai= "<p>C) =ROUND(A2) .</p>"; break;
      case "D30" : wordKeySai= "<p>D) =AROUND(A2).</p>"; break;
  }

  if(wordKeySai.equals("")){
      wordKeySai = "";
  }

  return  Html.fromHtml(wordKeySai).toString();
}
}

