package Console;

import java.io.File;
import java.io.IOException;
<<<<<<< HEAD
import java.text.ParseException;
import java.text.SimpleDateFormat;
=======
>>>>>>> a8926c86165acbcb9a41b8b1489536fdf3e91a4f
import java.util.*;

import algoritms.ReadCSV;
import algoritms.SelectionSort;
import algoritms.InsertionSort;
import algoritms.MergeSort;
import algoritms.QuickSort;
import algoritms.QuickSortWithMedian3;
<<<<<<< HEAD
import algoritms.AboveMedia;
import algoritms.BelowMedia;
import algoritms.CountingSort;
import algoritms.DateFormat;
import algoritms.HeapSort;

=======
import algoritms.CountingSort;
import algoritms.HeapSort;


>>>>>>> a8926c86165acbcb9a41b8b1489536fdf3e91a4f
public class Console {
    Scanner entrada = new Scanner(System.in);
    boolean loading;

    File directory = new File("");
    String basePAth;
    String fileBase;

    public Console(String fileBase) {
        this.loading = false;
        this.basePAth = directory.getAbsolutePath();
<<<<<<< HEAD

=======
        
>>>>>>> a8926c86165acbcb9a41b8b1489536fdf3e91a4f
        boolean hasSRC = false;
        for (String i : this.basePAth.split("/")) {
            if (i.equalsIgnoreCase("src")) {
                hasSRC = true;
            }
        }

        if (hasSRC) {
            this.basePAth = this.basePAth + "/csvs";
        } else {
            this.basePAth = this.basePAth + "/src/csvs";
        }

        this.fileBase = this.basePAth + "/base/" + fileBase;
    }

<<<<<<< HEAD
    public void menu() throws ParseException {

        while (true) {

            System.out.printf("\t\t-------------------------------\n");
            System.out.printf("\t\t|        AirBNB Data          |\n");
=======
    public void menu() {
        
        while (true) {
            
            System.out.printf("\t\t-------------------------------\n");
            System.out.printf("\t\t|       AirBNB_Berlin_1       |\n");
>>>>>>> a8926c86165acbcb9a41b8b1489536fdf3e91a4f
            System.out.printf("\t\t-------------------------------\n");
            System.out.printf("Pressione a tecla para executar a função correspondente:\n\n");
            System.out.printf("Digite (1) - INICIAR\n\n");
            System.out.printf("Digite (2) - SOBRE\n\n");
            System.out.printf("Digite (3) - CRÉDITOS\n\n");
            System.out.printf("Digite (0) - SAIR\n\n");
<<<<<<< HEAD

            int digito = getEnter();

            clearConsole();

            if (digito == 1) {
                program();
            } else if (digito == 2) {
                sobre();
            } else if (digito == 3) {
                creditos();
            } else if (digito == 0) {
                clearConsole();
=======
            
            int digito = getEnter();

            clearConsole();   

            if (digito == 1) {
                program();  
            }
            else if (digito == 2) {
                sobre();
            }
            else if (digito == 3) {
                creditos();
            }
            else if (digito == 0) {
                clearConsole();  
>>>>>>> a8926c86165acbcb9a41b8b1489536fdf3e91a4f
                System.out.printf(" PROGRAMA ENCERRADO !\n");
                entrada.close();
                break;
            } else {
                System.out.printf("Valor incorreto, tente novamente!\n");
<<<<<<< HEAD

                try {
                    Thread.sleep(1500);
                } catch (InterruptedException ex) {
                }

                clearConsole();
=======
                
                try { 
                    Thread.sleep (1500); 
                } catch (InterruptedException ex) {}

                clearConsole();   
>>>>>>> a8926c86165acbcb9a41b8b1489536fdf3e91a4f
            }
        }

    }

    private int getEnter() {
        String linha = entrada.nextLine(); // ler a linha (termina no enter)

<<<<<<< HEAD
        try {
            int inteiro = Integer.parseInt(linha); // (tenta converter pra int os dados inseridos)
            return inteiro;
        } catch (Exception e) {
=======
        try{
            int inteiro = Integer.parseInt(linha); // (tenta converter pra int os dados inseridos)
            return inteiro;
        } catch(Exception e){
>>>>>>> a8926c86165acbcb9a41b8b1489536fdf3e91a4f
            return 20;
        }
    }

<<<<<<< HEAD
    public void program() throws ParseException {
=======
    public void program(){
>>>>>>> a8926c86165acbcb9a41b8b1489536fdf3e91a4f

        System.out.printf("\t\tSelecione o Método de Ordenação\n");
        System.out.printf("\t\t-------------------------------\n\n");
        System.out.printf("Pressione a tecla para executar a função correspondente:\n\n");
        System.out.printf("Digite (1) - Selection Sort\n\n");
        System.out.printf("Digite (2) - Insertion Sort\n\n");
        System.out.printf("Digite (3) - Merge Sort\n\n");
        System.out.printf("Digite (4) - Quick Sort\n\n");
        System.out.printf("Digite (5) - Quick Sort com Mediana de 3\n\n");
        System.out.printf("Digite (6) - Counting\n\n");
        System.out.printf("Digite (7) - HeapSort\n\n");
        System.out.printf("Digite (8) - Executar Todos\n\n");
<<<<<<< HEAD
        System.out.printf("Digite (9) - Transformar Datas\n\n");
        System.out.printf("Digite (10) - Gerar valores Acima da Media\n\n");
        System.out.printf("Digite (0) - SAIR\n\n");

        int digito = getEnter();
        clearConsole();

        if (digito == 1) {

            ReadCSV numberOfReviews = new ReadCSV(this.fileBase,
                    this.basePAth + "/SelectionSort/listings_numberOfreviews_selectionSort_medioCaso.csv",
                    this.basePAth + "/SelectionSort/metrics_listings_numberOfreviews_selectionSort_medioCaso.csv",
                    "number_of_reviews", ";");

=======
        System.out.printf("Digite (0) - SAIR\n\n");
        
        int digito = getEnter();
        clearConsole();   
        
        
        if (digito == 1) {

            ReadCSV name = new ReadCSV(this.fileBase,
            this.basePAth+"/SelectionSort/selectionSort_ordena_name.csv", 
            this.basePAth+"/SelectionSort/metrics_selectionSort_ordena_name.csv", 
            "name", ",");
            
>>>>>>> a8926c86165acbcb9a41b8b1489536fdf3e91a4f
            this.loading = true;
            new Thread() {
                @Override
                public void run() {
                    loading();
                }
            }.start();

<<<<<<< HEAD
            numberOfReviews.readCsv(new SelectionSort(true));

            ReadCSV price = new ReadCSV(this.fileBase,
                    this.basePAth + "/SelectionSort/listings_price_selectionSort_medioCaso.csv",
                    this.basePAth + "/SelectionSort/metrics_listings_price_selectionSort_medioCaso.csv",
                    "price", ";");

            price.readCsv(new SelectionSort(true));

            ReadCSV cidade = new ReadCSV(this.fileBase,
                    this.basePAth + "/SelectionSort/listings_names_selectionSort_medioCaso.csv",
                    this.basePAth + "/SelectionSort/metrics_listings_names_selectionSort_medioCaso.csv",
                    "name", ";");

            cidade.readCsv(new SelectionSort(false));

            this.loading = false;
            clearConsole();

        } else if (digito == 2) {

            ReadCSV numberOfReviews = new ReadCSV(this.fileBase,
                    this.basePAth + "/InsertionSort/listings_numberOfreviews_insertionSort_medioCaso.csv",
                    this.basePAth + "/InsertionSort/metrics_numberOfreviews_insertionSort_medioCaso.csv",
                    "number_of_reviews", ";");

            this.loading = true;
=======
            name.readCsv(new SelectionSort(false));
            
            ReadCSV price = new ReadCSV(this.fileBase,
            this.basePAth+"/SelectionSort/selectionSort_price.csv", 
            this.basePAth+"/SelectionSort/metrics_selectionSort_price.csv", 
            "price", ",");

            price.readCsv(new SelectionSort(true));

            ReadCSV number_of_reviews = new ReadCSV(this.fileBase,
            this.basePAth+"/SelectionSort/selectionSort_ordena_number_of_reviews.csv", 
            this.basePAth+"/SelectionSort/metrics_selectionSort_ordena_number_of_reviews.csv", 
            "number_of_reviews", ",");

            number_of_reviews.readCsv(new SelectionSort(true));

            ReadCSV last_review = new ReadCSV(this.fileBase,
            this.basePAth+"/SelectionSort/selectionSort_ordena_last_review.csv", 
            this.basePAth+"/SelectionSort/metrics_selectionSort_ordena_last_review.csv", 
            "last_review", ",");

            last_review.readCsv(new SelectionSort(false));

            this.loading = false;
            clearConsole();
             

        } else if (digito == 2) {

            ReadCSV name = new ReadCSV(this.fileBase,
            this.basePAth+"/InsertionSort/insertionSort_ordena_name.csv", 
            this.basePAth+"/InsertionSort/metrics_insertionSort_ordena_name.csv", 
            "name", ",");

           this.loading = true;
>>>>>>> a8926c86165acbcb9a41b8b1489536fdf3e91a4f
            new Thread() {
                @Override
                public void run() {
                    loading();
                }
            }.start();

<<<<<<< HEAD
            numberOfReviews.readCsv(new InsertionSort(true));

            ReadCSV price = new ReadCSV(this.fileBase,
                    this.basePAth + "/InsertionSort/InsertionSort_ordena_price.csv",
                    this.basePAth + "/InsertionSort/metrics_InsertionSort_ordena_price.csv",
                    "price", ";");

            price.readCsv(new InsertionSort(true));

            ReadCSV cidade = new ReadCSV(this.fileBase,
                    this.basePAth + "/InsertionSort/InsertionSort_ordena_name.csv",
                    this.basePAth + "/InsertionSort/metrics_InsertionSort_ordena_name.csv",
                    "name", ";");

            cidade.readCsv(new InsertionSort(false));

=======
            name.readCsv(new InsertionSort(false));

            ReadCSV price = new ReadCSV(this.fileBase,
            this.basePAth+"/InsertionSort/InsertionSort_ordena_price.csv", 
            this.basePAth+"/InsertionSort/metrics_InsertionSort_ordena_price.csv", 
            "price", ",");

            price.readCsv(new InsertionSort(true));

            ReadCSV number_of_reviews = new ReadCSV(this.fileBase,
            this.basePAth+"/InsertionSort/InsertionSort_ordena_number_of_reviews.csv", 
            this.basePAth+"/InsertionSort/metrics_InsertionSort_ordena_number_of_reviews.csv", 
            "number_of_reviews", ",");

            number_of_reviews.readCsv(new InsertionSort(true));

            ReadCSV last_review = new ReadCSV(this.fileBase,
            this.basePAth+"/InsertionSort/InsertionSort_ordena_last_review.csv", 
            this.basePAth+"/InsertionSort/metrics_InsertionSort_ordena_last_review.csv",
            "last_review", ",");

            last_review.readCsv(new InsertionSort(true));
            
>>>>>>> a8926c86165acbcb9a41b8b1489536fdf3e91a4f
            this.loading = false;
            clearConsole();

        } else if (digito == 3) {

<<<<<<< HEAD
            ReadCSV numberOfReviews = new ReadCSV(this.fileBase,
                    this.basePAth + "/MergeSort/MergeSort_ordena_number_of_reviews.csv",
                    this.basePAth + "/MergeSort/metrics_MergeSort_ordena_number_of_reviews.csv",
                    "number_of_reviews", ";");
=======
            ReadCSV name = new ReadCSV(this.fileBase,
            this.basePAth+"/MergeSort/MergeSort_ordena_name.csv", 
            this.basePAth+"/MergeSort/metrics_MergeSort_ordena_name.csv", 
            "name", ",");
            
>>>>>>> a8926c86165acbcb9a41b8b1489536fdf3e91a4f

            this.loading = true;
            new Thread() {
                @Override
                public void run() {
                    loading();
                }
            }.start();

<<<<<<< HEAD
            numberOfReviews.readCsv(new MergeSort(true));

            ReadCSV price = new ReadCSV(this.fileBase,
                    this.basePAth + "/MergeSort/MergeSort_ordena_price.csv",
                    this.basePAth + "/MergeSort/metrics_MergeSort_ordena_price.csv",
                    "price", ";");

            price.readCsv(new MergeSort(true));

            ReadCSV name = new ReadCSV(this.fileBase,
                    this.basePAth + "/MergeSort/MergeSort_ordena_name.csv",
                    this.basePAth + "/MergeSort/metrics_MergeSort_ordena_name.csv",
                    "name", ";");

            name.readCsv(new MergeSort(false));
            this.loading = false;

            clearConsole();
        } else if (digito == 4) {

            ReadCSV numberOfReviews = new ReadCSV(this.fileBase,
                    this.basePAth + "/QuickSort/QuickSort_ordena_number_of_reviews.csv",
                    this.basePAth + "/QuickSort/metrics_QuickSort_ordena_number_of_reviews.csv",
                    "number_of_reviews", ";");

            this.loading = true;

=======
            name.readCsv(new MergeSort(false));

            ReadCSV price = new ReadCSV(this.fileBase,
            this.basePAth+"/MergeSort/MergeSort_ordena_price.csv", 
            this.basePAth+"/MergeSort/metrics_MergeSort_ordena_price.csv", 
            "price", ",");
            

            price.readCsv(new MergeSort(true));
            
            ReadCSV number_of_reviews = new ReadCSV(this.fileBase,
            this.basePAth+"/MergeSort/MergeSort_ordena_number_of_reviews.csv", 
            this.basePAth+"/MergeSort/metrics_MergeSort_ordena_number_of_reviews.csv", 
            "number_of_reviews", ",");
            

            number_of_reviews.readCsv(new MergeSort(true));
            this.loading = false;
           
            ReadCSV last_review = new ReadCSV(this.fileBase,
            this.basePAth+"/MergeSort/MergeSort_ordena_last_review.csv", 
            this.basePAth+"/MergeSort/metrics_MergeSort_ordena_last_review.csv", 
            "last_review", ",");
            
            last_review.readCsv(new MergeSort(true));

            clearConsole();
        } else if (digito == 4) {
            
            ReadCSV name = new ReadCSV(this.fileBase,
            this.basePAth+"/QuickSort/QuickSort_ordena_name.csv", 
            this.basePAth+"/QuickSort/metrics_QuickSort_ordena_name.csv", 
            "name", ",");

            this.loading = true;
            
>>>>>>> a8926c86165acbcb9a41b8b1489536fdf3e91a4f
            new Thread() {
                @Override
                public void run() {
                    loading();
                }
            }.start();

<<<<<<< HEAD
            numberOfReviews.readCsv(new QuickSort(true));

            ReadCSV price = new ReadCSV(this.fileBase,
                    this.basePAth + "/QuickSort/QuickSort_ordena_price.csv",
                    this.basePAth + "/QuickSort/metrics_QuickSort_ordena_price.csv",
                    "price", ";");

            price.readCsv(new QuickSort(true));

            ReadCSV name = new ReadCSV(this.fileBase,
                    this.basePAth + "/QuickSort/QuickSort_ordena_name.csv",
                    this.basePAth + "/QuickSort/metrics_QuickSort_ordena_name.csv",
                    "name", ";");

            name.readCsv(new QuickSort(false));
=======
            name.readCsv(new QuickSort(false));

            ReadCSV price = new ReadCSV(this.fileBase,
            this.basePAth+"/QuickSort/QuickSort_ordena_price.csv", 
            this.basePAth+"/QuickSort/metrics_QuickSort_ordena_price.csv", 
            "price", ",");

            price.readCsv(new QuickSort(true));

            ReadCSV number_of_reviews = new ReadCSV(this.fileBase,
            this.basePAth+"/QuickSort/QuickSort_ordena_number_of_reviews.csv", 
            this.basePAth+"/QuickSort/metrics_QuickSort_ordena_number_of_reviews.csv", 
            "number_of_reviews", ",");

            number_of_reviews.readCsv(new QuickSort(true));

            ReadCSV last_review = new ReadCSV(this.fileBase,
            this.basePAth+"/QuickSort/QuickSort_ordena_last_review.csv", 
            this.basePAth+"/QuickSort/metrics_QuickSort_ordena_last_review.csv", 
            "last_review", ",");

            last_review.readCsv(new QuickSort(true));
>>>>>>> a8926c86165acbcb9a41b8b1489536fdf3e91a4f
            this.loading = false;

            clearConsole();

        } else if (digito == 5) {

<<<<<<< HEAD
            ReadCSV numberOfReviews = new ReadCSV(this.fileBase,
                    this.basePAth + "/QuickSortWithMedian3/QuickSortWithMedian3_ordena_number_of_reviews.csv",
                    this.basePAth + "/QuickSortWithMedian3/metrics_QuickSortWithMedian3_ordena_number_of_reviews.csv",
                    "number_of_reviews", ";");

=======
            ReadCSV name = new ReadCSV(this.fileBase,
            this.basePAth+"/QuickSortWithMedian3/QuickSortWithMedian3_ordena_name.csv", 
            this.basePAth+"/QuickSortWithMedian3/metrics_QuickSortWithMedian3_ordena_name.csv", 
            "name", ",");
        
>>>>>>> a8926c86165acbcb9a41b8b1489536fdf3e91a4f
            this.loading = true;
            new Thread() {
                @Override
                public void run() {
                    loading();
                }
            }.start();
<<<<<<< HEAD

            numberOfReviews.readCsv(new QuickSortWithMedian3(true));

            ReadCSV price = new ReadCSV(this.fileBase,
                    this.basePAth + "/QuickSortWithMedian3/QuickSortWithMedian3_ordena_price.csv",
                    this.basePAth + "/QuickSortWithMedian3/metrics_QuickSortWithMedian3_ordena_price.csv",
                    "price", ";");

            price.readCsv(new QuickSortWithMedian3(true));

            ReadCSV name = new ReadCSV(this.fileBase,
                    this.basePAth + "/QuickSortWithMedian3/QuickSortWithMedian3_ordena_name.csv",
                    this.basePAth + "/QuickSortWithMedian3/metrics_QuickSortWithMedian3_ordena_name.csv",
                    "name", ";");

            name.readCsv(new QuickSortWithMedian3(false));
            this.loading = false;

            clearConsole();

        } else if (digito == 6) {

            ReadCSV numberOfReviews = new ReadCSV(this.fileBase,
                    this.basePAth + "/CountingSort/CountingSort_ordena_number_of_reviews.csv",
                    this.basePAth + "/CountingSort/metrics_CountingSort_ordena_number_of_reviews.csv",
                    "number_of_reviews", ";");
=======
    
            name.readCsv(new QuickSortWithMedian3(false));

            ReadCSV price = new ReadCSV(this.fileBase,
            this.basePAth+"/QuickSortWithMedian3/QuickSortWithMedian3_ordena_price.csv", 
            this.basePAth+"/QuickSortWithMedian3/metrics_QuickSortWithMedian3_ordena_price.csv", 
            "price", ",");

            price.readCsv(new QuickSortWithMedian3(true));

            ReadCSV number_of_reviews = new ReadCSV(this.fileBase,
            this.basePAth+"/QuickSortWithMedian3/QuickSortWithMedian3_ordena_number_of_reviews.csv", 
            this.basePAth+"/QuickSortWithMedian3/metrics_QuickSortWithMedian3_ordena_number_of_reviews.csv", 
            "number_of_reviews", ",");

            number_of_reviews.readCsv(new QuickSortWithMedian3(false));
            this.loading = false;


            clearConsole();
            
        } else if (digito == 6) {
            
            ReadCSV name = new ReadCSV(this.fileBase,
            this.basePAth+"/CountingSort/CountingSort_ordena_name.csv", 
            this.basePAth+"/CountingSort/metrics_CountingSort_ordena_name.csv", 
            "name", ",");
>>>>>>> a8926c86165acbcb9a41b8b1489536fdf3e91a4f

            this.loading = true;
            new Thread() {
                @Override
                public void run() {
                    loading();
                }
            }.start();

<<<<<<< HEAD
            numberOfReviews.readCsv(new CountingSort(true));

            ReadCSV price = new ReadCSV(this.fileBase,
                    this.basePAth + "/CountingSort/CountingSort_ordena_price.csv",
                    this.basePAth + "/CountingSort/metrics_CountingSort_ordena_price.csv",
                    "price", ";");

            price.readCsv(new CountingSort(true));

            ReadCSV name = new ReadCSV(this.fileBase,
                    this.basePAth + "/CountingSort/CountingSort_ordena_name.csv",
                    this.basePAth + "/CountingSort/metrics_CountingSort_ordena_name.csv",
                    "name", ";");

            name.readCsv(new CountingSort(false));
            this.loading = false;

=======
            name.readCsv(new CountingSort(false));

            ReadCSV price = new ReadCSV(this.fileBase,
            this.basePAth+"/CountingSort/CountingSort_ordena_price.csv", 
            this.basePAth+"/CountingSort/metrics_CountingSort_ordena_price.csv", 
            "price", ",");

            price.readCsv(new CountingSort(true));
            
            ReadCSV number_of_reviews = new ReadCSV(this.fileBase,
            this.basePAth+"/CountingSort/CountingSort_ordena_number_of_reviews.csv", 
            this.basePAth+"/CountingSort/metrics_CountingSort_ordena_number_of_reviews.csv", 
            "number_of_reviews", ",");

            number_of_reviews.readCsv(new CountingSort(false));
            this.loading = false;
            
>>>>>>> a8926c86165acbcb9a41b8b1489536fdf3e91a4f
            clearConsole();

        } else if (digito == 7) {

<<<<<<< HEAD
            ReadCSV numberOfReviews = new ReadCSV(this.fileBase,
                    this.basePAth + "/HeapSort/MedioCaso/HeapSort_ordena_number_of_reviews.csv",
                    this.basePAth + "/HeapSort/MedioCaso/metrics_HeapSort_ordena_number_of_reviews.csv",
                    "number_of_reviews", ";");
=======
            ReadCSV name = new ReadCSV(this.fileBase,
            this.basePAth+"/HeapSort/HeapSort_ordena_name.csv", 
            this.basePAth+"/HeapSort/metrics_HeapSort_ordena_name.csv", 
            "name", ",");
>>>>>>> a8926c86165acbcb9a41b8b1489536fdf3e91a4f

            this.loading = true;
            new Thread() {
                @Override
                public void run() {
                    loading();
                }
            }.start();

<<<<<<< HEAD
            numberOfReviews.readCsv(new HeapSort(true));

            ReadCSV price = new ReadCSV(this.fileBase,
                    this.basePAth + "/HeapSort/MedioCaso/HeapSort_ordena_price.csv",
                    this.basePAth + "/HeapSort/MedioCaso/metrics_HeapSort_ordena_price.csv",
                    "price", ";");

            price.readCsv(new HeapSort(true));

            ReadCSV name = new ReadCSV(this.fileBase,
                    this.basePAth + "/HeapSort/MedioCaso/HeapSort_ordena_name.csv",
                    this.basePAth + "/HeapSort/MedioCaso/metrics_HeapSort_ordena_name.csv",
                    "name", ";");

            name.readCsv(new HeapSort(false));
            this.loading = false;

            // MELHOR CASO HEAPSORT

            ReadCSV BestNumberOfReviews = new ReadCSV(
                    this.basePAth + "/HeapSort/MedioCaso/HeapSort_ordena_number_of_reviews.csv",
                    this.basePAth + "/HeapSort/MelhorCaso/listings_NumberOfreviews_HeapSort_melhorCaso.csv",
                    this.basePAth + "/HeapSort/MelhorCaso/metrics_listings_NumberOfreviews_HeapSort_melhorCaso.csv",
                    "number_of_reviews", ";");

            this.loading = true;
            new Thread() {
                @Override
                public void run() {
                    loading();
                }
            }.start();

            BestNumberOfReviews.readCsv(new HeapSort(true));

            ReadCSV BestPrice = new ReadCSV(this.basePAth + "/HeapSort/MedioCaso/HeapSort_ordena_price.csv",
                    this.basePAth + "/HeapSort/MelhorCaso/listings_price_HeapSort_melhorCaso.csv",
                    this.basePAth + "/HeapSort/MelhorCaso/metrics_listings_price_HeapSort_melhorCaso.csv",
                    "price", ";");

            BestPrice.readCsv(new HeapSort(true));

            ReadCSV BestName = new ReadCSV(this.basePAth + "/HeapSort/MedioCaso/HeapSort_ordena_name.csv",
                    this.basePAth + "/HeapSort/MelhorCaso/listings_Name_HeapSort_melhorCaso.csv",
                    this.basePAth + "/HeapSort/MelhorCaso/metrics_listings_Name_HeapSort_melhorCaso.csv",
                    "name", ";");

            BestName.readCsv(new HeapSort(false));
            this.loading = false;

            clearConsole();
        } else if (digito == 8) {

=======
            name.readCsv(new HeapSort(false));

            ReadCSV price = new ReadCSV(this.fileBase,
            this.basePAth+"/HeapSort/HeapSort_ordena_price.csv", 
            this.basePAth+"/HeapSort/metrics_HeapSort_ordena_price.csv", 
            "price", ",");
            
            price.readCsv(new HeapSort(true));
            
            ReadCSV number_of_reviews = new ReadCSV(this.fileBase,
            this.basePAth+"/HeapSort/HeapSort_ordena_number_of_reviews.csv", 
            this.basePAth+"/HeapSort/metrics_HeapSort_ordena_number_of_reviews.csv", 
            "number_of_reviews", ",");
            
            number_of_reviews.readCsv(new HeapSort(false));
            this.loading = false;
            
            clearConsole();
        } else if (digito == 8) {
            
>>>>>>> a8926c86165acbcb9a41b8b1489536fdf3e91a4f
            this.loading = true;
            new Thread() {
                @Override
                public void run() {
                    loading();
                }
            }.start();

            // SelectionSort
<<<<<<< HEAD
            ReadCSV numberOfReviewsSelectionSort = new ReadCSV(this.fileBase,
                    this.basePAth + "/SelectionSort/selectionSort_ordena_number_of_reviews.csv",
                    this.basePAth + "/SelectionSort/metrics_selectionSort_ordena_number_of_reviews.csv",
                    "number_of_reviews", ";");

            numberOfReviewsSelectionSort.readCsv(new SelectionSort(true));

            ReadCSV priceSelectionSort = new ReadCSV(this.fileBase,
                    this.basePAth + "/SelectionSort/selectionSort_ordena_price.csv",
                    this.basePAth + "/SelectionSort/metrics_selectionSort_ordena_price.csv",
                    "price", ";");

            priceSelectionSort.readCsv(new SelectionSort(true));

            ReadCSV nameelectionSort = new ReadCSV(this.fileBase,
                    this.basePAth + "/SelectionSort/selectionSort_ordena_name.csv",
                    this.basePAth + "/SelectionSort/metrics_selectionSort_ordena_name.csv",
                    "name", ";");

            nameelectionSort.readCsv(new SelectionSort(false));
            // SelectionSort

            // InsertionSort
            ReadCSV numberOfReviewsInsertionSort = new ReadCSV(this.fileBase,
                    this.basePAth + "/InsertionSort/insertionSort_ordena_number_of_reviews.csv",
                    this.basePAth + "/InsertionSort/metrics_insertionSort_ordena_number_of_reviews.csv",
                    "number_of_reviews", ";");

            numberOfReviewsInsertionSort.readCsv(new InsertionSort(true));

            ReadCSV priceInsertionSort = new ReadCSV(this.fileBase,
                    this.basePAth + "/InsertionSort/InsertionSort_ordena_price.csv",
                    this.basePAth + "/InsertionSort/metrics_InsertionSort_ordena_price.csv",
                    "price", ";");

            priceInsertionSort.readCsv(new InsertionSort(true));

            ReadCSV cidadeInsertionSort = new ReadCSV(this.fileBase,
                    this.basePAth + "/InsertionSort/InsertionSort_ordena_name.csv",
                    this.basePAth + "/InsertionSort/metrics_InsertionSort_ordena_name.csv",
                    "name", ";");

            cidadeInsertionSort.readCsv(new InsertionSort(false));
            // InsertionSort

            // MergeSort
            ReadCSV numberOfReviewsMergeSort = new ReadCSV(this.fileBase,
                    this.basePAth + "/MergeSort/MergeSort_ordena_number_of_reviews.csv",
                    this.basePAth + "/MergeSort/metrics_MergeSort_ordena_number_of_reviews.csv",
                    "number_of_reviews", ";");

            numberOfReviewsMergeSort.readCsv(new MergeSort(true));

            ReadCSV priceMergeSort = new ReadCSV(this.fileBase,
                    this.basePAth + "/MergeSort/MergeSort_ordena_price.csv",
                    this.basePAth + "/MergeSort/metrics_MergeSort_ordena_price.csv",
                    "price", ";");

            priceMergeSort.readCsv(new MergeSort(true));

            ReadCSV nameMergeSort = new ReadCSV(this.fileBase,
                    this.basePAth + "/MergeSort/MergeSort_ordena_name.csv",
                    this.basePAth + "/MergeSort/metrics_MergeSort_ordena_name.csv",
                    "name", ";");

            nameMergeSort.readCsv(new MergeSort(false));
            // MergeSort

            // QuickSort
            ReadCSV numberOfReviewsQuickSort = new ReadCSV(this.fileBase,
                    this.basePAth + "/QuickSort/QuickSort_ordena_number_of_reviews.csv",
                    this.basePAth + "/QuickSort/metrics_QuickSort_ordena_number_of_reviews.csv",
                    "number_of_reviews", ";");

            numberOfReviewsQuickSort.readCsv(new QuickSort(true));

            ReadCSV priceQuickSort = new ReadCSV(this.fileBase,
                    this.basePAth + "/QuickSort/QuickSort_ordena_price.csv",
                    this.basePAth + "/QuickSort/metrics_QuickSort_ordena_price.csv",
                    "price", ";");

            priceQuickSort.readCsv(new QuickSort(true));

            ReadCSV nameQuickSort = new ReadCSV(this.fileBase,
                    this.basePAth + "/QuickSort/QuickSort_ordena_name.csv",
                    this.basePAth + "/QuickSort/metrics_QuickSort_ordena_name.csv",
                    "name", ";");

            nameQuickSort.readCsv(new QuickSort(false));
            // QuickSort

            // QuickSortWithMedian3
            ReadCSV numberOfReviewsQuickSortWithMedian3 = new ReadCSV(this.fileBase,
                    this.basePAth + "/QuickSortWithMedian3/QuickSortWithMedian3_ordena_number_of_reviews.csv",
                    this.basePAth + "/QuickSortWithMedian3/metrics_QuickSortWithMedian3_ordena_number_of_reviews.csv",
                    "number_of_reviews", ";");

            numberOfReviewsQuickSortWithMedian3.readCsv(new QuickSortWithMedian3(true));

            ReadCSV priceQuickSortWithMedian3 = new ReadCSV(this.fileBase,
                    this.basePAth + "/QuickSortWithMedian3/QuickSortWithMedian3_ordena_price.csv",
                    this.basePAth + "/QuickSortWithMedian3/metrics_QuickSortWithMedian3_ordena_price.csv",
                    "price", ";");

            priceQuickSortWithMedian3.readCsv(new QuickSortWithMedian3(true));

            ReadCSV nameQuickSortWithMedian3 = new ReadCSV(this.fileBase,
                    this.basePAth + "/QuickSortWithMedian3/QuickSortWithMedian3_ordena_name.csv",
                    this.basePAth + "/QuickSortWithMedian3/metrics_QuickSortWithMedian3_ordena_name.csv",
                    "name", ";");

            nameQuickSortWithMedian3.readCsv(new QuickSortWithMedian3(false));
            // QuickSortWithMedian3

            // CountingSort
            ReadCSV numberOfReviewsCountingSort = new ReadCSV(this.fileBase,
                    this.basePAth + "/CountingSort/CountingSort_ordena_number_of_reviews.csv",
                    this.basePAth + "/CountingSort/metrics_CountingSort_ordena_number_of_reviews.csv",
                    "number_of_reviews", ";");

            numberOfReviewsCountingSort.readCsv(new CountingSort(true));

            ReadCSV priceCountingSort = new ReadCSV(this.fileBase,
                    this.basePAth + "/CountingSort/CountingSort_ordena_price.csv",
                    this.basePAth + "/CountingSort/metrics_CountingSort_ordena_price.csv",
                    "price", ";");

            priceCountingSort.readCsv(new CountingSort(true));

            ReadCSV nameCountingSort = new ReadCSV(this.fileBase,
                    this.basePAth + "/CountingSort/CountingSort_ordena_name.csv",
                    this.basePAth + "/CountingSort/metrics_CountingSort_ordena_name.csv",
                    "name", ";");

            nameCountingSort.readCsv(new CountingSort(false));
            // CountingSort

            // HeapSort
            ReadCSV numberOfReviewsHeapSort = new ReadCSV(this.fileBase,
                    this.basePAth + "/HeapSort/HeapSort_ordena_number_of_reviews.csv",
                    this.basePAth + "/HeapSort/metrics_HeapSort_ordena_number_of_reviews.csv",
                    "number_of_reviews", ";");

            numberOfReviewsHeapSort.readCsv(new HeapSort(true));

            ReadCSV priceHeapSort = new ReadCSV(this.fileBase,
                    this.basePAth + "/HeapSort/HeapSort_ordena_price.csv",
                    this.basePAth + "/HeapSort/metrics_HeapSort_ordena_price.csv",
                    "price", ";");

            priceHeapSort.readCsv(new HeapSort(true));

            ReadCSV nameHeapSort = new ReadCSV(this.fileBase,
                    this.basePAth + "/HeapSort/HeapSort_ordena_name.csv",
                    this.basePAth + "/HeapSort/metrics_HeapSort_ordena_name.csv",
                    "name", ";");

            nameHeapSort.readCsv(new HeapSort(false));
            // HeapSort

            this.loading = false;
            clearConsole();

        } else if (digito == 9) {
            ReadCSV dateTransform = new ReadCSV(this.basePAth + "/base/listings.csv",
                    this.basePAth + "/base/listings_review_date.csv",
                    this.basePAth + "/base/listings_review_date.csv",
                    "Last_review", ";");

            this.loading = true;
            new Thread() {
                @Override
                public void run() {
                    loading();
                }
            }.start();

            dateTransform.readCsvAndTransform(new DateFormat());
            this.loading = false;
            clearConsole();

        } else if (digito == 10) {
            ReadCSV aboveMedia = new ReadCSV(this.fileBase,
                    this.basePAth + "/Media/listings_gt_avg_prices.csv",
                    this.basePAth + "/Media/listings_gt_avg_prices.csv",
                    "price", ";");
            ReadCSV belowMedia = new ReadCSV(this.fileBase,
                    this.basePAth + "/Media/listings_lt_avg_prices.csv",
                    this.basePAth + "/Media/listings_lt_avg_prices.csv",
                    "price", ";");

            this.loading = true;
            new Thread() {
                @Override
                public void run() {
                    loading();
                }
            }.start();

            aboveMedia.readCsvAndTransform(new AboveMedia());
            belowMedia.readCsvAndTransform(new BelowMedia());
            this.loading = false;
            clearConsole();

        } else if (digito == 0) {
            clearConsole();
        } else {
            System.out.printf("Valor incorreto, tente novamente!\n");

            try {
                Thread.sleep(1500);
            } catch (InterruptedException ex) {
            }

            clearConsole();
        }
    }

    public void sobre() {
        System.out.printf(
                "O programa AirBNB Data é uma ferramenta feita com o intuito de indicar as estatísticas do AirBNB de Berlin. Que por meio de um arquivo .csv analisa e ordena os dados utilizando os seguintes métodos:\n\t• Selection Sort;\n\t• Insertion Sort;\n\t• Merge Sort;\n\t• Quick Sort;\n\t• QuickSort com Mediana de 3;\n\t• counting;\n\t• HeapSort \n\n\n");
=======
            ReadCSV nameSelectionSort = new ReadCSV(this.fileBase,
            this.basePAth+"/SelectionSort/selectionSort_ordena_name.csv", 
            this.basePAth+"/SelectionSort/metrics_selectionSort_ordena_name.csv", 
            "name", ",");

            nameSelectionSort.readCsv(new SelectionSort(false));
            
            ReadCSV priceSelectionSort = new ReadCSV(this.fileBase,
            this.basePAth+"/SelectionSort/selectionSort_ordena_price.csv", 
            this.basePAth+"/SelectionSort/metrics_selectionSort_ordena_price.csv", 
            "price", ",");

            priceSelectionSort.readCsv(new SelectionSort(true));

            ReadCSV number_of_reviewSelectionSort = new ReadCSV(this.fileBase,
            this.basePAth+"/SelectionSort/selectionSort_ordena_number_of_reviews.csv", 
            this.basePAth+"/SelectionSort/metrics_selectionSort_ordena_number_of_reviews.csv", 
            "number_of_reviews", ",");

            number_of_reviewSelectionSort.readCsv(new SelectionSort(true));
            // SelectionSort


            // InsertionSort
            ReadCSV nameInsertionSort = new ReadCSV(this.fileBase,
            this.basePAth+"/InsertionSort/insertionSort_ordena_name.csv", 
            this.basePAth+"/InsertionSort/metrics_insertionSort_ordena_name.csv", 
            "name", ",");

            nameInsertionSort.readCsv(new InsertionSort(false));

            ReadCSV priceInsertionSort = new ReadCSV(this.fileBase,
            this.basePAth+"/InsertionSort/InsertionSort_ordena_price.csv", 
            this.basePAth+"/InsertionSort/metrics_InsertionSort_ordena_price.csv", 
            "price", ",");

            priceInsertionSort.readCsv(new InsertionSort(true));

            ReadCSV number_of_reviewInsertionSort = new ReadCSV(this.fileBase,
            this.basePAth+"/InsertionSort/InsertionSort_ordena_number_of_reviews.csv", 
            this.basePAth+"/InsertionSort/metrics_InsertionSort_ordena_number_of_reviews.csv", 
            "number_of_reviews", ",");

            number_of_reviewInsertionSort.readCsv(new InsertionSort(true));
            // InsertionSort

            
            // MergeSort
            ReadCSV nameMergeSort = new ReadCSV(this.fileBase,
            this.basePAth+"/MergeSort/MergeSort_ordena_name.csv", 
            this.basePAth+"/MergeSort/metrics_MergeSort_ordena_name.csv", 
            "name", ",");

            nameMergeSort.readCsv(new MergeSort(false));

            ReadCSV priceMergeSort = new ReadCSV(this.fileBase,
            this.basePAth+"/MergeSort/MergeSort_ordena_price.csv", 
            this.basePAth+"/MergeSort/metrics_MergeSort_ordena_price.csv", 
            "price", ",");
            

            priceMergeSort.readCsv(new MergeSort(true));
            
            ReadCSV number_of_reviewsMergeSort = new ReadCSV(this.fileBase,
            this.basePAth+"/MergeSort/MergeSort_ordena_number_of_reviews.csv", 
            this.basePAth+"/MergeSort/metrics_MergeSort_ordena_number_of_reviews.csv", 
            "number_of_reviews", ",");

            number_of_reviewsMergeSort.readCsv(new MergeSort(true));
            // MergeSort


            // QuickSort
            ReadCSV nameQuickSort = new ReadCSV(this.fileBase,
            this.basePAth+"/QuickSort/QuickSort_ordena_name.csv", 
            this.basePAth+"/QuickSort/metrics_QuickSort_ordena_name.csv", 
            "name", ",");

            nameQuickSort.readCsv(new QuickSort(false));

            ReadCSV priceQuickSort = new ReadCSV(this.fileBase,
            this.basePAth+"/QuickSort/QuickSort_ordena_price.csv", 
            this.basePAth+"/QuickSort/metrics_QuickSort_ordena_price.csv", 
            "price", ",");

            priceQuickSort.readCsv(new QuickSort(true));

            ReadCSV number_of_reviewsQuickSort = new ReadCSV(this.fileBase,
            this.basePAth+"/QuickSort/QuickSort_ordena_number_of_reviews.csv", 
            this.basePAth+"/QuickSort/metrics_QuickSort_ordena_number_of_reviews.csv", 
            "number_of_reviews", ",");

            number_of_reviewsQuickSort.readCsv(new QuickSort(true));
            // QuickSort


            // QuickSortWithMedian3
            ReadCSV nameQuickSortWithMedian3 = new ReadCSV(this.fileBase,
            this.basePAth+"/QuickSortWithMedian3/QuickSortWithMedian3_ordena_name.csv", 
            this.basePAth+"/QuickSortWithMedian3/metrics_QuickSortWithMedian3_ordena_name.csv", 
            "name", ",");
    
            nameQuickSortWithMedian3.readCsv(new QuickSortWithMedian3(false));

            ReadCSV priceQuickSortWithMedian3 = new ReadCSV(this.fileBase,
            this.basePAth+"/QuickSortWithMedian3/QuickSortWithMedian3_ordena_price.csv", 
            this.basePAth+"/QuickSortWithMedian3/metrics_QuickSortWithMedian3_ordena_price.csv", 
            "price", ",");

            priceQuickSortWithMedian3.readCsv(new QuickSortWithMedian3(true));

            ReadCSV number_of_reviewsQuickSortWithMedian3 = new ReadCSV(this.fileBase,
            this.basePAth+"/QuickSortWithMedian3/QuickSortWithMedian3_ordena_number_of_reviews.csv", 
            this.basePAth+"/QuickSortWithMedian3/metrics_QuickSortWithMedian3_ordena_number_of_reviews.csv", 
            "number_of_reviews", ",");

            number_of_reviewsQuickSortWithMedian3.readCsv(new QuickSortWithMedian3(true));
            // QuickSortWithMedian3

            
            // CountingSort
            ReadCSV nameCountingSort = new ReadCSV(this.fileBase,
            this.basePAth+"/CountingSort/CountingSort_ordena_name.csv", 
            this.basePAth+"/CountingSort/metrics_CountingSort_ordena_name.csv", 
            "name", ",");

            nameCountingSort.readCsv(new CountingSort(false));

            ReadCSV priceCountingSort = new ReadCSV(this.fileBase,
            this.basePAth+"/CountingSort/CountingSort_ordena_price.csv", 
            this.basePAth+"/CountingSort/metrics_CountingSort_ordena_price.csv", 
            "price", ",");

            priceCountingSort.readCsv(new CountingSort(true));
            
            ReadCSV number_of_reviewsCountingSort = new ReadCSV(this.fileBase,
            this.basePAth+"/CountingSort/CountingSort_ordena_number_of_reviews.csv", 
            this.basePAth+"/CountingSort/metrics_CountingSort_ordena_number_of_reviews.csv", 
            "number_of_reviews", ",");

            number_of_reviewsCountingSort.readCsv(new CountingSort(true));
            // CountingSort


            // HeapSort
            ReadCSV nameHeapSort = new ReadCSV(this.fileBase,
            this.basePAth+"/HeapSort/HeapSort_ordena_name.csv", 
            this.basePAth+"/HeapSort/metrics_HeapSort_ordena_name.csv", 
            "name", ",");

            nameHeapSort.readCsv(new HeapSort(true));

            ReadCSV priceHeapSort = new ReadCSV(this.fileBase,
            this.basePAth+"/HeapSort/HeapSort_ordena_price.csv", 
            this.basePAth+"/HeapSort/metrics_HeapSort_ordena_price.csv", 
            "price", ",");
            
            priceHeapSort.readCsv(new HeapSort(true));
            
            ReadCSV number_of_reviewsHeapSort = new ReadCSV(this.fileBase,
            this.basePAth+"/HeapSort/HeapSort_ordena_number_of_reviews.csv", 
            this.basePAth+"/HeapSort/metrics_HeapSort_ordena_number_of_reviews.csv", 
            "number_of_reviews", ",");
            
            number_of_reviewsHeapSort.readCsv(new HeapSort(true));
            // HeapSort
            
            
            this.loading = false;
            clearConsole();
        }
        else if (digito == 0) {
            clearConsole();
        } else {
            System.out.printf("Valor incorreto, tente novamente!\n");
        
            try { 
                Thread.sleep (1500); 
            } catch (InterruptedException ex) {}

            clearConsole(); 
        }
    }

    public void sobre(){
        System.out.printf("O programa AirBNB_Berlin_1 é uma ferramenta feita com o intuito de filtrar melhor os preços das ofertas acima e abaixo da média vizinhança . Que por meio de um arquivo .csv analisa e ordena os dados utilizando os seguintes métodos:\n\t• Selection Sort;\n\t• Insertion Sort;\n\t• Merge Sort;\n\t• Quick Sort;\n\t• QuickSort com Mediana de 3;\n\t• counting;\n\t• HeapSort \n\n\n");
>>>>>>> a8926c86165acbcb9a41b8b1489536fdf3e91a4f
        promptEnterKey();
        clearConsole();
    }

<<<<<<< HEAD
    public void creditos() {
        System.out.printf("Desenvolvedores :\n\n");
        System.out.printf("Gabriel Alves da Costa e Silva - gabriel.costa@aluno.uepb.edu.br\n");
        System.out.printf("Github -> gabrizl\n\n");
        System.out.printf("Jose Axaiel - email@aluno.uepb.edu.br\n");
        System.out.printf("Github -> \n\n");
        System.out.printf("Natalia - email@aluno.uepb.edu.br\n");
        System.out.printf("Github -> \n\n");
        promptEnterKey();
        clearConsole();
    }

    public void promptEnterKey() {
=======
    public void creditos(){
        System.out.printf("Desenvolvedores :\n\n");
        System.out.printf("Gabriel Alves - gabriel.costa@aluno.uepb.edu.br\n");
        System.out.printf("Github -> gabrizl\n\n");
        System.out.printf("José Axaiel - jose.queiroz@aluno.uepb.edu.br\n");
        System.out.printf("Github -> axaiel\n\n");
        promptEnterKey();
        clearConsole();   
    }

    public void promptEnterKey(){
>>>>>>> a8926c86165acbcb9a41b8b1489536fdf3e91a4f
        System.out.println("Press \"ENTER\" to continue...");
        try {
            System.in.read(new byte[2]);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

<<<<<<< HEAD
    public final static void clearConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    private void loading() {
        String[] arr = { "/", "|", "\\", "-" };
        int i = 0;
        while (this.loading) {
            System.out.printf("Processando %s \r", arr[i++]);

            if (i == arr.length) {
                i = 0;
            }

            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
            }
=======
    public final static void clearConsole() {  
        System.out.print("\033[H\033[2J");
        System.out.flush(); 
    }

    private void loading() {
        String [] arr = {"/", "|", "\\", "-"};
        int i = 0;
        while (this.loading) {
            System.out.printf("Processando %s \r", arr[i++]);
          
            if (i == arr.length) {
                i = 0;
            }
    
            try {
                Thread.sleep(100); 
            } catch (InterruptedException ex) {}
>>>>>>> a8926c86165acbcb9a41b8b1489536fdf3e91a4f
        }
    }

}
<<<<<<< HEAD
=======


>>>>>>> a8926c86165acbcb9a41b8b1489536fdf3e91a4f
