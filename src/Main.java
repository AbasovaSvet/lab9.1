import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;
public class Main {
    // задание https://acmp.ru/index.asp?main=task&id_task=504
    public static void main(String[] args) throws IOException {

        String inputFName = "INPUT.TXT";
        Scanner scanner = new Scanner(new File(inputFName));
        int a = scanner.nextInt();

        char poliv1 = 'GCV';
        char poliv2 = 'VGC';
        char poliv3 = 'CVG';

        int rez = 0;

        String outputFName = "OUTPUT.TXT";
        String s = String.valueOf(rez);
        Files.writeString(Path.of(outputFName), s);

    }

}