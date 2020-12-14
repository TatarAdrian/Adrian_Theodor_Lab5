package resources;

public class QuizData {

    // here are the questions and answers stored
    // the right answers, have a * at the end
    private static String[][] qpa = new String[26][4];

    public static  String[][] setQuiz0()
    {
        qpa[0][0]="Indicatorul interzice ↑:";
        qpa[0][1]="depasirea";
        qpa[0][2]="deplasarea pe direcția înainte după prima intersecție";
        qpa[0][3]="schimbarea direcției de mers în prima intersecție *";

        qpa[1][0]="Autobuzul din față semnalizează ieșirea din stația prevăzută cu alveolă. Cum trebuie să procedați?";
        qpa[1][1]="îl ocoliți cât mai mult, pentru a proteja pietonii";
        qpa[1][2]="reduceți viteza și la nevoie opriți, pentru a permite plecarea din stație a autobuzului *";
        qpa[1][3]="vă continuați deplasarea, deoarece nu aveți restricții";

        qpa[2][0]="Marcajul aplicat pe marginea din dreapta a părţii carosabile, format dintr-o linie în zig-zag, semnifică:";
        qpa[2][1]="interzicerea staţionării *";
        qpa[2][2]="interzicerea opririi";
        qpa[2][3]="alte pericole";

        qpa[3][0]="Vă este permisă trecerea peste marcajul longitudinal?";
        qpa[3][1]="da, deoarece linia discontinuă este cea mai apropiată de vehiculul pe care îl conduceţi *";
        qpa[3][2]="nu, deoarece este un marcaj dublu";
        qpa[3][3]="nu, deoarece în acest caz depăşirea este interzisă.";

        qpa[4][0]="Cum trebuie să procedaţi atunci când intenţionaţi să finalizaţi o depăşire?";
        qpa[4][1]="semnalizaţi revenirea şi efectuaţi manevra în condiţii de siguranţă *";
        qpa[4][2]="după reîncadrare, semnalizaţi cu luminile de avarie";
        qpa[4][3]="claxonaţi şi vă angajaţi pe partea dreaptă, direct în faţa vehiculului depăşit.";

        qpa[5][0]="Conducătorul de autovehicul poate efectua depăşirea pe partea dreaptă a autovehiculului al cărui \n"
                +"conducător a semnalizat intenţia schimbării direcţiei de mers spre stânga?";
        qpa[5][1]="da, dacă vehiculul din faţă s-a angajat corespunzător părăsirii sensului de mers *";
        qpa[5][2]="da, dacă s-a creat spaţiu suficient pentru această manevră *";
        qpa[5][3]="nu";

        qpa[6][0]="La intersecţia nedirijată dintre un drum naţional şi unul judeţean, comunal sau local, \n"
                + "prioritatea de trecere se acordă:";
        qpa[6][1]="vehiculelor care circulă pe drumul judeţean, comunal sau local";
        qpa[6][2]="vehiculelor care vin din dreapta";
        qpa[6][3]="vehiculelor care circulă pe drumul naţional *";

        qpa[7][0]="Când este permisă trecerea la nivel cu o cale ferată fără bariere, prevăzută cu semnalizare \n"
                + "luminoasă, dacă tocmai a trecut un tren?";
        qpa[7][1]="după ce s-a stins lumina roşie intermitentă *";
        qpa[7][2]="după ce a trecut ultimul vagon";
        qpa[7][3]="atunci când pleacă vehiculele aflate de cealaltă parte a căii ferate";

        qpa[8][0]="Aveţi obligaţia de a opri imediat autovehiculul la semnalele adresate de:";
        qpa[8][1]="membrii patrulelor şcolare de circulaţie, de la trecerile pentru pietoni din apropierea \n"
                + "unităţilor de învăţământ *";
        qpa[8][2]="personalul autorizat din cadrul Ministerului Transporturilor";
        qpa[8][3]="lucrătorii ce îşi desfăşoară activitatea în cadrul Administraţiei Drumurilor";

        qpa[9][0]="Dacă semaforul în funcţiune se află instalat de cealaltă parte a intersecţiei, \n"
                + "conducătorul de autovehicul:";
        qpa[9][1]="nu este obligat să respecte semnificaţia semnalelor luminoase, deoarece nu i se adresează";
        qpa[9][2]="este obligat să respecte semnificaţia semnalelor luminoase, doar dacă semaforul este însoţit \n"
                + "de un semn adiţional care indică direcţiile cărora li se adresează semnalele";
        qpa[9][3]="este obligat să respecte semnificaţia semnalelor luminoase ale acestuia, dacă un alt semafor \n"
                + "instalat la intrarea în intersecţie are în funcţiune un semnal similar *";

        qpa[10][0]="Depăşirea nu este permisă:";
        qpa[10][1]="atunci când vehiculul ce urmează a fi depăşit rulează cu viteza admisă de lege";
        qpa[10][2]="în orice locuri şi situaţii în care vizibilitatea nu permite executarea manevrei *";
        qpa[10][3]="în orice locuri şi situaţii în care vizibilitatea nu permite executarea manevrei";

        qpa[11][0]="Întoarcerea autovehiculului este interzisă:";
        qpa[11][1]="unde marcajul axial este discontinuu";
        qpa[11][2]="în intersecţiile unde este necesară manevrarea înainte şi înapoi *";
        qpa[11][3]="în zona de acţiune a indicatorului Staţionarea interzisă";

        qpa[12][0]="La ieşirea din zonele rezidenţiale sau pietonale, sunteţi obligat să acordaţi prioritate:";
        qpa[12][1]="autovehiculelor";
        qpa[12][2]="pietonilor de pe sensul opus de circulaţie";
        qpa[12][3]="tuturor vehiculelor cu care vă intersectaţi *";

        qpa[13][0]="Precizaţi în care dintre situaţii este interzisă staţionarea voluntară a vehiculelor?";
        qpa[13][1]="în dreptul căilor de acces care deservesc proprietăţile alăturate drumurilor publice *";
        qpa[13][2]="în zona aglomerată a pieţelor";
        qpa[13][3]="în pante şi în rampe *";

        qpa[14][0]="Ce manevre sunt interzise pe autostradă?";
        qpa[14][1]="oprirea şi efectuarea unei pene de cauciuc";
        qpa[14][2]="învăţarea conducerii unui vehicul *";
        qpa[14][3]="încercarea prototipurilor de şasiuri şi de vehicule cu motor *";

        qpa[15][0]="În care dintre situaţii se reţine certificatul de înmatriculare sau înregistrare?";
        qpa[15][1]="când inspecţia tehnică periodică a expirat *";
        qpa[15][2]="dacă zgomotul în mers sau staţionare depăşeşte limita legală admisă *";
        qpa[15][3]="când motorul emite noxe poluante peste limitele legale admise *";

        qpa[16][0]="Este permisă staţionarea autovehiculelor pe timpul nopţii pe partea carosabilă a unui \n"
                + "drum comunal neiluminat?";
        qpa[16][1]="da, dacă se aprind luminile de poziţie sau de staţionare *";
        qpa[16][2]="nu, întrucât în toate cazurile se interzice pe timpul nopţii staţionarea pe partea carosabilă";
        qpa[16][3]="da, dacă în afara luminilor de poziţie, prezenţa autovehiculului este semnalizată şi \n"
                + "cu ajutorul triunghiurilor reflectorizante";

        qpa[17][0]="Ce se înţelege prin conduită preventivă?";
        qpa[17][1]="un concept valabil pentru conducătorii auto începători";
        qpa[17][2]="comportamentul rutier care asigură prevenirea accidentelor, prin anticiparea şi evitarea \n"
                + "acţiunilor incorecte ale partenerilor de drum, precum şi adaptarea vitezei de deplasare la \n"
                + "condiţiile meteo-rutiere specifice *";
        qpa[17][3]="calitatea unor conducători auto de a circula prudent, cu viteză redusă, pentru a nu crea \n"
                + "neplăceri în trafic celorlalţi utilizatori ai drumului public";

        qpa[18][0]="Când se aplică regulile conduitei preventive?";
        qpa[18][1]="când conduceţi efectiv autovehiculul pe drumurile publice";
        qpa[18][2]="când autovehiculul este oprit pe partea carosabilă";
        qpa[18][3]="atât în timpul conducerii efective, cât şi atunci când autovehiculul este oprit *";

        qpa[19][0]="Conducătorului auto i se interzice:";
        qpa[19][1]="să arunce din vehicul obiecte, substanţe sau alte bunuri *";
        qpa[19][2]="să deschidă uşile, dacă vehiculul este oprit sau staţionat pe partea carosabilă";
        qpa[19][3]="să folosească instalaţia de sonorizare cu care este echipat autoturismul";

        qpa[20][0]="Cum se pedepseşte conducerea pe drumurile publice a unui autovehicul din categoria C, de către \n"
                + "o persoană al cărei permis este valabil pentru categoria B? *";
        qpa[20][1]="penal";
        qpa[20][2]="contravenţional";
        qpa[20][3]="amendă contravenţională şi reţinerea permisului de conducere";

        qpa[21][0]="Conducătorul unui autoturism poate transporta obiecte al căror gabarit depăşeşte, împreună cu \n"
                + "încărcătura, dimensiunile acestuia?";
        qpa[21][1]="da, dacă extremitatea obiectelor este semnalizată cu un steag roşu";
        qpa[21][2]="nu *";
        qpa[21][3]="da, dacă obiectele depăşesc lăţimea autovehiculului";

        qpa[22][0]="Perna de aer (AIRBAG-ul) asigură:";
        qpa[22][1]="amortizarea rapidă a trepidaţiilor datorate denivelărilor existente pe drumul public";
        qpa[22][2]="protecţia suplimentară a persoanelor în cazul unui impact puternic al autovehiculului *";
        qpa[22][3]="posibilitatea conducerii relaxate, cu capul sprijinit de aceasta";

        qpa[23][0]="La întâlnirea cărui indicator conducătorul auto nu are prioritate de trecere?";
        qpa[23][1]="Prioritate pentru circulaţia din sens invers *";
        qpa[23][2]="Prioritate faţă de circulaţia din sens invers";
        qpa[23][3]="Drum cu prioritate";

        qpa[24][0]="Avertizarea sonoră se foloseşte:";
        qpa[24][1]="ori de câte ori este necesar, pentru evitarea unui pericol imediat *";
        qpa[24][2]="la trecerea pe lângă biciclişti";
        qpa[24][3]="în localităţi, la apropierea de o trecere pentru pietoni";

        qpa[25][0]="Depăşirea vehiculelor pe drumurile publice este interzisă:";
        qpa[25][1]="pe sectorul de drum unde s-a format o coloană de autovehicule în aşteptare, dacă prin \n"
                + "aceasta se intră pe sensul opus de circulaţie *";
        qpa[25][2]="în intersecţiile dirijate doar cu indicatoare rutiere";
        qpa[25][3]="atunci când cel depăşit este remorcat şi are puse în funcţiune luminile de avarie";

        return qpa;

    }
}
