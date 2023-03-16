package Lavoro;

public class Main {
    public static void main(String[] args) {
     Dipendente dip1 = new Dipendente(Dipartimento.PRODUZIONE, Livello.OPERAIO);

    // dip1.Liv = Livello.QUADRO; con uguale qua finisco a dover richiamare calcolastipendio()
       // dip1.stipendio = dip1.calcolaStipendio(); copiaincolla di questa dichiarazione, non voglio.
        dip1.setLivello(Livello.QUADRO);//richiamando setLivello() ci obbliga ad utilizzare calcolaStipendio()
        dip1.promuovi();


}







}