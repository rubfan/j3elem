package hillel;

import java.util.ArrayList;
import java.util.Arrays;

public class Bank {

    private int id = 0;
    private int idArch = 0;
    private int numberTr = 0;
    private ArrayList<String[]> clientBase = new ArrayList<String[]>();
    private ArrayList<String[]> clientArch = new ArrayList<String[]>();
    private ArrayList<String[]> transactBase = new ArrayList<String[]>();

    public void creatCl(String fName, String lName) {
        clientBase.add(id, new String[]{fName, lName});
        id++;
    }

    public String[] getClientBase(int idKey) {
        String[] cl = clientBase.get(idKey);
        return cl;
    }

    public void showallCl() {
        for (int i = 0; i < clientBase.size(); i++) {
            System.out.print("Client " + Arrays.toString(clientBase.get(i)));
            System.out.println(" his ID key: " + i);
        }
    }

    public void delClient(int idKey) {
        String[] delete = clientBase.remove(idKey);
        addClientArch(delete);
        id--;
    }

    private void addClientArch(String[] add) {
        clientArch.add(idArch, add);
        idArch++;
    }

    public String[] getClientArch(int idKey) {
        String[] cl = clientArch.get(idKey);
        return cl;
    }

    public void showallArch() {
        for (int i = 0; i < clientArch.size(); i++) {
            System.out.print("Client " + Arrays.toString(clientArch.get(i)));
            System.out.println(" his ID key: " + i);
        }
    }

    public void transact(int idKey, String inf) {
        //get first and last name client who will do transaction
        String perf = getPerfomer(getClientBase(idKey));
        transactBase.add(numberTr, new String[]{inf, perf});
        numberTr++;
    }

    private String getPerfomer(String[] client){
        String perfomer = client[0] + " " + client[1];
        return perfomer;
    }

    public String[] getTransact(int number) {
        String[] transact = transactBase.get(number);
        return transact;
    }

    public void showAllTransact() {
        for(int i = 0; i < transactBase.size(); i++){
            System.out.print("Number transction: " + i + " ");
            System.out.println("operation and perfomer: " + Arrays.toString(transactBase.get(i)));
        }

    }
}
