public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Pilha pilha = new Pilha();

        pilha.push('a');
        pilha.push('b');
        pilha.push('c');
        pilha.push('d');
        pilha.push('e');

        pilha.print();

        pilha.pop();

        pilha.print();
    }
}
