public class Musuh {
    protected String namamusuh;
    protected int healtpoint;

    public Musuh(String nama, int hp) {
        this.namamusuh = nama;
        this.healtpoint = hp;

    }

    public void terimaDamage(int damage) {
        this.healtpoint -= damage;
        System.out.println(this.namamusuh + " terkena serangan biasa, Sisa HP: " + this.healtpoint);
    }

    public void serangPemain(){
        
    }

    public void suaraKhas(){

    }
}