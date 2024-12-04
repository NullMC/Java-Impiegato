public class Impiegato {
    private String nome;
    private String cognome;
    private int oreLavoro;

    static int ORE_BASE = 150;
    static int MAX_ORE = 180;

    private double COSTO_ORARIO = 10.50;
    private double MAGG_STRAORD = 1.1;

    public Impiegato(String pNome, String pCognome, int pOreLavoro){
        this.nome = pNome;
        this.cognome = pCognome;
        this.oreLavoro = pOreLavoro; //possiamo usare anche il metodo set ore
    }
    public String getNome(){
        return this.nome;
    }
    public String getCognome(){
        return this.cognome;
    }
    public int getOreLavoro(){
        return this.oreLavoro;
    }

    public void setOreLavoro(int pOreLavoro){
        this.oreLavoro = pOreLavoro;
    }

    public void setCostoOrario(double pCostoOrario){
        this.COSTO_ORARIO = pCostoOrario;
    }
    public void setMAGG_STRAORD(double pMAGG_STRAORD){
        this.MAGG_STRAORD = pMAGG_STRAORD;
    }


    public double calcolaSalario(){
        double salario;
        if(this.oreLavoro <= ORE_BASE){
            salario = this.oreLavoro * COSTO_ORARIO;
        }
        else{
            int oreStraordinario;
            double salarioBase, salarioStraordinario;
            salarioBase = 150 * COSTO_ORARIO;
            oreStraordinario = this.oreLavoro - ORE_BASE;
            if (oreStraordinario > 30){
                System.out.println("Hai lavorato più ore di quelle retribuibili");
                oreStraordinario = 30;
            }
            salarioStraordinario = MAGG_STRAORD * (oreStraordinario * COSTO_ORARIO);
            salario = salarioBase + salarioStraordinario;
        }
        return salario;
    }

    public void stampaImpiegato(){
        System.out.println(this.toString() + " --> Salario percepito: " + this.calcolaSalario() + " euro");
    }


    //metodo che crea una stringa che concatena le informazioni del dipendente
    public String toString(){
        String newString;
        newString = this.nome + " " + this.cognome + " --> ore lavorate: " + this.oreLavoro;
        newString += " Costo orario: " + this.COSTO_ORARIO;
        newString += " Maggiorazione straordinario: " + this.MAGG_STRAORD;
        return newString;
    }
}
