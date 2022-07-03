
import java.util.LinkedList;
import java.util.List;

public class Stack {
    private List<Integer> valores = new LinkedList<Integer>();
    private int tamanhoStack;

    public int getTamanhoStack() {
        return tamanhoStack;
    }

    public void setTamanhoStack(int tamanhoStack) {
        this.tamanhoStack = tamanhoStack;
    }

    public boolean push(int valor) {
        valores.add(valor);
        return true;
    }

    public int pop() {
        return valores.remove(valores.size() - 1);
    }

    public boolean vazia() {
        if (valores.isEmpty()) {
            return true;
        }
        return false;
    }

    public boolean cheia() {
        if (valores.size() >= getTamanhoStack()) {
            return false;
        }
        return true;
    }


    @Override
    public String toString() {
        return valores.toString();
    }
}
