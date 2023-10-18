package software.ulpgc;

import java.io.File;
import java.io.IOException;
import java.util.List;

public interface CurrencyLoader {
    List<Currency> Load(File file) throws IOException;
}
