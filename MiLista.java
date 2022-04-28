import java.util.Scanner;

public class MiLista {
    public static Scanner input = new Scanner(System.in);

    private int[] lista;

    public int[] getLista() {
        return lista;
    }

    public void setLista(int[] lista) {
        this.lista = lista;
    }

    public void setLista(MiLista lista){
        this.lista = lista.getLista();
    }

    public MiLista(){
        this.lista = new int[0];
    }

    public MiLista(int[] lista) {
        this.lista = lista;
    }

    public void addNumber(int num){
        int[] newLista = new int[this.getLista().length+1];
        for(int i = 0; i < this.getLista().length; i ++){
            newLista[i] = this.getLista()[i];
        }
        newLista[this.getLista().length] = num;
        this.setLista(newLista);
    }

    public void removeNumber(int num){
        int[] newLista = this.getLista();
        int contador = 0;
        for(int i = 0; i < lista.length; i++){
            if(this.getLista()[i] != num){
                newLista[i - contador] = this.getLista()[i];
            } else {
                contador ++;
            }
        }
        int[] newNewLista = new int[newLista.length - contador];
        for(int i = 0; i < newNewLista.length;i ++){
            newNewLista[i] = newLista[i];
        }
        this.setLista(newNewLista);
    }
    
    public void introNumber(){
        MiLista lista = new MiLista();
        boolean go = true;
        while(go){
            System.out.println("Intro number");
            try{
                int num = input.nextInt();
                input.nextLine();
                lista.addNumber(num);
            }catch(Exception e){
                if(input.nextLine().equals("Salir")){
                    go = false;
                }else{
                    System.out.println("[!] Intro a valid number");
                }
            }
        }
        this.setLista(lista);
    }

    
    
    public void printList(){
        for(int i = 0; i < this.getLista().length;i ++){
            System.out.println(this.getLista()[i]);
        }
    }
}
