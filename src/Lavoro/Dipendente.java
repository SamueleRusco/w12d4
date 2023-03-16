package Lavoro;

public class Dipendente {
    static double stipendioBase = 1000;
//    int matricola = getMatricola();
   private Livello Liv; //li metto private cosi non posso modificarli da fuori questa classe
    private Dipartimento Dip;
   double stipendio;


    /* public static int getMatricola() {
         Random rand = new Random();
         int matricolaGenerata = rand.nextInt(1000) + 1;
         return matricolaGenerata;
     }*/
    public Dipendente (Dipartimento d, Livello l){
        this.setDipartimento(d);//dipartimento
        this.setLivello(l);
    //this.Liv = l;// operaio
   // this.stipendio = calcolaStipendio();//calcola lo stipendio a seconda del livello
    }

    public void setDipartimento(Dipartimento d){
        this.Dip = d;
    }

    public void setLivello(Livello l){
        this.Liv = l;
        this.stipendio = calcolaStipendio();

    }

    private double calcolaStipendio(){
        double pagaBase = 0;

        switch(this.Liv) {

            case OPERAIO:
                pagaBase = 1;
                break;
            case IMPIEGATO:
                pagaBase = 1.2;
                break;
            case QUADRO:
                pagaBase = 1.5;
                break;
            case DIRIGENTE:
                pagaBase = 2;
                break;
            default:
                pagaBase = 0;
                break;
        }
        return  (pagaBase * stipendioBase);
    }
    public void promuovi() {
        if (this.Liv == Livello.OPERAIO) {
            this.setLivello(Livello.IMPIEGATO);
        } else if (this.Liv == Livello.IMPIEGATO) {
            this.setLivello(Livello.QUADRO);
        } else if (this.Liv == Livello.QUADRO) {
            this.setLivello(Livello.DIRIGENTE);
        } else {
            System.out.println("dove cazzo vuoi andare?");
        }
    }



       /* public double getStipendio(){

            double pagaBase = 0;
            switch(Liv) {

                case OPERAIO:
                 pagaBase = 1;
                    break;
                case IMPIEGATO:
                   pagaBase = 1.2;
                    break;
                case QUADRO:
                    pagaBase = 1.5;
                    break;
                case DIRIGENTE:
                    pagaBase = 2;
                    break;
                default:
                    pagaBase = 0;
                    break;
            }
            return pagaBase;

           //return (stipendio = pagaBase * stipendioBase);

        }*/









}
