public class Pilha {
    Elemento top;
    int tamanho;

    public Pilha()
    {
        this.top = null;
        this.tamanho = 0;
    }

    public void push(char elemento)
    {
        Elemento elem = new Elemento(elemento);
        elem.proxi = top;
        top = elem;
        tamanho++;
    }


    public char pop()
    {
        if (Empty())
        {
            System.out.println("Pilha vazia");
            return '\0';
        }

        Elemento elem = top;
        char c = elem.valor;
        top = top.proxi;
        tamanho--;
        return c;
    }

    public int size()
    {
        return tamanho;
    }

    public boolean Empty()
    {
        return tamanho == 0;
    }

    public void print()
    {
        if (Empty())
        {
            System.out.println("Pilha vazia");
            return;
        } 
        
        Elemento atual = top;

        while (atual != null)
        {
            System.out.print(atual.valor + " ");
            if (atual.proxi != null)
            {
                System.out.print("-> ");
            }
            atual = atual.proxi;
        }

        System.out.println();
        
    }
}
