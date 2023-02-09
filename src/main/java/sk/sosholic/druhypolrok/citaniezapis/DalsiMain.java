package sk.sosholic.druhypolrok.citaniezapis;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class DalsiMain {
    public static void main(String[] args) throws IOException {

        String textNaZapis = "Tu je text na zapis";
        String meno = "Petko";

        FileWriter file1 = new FileWriter("textNazapis.txt");
        file1.write(textNaZapis);
        file1.write(meno);
        file1.close();
        file1.close();

        FileWriter subor2 = new FileWriter("OpakovanieZapisu.txt",true);

        String zapisDoSuboru2 = "tu zapiseme nieco dalsieho ";
        subor2.write("\n");
        subor2.write(zapisDoSuboru2);
        subor2.close();

        FileWriter fileWriter = new FileWriter("text.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.close();

    }
}
