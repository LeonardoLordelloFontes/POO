import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Datas {
    LocalDate[] datas;
    int pos;
    public Datas(int size) {
        pos = 0;
        datas = new LocalDate[size];
    }

    // 3 a)

    public void insereData(LocalDate data) {
        boolean exists = false;
        for (int i = 0; i < pos && !exists; i++) {
            if (ChronoUnit.DAYS.between(data, datas[i]) == 0)
                exists = true;
        }
        if (!exists) datas[pos++] = data;
    }

    // 3 b)

    public LocalDate dataMaisProxima(LocalDate data) {
        LocalDate MaisProxima = datas[0];
        long min = Math.abs(ChronoUnit.DAYS.between(data, MaisProxima));
        for (int i = 1; i < pos; i++) {
            long dist = Math.abs(ChronoUnit.DAYS.between(MaisProxima, datas[i]));
            if (dist < min) {
                min = dist;
                MaisProxima = datas[i];
            }
        }
        return MaisProxima;
    }

    // 3 c)

    public String toString() {
        String string = "";
        for (int i = 0; i < pos; i++) {
            string += datas[i].toString() + "\n";
        }
        return string;
    }
}
