package software.ulpgc;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        TsvCurrencyLoader tsvCurrencyLoader = new TsvCurrencyLoader();

        List<Currency> list = tsvCurrencyLoader.Load(new File("res/codes-all_csv.tsv"));

        for(Currency currency : list){
            System.out.println(currency);
        }

        System.out.println(list.size());
    }
}
