package algoritms;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
<<<<<<< HEAD
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;

import algoritms.DateFormat.*;
=======
import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;

>>>>>>> a8926c86165acbcb9a41b8b1489536fdf3e91a4f

public class ReadCSV {

  private String filePath;
  private String sep;
  private String pathToSave;
  private String columnToOrder;
  private String pathToSaveMetrics;

<<<<<<< HEAD
  public ReadCSV(String filePath, String pathToSave,
      String pathToSaveMetrics, String columnToOrder, String sep) {
=======
  public ReadCSV(String filePath, String pathToSave, 
                 String pathToSaveMetrics, String columnToOrder, String sep) {
>>>>>>> a8926c86165acbcb9a41b8b1489536fdf3e91a4f
    this.filePath = filePath;
    this.pathToSave = pathToSave;
    this.columnToOrder = columnToOrder;
    this.pathToSaveMetrics = pathToSaveMetrics;
    this.sep = sep.length() == 0 ? "," : sep;
  }

<<<<<<< HEAD
  public void readCsv(SortInterface algoritm) throws ParseException {
=======
  public void readCsv(SortInterface algoritm) {
>>>>>>> a8926c86165acbcb9a41b8b1489536fdf3e91a4f

    String arquivoCSV = this.filePath;
    BufferedReader br = null;
    String linha = "";

<<<<<<< HEAD
    int lineSize = lineSize() - 1;
    int columnSize = columnsSize() - 1;
    String[][] matrix = new String[lineSize][columnSize];
=======
    int lineSize = lineSize()-1;
    int columnSize = columnsSize()-1;
    String [][] matrix = new String[lineSize][columnSize];
>>>>>>> a8926c86165acbcb9a41b8b1489536fdf3e91a4f
    int i = 0;

    try {

      br = new BufferedReader(new FileReader(arquivoCSV));
<<<<<<< HEAD
      String[] header = br.readLine().split(this.sep);
=======
      String [] header = br.readLine().split(this.sep);
>>>>>>> a8926c86165acbcb9a41b8b1489536fdf3e91a4f
      while ((linha = br.readLine()) != null) {

        matrix[i++] = linha.split(this.sep);

      }

      int col = indexOfColumn(header);

<<<<<<< HEAD
      // matrix = DateFormat.mudarData(matrix);

      String[][] newMatrix = algoritm.sort(matrix, col, this.pathToSaveMetrics);
=======
      String [][] newMatrix = algoritm.sort(matrix, col+1, this.pathToSaveMetrics);
>>>>>>> a8926c86165acbcb9a41b8b1489536fdf3e91a4f

      saveInCsv(newMatrix, header);

    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      if (br != null) {
        try {
          br.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
    }
  }

<<<<<<< HEAD
  public void readCsvAndTransform(TransformInterface algoritm) throws ParseException {

    String arquivoCSV = this.filePath;
    BufferedReader br = null;
    String linha = "";

    int lineSize = lineSize() - 1;
    int columnSize = columnsSize() - 1;
    String[][] matrix = new String[lineSize][columnSize];
    int i = 0;

    try {

      br = new BufferedReader(new FileReader(arquivoCSV));
      String[] header = br.readLine().split(this.sep);
      while ((linha = br.readLine()) != null) {

        matrix[i++] = linha.split(this.sep);

      }

      int col = indexOfColumn(header);

      String[][] newMatrix = algoritm.transform(matrix, col, this.pathToSaveMetrics);

      saveInCsv(newMatrix, header);

    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      if (br != null) {
        try {
          br.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
    }
  }

  private void saveInCsv(String[][] matrix, String[] header) {
    try {

      FileWriter arq = new FileWriter(this.pathToSave);
      PrintWriter gravarArq = new PrintWriter(arq);
      String head = String.join(";", header);

      gravarArq.println(head);
      for (int i = 0; i < matrix.length; i++) {
        String line = String.join(";", matrix[i]);
=======
  private void saveInCsv(String [][] matrix, String [] header) {
    try {
      
      FileWriter arq = new FileWriter(this.pathToSave);
      PrintWriter gravarArq = new PrintWriter(arq);
      String head = String.join(",", header);
      
      gravarArq.println(head);
      for (int i = 0; i < matrix.length; i++) {
        String line = String.join(",", matrix[i]);
>>>>>>> a8926c86165acbcb9a41b8b1489536fdf3e91a4f
        gravarArq.println(line);
      }

      gravarArq.close();
    } catch (IOException e) {
      e.printStackTrace();
    }

  }

<<<<<<< HEAD
  private int indexOfColumn(String[] header) {
=======
  private int indexOfColumn(String [] header) {
>>>>>>> a8926c86165acbcb9a41b8b1489536fdf3e91a4f
    for (int i = 0; i < header.length; i++) {
      if (header[i].equalsIgnoreCase(this.columnToOrder)) {
        return i;
      }
    }
    return -1;
  }

  private int lineSize() {

    String arquivoCSV = this.filePath;
    BufferedReader br = null;
    int lines = 0;

    try {

      br = new BufferedReader(new FileReader(arquivoCSV));
      while (br.readLine() != null) {
        lines++;
      }

    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      if (br != null) {
        try {
          br.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
    }

    return lines;
  }

<<<<<<< HEAD
  private int columnsSize() {
=======
  private int columnsSize () {
>>>>>>> a8926c86165acbcb9a41b8b1489536fdf3e91a4f
    String arquivoCSV = filePath;
    BufferedReader br = null;

    int columns = 0;

    try {

      br = new BufferedReader(new FileReader(arquivoCSV));
<<<<<<< HEAD
      String[] lineColumn = br.readLine().split(this.sep);

=======
      String [] lineColumn = br.readLine().split(this.sep);
      
>>>>>>> a8926c86165acbcb9a41b8b1489536fdf3e91a4f
      for (int i = 0; i < lineColumn.length; i++) {
        columns++;
      }

    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      if (br != null) {
        try {
          br.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
    }

    return columns;
  }

}
