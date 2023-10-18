package software.ulpgc;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TsvCurrencyLoader implements CurrencyLoader{

    List<Currency> CurrencyList = new ArrayList<>();

    @Override
    public List<Currency> Load(File file) throws IOException {

        BufferToCurrency(file);
        return CurrencyList;
    }

    private void BufferToCurrency(File file1) throws IOException {
        FileReader fr = new FileReader(file1);
        BufferedReader br = new BufferedReader(fr);

        boolean check = ReaderCurrency(br);
        while(check) {
            check = ReaderCurrency(br);
        }
    }

    private boolean ReaderCurrency(BufferedReader br) throws IOException {
        String line = br.readLine();
        if (line == null) return false;
        if (line.isEmpty()) return false;
        Currency currency = toCurrency(line);
        if (currency == null) return true;
        CurrencyList.add(currency);
        return true;

    }


    private Currency toCurrency(String line) {
        String[] split = line.split("\t");
        if(split.length < 4) return null;
        return new Currency(
                split[0],
                split[1],
                split[2],
                split[3].isEmpty() ? Integer.parseInt(split[3]) : 0
        );

    }

}
