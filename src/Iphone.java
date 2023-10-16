import Navegador.NavegadorInternet;
import Reprodutor.ReprodutorMusical;
import Telefone.Telefone;

public class Iphone implements ReprodutorMusical, Telefone, NavegadorInternet {
        // Reprodutor
        boolean tocandoMusica = false;
        String music;
        public String getMusic() {
            return music;
        }
        public void setMusic(String newMusic) {
            this.music = newMusic;
        }
        public void tocarMusica(){
            tocandoMusica = true;
            System.out.println("Reproduzindo música");
        }
        public void pausarMusica(){
            tocandoMusica = false;
            System.out.println("Música pausada");
        }
        public void selecionarMusica() {
            this.music = getMusic();
            System.out.println("Tocando a música: " + getMusic());
        }
        
        // Telefone 
        private int numeroCorreioVoz;
        boolean ligacao = false;
        private long contato;
        public long getContato() {
            return contato;
        }
        public void setContato(long newContato) {
            this.contato = newContato;
        }
        public int getNumeroCorreioVoz() {
            return numeroCorreioVoz;
        }
        public void setNumeroCorreioVoz(int newNumeroCorreioVoz) {
            this.numeroCorreioVoz = newNumeroCorreioVoz;
        }
        public void atenderLigacao(){
            ligacao = true;
            System.out.println("Atendendo ligação");
        }
        public void ligarCorreioVoz(int numeroCorreioVoz) {
            numeroCorreioVoz = 144;
            System.out.println("Ligando para Correio de Voz " + "(*"+ getNumeroCorreioVoz() + ")");
        }
        public void fazerLigacao(long numeroContato) {
            numeroContato = getContato();
            System.out.println("Ligando para o número " + getContato());
        }
        
        // navegador
       
        private Integer abaNavegador = 0;
        public void exibirPagina() {
            if(abaNavegador == 0) {
                abaNavegador++;
                System.out.println("Exibindo página inicial");
            } else if (abaNavegador == 1) {
                System.out.println("Exibindo página inicial");
            } else {
                System.out.println("Exibindo aba " + abaNavegador);
            }
        }
        public void adicionarPagina(){
            abaNavegador++;
            System.out.println("Nova aba aberta. Você tem " + abaNavegador + " aba(as) abertas");
        }
        public void removerPagina() {
            abaNavegador--;
            if(abaNavegador >= 1) {
                System.out.println("Aba removida. Você tem " + abaNavegador + " aba(as) abertas" );
            } else {
                System.out.println("Você não possui nenhuma aba aberta.");
            }
        }   
        public void atualizarPagina() {
        if (abaNavegador > 0){
            System.out.println("Atualizando página..");
        } else {
            System.out.println("Você não tem nenhuma página aberta.");
            exibirPagina();
        }    
    }

public static void main(String[] args) {
        
        Iphone proMax = new Iphone();
        
        proMax.tocarMusica();
        proMax.pausarMusica();
        proMax.setMusic("RHCP - Californication");
        proMax.selecionarMusica();
        proMax.setContato(965405620);
        proMax.fazerLigacao(0);
        proMax.atenderLigacao();
        proMax.setNumeroCorreioVoz(144);
        proMax.ligarCorreioVoz(0);
        proMax.exibirPagina();
        proMax.adicionarPagina();
        proMax.atualizarPagina();
        proMax.removerPagina();
        proMax.removerPagina();
}

}
