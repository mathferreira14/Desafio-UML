package Telefone;


public interface Telefone  {

        public long getContato();

        public void setContato(long newContato);

        public int getNumeroCorreioVoz();

        public void setNumeroCorreioVoz(int newNumeroCorreioVoz);

        public void atenderLigacao();

        public void ligarCorreioVoz(int numeroCorreioVoz);

        public void fazerLigacao(long numeroContato);


}
