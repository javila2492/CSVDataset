package sample;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class CSVUtilities
{
    ArrayList<String> CSVData;
    int qCritNum = 0;
    int qNum = 0;
    int bkCritNum = 0;
    int bkNum = 0;
    int bxCritNum = 0;
    int bxNum = 0;
    int mCritNum = 0;
    int mNum = 0;
    int sCritNum = 0;
    int sNum = 0;
    String[] attributes;
    int numColumns;

    public CSVUtilities(File csv)
    {
        List<String> data = new ArrayList<>();
        Path pathToFile = Paths.get(String.valueOf(csv));

        try (BufferedReader br = Files.newBufferedReader(pathToFile, StandardCharsets.US_ASCII))
        {
            String line = br.readLine();

            while (line != null)
            {
                attributes = line.split(",");
                CSVData.add(attributes[2]);
                CSVData.add(attributes[12]);
                line = br.readLine();
            }

        }
        catch (IOException ioe)
        {
            ioe.printStackTrace();
        }
    }
//Return an ArrayList with the data for a column specified public List<String> getDataString(int column)
//Return an ArrayList with the data converted to Integer public List<Integer> getDataInt(int column)
//Return an ArrayList with the data converted to Double public List<Double> getDataDouble(int column)

}
