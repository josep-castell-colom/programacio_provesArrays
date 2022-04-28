import java.util.Scanner;

public class MiListaString {
    public static Scanner input = new Scanner(System.in);
    private String[] lista;

    public String[] getLista() {
        return lista;
    }

    public void setLista(String[] lista) {
        this.lista = lista;
    }

    public void setLista(MiListaString lista) {
        this.lista = lista.getLista();
    }

    public MiListaString(){
        lista = new String[0];
    }

    public MiListaString(String[] lista){
        this.setLista(lista);
    }

    public void printList(){
        for(int i = 0; i < this.getLista().length;i ++){
            System.out.println(this.getLista()[i]);
        }
    }

    public void addString(String palabra){
        String[] newList = new String[this.getLista().length + 1];
        for(int i = 0; i < this.getLista().length; i ++){
            newList[i] = this.getLista()[i];
        }
        newList[this.getLista().length] = palabra;
        this.setLista(newList);
    }

    public void introString(){
        System.out.println("Intro string:");
        String newString = input.nextLine();
        while(newString!=""){
            this.addString(newString);
            System.out.println("Intro string:");
            newString = input.nextLine();
        }
    }
}
