
package exemploarrayobxectos;

public class Xogador {
    private String Nome;
    private int dorsal;

    public Xogador() {
    }

    public Xogador(String Nome, int dorsal) {
        this.Nome = Nome;
        this.dorsal = dorsal;
    }

    public String getNome() {
        return Nome;
    }

    public int getDorsal() {
        return dorsal;
    }

    @Override
    public String toString() {
        return "Xogador{" + "Nome=" + Nome + ", dorsal=" + dorsal + '}';
    }
    
}
